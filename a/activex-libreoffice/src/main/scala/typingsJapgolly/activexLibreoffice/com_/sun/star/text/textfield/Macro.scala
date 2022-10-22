package typingsJapgolly.activexLibreoffice.com_.sun.star.text.textfield

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.TextField_
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XTextRange
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a macro text field.
  * @see com.sun.star.text.TextField
  */
trait Macro
  extends StObject
     with TextField_ {
  
  /** contains a tip that is displayed at the user interface. */
  var Hint: String
  
  /** contains the library name of a StarBASIC macro. */
  var MacroLibrary: String
  
  /** contains the macro name of a StarBASIC macro. */
  var MacroName: String
}
object Macro {
  
  inline def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Hint: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    MacroLibrary: String,
    MacroName: String,
    PropertySetInfo: XPropertySetInfo,
    TextWrap: WrapTextMode,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getPresentation: Boolean => String,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): Macro = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], MacroLibrary = MacroLibrary.asInstanceOf[js.Any], MacroName = MacroName.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Macro]
  }
  
  extension [Self <: Macro](x: Self) {
    
    inline def setHint(value: String): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
    
    inline def setMacroLibrary(value: String): Self = StObject.set(x, "MacroLibrary", value.asInstanceOf[js.Any])
    
    inline def setMacroName(value: String): Self = StObject.set(x, "MacroName", value.asInstanceOf[js.Any])
  }
}
