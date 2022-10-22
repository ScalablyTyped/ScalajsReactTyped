package typingsJapgolly.reactDnd

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectableElement
import typingsJapgolly.reactDnd.distTypesOptionsMod.DragPreviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDragPreviewImageMod {
  
  @JSImport("react-dnd/dist/core/DragPreviewImage", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  trait DragPreviewImageProps extends StObject {
    
    var connect: ConnectDragPreview
    
    var src: String
  }
  object DragPreviewImageProps {
    
    inline def apply(
      connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => Element | Null,
      src: String
    ): DragPreviewImageProps = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragPreviewImageProps]
    }
    
    extension [Self <: DragPreviewImageProps](x: Self) {
      
      inline def setConnect(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => Element | Null
      ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
