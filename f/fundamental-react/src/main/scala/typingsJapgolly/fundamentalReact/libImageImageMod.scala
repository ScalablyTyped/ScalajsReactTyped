package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.circle
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageImageMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Image/Image", JSImport.Default)
  @js.native
  val default: FunctionComponent[ImageProps] = js.native
  
  trait ImageProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var photo: String
    
    var size: imageSize
    
    var `type`: js.UndefOr[imageType] = js.undefined
  }
  object ImageProps {
    
    inline def apply(photo: String, size: imageSize): ImageProps = {
      val __obj = js.Dynamic.literal(photo = photo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setPhoto(value: String): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      inline def setSize(value: imageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: imageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `libImageImageMod.foo` */
  override def _to: FunctionComponent[ImageProps] = default
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.s
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.m
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.l
  */
  trait imageSize extends StObject
  object imageSize {
    
    inline def l: typingsJapgolly.fundamentalReact.fundamentalReactStrings.l = "l".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.l]
    
    inline def m: typingsJapgolly.fundamentalReact.fundamentalReactStrings.m = "m".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.m]
    
    inline def s: typingsJapgolly.fundamentalReact.fundamentalReactStrings.s = "s".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.s]
  }
  
  type imageType = circle
}
