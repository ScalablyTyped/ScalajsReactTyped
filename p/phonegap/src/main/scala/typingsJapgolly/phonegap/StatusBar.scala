package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
trait StatusBar extends StObject {
  
  def backgroundColorByHexString(hexString: String): Unit
  
  def backgroundColorByName(colorname: String): Unit
  
  def hide(): Unit
  
  var isVisible: Boolean
  
  def overlaysWebView(doOverlay: Boolean): Unit
  
  def show(): Unit
  
  def styleBlackOpaque(): Unit
  
  def styleBlackTranslucent(): Unit
  
  def styleDefault(): Unit
  
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
