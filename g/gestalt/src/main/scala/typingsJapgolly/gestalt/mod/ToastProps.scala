package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.rectangle
import typingsJapgolly.gestalt.gestaltStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastProps extends StObject {
  
  var button: js.UndefOr[Node] = js.undefined
  
  var text: js.UndefOr[String | Node] = js.undefined
  
  var thumbnail: js.UndefOr[Node] = js.undefined
  
  var thumbnailShape: js.UndefOr[circle | rectangle | square] = js.undefined
  
  var variant: js.UndefOr[default | error] = js.undefined
}
object ToastProps {
  
  inline def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  
  extension [Self <: ToastProps](x: Self) {
    
    inline def setButton(value: VdomNode): Self = StObject.set(x, "button", value.rawNode.asInstanceOf[js.Any])
    
    inline def setButtonNull: Self = StObject.set(x, "button", null)
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "button", js.Array(value*))
    
    inline def setButtonVdomElement(value: VdomElement): Self = StObject.set(x, "button", value.rawElement.asInstanceOf[js.Any])
    
    inline def setText(value: String | Node): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: VdomNode): Self = StObject.set(x, "thumbnail", value.rawNode.asInstanceOf[js.Any])
    
    inline def setThumbnailNull: Self = StObject.set(x, "thumbnail", null)
    
    inline def setThumbnailShape(value: circle | rectangle | square): Self = StObject.set(x, "thumbnailShape", value.asInstanceOf[js.Any])
    
    inline def setThumbnailShapeUndefined: Self = StObject.set(x, "thumbnailShape", js.undefined)
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setThumbnailVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "thumbnail", js.Array(value*))
    
    inline def setThumbnailVdomElement(value: VdomElement): Self = StObject.set(x, "thumbnail", value.rawElement.asInstanceOf[js.Any])
    
    inline def setVariant(value: default | error): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
