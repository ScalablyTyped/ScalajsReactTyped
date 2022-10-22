package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularDevkitCore.anon.PartialJobDescription
import typingsJapgolly.angularDevkitCore.anon.PartialReadwriteJobDescri
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsCreateJobHandlerMod.SimpleJobHandlerFn
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsDispatcherMod.JobDispatcher
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofjobs extends StObject {
  
  var ChannelAlreadyExistException: Instantiable1[
    /* name */ String, 
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.ChannelAlreadyExistException
  ] = js.native
  
  var FallbackRegistry: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.FallbackRegistry[JsonValue, JsonValue, JsonValue]
  ] = js.native
  
  var JobArgumentSchemaValidationError: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.JobArgumentSchemaValidationError
  ] = js.native
  
  var JobDoesNotExistException: Instantiable1[
    /* name */ JobName, 
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.JobDoesNotExistException
  ] = js.native
  
  var JobInboundMessageSchemaValidationError: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.JobInboundMessageSchemaValidationError
  ] = js.native
  
  var JobNameAlreadyRegisteredException: Instantiable1[
    /* name */ JobName, 
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.JobNameAlreadyRegisteredException
  ] = js.native
  
  var JobOutputSchemaValidationError: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.JobOutputSchemaValidationError
  ] = js.native
  
  var SimpleJobRegistry: Instantiable0[
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.SimpleJobRegistry[JsonValue, JsonValue, JsonValue]
  ] = js.native
  
  var SimpleScheduler: Instantiable1[
    /* _jobRegistry */ Registry[
      /* import warning: RewrittenClass.unapply cls was tparam MinimumArgumentT */ Any, 
      /* import warning: RewrittenClass.unapply cls was tparam MinimumInputT */ Any, 
      /* import warning: RewrittenClass.unapply cls was tparam MinimumOutputT */ Any
    ], 
    typingsJapgolly.angularDevkitCore.mod.experimental.jobs.SimpleScheduler[JsonValue, JsonValue, JsonValue]
  ] = js.native
  
  def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobDispatcher[A, I, O] = js.native
  def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](options: PartialReadwriteJobDescri): JobDispatcher[A, I, O] = js.native
  
  def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]]): JobHandler[A, I, O] = js.native
  def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]], options: PartialJobDescription): JobHandler[A, I, O] = js.native
  
  def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O]): JobHandler[A, I, O] = js.native
  def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O], options: PartialJobDescription): JobHandler[A, I, O] = js.native
  
  def createLoggerJob[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](job: JobHandler[A, I, O], logger: LoggerApi): JobHandler[A, I, O] = js.native
  
  def isJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](value: Any): /* is @angular-devkit/core.@angular-devkit/core/src/experimental/jobs/api.JobHandler<A, I, O> */ Boolean = js.native
  
  val strategy: Typeofstrategy = js.native
}
