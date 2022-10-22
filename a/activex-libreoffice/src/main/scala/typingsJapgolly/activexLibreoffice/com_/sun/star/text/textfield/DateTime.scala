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
  * specifies service of a date or time text field.
  * @see com.sun.star.text.TextField
  */
trait DateTime
  extends StObject
     with TextField_ {
  
  /** contains an offset to the date or time value in minutes. */
  var Adjust: Double
  
  /**
    * this is the display format for this field. Depending on {@link IsDate} , this is either a {@link com.sun.star.text.DateDisplayFormat} or {@link
    * com.sun.star.text.TimeDisplayFormat} .
    *
    * This property is deprecated and is here only for components that do not support a {@link com.sun.star.util.NumberFormatter} .
    * @deprecated Deprecated
    * @see com.sun.star.text.DateDisplayFormat
    * @see com.sun.star.text.TimeDisplayFormat
    */
  var DateTimeFormat: Double
  
  /** the is the content of this field. */
  var DateTimeValue: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
  
  /** If this flag is set to `TRUE` this field represents a date with an optional time. If it is set to `FALSE` only the time is used here. */
  var IsDate: Boolean
  
  /**
    * If this flag is set to `FALSE` the date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: Boolean
  
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: Boolean
  
  /**
    * this is the number format for this field
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double
}
object DateTime {
  
  inline def apply(
    Adjust: Double,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    DateTimeFormat: Double,
    DateTimeValue: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime,
    IsDate: Boolean,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    IsFixed: Boolean,
    IsFixedLanguage: Boolean,
    NumberFormat: Double,
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
  ): DateTime = {
    val __obj = js.Dynamic.literal(Adjust = Adjust.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], DateTimeFormat = DateTimeFormat.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], IsDate = IsDate.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixed = IsFixed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DateTime]
  }
  
  extension [Self <: DateTime](x: Self) {
    
    inline def setAdjust(value: Double): Self = StObject.set(x, "Adjust", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormat(value: Double): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeValue(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
    
    inline def setIsDate(value: Boolean): Self = StObject.set(x, "IsDate", value.asInstanceOf[js.Any])
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "IsFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedLanguage(value: Boolean): Self = StObject.set(x, "IsFixedLanguage", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
  }
}
