package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access the text fields used in this context (e.g. this document).
  * @see com.sun.star.sheet.SpreadsheetDocument
  * @see TextDocument
  */
trait XTextFieldsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  val TextFieldMasters: XNameAccess
  
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  val TextFields: XEnumerationAccess
  
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  def getTextFieldMasters(): XNameAccess
  
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  def getTextFields(): XEnumerationAccess
}
object XTextFieldsSupplier {
  
  inline def apply(
    TextFieldMasters: XNameAccess,
    TextFields: XEnumerationAccess,
    acquire: Callback,
    getTextFieldMasters: CallbackTo[XNameAccess],
    getTextFields: CallbackTo[XEnumerationAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextFieldsSupplier = {
    val __obj = js.Dynamic.literal(TextFieldMasters = TextFieldMasters.asInstanceOf[js.Any], TextFields = TextFields.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextFieldMasters = getTextFieldMasters.toJsFn, getTextFields = getTextFields.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextFieldsSupplier]
  }
  
  extension [Self <: XTextFieldsSupplier](x: Self) {
    
    inline def setGetTextFieldMasters(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getTextFieldMasters", value.toJsFn)
    
    inline def setGetTextFields(value: CallbackTo[XEnumerationAccess]): Self = StObject.set(x, "getTextFields", value.toJsFn)
    
    inline def setTextFieldMasters(value: XNameAccess): Self = StObject.set(x, "TextFieldMasters", value.asInstanceOf[js.Any])
    
    inline def setTextFields(value: XEnumerationAccess): Self = StObject.set(x, "TextFields", value.asInstanceOf[js.Any])
  }
}
