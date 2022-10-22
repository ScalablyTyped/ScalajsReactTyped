package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a service, supporting single-interface  -  based services.
  *
  * This type supersedes {@link XServiceTypeDescription} , which only supports obsolete, accumulation-based services.
  * @since OOo 2.0
  */
trait XServiceTypeDescription2
  extends StObject
     with XServiceTypeDescription {
  
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  val Constructors: SafeArray[XServiceConstructorDescription]
  
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  val Interface: XTypeDescription
  
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  def getConstructors(): SafeArray[XServiceConstructorDescription]
  
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  def getInterface(): XTypeDescription
  
  /**
    * Returns whether this object reflects a single-interface  -  based service.
    * @returns `TRUE` if this object reflects a single-interface  -  based service, and `FALSE` if this object reflects an obsolete, accumulation-based service
    */
  def isSingleInterfaceBased(): Boolean
}
object XServiceTypeDescription2 {
  
  inline def apply(
    Constructors: SafeArray[XServiceConstructorDescription],
    Interface: XTypeDescription,
    MandatoryInterfaces: SafeArray[XInterfaceTypeDescription],
    MandatoryServices: SafeArray[XServiceTypeDescription],
    Name: String,
    OptionalInterfaces: SafeArray[XInterfaceTypeDescription],
    OptionalServices: SafeArray[XServiceTypeDescription],
    Properties: SafeArray[XPropertyTypeDescription],
    TypeClass: TypeClass,
    acquire: Callback,
    getConstructors: CallbackTo[SafeArray[XServiceConstructorDescription]],
    getInterface: CallbackTo[XTypeDescription],
    getMandatoryInterfaces: CallbackTo[SafeArray[XInterfaceTypeDescription]],
    getMandatoryServices: CallbackTo[SafeArray[XServiceTypeDescription]],
    getName: CallbackTo[String],
    getOptionalInterfaces: CallbackTo[SafeArray[XInterfaceTypeDescription]],
    getOptionalServices: CallbackTo[SafeArray[XServiceTypeDescription]],
    getProperties: CallbackTo[SafeArray[XPropertyTypeDescription]],
    getTypeClass: CallbackTo[TypeClass],
    isSingleInterfaceBased: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XServiceTypeDescription2 = {
    val __obj = js.Dynamic.literal(Constructors = Constructors.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], MandatoryInterfaces = MandatoryInterfaces.asInstanceOf[js.Any], MandatoryServices = MandatoryServices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalInterfaces = OptionalInterfaces.asInstanceOf[js.Any], OptionalServices = OptionalServices.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConstructors = getConstructors.toJsFn, getInterface = getInterface.toJsFn, getMandatoryInterfaces = getMandatoryInterfaces.toJsFn, getMandatoryServices = getMandatoryServices.toJsFn, getName = getName.toJsFn, getOptionalInterfaces = getOptionalInterfaces.toJsFn, getOptionalServices = getOptionalServices.toJsFn, getProperties = getProperties.toJsFn, getTypeClass = getTypeClass.toJsFn, isSingleInterfaceBased = isSingleInterfaceBased.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XServiceTypeDescription2]
  }
  
  extension [Self <: XServiceTypeDescription2](x: Self) {
    
    inline def setConstructors(value: SafeArray[XServiceConstructorDescription]): Self = StObject.set(x, "Constructors", value.asInstanceOf[js.Any])
    
    inline def setGetConstructors(value: CallbackTo[SafeArray[XServiceConstructorDescription]]): Self = StObject.set(x, "getConstructors", value.toJsFn)
    
    inline def setGetInterface(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getInterface", value.toJsFn)
    
    inline def setInterface(value: XTypeDescription): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setIsSingleInterfaceBased(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSingleInterfaceBased", value.toJsFn)
  }
}
