package typingsJapgolly.rcDialog.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcDialog.esDialogContentMemoChildrenMod.MemoChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MemoChildren {
  
  inline def apply(shouldUpdate: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(shouldUpdate = shouldUpdate.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasChildren */ MemoChildrenProps]))
  }
  
  @JSImport("rc-dialog/es/Dialog/Content/MemoChildren", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasChildren */ MemoChildrenProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
