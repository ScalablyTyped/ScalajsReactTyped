package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `action`, `browser_action`
  *
  * Not supported on manifest versions above 2.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserAction {
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
  
  /**
    * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example, opaque red is `[255, 0, 0, 255]`. Can also be a string with a CSS value, with opaque red being `#FF0000` or `#F00`.
    */
  type ColorValue = String | ColorArray | Null
  
  /* browserAction types */
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait Details extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object Details {
    
    inline def apply(): Details = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Details]
    }
    
    extension [Self <: Details](x: Self) {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = ImageData
  
  /** Information sent when a browser action is clicked. */
  trait OnClickData extends StObject {
    
    /** An integer value of button by which menu item was clicked. */
    var button: js.UndefOr[Double] = js.undefined
    
    /** An array of keyboard modifiers that were held while the menu item was clicked. */
    var modifiers: js.Array[OnClickDataModifiers]
  }
  object OnClickData {
    
    inline def apply(modifiers: js.Array[OnClickDataModifiers]): OnClickData = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClickData]
    }
    
    extension [Self <: OnClickData](x: Self) {
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setModifiers(value: js.Array[OnClickDataModifiers]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: OnClickDataModifiers*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl
  */
  trait OnClickDataModifiers extends StObject
  object OnClickDataModifiers {
    
    inline def Alt: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt = "Alt".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Alt]
    
    inline def Command: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command = "Command".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Command]
    
    inline def Ctrl: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl = "Ctrl".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Ctrl]
    
    inline def MacCtrl: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl = "MacCtrl".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.MacCtrl]
    
    inline def Shift: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift = "Shift".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.Shift]
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetBadgeBackgroundColorDetails extends StObject {
    
    var color: ColorValue
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetBadgeBackgroundColorDetails {
    
    inline def apply(): SetBadgeBackgroundColorDetails = {
      val __obj = js.Dynamic.literal(color = null)
      __obj.asInstanceOf[SetBadgeBackgroundColorDetails]
    }
    
    extension [Self <: SetBadgeBackgroundColorDetails](x: Self) {
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetBadgeTextColorDetails extends StObject {
    
    var color: ColorValue
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetBadgeTextColorDetails {
    
    inline def apply(): SetBadgeTextColorDetails = {
      val __obj = js.Dynamic.literal(color = null)
      __obj.asInstanceOf[SetBadgeTextColorDetails]
    }
    
    extension [Self <: SetBadgeTextColorDetails](x: Self) {
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetBadgeTextDetails extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** Any number of characters can be passed, but only about four can fit in the space. */
    var text: String | Null
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetBadgeTextDetails {
    
    inline def apply(): SetBadgeTextDetails = {
      val __obj = js.Dynamic.literal(text = null)
      __obj.asInstanceOf[SetBadgeTextDetails]
    }
    
    extension [Self <: SetBadgeTextDetails](x: Self) {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetIconDetails extends StObject {
    
    /**
      * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.undefined
    
    /**
      * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals `scale`, then image with size `scale` * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
      */
    var path: js.UndefOr[String | NumberDictionary[String]] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetIconDetails {
    
    inline def apply(): SetIconDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetIconDetails]
    }
    
    extension [Self <: SetIconDetails](x: Self) {
      
      inline def setImageData(value: ImageData | NumberDictionary[ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
      
      inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
      
      inline def setPath(value: String | NumberDictionary[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetPopupDetails extends StObject {
    
    /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
    var popup: String | Null
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetPopupDetails {
    
    inline def apply(): SetPopupDetails = {
      val __obj = js.Dynamic.literal(popup = null)
      __obj.asInstanceOf[SetPopupDetails]
    }
    
    extension [Self <: SetPopupDetails](x: Self) {
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupNull: Self = StObject.set(x, "popup", null)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  trait SetTitleDetails extends StObject {
    
    /**
      * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the window one will be inherited.
      */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** The string the browser action should display when moused over. */
    var title: String | Null
    
    /**
      * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value from; if there is no window-specific value, the global one will be inherited.
      */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object SetTitleDetails {
    
    inline def apply(): SetTitleDetails = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[SetTitleDetails]
    }
    
    extension [Self <: SetTitleDetails](x: Self) {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
