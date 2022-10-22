package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to enumerate the contents of a container.
  *
  * An object that implements the {@link XEnumeration} interface generates a series of elements, one at a time. Successive calls to the
  * `XEnumeration::nextElement` method return successive elements of the series.
  *
  * For example (Java), to print all elements of a vector **aVect** :
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * If the object changed, the behavior of the enumeration is not specified. This is not a remote interface.
  */
trait XEnumeration
  extends StObject
     with XInterface {
  
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): Boolean
  
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def nextElement(): Any
}
object XEnumeration {
  
  inline def apply(
    acquire: Callback,
    hasMoreElements: CallbackTo[Boolean],
    nextElement: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XEnumeration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasMoreElements = hasMoreElements.toJsFn, nextElement = nextElement.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEnumeration]
  }
  
  extension [Self <: XEnumeration](x: Self) {
    
    inline def setHasMoreElements(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasMoreElements", value.toJsFn)
    
    inline def setNextElement(value: CallbackTo[Any]): Self = StObject.set(x, "nextElement", value.toJsFn)
  }
}
