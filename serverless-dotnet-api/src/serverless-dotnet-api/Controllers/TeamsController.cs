using System.Threading.Tasks;
using System.IO;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using System.Threading;

namespace serverless_dotnet_api.Controllers
{
    [Route("api/[controller]")]
    public class TeamsController : ControllerBase
    {
        [HttpGet]
        public  IActionResult Get()
        {
            Thread.Sleep(200);

            return Ok(new string[] { "Patriots", "Cowboys", "Jets" });

        }

        [HttpGet("{team}")]
        public string Get(string team)
        {
            return team;
        }

       
    }
}
