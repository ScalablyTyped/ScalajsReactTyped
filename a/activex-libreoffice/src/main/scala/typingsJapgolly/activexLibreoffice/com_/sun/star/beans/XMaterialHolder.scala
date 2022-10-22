package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the material a (tool-) object is working on.
  *
  * Example: The introspection service allows the inspection of an object's properties and methods. The result is represented as {@link
  * XIntrospectionAccess} interface. The inspected object then is the material attached to the introspection tool and an implementation of {@link
  * XIntrospectionAccess} should also support {@link XMaterialHolder} to give access to this material.
  * @see XIntrospectionAccess
  */
trait XMaterialHolder
  extends StObject
     with XInterface {
  
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  val Material: Any
  
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  def getMaterial(): Any
}
object XMaterialHolder {
  
  inline def apply(
    Material: Any,
    acquire: Callback,
    getMaterial: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XMaterialHolder = {
    val __obj = js.Dynamic.literal(Material = Material.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMaterial = getMaterial.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMaterialHolder]
  }
  
  extension [Self <: XMaterialHolder](x: Self) {
    
    inline def setGetMaterial(value: CallbackTo[Any]): Self = StObject.set(x, "getMaterial", value.toJsFn)
    
    inline def setMaterial(value: Any): Self = StObject.set(x, "Material", value.asInstanceOf[js.Any])
  }
}
