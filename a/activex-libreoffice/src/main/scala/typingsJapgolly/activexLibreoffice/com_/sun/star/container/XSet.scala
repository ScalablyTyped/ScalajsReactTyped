package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of elements.
  * @see XContainer
  */
trait XSet
  extends StObject
     with XEnumerationAccess {
  
  /** @returns `TRUE` if the given element is a member of this container, otherwise `FALSE` . */
  def has(aElement: Any): Boolean
  
  /** inserts the given element into this container. */
  def insert(aElement: Any): Unit
  
  /** removes the given element from this container. */
  def remove(aElement: Any): Unit
}
object XSet {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getElementType: CallbackTo[`type`],
    has: Any => Boolean,
    hasElements: CallbackTo[Boolean],
    insert: Any => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    remove: Any => Callback
  ): XSet = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createEnumeration = createEnumeration.toJsFn, getElementType = getElementType.toJsFn, has = js.Any.fromFunction1(has), hasElements = hasElements.toJsFn, insert = js.Any.fromFunction1((t0: Any) => insert(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: Any) => remove(t0).runNow()))
    __obj.asInstanceOf[XSet]
  }
  
  extension [Self <: XSet](x: Self) {
    
    inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setInsert(value: Any => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove(value: Any => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
