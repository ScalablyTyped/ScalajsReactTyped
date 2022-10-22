package typingsJapgolly.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.wallpaper
///////////////
// Wallpaper //
///////////////
/**
  * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
  * @requires Permissions: 'wallpaper'
  * @requires Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object wallpaper {
  
  @js.native
  sealed trait WallpaperLayout extends StObject
  @JSGlobal("chrome.wallpaper.WallpaperLayout")
  @js.native
  object WallpaperLayout extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with WallpaperLayout
    
    @js.native
    sealed trait CENTER_CROPPED
      extends StObject
         with WallpaperLayout
    
    @js.native
    sealed trait STRETCH
      extends StObject
         with WallpaperLayout
  }
  
  trait WallpaperDetails extends StObject {
    
    /** The jpeg or png encoded wallpaper image. */
    var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    /** The file name of the saved wallpaper. */
    var filename: String
    
    /**
      * The supported wallpaper layouts.
      * @see WallpaperLayout
      */
    var layout: WallpaperLayout | WallpaperLayoutType
    
    /** True if a 128x60 thumbnail should be generated. */
    var thumbnail: js.UndefOr[Boolean] = js.undefined
    
    /** The URL of the wallpaper to be set. */
    var url: js.UndefOr[String] = js.undefined
  }
  object WallpaperDetails {
    
    inline def apply(filename: String, layout: WallpaperLayout | WallpaperLayoutType): WallpaperDetails = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WallpaperDetails]
    }
    
    extension [Self <: WallpaperDetails](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: WallpaperLayout | WallpaperLayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: Boolean): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.STRETCH
    - typingsJapgolly.chromeApps.chromeAppsStrings.CENTER
    - typingsJapgolly.chromeApps.chromeAppsStrings.CENTER_CROPPED
  */
  trait WallpaperLayoutType extends StObject
  object WallpaperLayoutType {
    
    inline def CENTER: typingsJapgolly.chromeApps.chromeAppsStrings.CENTER = "CENTER".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.CENTER]
    
    inline def CENTER_CROPPED: typingsJapgolly.chromeApps.chromeAppsStrings.CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.CENTER_CROPPED]
    
    inline def STRETCH: typingsJapgolly.chromeApps.chromeAppsStrings.STRETCH = "STRETCH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.STRETCH]
  }
}
