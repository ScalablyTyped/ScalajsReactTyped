package typingsJapgolly.expoPrebuildConfig

import typingsJapgolly.expoPrebuildConfig.anon.Author
import typingsJapgolly.expoPrebuildConfig.anon.PickContentsJsonimages
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.dark
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.luminosity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPluginsIconsAssetContentsMod {
  
  @JSImport("@expo/prebuild-config/build/plugins/icons/AssetContents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContentsJsonItem(item: ContentsJsonImage): ContentsJsonImage = ^.asInstanceOf[js.Dynamic].applyDynamic("createContentsJsonItem")(item.asInstanceOf[js.Any]).asInstanceOf[ContentsJsonImage]
  
  inline def writeContentsJsonAsync(directory: String, hasImages: PickContentsJsonimages): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeContentsJsonAsync")(directory.asInstanceOf[js.Any], hasImages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ContentsJson extends StObject {
    
    var images: js.Array[ContentsJsonImage]
    
    var info: Author
  }
  object ContentsJson {
    
    inline def apply(images: js.Array[ContentsJsonImage], info: Author): ContentsJson = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsJson]
    }
    
    extension [Self <: ContentsJson](x: Self) {
      
      inline def setImages(value: js.Array[ContentsJsonImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: ContentsJsonImage*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setInfo(value: Author): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentsJsonImage extends StObject {
    
    var appearances: js.UndefOr[js.Array[ContentsJsonImageAppearance]] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var idiom: ContentsJsonImageIdiom
    
    var scale: ContentsJsonImageScale
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ContentsJsonImage {
    
    inline def apply(idiom: ContentsJsonImageIdiom, scale: ContentsJsonImageScale): ContentsJsonImage = {
      val __obj = js.Dynamic.literal(idiom = idiom.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentsJsonImage]
    }
    
    extension [Self <: ContentsJsonImage](x: Self) {
      
      inline def setAppearances(value: js.Array[ContentsJsonImageAppearance]): Self = StObject.set(x, "appearances", value.asInstanceOf[js.Any])
      
      inline def setAppearancesUndefined: Self = StObject.set(x, "appearances", js.undefined)
      
      inline def setAppearancesVarargs(value: ContentsJsonImageAppearance*): Self = StObject.set(x, "appearances", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIdiom(value: ContentsJsonImageIdiom): Self = StObject.set(x, "idiom", value.asInstanceOf[js.Any])
      
      inline def setScale(value: ContentsJsonImageScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ContentsJsonImageAppearance extends StObject {
    
    var appearance: luminosity
    
    var value: dark
  }
  object ContentsJsonImageAppearance {
    
    inline def apply(): ContentsJsonImageAppearance = {
      val __obj = js.Dynamic.literal(appearance = "luminosity", value = "dark")
      __obj.asInstanceOf[ContentsJsonImageAppearance]
    }
    
    extension [Self <: ContentsJsonImageAppearance](x: Self) {
      
      inline def setAppearance(value: luminosity): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setValue(value: dark): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.iphone
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.ipad
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing`
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.universal
  */
  trait ContentsJsonImageIdiom extends StObject
  object ContentsJsonImageIdiom {
    
    inline def `ios-marketing`: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing` = "ios-marketing".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`ios-marketing`]
    
    inline def ipad: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.ipad = "ipad".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.ipad]
    
    inline def iphone: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.iphone = "iphone".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.iphone]
    
    inline def universal: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.universal = "universal".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.universal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`1x`
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`2x`
    - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`3x`
  */
  trait ContentsJsonImageScale extends StObject
  object ContentsJsonImageScale {
    
    inline def `1x`: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`1x` = "1x".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`1x`]
    
    inline def `2x`: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`2x` = "2x".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`2x`]
    
    inline def `3x`: typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`3x` = "3x".asInstanceOf[typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.`3x`]
  }
}
