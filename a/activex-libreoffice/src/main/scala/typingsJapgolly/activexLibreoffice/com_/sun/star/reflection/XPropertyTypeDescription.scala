package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a property.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::PROPERTY.
  * @since OOo 1.1.2
  */
trait XPropertyTypeDescription
  extends StObject
     with XTypeDescription {
  
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  val PropertyFlags: Double
  
  /** @returns the type description for this property. */
  val PropertyTypeDescription: XTypeDescription
  
  /** @returns the flags defined for this property.  The possible values are defined in {@link com.sun.star.beans.PropertyAttribute} */
  def getPropertyFlags(): Double
  
  /** @returns the type description for this property. */
  def getPropertyTypeDescription(): XTypeDescription
}
object XPropertyTypeDescription {
  
  inline def apply(
    Name: String,
    PropertyFlags: Double,
    PropertyTypeDescription: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getName: CallbackTo[String],
    getPropertyFlags: CallbackTo[Double],
    getPropertyTypeDescription: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertyTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertyFlags = PropertyFlags.asInstanceOf[js.Any], PropertyTypeDescription = PropertyTypeDescription.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getName = getName.toJsFn, getPropertyFlags = getPropertyFlags.toJsFn, getPropertyTypeDescription = getPropertyTypeDescription.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertyTypeDescription]
  }
  
  extension [Self <: XPropertyTypeDescription](x: Self) {
    
    inline def setGetPropertyFlags(value: CallbackTo[Double]): Self = StObject.set(x, "getPropertyFlags", value.toJsFn)
    
    inline def setGetPropertyTypeDescription(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getPropertyTypeDescription", value.toJsFn)
    
    inline def setPropertyFlags(value: Double): Self = StObject.set(x, "PropertyFlags", value.asInstanceOf[js.Any])
    
    inline def setPropertyTypeDescription(value: XTypeDescription): Self = StObject.set(x, "PropertyTypeDescription", value.asInstanceOf[js.Any])
  }
}
