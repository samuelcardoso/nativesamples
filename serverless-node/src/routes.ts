import { validation } from './validation';
import { test } from './main';

export const routes = [
    {
      method: 'GET',
      path: '/main',
      handler: test,
      summary: 'Run main',
      description: 'Returns all',
      tags: ['main'],
      validation: {
        queryStringParameters: {
          limit: validation.limit,
          offset: validation.offset,
        },
      },
      responses: {
        200: { description: 'Success!' },
      },
    },
  ];