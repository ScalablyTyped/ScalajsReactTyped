package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the creation and removal of elements with unique identifiers.
  * @see XContainer
  */
trait XIdentifierContainer
  extends StObject
     with XIdentifierReplace {
  
  /**
    * inserts an element and creates a new unique identifier for it.
    * @param aElement The new element that will be inserted.
    * @returns the newly created identifier under which the element is inserted.
    * @throws com::sun::star::lang::IllegalArgumentException if the argument is not vailid for this container.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def insert(aElement: Any): Double
  
  /**
    * removes the element with the specified identifier.
    * @param Identifier The identifier that should be removed.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def removeByIdentifier(Identifier: Double): Unit
}
object XIdentifierContainer {
  
  inline def apply(
    ElementType: `type`,
    Identifiers: SafeArray[Double],
    acquire: Callback,
    getByIdentifier: Double => Any,
    getElementType: CallbackTo[`type`],
    getIdentifiers: CallbackTo[SafeArray[Double]],
    hasElements: CallbackTo[Boolean],
    insert: Any => Double,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIdentifier: Double => Callback,
    replaceByIdentifer: (Double, Any) => Callback
  ): XIdentifierContainer = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], Identifiers = Identifiers.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIdentifier = js.Any.fromFunction1(getByIdentifier), getElementType = getElementType.toJsFn, getIdentifiers = getIdentifiers.toJsFn, hasElements = hasElements.toJsFn, insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIdentifier = js.Any.fromFunction1((t0: Double) => removeByIdentifier(t0).runNow()), replaceByIdentifer = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIdentifer(t0, t1)).runNow()))
    __obj.asInstanceOf[XIdentifierContainer]
  }
  
  extension [Self <: XIdentifierContainer](x: Self) {
    
    inline def setInsert(value: Any => Double): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setRemoveByIdentifier(value: Double => Callback): Self = StObject.set(x, "removeByIdentifier", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
