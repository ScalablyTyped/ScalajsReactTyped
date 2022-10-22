package typingsJapgolly.cordovaPluginStatusbar

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* The StatusBar object provides some functions to customize the iOS and Android StatusBar.
*/
trait StatusBar extends StObject {
  
  /**
    * Sets the background color of the statusbar by a hex string.
    *
    * @param color - CSS shorthand properties are also supported.
    *                On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false, you can set the background color of the statusbar by a hex string (#RRGGBB).
    *                On WP7 and WP8 you can also specify values as #AARRGGBB, where AA is an alpha value
    */
  def backgroundColorByHexString(color: String): Unit
  
  /**
    * On iOS 7, when you set StatusBar.statusBarOverlaysWebView to false,
    * you can set the background color of the statusbar by color name.
    *
    * @param color - Supported color names are:
    *                black, darkGray, lightGray, white, gray, red, green, blue, cyan, yellow, magenta, orange, purple, brown
    */
  def backgroundColorByName(color: String): Unit
  
  /**
    * Hide the statusbar.
    */
  def hide(): Unit
  
  /**
    * Read this property to see if the statusbar is visible or not.
    */
  var isVisible: Boolean
  
  /**
    * On iOS 7, make the statusbar overlay or not overlay the WebView.
    * 
    * @param isOverlay - On iOS 7, set to false to make the statusbar appear like iOS 6.
    *                    Set the style and background color to suit using the other functions.
    */
  def overlaysWebView(isOverlay: Boolean): Unit
  
  /**
    * Show the statusbar.
    */
  def show(): Unit
  
  /**
    * Use the blackOpaque statusbar (light text, for dark backgrounds).
    */
  def styleBlackOpaque(): Unit
  
  /**
    * Use the blackTranslucent statusbar (light text, for dark backgrounds).
    */
  def styleBlackTranslucent(): Unit
  
  /**
    * Use the default statusbar (dark text, for light backgrounds).
    */
  def styleDefault(): Unit
  
  /**
    * Use the lightContent statusbar (light text, for dark backgrounds).
    */
  def styleLightContent(): Unit
}
object StatusBar {
  
  inline def apply(
    backgroundColorByHexString: String => Callback,
    backgroundColorByName: String => Callback,
    hide: Callback,
    isVisible: Boolean,
    overlaysWebView: Boolean => Callback,
    show: Callback,
    styleBlackOpaque: Callback,
    styleBlackTranslucent: Callback,
    styleDefault: Callback,
    styleLightContent: Callback
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1((t0: String) => backgroundColorByHexString(t0).runNow()), backgroundColorByName = js.Any.fromFunction1((t0: String) => backgroundColorByName(t0).runNow()), hide = hide.toJsFn, isVisible = isVisible.asInstanceOf[js.Any], overlaysWebView = js.Any.fromFunction1((t0: Boolean) => overlaysWebView(t0).runNow()), show = show.toJsFn, styleBlackOpaque = styleBlackOpaque.toJsFn, styleBlackTranslucent = styleBlackTranslucent.toJsFn, styleDefault = styleDefault.toJsFn, styleLightContent = styleLightContent.toJsFn)
    __obj.asInstanceOf[StatusBar]
  }
  
  extension [Self <: StatusBar](x: Self) {
    
    inline def setBackgroundColorByHexString(value: String => Callback): Self = StObject.set(x, "backgroundColorByHexString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setBackgroundColorByName(value: String => Callback): Self = StObject.set(x, "backgroundColorByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setOverlaysWebView(value: Boolean => Callback): Self = StObject.set(x, "overlaysWebView", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setStyleBlackOpaque(value: Callback): Self = StObject.set(x, "styleBlackOpaque", value.toJsFn)
    
    inline def setStyleBlackTranslucent(value: Callback): Self = StObject.set(x, "styleBlackTranslucent", value.toJsFn)
    
    inline def setStyleDefault(value: Callback): Self = StObject.set(x, "styleDefault", value.toJsFn)
    
    inline def setStyleLightContent(value: Callback): Self = StObject.set(x, "styleLightContent", value.toJsFn)
  }
}
