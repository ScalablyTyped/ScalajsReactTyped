package typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckboxVisibility extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "CheckboxVisibility")
@js.native
object CheckboxVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxVisibility & Double] = js.native
  
  /** Visible always. */
  @js.native
  sealed trait always
    extends StObject
       with CheckboxVisibility
  /* 1 */ val always: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.always & Double = js.native
  
  /** Hide checkboxes. */
  @js.native
  sealed trait hidden
    extends StObject
       with CheckboxVisibility
  /* 2 */ val hidden: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.hidden & Double = js.native
  
  /** Visible on hover. */
  @js.native
  sealed trait onHover
    extends StObject
       with CheckboxVisibility
  /* 0 */ val onHover: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility.onHover & Double = js.native
}
