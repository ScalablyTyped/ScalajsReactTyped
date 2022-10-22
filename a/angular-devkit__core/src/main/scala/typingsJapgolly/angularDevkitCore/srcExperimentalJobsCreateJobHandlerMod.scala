package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.anon.PartialJobDescription
import typingsJapgolly.angularDevkitCore.srcExceptionMod.BaseException
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Job
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobDescription
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobHandlerContext
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessage
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Scheduler
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Observer
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsCreateJobHandlerMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/create-job-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/create-job-handler", "ChannelAlreadyExistException")
  @js.native
  open class ChannelAlreadyExistException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
  inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
  inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  inline def createLoggerJob[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](job: JobHandler[A, I, O], logger: LoggerApi): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerJob")(job.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  trait SimpleJobHandlerContext[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */]
    extends StObject
       with JobHandlerContext[A, I, O] {
    
    def createChannel(name: String): Observer[JsonValue]
    
    var input: Observable_[I]
  }
  object SimpleJobHandlerContext {
    
    inline def apply[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](
      createChannel: String => Observer[JsonValue],
      dependencies: js.Array[Job[JsonValue, JsonValue, JsonValue]],
      description: JobDescription,
      inboundBus: Observable_[JobInboundMessage[I]],
      input: Observable_[I],
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    ): SimpleJobHandlerContext[A, I, O] = {
      val __obj = js.Dynamic.literal(createChannel = js.Any.fromFunction1(createChannel), dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inboundBus = inboundBus.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleJobHandlerContext[A, I, O]]
    }
    
    extension [Self <: SimpleJobHandlerContext[?, ?, ?], A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](x: Self & (SimpleJobHandlerContext[A, I, O])) {
      
      inline def setCreateChannel(value: String => Observer[JsonValue]): Self = StObject.set(x, "createChannel", js.Any.fromFunction1(value))
      
      inline def setInput(value: Observable_[I]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleJobHandlerFn[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */] = js.Function2[
    /* input */ A, 
    /* context */ SimpleJobHandlerContext[A, I, O], 
    O | js.Promise[O] | Observable_[O]
  ]
}
