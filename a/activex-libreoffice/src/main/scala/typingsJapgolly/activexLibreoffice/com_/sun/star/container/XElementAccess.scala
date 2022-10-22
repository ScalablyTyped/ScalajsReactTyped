package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the base interface of all collection interfaces. */
trait XElementAccess
  extends StObject
     with XInterface {
  
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  val ElementType: `type`
  
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  def getElementType(): `type`
  
  /** @returns `TRUE` if the object contain elements, otherwise `FALSE` . */
  def hasElements(): Boolean
}
object XElementAccess {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XElementAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XElementAccess]
  }
  
  extension [Self <: XElementAccess](x: Self) {
    
    inline def setElementType(value: `type`): Self = StObject.set(x, "ElementType", value.asInstanceOf[js.Any])
    
    inline def setGetElementType(value: CallbackTo[`type`]): Self = StObject.set(x, "getElementType", value.toJsFn)
    
    inline def setHasElements(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasElements", value.toJsFn)
  }
}
