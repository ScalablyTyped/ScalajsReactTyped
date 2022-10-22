package typingsJapgolly.snyk

import typingsJapgolly.snyk.anon.Type
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.ContainerTarget
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.GitTarget
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.MonitorDependenciesResponse
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.NamedTarget
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.TestDepGraphMeta
import typingsJapgolly.snyk.distLibSnykTestLegacyMod.TestDependenciesResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPollingTypesMod {
  
  trait PollingTask extends StObject {
    
    var maxAttempts: Double
    
    var pollInterval: Double
  }
  object PollingTask {
    
    inline def apply(maxAttempts: Double, pollInterval: Double): PollingTask = {
      val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], pollInterval = pollInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollingTask]
    }
    
    extension [Self <: PollingTask](x: Self) {
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolutionMeta extends StObject {
    
    var identity: Type
    
    var name: js.UndefOr[String] = js.undefined
    
    var policy: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[GitTarget | ContainerTarget | NamedTarget] = js.undefined
    
    var targetReference: js.UndefOr[String] = js.undefined
  }
  object ResolutionMeta {
    
    inline def apply(identity: Type): ResolutionMeta = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolutionMeta]
    }
    
    extension [Self <: ResolutionMeta](x: Self) {
      
      inline def setIdentity(value: Type): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setTarget(value: GitTarget | ContainerTarget | NamedTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetReference(value: String): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
      
      inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ResolveAndMonitorFactsResponse
    extends StObject
       with ResolveFactsState
       with MonitorDependenciesResponse
  object ResolveAndMonitorFactsResponse {
    
    inline def apply(
      id: String,
      isMonitored: Boolean,
      licensesPolicy: Any,
      ok: Boolean,
      org_ : String,
      path: String,
      pollingTask: PollingTask,
      projectName: String,
      token: String,
      trialStarted: Boolean,
      uri: String
    ): ResolveAndMonitorFactsResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isMonitored = isMonitored.asInstanceOf[js.Any], licensesPolicy = licensesPolicy.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pollingTask = pollingTask.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], trialStarted = trialStarted.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveAndMonitorFactsResponse]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.snyk.distLibPollingTypesMod.TestDependenciesResponse because var conflicts: meta. Inlined result */ trait ResolveAndTestFactsResponse
    extends StObject
       with ResolveFactsState {
    
    var result: js.UndefOr[TestDependenciesResult] = js.undefined
  }
  object ResolveAndTestFactsResponse {
    
    inline def apply(pollingTask: PollingTask, token: String): ResolveAndTestFactsResponse = {
      val __obj = js.Dynamic.literal(pollingTask = pollingTask.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveAndTestFactsResponse]
    }
    
    extension [Self <: ResolveAndTestFactsResponse](x: Self) {
      
      inline def setResult(value: TestDependenciesResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait ResolveFactsState extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[TestDepGraphMeta] = js.undefined
    
    var pollingTask: PollingTask
    
    var resolutionMeta: js.UndefOr[ResolutionMeta] = js.undefined
    
    var status: js.UndefOr[ResolveFactsStatus] = js.undefined
    
    var token: String
    
    var userMessage: js.UndefOr[String] = js.undefined
  }
  object ResolveFactsState {
    
    inline def apply(pollingTask: PollingTask, token: String): ResolveFactsState = {
      val __obj = js.Dynamic.literal(pollingTask = pollingTask.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveFactsState]
    }
    
    extension [Self <: ResolveFactsState](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMeta(value: TestDepGraphMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPollingTask(value: PollingTask): Self = StObject.set(x, "pollingTask", value.asInstanceOf[js.Any])
      
      inline def setResolutionMeta(value: ResolutionMeta): Self = StObject.set(x, "resolutionMeta", value.asInstanceOf[js.Any])
      
      inline def setResolutionMetaUndefined: Self = StObject.set(x, "resolutionMeta", js.undefined)
      
      inline def setStatus(value: ResolveFactsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUserMessage(value: String): Self = StObject.set(x, "userMessage", value.asInstanceOf[js.Any])
      
      inline def setUserMessageUndefined: Self = StObject.set(x, "userMessage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.snyk.snykStrings.CANCELLED
    - typingsJapgolly.snyk.snykStrings.ERROR
    - typingsJapgolly.snyk.snykStrings.PENDING
    - typingsJapgolly.snyk.snykStrings.RUNNING
    - typingsJapgolly.snyk.snykStrings.OK
  */
  trait ResolveFactsStatus extends StObject
  object ResolveFactsStatus {
    
    inline def CANCELLED: typingsJapgolly.snyk.snykStrings.CANCELLED = "CANCELLED".asInstanceOf[typingsJapgolly.snyk.snykStrings.CANCELLED]
    
    inline def ERROR: typingsJapgolly.snyk.snykStrings.ERROR = "ERROR".asInstanceOf[typingsJapgolly.snyk.snykStrings.ERROR]
    
    inline def OK: typingsJapgolly.snyk.snykStrings.OK = "OK".asInstanceOf[typingsJapgolly.snyk.snykStrings.OK]
    
    inline def PENDING: typingsJapgolly.snyk.snykStrings.PENDING = "PENDING".asInstanceOf[typingsJapgolly.snyk.snykStrings.PENDING]
    
    inline def RUNNING: typingsJapgolly.snyk.snykStrings.RUNNING = "RUNNING".asInstanceOf[typingsJapgolly.snyk.snykStrings.RUNNING]
  }
  
  trait TestDependenciesResponse extends StObject {
    
    var meta: js.UndefOr[TestDepGraphMeta] = js.undefined
    
    var result: js.UndefOr[TestDependenciesResult] = js.undefined
  }
  object TestDependenciesResponse {
    
    inline def apply(): TestDependenciesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestDependenciesResponse]
    }
    
    extension [Self <: TestDependenciesResponse](x: Self) {
      
      inline def setMeta(value: TestDepGraphMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setResult(value: TestDependenciesResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
