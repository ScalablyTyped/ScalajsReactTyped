package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to attach this {@link TextField} to a {@link TextFieldMaster} . */
trait XDependentTextField
  extends StObject
     with XTextField {
  
  /** @returns the previously attached {@link TextFieldMaster} */
  val TextFieldMaster: XPropertySet
  
  /**
    * method must be called to attach the {@link TextFieldMaster} to this {@link TextField} .
    *
    * A {@link TextFieldMaster} can only be assigned once.
    *
    * Example: Create and insert a user field (with a `UserField` ):
    *
    * {{program example here, see documentation}}
    */
  def attachTextFieldMaster(xFieldMaster: XPropertySet): Unit
  
  /** @returns the previously attached {@link TextFieldMaster} */
  def getTextFieldMaster(): XPropertySet
}
object XDependentTextField {
  
  inline def apply(
    Anchor: XTextRange,
    TextFieldMaster: XPropertySet,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    attachTextFieldMaster: XPropertySet => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getPresentation: Boolean => String,
    getTextFieldMaster: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XDependentTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), attachTextFieldMaster = js.Any.fromFunction1((t0: XPropertySet) => attachTextFieldMaster(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getPresentation = js.Any.fromFunction1(getPresentation), getTextFieldMaster = getTextFieldMaster.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XDependentTextField]
  }
  
  extension [Self <: XDependentTextField](x: Self) {
    
    inline def setAttachTextFieldMaster(value: XPropertySet => Callback): Self = StObject.set(x, "attachTextFieldMaster", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
    
    inline def setGetTextFieldMaster(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getTextFieldMaster", value.toJsFn)
    
    inline def setTextFieldMaster(value: XPropertySet): Self = StObject.set(x, "TextFieldMaster", value.asInstanceOf[js.Any])
  }
}
