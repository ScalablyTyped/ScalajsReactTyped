package typingsJapgolly.reactDnd.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDnd.distCoreDragPreviewImageMod.DragPreviewImageProps
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectableElement
import typingsJapgolly.reactDnd.distTypesOptionsMod.DragPreviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragPreviewImage {
  
  inline def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => Element | Null,
    src: String
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DragPreviewImageProps]))
  }
  
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DragPreviewImageProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
