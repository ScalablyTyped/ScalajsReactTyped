package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service contains the collection of automatic style families within the container document. */
trait XAutoStyleFamily
  extends StObject
     with XEnumerationAccess {
  
  def insertStyle(Values: PropertyValues): XAutoStyle
}
object XAutoStyleFamily {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertStyle: PropertyValues => XAutoStyle,
    queryInterface: `type` => Any,
    release: Callback
  ): XAutoStyleFamily = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createEnumeration = createEnumeration.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertStyle = js.Any.fromFunction1(insertStyle), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAutoStyleFamily]
  }
  
  extension [Self <: XAutoStyleFamily](x: Self) {
    
    inline def setInsertStyle(value: PropertyValues => XAutoStyle): Self = StObject.set(x, "insertStyle", js.Any.fromFunction1(value))
  }
}
