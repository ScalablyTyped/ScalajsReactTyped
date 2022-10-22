package typingsJapgolly.next

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.next.anon.Alt
import typingsJapgolly.next.nextStrings.alt
import typingsJapgolly.next.nextStrings.height
import typingsJapgolly.next.nextStrings.loading
import typingsJapgolly.next.nextStrings.ref
import typingsJapgolly.next.nextStrings.src
import typingsJapgolly.next.nextStrings.srcSet
import typingsJapgolly.next.nextStrings.width
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientFutureImageMod {
  
  @JSImport("next/dist/client/future/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasSrcSizesUnoptimizedPriorityLoadingClassNameQualityWidthHeightFillStyleOnLoadingCompletePlaceholderBlurDataURLAll: ImageProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasSrcSizesUnoptimizedPriorityLoadingClassNameQualityWidthHeightFillStyleOnLoadingCompletePlaceholderBlurDataURLAll.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ImageLoader = js.Function1[/* p */ ImageLoaderProps, String]
  
  trait ImageLoaderProps extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var src: String
    
    var width: Double
  }
  object ImageLoaderProps {
    
    inline def apply(src: String, width: Double): ImageLoaderProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageLoaderProps]
    }
    
    extension [Self <: ImageLoaderProps](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageProps = (Omit[
    DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
    src | srcSet | ref | alt | width | height | loading
  ]) & Alt
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.`lazy`
    - typingsJapgolly.next.nextStrings.eager
    - scala.Unit
  */
  type LoadingValue = js.UndefOr[_LoadingValue]
  
  type OnLoadingComplete = js.Function1[/* img */ HTMLImageElement, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.blur
    - typingsJapgolly.next.nextStrings.empty
  */
  trait PlaceholderValue extends StObject
  object PlaceholderValue {
    
    inline def blur: typingsJapgolly.next.nextStrings.blur = "blur".asInstanceOf[typingsJapgolly.next.nextStrings.blur]
    
    inline def empty: typingsJapgolly.next.nextStrings.empty = "empty".asInstanceOf[typingsJapgolly.next.nextStrings.empty]
  }
  
  trait StaticImageData
    extends StObject
       with StaticImport {
    
    var blurDataURL: js.UndefOr[String] = js.undefined
    
    var blurHeight: js.UndefOr[Double] = js.undefined
    
    var blurWidth: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var src: String
    
    var width: Double
  }
  object StaticImageData {
    
    inline def apply(height: Double, src: String, width: Double): StaticImageData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticImageData]
    }
    
    extension [Self <: StaticImageData](x: Self) {
      
      inline def setBlurDataURL(value: String): Self = StObject.set(x, "blurDataURL", value.asInstanceOf[js.Any])
      
      inline def setBlurDataURLUndefined: Self = StObject.set(x, "blurDataURL", js.undefined)
      
      inline def setBlurHeight(value: Double): Self = StObject.set(x, "blurHeight", value.asInstanceOf[js.Any])
      
      inline def setBlurHeightUndefined: Self = StObject.set(x, "blurHeight", js.undefined)
      
      inline def setBlurWidth(value: Double): Self = StObject.set(x, "blurWidth", value.asInstanceOf[js.Any])
      
      inline def setBlurWidthUndefined: Self = StObject.set(x, "blurWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.distClientFutureImageMod.StaticRequire
    - typingsJapgolly.next.distClientFutureImageMod.StaticImageData
  */
  trait StaticImport extends StObject
  object StaticImport {
    
    inline def StaticImageData(height: Double, src: String, width: Double): typingsJapgolly.next.distClientFutureImageMod.StaticImageData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.distClientFutureImageMod.StaticImageData]
    }
    
    inline def StaticRequire(default: StaticImageData): typingsJapgolly.next.distClientFutureImageMod.StaticRequire = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.distClientFutureImageMod.StaticRequire]
    }
  }
  
  trait StaticRequire
    extends StObject
       with StaticImport {
    
    var default: StaticImageData
  }
  object StaticRequire {
    
    inline def apply(default: StaticImageData): StaticRequire = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRequire]
    }
    
    extension [Self <: StaticRequire](x: Self) {
      
      inline def setDefault(value: StaticImageData): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait _LoadingValue extends StObject
}
