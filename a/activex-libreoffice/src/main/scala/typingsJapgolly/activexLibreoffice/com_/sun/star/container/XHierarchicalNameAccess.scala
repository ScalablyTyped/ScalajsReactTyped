package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to have hierarchical access to elements within a container.
  *
  * You address an object of a specific level in the hierarchy by giving its fully qualified name, e.g., "com.sun.star.uno.XInterface".
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
trait XHierarchicalNameAccess
  extends StObject
     with XInterface {
  
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    */
  def getByHierarchicalName(aName: String): Any
  
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases, the next call is {@link XNameAccess.getByName()} . Yo
    */
  def hasByHierarchicalName(aName: String): Boolean
}
object XHierarchicalNameAccess {
  
  inline def apply(
    acquire: Callback,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XHierarchicalNameAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHierarchicalNameAccess]
  }
  
  extension [Self <: XHierarchicalNameAccess](x: Self) {
    
    inline def setGetByHierarchicalName(value: String => Any): Self = StObject.set(x, "getByHierarchicalName", js.Any.fromFunction1(value))
    
    inline def setHasByHierarchicalName(value: String => Boolean): Self = StObject.set(x, "hasByHierarchicalName", js.Any.fromFunction1(value))
  }
}
