package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the elements of a collection through a unique identifier. */
trait XIdentifierAccess
  extends StObject
     with XElementAccess {
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  val Identifiers: SafeArray[Double]
  
  /**
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @returns the element with the specified identifier
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIdentifier(Identifier: Double): Any
  
  /** @returns a sequence of all identifiers in this container.  The order of the identifiers is not specified. */
  def getIdentifiers(): SafeArray[Double]
}
object XIdentifierAccess {
  
  inline def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: Callback,
    getByIdentifier: Double => Any,
    getElementType: CallbackTo[`type`],
    getIdentifiers: CallbackTo[SafeArray[Double]],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XIdentifierAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = getElementType.toJsFn, getIdentifiers = getIdentifiers.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIdentifierAccess]
  }
  
  extension [Self <: XIdentifierAccess](x: Self) {
    
    inline def setGetByIdentifier(value: Double => Any): Self = StObject.set(x, "getByIdentifier", js.Any.fromFunction1(value))
    
    inline def setGetIdentifiers(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getIdentifiers", value.toJsFn)
    
    inline def setIdentifiers(value: SafeArray[Double]): Self = StObject.set(x, "Identifiers", value.asInstanceOf[js.Any])
  }
}
