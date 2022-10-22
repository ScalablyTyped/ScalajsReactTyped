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
  * specifies service of a reference field.
  * @see com.sun.star.text.TextField
  */
trait GetReference
  extends StObject
     with TextField_ {
  
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: String
  
  /**
    * contains the type of the reference.
    * @see com.sun.star.text.ReferenceFieldPart
    */
  var ReferenceFieldPart: Double
  
  /**
    * contains the source of the reference.
    * @see com.sun.star.text.ReferenceFieldSource
    */
  var ReferenceFieldSource: Double
  
  /**
    * contains the sequence number of a set expression field that is used as sequence field or the value of the ReferenceId property of a footnote or
    * endnote.
    * @see com.sun.star.text.Footnote
    */
  var SequenceNumber: Double
  
  /**
    * contains the name of the source.
    *
    * Depending on the property {@link ReferenceFieldSource} it may be the name of a bookmark, a reference mark.
    */
  var SourceName: String
}
object GetReference {
  
  inline def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    CurrentPresentation: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReferenceFieldPart: Double,
    ReferenceFieldSource: Double,
    SequenceNumber: Double,
    SourceName: String,
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
  ): GetReference = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferenceFieldPart = ReferenceFieldPart.asInstanceOf[js.Any], ReferenceFieldSource = ReferenceFieldSource.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[GetReference]
  }
  
  extension [Self <: GetReference](x: Self) {
    
    inline def setCurrentPresentation(value: String): Self = StObject.set(x, "CurrentPresentation", value.asInstanceOf[js.Any])
    
    inline def setReferenceFieldPart(value: Double): Self = StObject.set(x, "ReferenceFieldPart", value.asInstanceOf[js.Any])
    
    inline def setReferenceFieldSource(value: Double): Self = StObject.set(x, "ReferenceFieldSource", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
  }
}
