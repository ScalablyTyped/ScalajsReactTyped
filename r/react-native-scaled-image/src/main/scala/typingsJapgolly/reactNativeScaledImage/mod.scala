package typingsJapgolly.reactNativeScaledImage

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-scaled-image", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScaledImageProps, js.Object, Any]
  
  type ScaledImage = japgolly.scalajs.react.facade.React.Component[ScaledImageProps & js.Object, js.Object]
  
  trait ScaledImageProps extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var source: ImageSourcePropType
    
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ScaledImageProps {
    
    inline def apply(source: ImageSourcePropType): ScaledImageProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaledImageProps]
    }
    
    extension [Self <: ScaledImageProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
