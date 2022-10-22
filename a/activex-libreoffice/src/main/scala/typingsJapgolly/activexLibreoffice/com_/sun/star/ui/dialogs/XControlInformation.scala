package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to query for controls and control properties supported by the implementing instance.
  * @since OOo 1.1.2
  */
trait XControlInformation
  extends StObject
     with XInterface {
  
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  val SupportedControls: SafeArray[String]
  
  /**
    * Returns a sequence with properties supported by the specified control.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns a sequence of control properties supported by the specified control.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def getSupportedControlProperties(aControlName: String): SafeArray[String]
  
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  def getSupportedControls(): SafeArray[String]
  
  /**
    * Returns whether control property is supported by a control.
    * @param aControlName The name of the control.
    * @param aControlProperty The control property to query for.
    * @returns `TRUE` if the specified control action is supported. `FALSE` if the specified control action is not supported.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def isControlPropertySupported(aControlName: String, aControlProperty: String): Boolean
  
  /**
    * Returns whether the specified control is supported or not.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns `TRUE` if the specified control is supported. `FALSE` if the specified control is not supported.
    */
  def isControlSupported(aControlName: String): Boolean
}
object XControlInformation {
  
  inline def apply(
    SupportedControls: SafeArray[String],
    acquire: Callback,
    getSupportedControlProperties: String => SafeArray[String],
    getSupportedControls: CallbackTo[SafeArray[String]],
    isControlPropertySupported: (String, String) => Boolean,
    isControlSupported: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XControlInformation = {
    val __obj = js.Dynamic.literal(SupportedControls = SupportedControls.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSupportedControlProperties = js.Any.fromFunction1(getSupportedControlProperties), getSupportedControls = getSupportedControls.toJsFn, isControlPropertySupported = js.Any.fromFunction2(isControlPropertySupported), isControlSupported = js.Any.fromFunction1(isControlSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XControlInformation]
  }
  
  extension [Self <: XControlInformation](x: Self) {
    
    inline def setGetSupportedControlProperties(value: String => SafeArray[String]): Self = StObject.set(x, "getSupportedControlProperties", js.Any.fromFunction1(value))
    
    inline def setGetSupportedControls(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedControls", value.toJsFn)
    
    inline def setIsControlPropertySupported(value: (String, String) => Boolean): Self = StObject.set(x, "isControlPropertySupported", js.Any.fromFunction2(value))
    
    inline def setIsControlSupported(value: String => Boolean): Self = StObject.set(x, "isControlSupported", js.Any.fromFunction1(value))
    
    inline def setSupportedControls(value: SafeArray[String]): Self = StObject.set(x, "SupportedControls", value.asInstanceOf[js.Any])
  }
}
