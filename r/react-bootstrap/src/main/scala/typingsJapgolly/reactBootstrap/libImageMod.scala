package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageMod {
  
  @JSImport("react-bootstrap/lib/Image", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ImageProps, js.Object, Any]
  
  type Image = japgolly.scalajs.react.facade.React.Component[ImageProps & js.Object, js.Object]
  
  trait ImageProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[ImageProps & js.Object, js.Object]] {
    
    var circle: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var thumbnail: js.UndefOr[Boolean] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
}
