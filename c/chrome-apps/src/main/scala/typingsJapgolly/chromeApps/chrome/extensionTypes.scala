package typingsJapgolly.chromeApps.chrome

import typingsJapgolly.chromeApps.chrome.extensionTypes.internal.InjectDetailsBase
import typingsJapgolly.chromeApps.chromeAppsStrings.jpeg
import typingsJapgolly.chromeApps.chromeAppsStrings.png
import typingsJapgolly.chromeApps.chromeAppsStrings.user_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.extensionTypes
/////////////////////
// Extension Types //
/////////////////////
/**
  * Primary for extensions, but also used in apps.
  * https://developer.chrome.com/extensions/extensionTypes#type-ImageDetails
  * @since Chrome 39.
  **/
object extensionTypes {
  
  /**
    * @since Chrome 66.
    * @description The origin of injected CSS.
    **/
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.author
    - typingsJapgolly.chromeApps.chromeAppsStrings.user_
  */
  trait CSSOrigin extends StObject
  object CSSOrigin {
    
    inline def author: typingsJapgolly.chromeApps.chromeAppsStrings.author = "author".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.author]
    
    inline def user: user_ = "user".asInstanceOf[user_]
  }
  
  /**
    * Details about the format and quality of an image.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsJpeg
    - typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsPng
  */
  trait ImageDetails extends StObject
  object ImageDetails {
    
    inline def ImageDetailsJpeg(): typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsJpeg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsJpeg]
    }
    
    inline def ImageDetailsPng(): typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsPng = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.chromeApps.chrome.extensionTypes.ImageDetailsPng]
    }
  }
  
  trait ImageDetailsJpeg
    extends StObject
       with ImageDetails {
    
    /**
      * The format of the resulting image.
      */
    var format: js.UndefOr[png] = js.undefined
  }
  object ImageDetailsJpeg {
    
    inline def apply(): ImageDetailsJpeg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDetailsJpeg]
    }
    
    extension [Self <: ImageDetailsJpeg](x: Self) {
      
      inline def setFormat(value: png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait ImageDetailsPng
    extends StObject
       with ImageDetails {
    
    /**
      * The format of the resulting image.
      * @default 'jpeg'
      */
    var format: js.UndefOr[jpeg] = js.undefined
    
    /**
      * Controls the quality of the resulting image.
      * As quality is decreased, the resulting image
      * will have more visual artifacts, and the number
      * of bytes needed to store it will decrease.
      */
    var quality: js.UndefOr[integer] = js.undefined
  }
  object ImageDetailsPng {
    
    inline def apply(): ImageDetailsPng = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDetailsPng]
    }
    
    extension [Self <: ImageDetailsPng](x: Self) {
      
      inline def setFormat(value: jpeg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  trait InjectCodeDetails
    extends StObject
       with InjectDetailsBase {
    
    /**
      * JavaScript or CSS code to inject.
      * **⚠ Warning**
      * Be careful using the code parameter.
      * Incorrect use of it may open your app
      * to cross site scripting attacks.
      * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
      */
    var code: String
  }
  object InjectCodeDetails {
    
    inline def apply(code: String, cssOrigin: CSSOrigin, runAt: RunAt): InjectCodeDetails = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectCodeDetails]
    }
    
    extension [Self <: InjectCodeDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait InjectFileDetails
    extends StObject
       with InjectDetailsBase {
    
    /** JavaScript or CSS file to inject. */
    var file: String
  }
  object InjectFileDetails {
    
    inline def apply(cssOrigin: CSSOrigin, file: String, runAt: RunAt): InjectFileDetails = {
      val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectFileDetails]
    }
    
    extension [Self <: InjectFileDetails](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    **/
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.document_start
    - typingsJapgolly.chromeApps.chromeAppsStrings.document_end
    - typingsJapgolly.chromeApps.chromeAppsStrings.document_idle
  */
  trait RunAt extends StObject
  object RunAt {
    
    inline def document_end: typingsJapgolly.chromeApps.chromeAppsStrings.document_end = "document_end".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.document_end]
    
    inline def document_idle: typingsJapgolly.chromeApps.chromeAppsStrings.document_idle = "document_idle".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.document_idle]
    
    inline def document_start: typingsJapgolly.chromeApps.chromeAppsStrings.document_start = "document_start".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.document_start]
  }
  
  /**
    * Internal interfaces, not to be used directly
    * @private
    * @internal
    */
  object internal {
    
    /**
      * Partial, use these interfaces instead:
      * @see InjectCodeDetails
      * @see InjectFileDetails
      */
    trait InjectDetailsBase extends StObject {
      
      /**
        * If allFrames is true, implies that the JavaScript or CSS should be
        * injected into all frames of current page. By default, it's false
        * and is only injected into the top frame. If true and frameId is set,
        * then the code is inserted in the selected frame and all of its child frames.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The origin of the CSS to inject.
        * This may only be specified for CSS, not JavaScript.
        * @default 'author'
        * @since Chrome 66.
        */
      var cssOrigin: CSSOrigin
      
      /**
        * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
        * @see[frame ref]{@link https://developer.chrome.com/apps/webNavigation#frame_ids}
        * @since Chrome 50.
        */
      var frameId: js.UndefOr[integer] = js.undefined
      
      /**
        * If matchAboutBlank is true, then the code is also injected in about:blank
        * and about:srcdoc frames if your extension has access to its parent document.
        * Code cannot be inserted in top-level about:-frames. By default it is false.
        */
      var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The soonest that the JavaScript or CSS will be injected into the tab.
        * @default 'document_idle'
        */
      var runAt: RunAt
    }
    object InjectDetailsBase {
      
      inline def apply(cssOrigin: CSSOrigin, runAt: RunAt): InjectDetailsBase = {
        val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
        __obj.asInstanceOf[InjectDetailsBase]
      }
      
      extension [Self <: InjectDetailsBase](x: Self) {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCssOrigin(value: CSSOrigin): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
        
        inline def setFrameId(value: integer): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
        
        inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
        
        inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
        
        inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
        
        inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      }
    }
  }
}
