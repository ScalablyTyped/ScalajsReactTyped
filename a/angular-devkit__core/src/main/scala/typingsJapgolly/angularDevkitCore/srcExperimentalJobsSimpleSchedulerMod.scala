package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Job
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.ScheduleJobOptions
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.Scheduler
import typingsJapgolly.angularDevkitCore.srcJsonMod.schema.SchemaValidationException
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorError
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsSimpleSchedulerMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/simple-scheduler", "JobArgumentSchemaValidationError")
  @js.native
  open class JobArgumentSchemaValidationError () extends SchemaValidationException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/simple-scheduler", "JobInboundMessageSchemaValidationError")
  @js.native
  open class JobInboundMessageSchemaValidationError () extends SchemaValidationException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/simple-scheduler", "JobOutputSchemaValidationError")
  @js.native
  open class JobOutputSchemaValidationError () extends SchemaValidationException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/simple-scheduler", "SimpleScheduler")
  @js.native
  open class SimpleScheduler[MinimumArgumentT /* <: JsonValue */, MinimumInputT /* <: JsonValue */, MinimumOutputT /* <: JsonValue */] protected ()
    extends StObject
       with Scheduler[MinimumArgumentT, MinimumInputT, MinimumOutputT] {
    def this(_jobRegistry: Registry[MinimumArgumentT, MinimumInputT, MinimumOutputT]) = this()
    def this(
      _jobRegistry: Registry[MinimumArgumentT, MinimumInputT, MinimumOutputT],
      _schemaRegistry: SchemaRegistry
    ) = this()
    
    /**
      * Create the job.
      * @private
      */
    /* private */ var _createJob: Any = js.native
    
    /**
      * Filter messages.
      * @private
      */
    /* private */ var _filterJobOutboundMessages: Any = js.native
    
    /* private */ var _getInternalDescription: Any = js.native
    
    /* private */ var _internalJobDescriptionMap: Any = js.native
    
    /* protected */ var _jobRegistry: Registry[MinimumArgumentT, MinimumInputT, MinimumOutputT] = js.native
    
    /* private */ var _pauseCounter: Any = js.native
    
    /* private */ var _queue: Any = js.native
    
    /* protected */ def _scheduleJob[A /* <: MinimumArgumentT */, I /* <: MinimumInputT */, O /* <: MinimumOutputT */](name: JobName, argument: A, options: ScheduleJobOptions, waitable: Observable_[scala.Nothing]): Job[A, I, O] = js.native
    
    /* protected */ var _schemaRegistry: SchemaRegistry = js.native
    
    /**
      * Return a new state. This is just to simplify the reading of the _createJob method.
      * @private
      */
    /* private */ var _updateState: Any = js.native
  }
}
