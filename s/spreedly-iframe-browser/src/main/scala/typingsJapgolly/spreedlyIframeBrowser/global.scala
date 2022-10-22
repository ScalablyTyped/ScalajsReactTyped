package typingsJapgolly.spreedlyIframeBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Create a new, independent, instance of the iFrame. It will be created alongside the default instance, already exposed as Spreedly.
    * @see https://docs.spreedly.com/reference/iframe/v1/#spreedlypaymentframe
    */
  @JSGlobal("SpreedlyPaymentFrame")
  @js.native
  open class SpreedlyPaymentFrame ()
    extends StObject
       with typingsJapgolly.spreedlyIframeBrowser.SpreedlyPaymentFrame
  
  @JSGlobal("Spreedly")
  @js.native
  def Spreedly_ : typingsJapgolly.spreedlyIframeBrowser.SpreedlyPaymentFrame = js.native
  
  inline def Spreedly__=(x: typingsJapgolly.spreedlyIframeBrowser.SpreedlyPaymentFrame): Unit = js.Dynamic.global.updateDynamic("Spreedly")(x.asInstanceOf[js.Any])
}
