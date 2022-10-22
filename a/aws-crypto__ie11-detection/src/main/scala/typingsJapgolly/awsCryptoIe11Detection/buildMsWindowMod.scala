package typingsJapgolly.awsCryptoIe11Detection

import japgolly.scalajs.react.Callback
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.Window
import typingsJapgolly.awsCryptoIe11Detection.buildMsSubtleCryptoMod.MsSubtleCrypto
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMsWindowMod {
  
  @JSImport("@aws-crypto/ie11-detection/build/MsWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMsWindow(window: Window): /* is @aws-crypto/ie11-detection.@aws-crypto/ie11-detection/build/MsWindow.MsWindow */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMsWindow")(window.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-crypto/ie11-detection.@aws-crypto/ie11-detection/build/MsWindow.MsWindow */ Boolean]
  
  trait MsCrypto extends StObject {
    
    def getRandomValues(toFill: js.typedarray.Uint8Array): Unit
    
    var subtle: MsSubtleCrypto
  }
  object MsCrypto {
    
    inline def apply(getRandomValues: js.typedarray.Uint8Array => Callback, subtle: MsSubtleCrypto): MsCrypto = {
      val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => getRandomValues(t0).runNow()), subtle = subtle.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsCrypto]
    }
    
    extension [Self <: MsCrypto](x: Self) {
      
      inline def setGetRandomValues(value: js.typedarray.Uint8Array => Callback): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1((t0: js.typedarray.Uint8Array) => value(t0).runNow()))
      
      inline def setSubtle(value: MsSubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsWindow
    extends StObject
       with typingsJapgolly.std.Window {
    
    var MSInputMethodContext: Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var msCrypto: MsCrypto = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
