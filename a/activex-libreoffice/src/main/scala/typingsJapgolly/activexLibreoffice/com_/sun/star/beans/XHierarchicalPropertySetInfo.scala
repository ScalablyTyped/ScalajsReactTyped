package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a hierarchy of properties.
  *
  * The specification only describes the properties, it does not contain any values.
  */
trait XHierarchicalPropertySetInfo
  extends StObject
     with XInterface {
  
  /**
    * @param aHierarchicalName specifies the nested name of the property.
    * @returns the property with the specified name from the hierarchy.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def getPropertyByHierarchicalName(aHierarchicalName: String): Property
  
  /**
    * @param aHierarchicalName specifies the name of the property.
    * @returns `TRUE` if a property with the specified name exists; otherwise `FALSE` is returned.
    * @throws com::sun::star::lang::IllegalArgumentException if **aHierarchicalName** is not a well-formed nested name for this hierarchy. An implementation is
    */
  def hasPropertyByHierarchicalName(aHierarchicalName: String): Boolean
}
object XHierarchicalPropertySetInfo {
  
  inline def apply(
    acquire: Callback,
    getPropertyByHierarchicalName: String => Property,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XHierarchicalPropertySetInfo = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHierarchicalPropertySetInfo]
  }
  
  extension [Self <: XHierarchicalPropertySetInfo](x: Self) {
    
    inline def setGetPropertyByHierarchicalName(value: String => Property): Self = StObject.set(x, "getPropertyByHierarchicalName", js.Any.fromFunction1(value))
    
    inline def setHasPropertyByHierarchicalName(value: String => Boolean): Self = StObject.set(x, "hasPropertyByHierarchicalName", js.Any.fromFunction1(value))
  }
}
