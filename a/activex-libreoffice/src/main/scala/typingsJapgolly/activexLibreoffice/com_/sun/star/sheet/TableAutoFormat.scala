package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an AutoFormat, containing exactly 16 AutoFormat fields.
  *
  * Each of the 16 fields contain formatting properties for a table cell at a specific position in the AutoFormat range. The rows of the range are divided
  * into a header row, a footer row and 2 data rows (repeated in turn between header and footer row). The columns are divided similar. This results in 16
  * different types of cells in the range. The AutoFormats are numbered row by row, then column by column.
  * @see com.sun.star.sheet.TableAutoFormatField
  */
trait TableAutoFormat
  extends StObject
     with XPropertySet
     with XIndexAccess
     with XEnumerationAccess
     with XNamed {
  
  /** specifies whether the background settings from the fields are used. */
  var IncludeBackground: Boolean
  
  /** specifies whether the border settings from the fields are used. */
  var IncludeBorder: Boolean
  
  /** specifies whether the font settings from the fields are used. */
  var IncludeFont: Boolean
  
  /** specifies whether the justification settings from the fields are used. */
  var IncludeJustify: Boolean
  
  /** specifies whether the number format settings from the fields are used. */
  var IncludeNumberFormat: Boolean
  
  /** specifies whether the column widths and row heights should be updated after applying the format. */
  var IncludeWidthAndHeight: Boolean
}
object TableAutoFormat {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    IncludeBackground: Boolean,
    IncludeBorder: Boolean,
    IncludeFont: Boolean,
    IncludeJustify: Boolean,
    IncludeNumberFormat: Boolean,
    IncludeWidthAndHeight: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getName: CallbackTo[String],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): TableAutoFormat = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], IncludeBackground = IncludeBackground.asInstanceOf[js.Any], IncludeBorder = IncludeBorder.asInstanceOf[js.Any], IncludeFont = IncludeFont.asInstanceOf[js.Any], IncludeJustify = IncludeJustify.asInstanceOf[js.Any], IncludeNumberFormat = IncludeNumberFormat.asInstanceOf[js.Any], IncludeWidthAndHeight = IncludeWidthAndHeight.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getName = getName.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[TableAutoFormat]
  }
  
  extension [Self <: TableAutoFormat](x: Self) {
    
    inline def setIncludeBackground(value: Boolean): Self = StObject.set(x, "IncludeBackground", value.asInstanceOf[js.Any])
    
    inline def setIncludeBorder(value: Boolean): Self = StObject.set(x, "IncludeBorder", value.asInstanceOf[js.Any])
    
    inline def setIncludeFont(value: Boolean): Self = StObject.set(x, "IncludeFont", value.asInstanceOf[js.Any])
    
    inline def setIncludeJustify(value: Boolean): Self = StObject.set(x, "IncludeJustify", value.asInstanceOf[js.Any])
    
    inline def setIncludeNumberFormat(value: Boolean): Self = StObject.set(x, "IncludeNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setIncludeWidthAndHeight(value: Boolean): Self = StObject.set(x, "IncludeWidthAndHeight", value.asInstanceOf[js.Any])
  }
}
