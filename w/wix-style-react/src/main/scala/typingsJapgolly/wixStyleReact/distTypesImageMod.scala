package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Image", JSImport.Default)
  @js.native
  val default: FC[ImageProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.contain
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.cover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tile
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
  */
  trait ImageFit extends StObject
  object ImageFit {
    
    inline def contain: typingsJapgolly.wixStyleReact.wixStyleReactStrings.contain = "contain".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.contain]
    
    inline def cover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.cover = "cover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.cover]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def tile: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tile = "tile".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tile]
  }
  
  trait ImageProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement] {
    
    var borderRadius: js.UndefOr[BorderRadius[String | Double]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fit: js.UndefOr[ImageFit] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var showBorder: js.UndefOr[Boolean] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setBorderRadius(value: BorderRadius[String | Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFit(value: ImageFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowBorder(value: Boolean): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  type _To = FC[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesImageMod.foo` */
  override def _to: FC[ImageProps] = default
}
