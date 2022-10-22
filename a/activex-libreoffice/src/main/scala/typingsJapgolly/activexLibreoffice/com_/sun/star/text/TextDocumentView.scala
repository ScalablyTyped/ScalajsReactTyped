package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.OfficeDocumentView
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the view of a {@link TextDocument} . */
trait TextDocumentView
  extends StObject
     with OfficeDocumentView
     with XTextViewCursorSupplier
     with XPropertySet {
  
  /**
    * specifies if spell checking should be done while typing.
    * @since OOo 2.0
    */
  var IsConstantSpellcheck: Boolean
  
  /**
    * specifies if the marks for misspelled text should be displayed.
    * @since OOo 2.0
    */
  var IsHideSpellMarks: Boolean
  
  /**
    * returns the number of lines in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    *
    * Empty paragraphs are not counted.
    * @since OOo 2.0
    */
  var LineCount: Double
  
  /**
    * returns the number of pages in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    * @since OOo 2.0
    */
  var PageCount: Double
}
object TextDocumentView {
  
  inline def apply(
    IsConstantSpellcheck: Boolean,
    IsHideSpellMarks: Boolean,
    LineCount: Double,
    PageCount: Double,
    PropertySetInfo: XPropertySetInfo,
    Selection: Any,
    ViewCursor: XTextViewCursor,
    ViewSettings: XPropertySet,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getControl: XControlModel => XControl,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSelection: CallbackTo[Any],
    getViewCursor: CallbackTo[XTextViewCursor],
    getViewSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    select: Any => Boolean,
    setPropertyValue: (String, Any) => Callback
  ): TextDocumentView = {
    val __obj = js.Dynamic.literal(IsConstantSpellcheck = IsConstantSpellcheck.asInstanceOf[js.Any], IsHideSpellMarks = IsHideSpellMarks.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], ViewCursor = ViewCursor.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getControl = js.Any.fromFunction1(getControl), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = getSelection.toJsFn, getViewCursor = getViewCursor.toJsFn, getViewSettings = getViewSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), select = js.Any.fromFunction1(select), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[TextDocumentView]
  }
  
  extension [Self <: TextDocumentView](x: Self) {
    
    inline def setIsConstantSpellcheck(value: Boolean): Self = StObject.set(x, "IsConstantSpellcheck", value.asInstanceOf[js.Any])
    
    inline def setIsHideSpellMarks(value: Boolean): Self = StObject.set(x, "IsHideSpellMarks", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "LineCount", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "PageCount", value.asInstanceOf[js.Any])
  }
}
