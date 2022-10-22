package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiffKind extends StObject
@JSImport("@pulumi/pulumi/automation/events", "DiffKind")
@js.native
object DiffKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiffKind & String] = js.native
  
  @js.native
  sealed trait add
    extends StObject
       with DiffKind
  /* "add" */ val add: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.add & String = js.native
  
  @js.native
  sealed trait addReplace
    extends StObject
       with DiffKind
  /* "add-replace" */ val addReplace: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.addReplace & String = js.native
  
  @js.native
  sealed trait delete
    extends StObject
       with DiffKind
  /* "delete" */ val delete: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.delete & String = js.native
  
  @js.native
  sealed trait deleteReplace
    extends StObject
       with DiffKind
  /* "delete-replace" */ val deleteReplace: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.deleteReplace & String = js.native
  
  @js.native
  sealed trait update
    extends StObject
       with DiffKind
  /* "update" */ val update: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.update & String = js.native
  
  @js.native
  sealed trait updateReplace
    extends StObject
       with DiffKind
  /* "update-replace" */ val updateReplace: typingsJapgolly.pulumiPulumi.automationEventsMod.DiffKind.updateReplace & String = js.native
}
