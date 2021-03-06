package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.policyInterfacesMod.PolicyConfiguration
import typingsJapgolly.vsoNodeApi.policyInterfacesMod.PolicyEvaluationRecord
import typingsJapgolly.vsoNodeApi.policyInterfacesMod.PolicyType
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/PolicyApi", JSImport.Namespace)
@js.native
object policyApiMod extends js.Object {
  @js.native
  trait IPolicyApi extends ClientApiBase {
    def createPolicyConfiguration(configuration: PolicyConfiguration, project: String): js.Promise[PolicyConfiguration] = js.native
    def createPolicyConfiguration(configuration: PolicyConfiguration, project: String, configurationId: Double): js.Promise[PolicyConfiguration] = js.native
    def deletePolicyConfiguration(project: String, configurationId: Double): js.Promise[Unit] = js.native
    def getPolicyConfiguration(project: String, configurationId: Double): js.Promise[PolicyConfiguration] = js.native
    def getPolicyConfigurationRevision(project: String, configurationId: Double, revisionId: Double): js.Promise[PolicyConfiguration] = js.native
    def getPolicyConfigurationRevisions(project: String, configurationId: Double): js.Promise[js.Array[PolicyConfiguration]] = js.native
    def getPolicyConfigurationRevisions(project: String, configurationId: Double, top: Double): js.Promise[js.Array[PolicyConfiguration]] = js.native
    def getPolicyConfigurationRevisions(project: String, configurationId: Double, top: Double, skip: Double): js.Promise[js.Array[PolicyConfiguration]] = js.native
    def getPolicyConfigurations(project: String): js.Promise[js.Array[PolicyConfiguration]] = js.native
    def getPolicyConfigurations(project: String, scope: String): js.Promise[js.Array[PolicyConfiguration]] = js.native
    def getPolicyEvaluation(project: String, evaluationId: String): js.Promise[PolicyEvaluationRecord] = js.native
    def getPolicyEvaluations(project: String, artifactId: String): js.Promise[js.Array[PolicyEvaluationRecord]] = js.native
    def getPolicyEvaluations(project: String, artifactId: String, includeNotApplicable: Boolean): js.Promise[js.Array[PolicyEvaluationRecord]] = js.native
    def getPolicyEvaluations(project: String, artifactId: String, includeNotApplicable: Boolean, top: Double): js.Promise[js.Array[PolicyEvaluationRecord]] = js.native
    def getPolicyEvaluations(project: String, artifactId: String, includeNotApplicable: Boolean, top: Double, skip: Double): js.Promise[js.Array[PolicyEvaluationRecord]] = js.native
    def getPolicyType(project: String, typeId: String): js.Promise[PolicyType] = js.native
    def getPolicyTypes(project: String): js.Promise[js.Array[PolicyType]] = js.native
    def requeuePolicyEvaluation(project: String, evaluationId: String): js.Promise[PolicyEvaluationRecord] = js.native
    def updatePolicyConfiguration(configuration: PolicyConfiguration, project: String, configurationId: Double): js.Promise[PolicyConfiguration] = js.native
  }
  
  @js.native
  class PolicyApi protected () extends IPolicyApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  /* static members */
  @js.native
  object PolicyApi extends js.Object {
    val RESOURCE_AREA_ID: String = js.native
  }
  
}

