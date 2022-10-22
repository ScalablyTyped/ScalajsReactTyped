package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the property sequence of a function description via function index or identifier.
  *
  * The container access methods return a sequence of {@link com.sun.star.beans.PropertyValue} structs. The properties contained in the sequence are
  * collected in the service {@link FunctionDescription} .
  * @see com.sun.star.sheet.FunctionDescriptions
  */
trait XFunctionDescriptions
  extends StObject
     with XIndexAccess {
  
  /**
    * finds a function description by the identifier of the function.
    * @param nId is the identifier of the function description (the same that is used in the service {@link RecentFunctions} .
    * @returns the sequence of property values (described in {@link FunctionDescription} ).
    */
  def getById(nId: Double): SafeArray[PropertyValue]
}
object XFunctionDescriptions {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getById: Double => SafeArray[PropertyValue],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XFunctionDescriptions = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getById = js.Any.fromFunction1(getById), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFunctionDescriptions]
  }
  
  extension [Self <: XFunctionDescriptions](x: Self) {
    
    inline def setGetById(value: Double => SafeArray[PropertyValue]): Self = StObject.set(x, "getById", js.Any.fromFunction1(value))
  }
}
