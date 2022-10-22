package typingsJapgolly.angularDevkitSchematics

import typingsJapgolly.angularDevkitCore.mod.schema.CoreSchemaRegistry
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typingsJapgolly.angularDevkitSchematics.anon.PartialWorkflowExecutionC
import typingsJapgolly.angularDevkitSchematics.anon.ReadonlyWorkflowExecution
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Engine
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.EngineHost
import typingsJapgolly.angularDevkitSchematics.srcSinkDryrunMod.DryRunEvent
import typingsJapgolly.angularDevkitSchematics.srcSinkSinkMod.Sink
import typingsJapgolly.angularDevkitSchematics.srcWorkflowInterfaceMod.LifeCycleEvent
import typingsJapgolly.angularDevkitSchematics.srcWorkflowInterfaceMod.Workflow
import typingsJapgolly.angularDevkitSchematics.srcWorkflowInterfaceMod.WorkflowExecutionContext
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkflowBaseMod {
  
  /* note: abstract class */ @JSImport("@angular-devkit/schematics/src/workflow/base", "BaseWorkflow")
  @js.native
  open class BaseWorkflow protected ()
    extends StObject
       with Workflow {
    def this(options: BaseWorkflowOptions) = this()
    
    /* protected */ var _context: js.Array[WorkflowExecutionContext] = js.native
    
    /* protected */ def _createSinks(): js.Array[Sink] = js.native
    
    /* protected */ var _dryRun: Boolean = js.native
    
    /* protected */ var _engine: Engine[js.Object, js.Object] = js.native
    
    /* protected */ var _engineHost: EngineHost[js.Object, js.Object] = js.native
    
    /* protected */ var _force: Boolean = js.native
    
    /* protected */ var _host: Host[js.Object] = js.native
    
    /* protected */ var _lifeCycle: Subject[LifeCycleEvent] = js.native
    
    /* protected */ var _registry: CoreSchemaRegistry = js.native
    
    /* protected */ var _reporter: Subject[DryRunEvent] = js.native
    
    /* CompleteClass */
    override val context: ReadonlyWorkflowExecution = js.native
    @JSName("context")
    def context_MBaseWorkflow: ReadonlyWorkflowExecution = js.native
    
    def engine: Engine[js.Object, js.Object] = js.native
    
    def engineHost: EngineHost[js.Object, js.Object] = js.native
    
    /* CompleteClass */
    override def execute(options: PartialWorkflowExecutionC): Observable_[Unit] = js.native
    
    def lifeCycle: Observable_[LifeCycleEvent] = js.native
    
    def registry: SchemaRegistry = js.native
    
    def reporter: Observable_[DryRunEvent] = js.native
  }
  
  trait BaseWorkflowOptions extends StObject {
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var engineHost: EngineHost[js.Object, js.Object]
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var host: Host[js.Object]
    
    var registry: js.UndefOr[CoreSchemaRegistry] = js.undefined
  }
  object BaseWorkflowOptions {
    
    inline def apply(engineHost: EngineHost[js.Object, js.Object], host: Host[js.Object]): BaseWorkflowOptions = {
      val __obj = js.Dynamic.literal(engineHost = engineHost.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseWorkflowOptions]
    }
    
    extension [Self <: BaseWorkflowOptions](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setEngineHost(value: EngineHost[js.Object, js.Object]): Self = StObject.set(x, "engineHost", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setHost(value: Host[js.Object]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: CoreSchemaRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}
