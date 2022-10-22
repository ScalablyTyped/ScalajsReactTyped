package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkflowServices {
  
  // TODO: comments, types
  @JSGlobal("SP.WorkflowServices.InteropService")
  @js.native
  open class InteropService protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.InteropService {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsJapgolly.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object InteropService {
    
    @JSGlobal("SP.WorkflowServices.InteropService")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getCurrent(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.WorkflowServices.InteropService = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.WorkflowServices.InteropService]
  }
  
  /** Represents a workflow definition and associated properties. */
  @JSGlobal("SP.WorkflowServices.WorkflowDefinition")
  @js.native
  open class WorkflowDefinition protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowDefinition {
    def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext) = this()
  }
  
  /** Manages workflow definitions and workflow activity authoring. */
  @JSGlobal("SP.WorkflowServices.WorkflowDeploymentService")
  @js.native
  open class WorkflowDeploymentService ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowDeploymentService
  
  /** Represents an instance of a workflow association that performs on a list item the process that is defined in a workflow template */
  @JSGlobal("SP.WorkflowServices.WorkflowInstance")
  @js.native
  open class WorkflowInstance ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowInstance
  
  /** Reads the SharePoint workflow instances from the external workflow host and manages the instance execution. */
  @JSGlobal("SP.WorkflowServices.WorkflowInstanceService")
  @js.native
  open class WorkflowInstanceService ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowInstanceService
  
  /** Describes the workflow host configuration states and provides service objects that interact with the workflow */
  @JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
  @js.native
  open class WorkflowServicesManager protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowServicesManager {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ) = this()
  }
  object WorkflowServicesManager {
    
    @JSGlobal("SP.WorkflowServices.WorkflowServicesManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def newObject(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowServicesManager = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowServicesManager]
  }
  
  @JSGlobal("SP.WorkflowServices.WorkflowStatus")
  @js.native
  object WorkflowStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus & Double] = js.native
    
    /* 4 */ val canceled: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.canceled & Double = js.native
    
    /* 3 */ val canceling: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.canceling & Double = js.native
    
    /* 6 */ val completed: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.completed & Double = js.native
    
    /* 8 */ val invalid: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.invalid & Double = js.native
    
    /* 7 */ val notSpecified: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.notSpecified & Double = js.native
    
    /* 0 */ val notStarted: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.notStarted & Double = js.native
    
    /* 1 */ val started: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.started & Double = js.native
    
    /* 2 */ val suspended: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.suspended & Double = js.native
    
    /* 5 */ val terminated: typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowStatus.terminated & Double = js.native
  }
  
  /** Base class representing subscriptions for the external workflow host. */
  @JSGlobal("SP.WorkflowServices.WorkflowSubscription")
  @js.native
  open class WorkflowSubscription ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowSubscription
  
  @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
  @js.native
  open class WorkflowSubscriptionService protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsJapgolly.sharepoint.SP.ObjectPathStaticProperty
    ) = this()
  }
  object WorkflowSubscriptionService {
    
    @JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getCurrent(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.WorkflowServices.WorkflowSubscriptionService]
  }
}
