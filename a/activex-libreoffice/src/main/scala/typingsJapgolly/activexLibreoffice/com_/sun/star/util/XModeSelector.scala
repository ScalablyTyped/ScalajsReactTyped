package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects which supply different modes. */
trait XModeSelector
  extends StObject
     with XInterface {
  
  /** @returns the current mode. */
  var Mode: String
  
  /** @returns a sequence of all supported modes. */
  val SupportedModes: SafeArray[String]
  
  /** @returns the current mode. */
  def getMode(): String
  
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): SafeArray[String]
  
  /** sets a new mode for the implementing object. */
  def setMode(aMode: String): Unit
  
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: String): Boolean
}
object XModeSelector {
  
  inline def apply(
    Mode: String,
    SupportedModes: SafeArray[String],
    acquire: Callback,
    getMode: CallbackTo[String],
    getSupportedModes: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    setMode: String => Callback,
    supportsMode: String => Boolean
  ): XModeSelector = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMode = getMode.toJsFn, getSupportedModes = getSupportedModes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMode = js.Any.fromFunction1((t0: String) => setMode(t0).runNow()), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[XModeSelector]
  }
  
  extension [Self <: XModeSelector](x: Self) {
    
    inline def setGetMode(value: CallbackTo[String]): Self = StObject.set(x, "getMode", value.toJsFn)
    
    inline def setGetSupportedModes(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedModes", value.toJsFn)
    
    inline def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setSetMode(value: String => Callback): Self = StObject.set(x, "setMode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSupportedModes(value: SafeArray[String]): Self = StObject.set(x, "SupportedModes", value.asInstanceOf[js.Any])
    
    inline def setSupportsMode(value: String => Boolean): Self = StObject.set(x, "supportsMode", js.Any.fromFunction1(value))
  }
}
