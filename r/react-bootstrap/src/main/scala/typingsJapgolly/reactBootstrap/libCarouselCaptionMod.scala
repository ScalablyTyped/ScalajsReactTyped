package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselCaptionMod {
  
  @JSImport("react-bootstrap/lib/CarouselCaption", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[CarouselCaptionProps, js.Object, Any]
  
  type CarouselCaption = japgolly.scalajs.react.facade.React.Component[CarouselCaptionProps & js.Object, js.Object]
  
  trait CarouselCaptionProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[CarouselCaptionProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object CarouselCaptionProps {
    
    inline def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    extension [Self <: CarouselCaptionProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
