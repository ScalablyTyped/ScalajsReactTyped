package typingsJapgolly.reactFileUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsThumbnailMod {
  
  @JSImport("react-file-utils/dist/components/Thumbnail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Thumbnail(hasImageSizeHandleCloseAlt: ThumbnailProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Thumbnail")(hasImageSizeHandleCloseAlt.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ThumbnailProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var handleClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: String
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object ThumbnailProps {
    
    inline def apply(image: String): ThumbnailProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    extension [Self <: ThumbnailProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setHandleClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "handleClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setHandleCloseUndefined: Self = StObject.set(x, "handleClose", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
