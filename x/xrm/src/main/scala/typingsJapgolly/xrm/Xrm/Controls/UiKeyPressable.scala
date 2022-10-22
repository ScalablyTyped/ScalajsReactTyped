package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import typingsJapgolly.xrm.Xrm.Events.ContextSensitiveHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for controls which methods provide immediate feedback or take actions as user types in a control.
  * Contains methods which can be used to perform data validations in a control even before the user commits (saves) the value in a form.
  */
trait UiKeyPressable extends StObject {
  
  /**
    * Use this to add a function as an event handler for the keypress event so that the function is called when you type a character in the specific text or number field.
    * For a sample JavaScript code that uses the addOnKeyPress method to configure the auto-completion experience, see Sample: Auto-complete in CRM controls.
    * @deprecated Deprecated in v9.1; Use a custom control.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param handler The function reference.
    */
  def addOnKeyPress(handler: ContextSensitiveHandler): Unit
  
  /**
    * Use this to manually fire an event handler that you created for a specific text or number field to be executed on the keypress event.
    * @deprecated Deprecated in v9.1; Use a custom control.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def fireOnKeyPress(): Unit
  
  /**
    * Use this to remove an event handler for a text or number field that you added using addOnKeyPress.
    * @deprecated Deprecated in v9.1; Use a custom control.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * Remarks:  If an anonymous function is set using addOnKeyPress, it can’t be removed using this method.
    * @param handler The function reference.
    */
  def removeOnKeyPress(handler: ContextSensitiveHandler): Unit
}
object UiKeyPressable {
  
  inline def apply(
    addOnKeyPress: ContextSensitiveHandler => Callback,
    fireOnKeyPress: Callback,
    removeOnKeyPress: ContextSensitiveHandler => Callback
  ): UiKeyPressable = {
    val __obj = js.Dynamic.literal(addOnKeyPress = js.Any.fromFunction1((t0: ContextSensitiveHandler) => addOnKeyPress(t0).runNow()), fireOnKeyPress = fireOnKeyPress.toJsFn, removeOnKeyPress = js.Any.fromFunction1((t0: ContextSensitiveHandler) => removeOnKeyPress(t0).runNow()))
    __obj.asInstanceOf[UiKeyPressable]
  }
  
  extension [Self <: UiKeyPressable](x: Self) {
    
    inline def setAddOnKeyPress(value: ContextSensitiveHandler => Callback): Self = StObject.set(x, "addOnKeyPress", js.Any.fromFunction1((t0: ContextSensitiveHandler) => value(t0).runNow()))
    
    inline def setFireOnKeyPress(value: Callback): Self = StObject.set(x, "fireOnKeyPress", value.toJsFn)
    
    inline def setRemoveOnKeyPress(value: ContextSensitiveHandler => Callback): Self = StObject.set(x, "removeOnKeyPress", js.Any.fromFunction1((t0: ContextSensitiveHandler) => value(t0).runNow()))
  }
}
