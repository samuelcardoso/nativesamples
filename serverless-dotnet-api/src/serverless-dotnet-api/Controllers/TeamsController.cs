using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;

namespace serverless_dotnet_api.Controllers
{
    [Route("api/[controller]")]
    public class TeamsController : ControllerBase
    {
        [HttpGet]
        public IEnumerable<string> Get()
        {
            return new string[] { "Patriots", "Cowboys", "Jets" };
        }

        [HttpGet("{team}")]
        public string Get(string team)
        {
            return team;
        }

       
    }
}
