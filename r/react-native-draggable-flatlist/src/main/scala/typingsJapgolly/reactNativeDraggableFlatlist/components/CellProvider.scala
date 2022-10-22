package typingsJapgolly.reactNativeDraggableFlatlist.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptContextCellContextMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CellProvider {
  
  inline def apply(isActive: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/cellContext", "CellProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
