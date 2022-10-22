package typingsJapgolly.next

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.next.anon.BlurDataURL
import typingsJapgolly.next.anon.NaturalHeight
import typingsJapgolly.next.nextStrings.height
import typingsJapgolly.next.nextStrings.loading
import typingsJapgolly.next.nextStrings.ref
import typingsJapgolly.next.nextStrings.src
import typingsJapgolly.next.nextStrings.srcSet
import typingsJapgolly.next.nextStrings.width
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientImageMod {
  
  @JSImport("next/dist/client/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasSrcSizesUnoptimizedPriorityLoadingLazyRootLazyBoundaryClassNameQualityWidthHeightStyleObjectFitObjectPositionOnLoadingCompletePlaceholderBlurDataURLAll: ImageProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasSrcSizesUnoptimizedPriorityLoadingLazyRootLazyBoundaryClassNameQualityWidthHeightStyleObjectFitObjectPositionOnLoadingCompletePlaceholderBlurDataURLAll.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ImageLoader = js.Function1[/* resolverProps */ ImageLoaderProps, String]
  
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
    src | srcSet | ref | width | height | loading
  ]) & BlurDataURL
  
  type ImgElementStyle = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement>['style'] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.fill
    - typingsJapgolly.next.nextStrings.fixed
    - typingsJapgolly.next.nextStrings.intrinsic
    - typingsJapgolly.next.nextStrings.responsive
    - scala.Unit
  */
  type LayoutValue = js.UndefOr[_LayoutValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.`lazy`
    - typingsJapgolly.next.nextStrings.eager
    - scala.Unit
  */
  type LoadingValue = js.UndefOr[_LoadingValue]
  
  type OnLoadingComplete = js.Function1[/* result */ NaturalHeight, Unit]
  
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
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.distClientImageMod.StaticRequire
    - typingsJapgolly.next.distClientImageMod.StaticImageData
  */
  trait StaticImport extends StObject
  object StaticImport {
    
    inline def StaticImageData(height: Double, src: String, width: Double): typingsJapgolly.next.distClientImageMod.StaticImageData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.distClientImageMod.StaticImageData]
    }
    
    inline def StaticRequire(default: StaticImageData): typingsJapgolly.next.distClientImageMod.StaticRequire = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.distClientImageMod.StaticRequire]
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
  
  trait _LayoutValue extends StObject
  
  trait _LoadingValue extends StObject
}
