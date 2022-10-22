package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the generic interface for supporting the replacement of elements with unique identifiers. */
trait XIdentifierReplace
  extends StObject
     with XIdentifierAccess {
  
  /**
    * replaces the element with the specified identifier.
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @param aElement the new element that replaces the old element for the specified identifier.
    * @throws com::sun::star::lang::IllegalArgumentException If the argument is not valid for this container.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def replaceByIdentifer(Identifier: Double, aElement: Any): Unit
}
object XIdentifierReplace {
  
  inline def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: Callback,
    getByIdentifier: Double => Any,
    getElementType: CallbackTo[`type`],
    getIdentifiers: CallbackTo[SafeArray[Double]],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    replaceByIdentifer: (Double, Any) => Callback
  ): XIdentifierReplace = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = getElementType.toJsFn, getIdentifiers = getIdentifiers.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByIdentifer = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIdentifer(t0, t1)).runNow()))
    __obj.asInstanceOf[XIdentifierReplace]
  }
  
  extension [Self <: XIdentifierReplace](x: Self) {
    
    inline def setReplaceByIdentifer(value: (Double, Any) => Callback): Self = StObject.set(x, "replaceByIdentifer", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
  }
}
