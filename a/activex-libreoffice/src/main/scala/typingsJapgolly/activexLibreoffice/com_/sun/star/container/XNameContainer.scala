package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of named elements.
  * @see XContainer
  */
trait XNameContainer
  extends StObject
     with XNameReplace {
  
  /** inserts the given element at the specified name. */
  def insertByName(aName: String, aElement: Any): Unit
  
  /** removes the element with the specified name. */
  def removeByName(Name: String): Unit
}
object XNameContainer {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertByName: (String, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    replaceByName: (String, Any) => Callback
  ): XNameContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[XNameContainer]
  }
  
  extension [Self <: XNameContainer](x: Self) {
    
    inline def setInsertByName(value: (String, Any) => Callback): Self = StObject.set(x, "insertByName", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
