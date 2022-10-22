package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to access named objects within a container.
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
trait XNameAccess
  extends StObject
     with XElementAccess {
  
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  val ElementNames: SafeArray[String]
  
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByName(aName: String): Any
  
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  def getElementNames(): SafeArray[String]
  
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases the next call is {@link XNameAccess.getByName()} . You
    */
  def hasByName(aName: String): Boolean
}
object XNameAccess {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XNameAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNameAccess]
  }
  
  extension [Self <: XNameAccess](x: Self) {
    
    inline def setElementNames(value: SafeArray[String]): Self = StObject.set(x, "ElementNames", value.asInstanceOf[js.Any])
    
    inline def setGetByName(value: String => Any): Self = StObject.set(x, "getByName", js.Any.fromFunction1(value))
    
    inline def setGetElementNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getElementNames", value.toJsFn)
    
    inline def setHasByName(value: String => Boolean): Self = StObject.set(x, "hasByName", js.Any.fromFunction1(value))
  }
}
