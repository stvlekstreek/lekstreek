import { Authority } from '@/shared/security/authority';
/* tslint:disable */
// prettier-ignore

// jhipster-needle-add-entity-to-router-import - JHipster will import entities to the router here
const RelatieComponent = () => import('@/entities/relatie/relatie.vue');

export default [
  // jhipster-needle-add-entity-to-router - JHipster will add entities to the router here
  {
    path: '/entities/relatie',
    name: 'RelatieComponent',
    component: RelatieComponent,
    meta: { authorities: [Authority.ADMIN] },
  },
];
