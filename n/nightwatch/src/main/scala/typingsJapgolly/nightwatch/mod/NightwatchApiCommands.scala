package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchApiCommands extends StObject {
  
  val WEBDRIVER_ELEMENT_ID: String
  
  def __isBrowserName(browser: String, alternateName: String): Boolean
  
  def __isPlatformName(platform: String): Boolean
  
  val browserName: String
  
  def isAndroid(): Boolean
  
  def isChrome(): Boolean
  
  def isEdge(): Boolean
  
  def isFirefox(): Boolean
  
  def isIOS(): Boolean
  
  def isInternetExplorer(): Boolean
  
  def isMobile(): Boolean
  
  def isOpera(): Boolean
  
  def isSafari(): Boolean
  
  val platformName: String
}
object NightwatchApiCommands {
  
  inline def apply(
    WEBDRIVER_ELEMENT_ID: String,
    __isBrowserName: (String, String) => Boolean,
    __isPlatformName: String => Boolean,
    browserName: String,
    isAndroid: CallbackTo[Boolean],
    isChrome: CallbackTo[Boolean],
    isEdge: CallbackTo[Boolean],
    isFirefox: CallbackTo[Boolean],
    isIOS: CallbackTo[Boolean],
    isInternetExplorer: CallbackTo[Boolean],
    isMobile: CallbackTo[Boolean],
    isOpera: CallbackTo[Boolean],
    isSafari: CallbackTo[Boolean],
    platformName: String
  ): NightwatchApiCommands = {
    val __obj = js.Dynamic.literal(WEBDRIVER_ELEMENT_ID = WEBDRIVER_ELEMENT_ID.asInstanceOf[js.Any], __isBrowserName = js.Any.fromFunction2(__isBrowserName), __isPlatformName = js.Any.fromFunction1(__isPlatformName), browserName = browserName.asInstanceOf[js.Any], isAndroid = isAndroid.toJsFn, isChrome = isChrome.toJsFn, isEdge = isEdge.toJsFn, isFirefox = isFirefox.toJsFn, isIOS = isIOS.toJsFn, isInternetExplorer = isInternetExplorer.toJsFn, isMobile = isMobile.toJsFn, isOpera = isOpera.toJsFn, isSafari = isSafari.toJsFn, platformName = platformName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchApiCommands]
  }
  
  extension [Self <: NightwatchApiCommands](x: Self) {
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setIsAndroid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAndroid", value.toJsFn)
    
    inline def setIsChrome(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChrome", value.toJsFn)
    
    inline def setIsEdge(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEdge", value.toJsFn)
    
    inline def setIsFirefox(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFirefox", value.toJsFn)
    
    inline def setIsIOS(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIOS", value.toJsFn)
    
    inline def setIsInternetExplorer(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInternetExplorer", value.toJsFn)
    
    inline def setIsMobile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMobile", value.toJsFn)
    
    inline def setIsOpera(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpera", value.toJsFn)
    
    inline def setIsSafari(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSafari", value.toJsFn)
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setWEBDRIVER_ELEMENT_ID(value: String): Self = StObject.set(x, "WEBDRIVER_ELEMENT_ID", value.asInstanceOf[js.Any])
    
    inline def set__isBrowserName(value: (String, String) => Boolean): Self = StObject.set(x, "__isBrowserName", js.Any.fromFunction2(value))
    
    inline def set__isPlatformName(value: String => Boolean): Self = StObject.set(x, "__isPlatformName", js.Any.fromFunction1(value))
  }
}
