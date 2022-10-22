package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to add and remove properties to or from an object.
  *
  * Some scripting engines cannot access properties directly when the property set is changed. Please use {@link XPropertySet.getPropertyValue()} etc. in
  * this case.
  */
trait XPropertyContainer
  extends StObject
     with XInterface {
  
  /**
    * adds a property to the object.
    * @param Name specifies the name of the new property.
    * @param Attributes specifies the property attributes, see {@link PropertyAttribute} .
    * @param DefaultValue specifies the type of the new property and a potential default value.
    * @throws PropertyExistException if a property with the same name already exists.
    * @throws IllegalTypeException if the specified type is not allowed.
    */
  def addProperty(Name: String, Attributes: Double, DefaultValue: Any): Unit
  
  /**
    * removes a property from the object.
    * @param Name specified the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def removeProperty(Name: String): Unit
}
object XPropertyContainer {
  
  inline def apply(
    acquire: Callback,
    addProperty: (String, Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeProperty: String => Callback
  ): XPropertyContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addProperty(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()))
    __obj.asInstanceOf[XPropertyContainer]
  }
  
  extension [Self <: XPropertyContainer](x: Self) {
    
    inline def setAddProperty(value: (String, Double, Any) => Callback): Self = StObject.set(x, "addProperty", js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveProperty(value: String => Callback): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
