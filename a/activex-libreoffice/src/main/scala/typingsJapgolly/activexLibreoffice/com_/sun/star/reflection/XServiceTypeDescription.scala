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
  * Reflects a service.
  *
  * This type is superseded by {@link XServiceTypeDescription2} , which supports single-interface  -  based services, in addition to the obsolete,
  * accumulation-based services.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SERVICE.
  * @since OOo 1.1.2
  */
trait XServiceTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val MandatoryInterfaces: SafeArray[XInterfaceTypeDescription]
  
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val MandatoryServices: SafeArray[XServiceTypeDescription]
  
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val OptionalInterfaces: SafeArray[XInterfaceTypeDescription]
  
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val OptionalServices: SafeArray[XServiceTypeDescription]
  
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  val Properties: SafeArray[XPropertyTypeDescription]
  
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getMandatoryInterfaces(): SafeArray[XInterfaceTypeDescription]
  
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getMandatoryServices(): SafeArray[XServiceTypeDescription]
  
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getOptionalInterfaces(): SafeArray[XInterfaceTypeDescription]
  
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getOptionalServices(): SafeArray[XServiceTypeDescription]
  
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  def getProperties(): SafeArray[XPropertyTypeDescription]
}
object XServiceTypeDescription {
  
  inline def apply(
    MandatoryInterfaces: SafeArray[XInterfaceTypeDescription],
    MandatoryServices: SafeArray[XServiceTypeDescription],
    Name: String,
    OptionalInterfaces: SafeArray[XInterfaceTypeDescription],
    OptionalServices: SafeArray[XServiceTypeDescription],
    Properties: SafeArray[XPropertyTypeDescription],
    TypeClass: TypeClass,
    acquire: Callback,
    getMandatoryInterfaces: CallbackTo[SafeArray[XInterfaceTypeDescription]],
    getMandatoryServices: CallbackTo[SafeArray[XServiceTypeDescription]],
    getName: CallbackTo[String],
    getOptionalInterfaces: CallbackTo[SafeArray[XInterfaceTypeDescription]],
    getOptionalServices: CallbackTo[SafeArray[XServiceTypeDescription]],
    getProperties: CallbackTo[SafeArray[XPropertyTypeDescription]],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XServiceTypeDescription = {
    val __obj = js.Dynamic.literal(MandatoryInterfaces = MandatoryInterfaces.asInstanceOf[js.Any], MandatoryServices = MandatoryServices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalInterfaces = OptionalInterfaces.asInstanceOf[js.Any], OptionalServices = OptionalServices.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMandatoryInterfaces = getMandatoryInterfaces.toJsFn, getMandatoryServices = getMandatoryServices.toJsFn, getName = getName.toJsFn, getOptionalInterfaces = getOptionalInterfaces.toJsFn, getOptionalServices = getOptionalServices.toJsFn, getProperties = getProperties.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XServiceTypeDescription]
  }
  
  extension [Self <: XServiceTypeDescription](x: Self) {
    
    inline def setGetMandatoryInterfaces(value: CallbackTo[SafeArray[XInterfaceTypeDescription]]): Self = StObject.set(x, "getMandatoryInterfaces", value.toJsFn)
    
    inline def setGetMandatoryServices(value: CallbackTo[SafeArray[XServiceTypeDescription]]): Self = StObject.set(x, "getMandatoryServices", value.toJsFn)
    
    inline def setGetOptionalInterfaces(value: CallbackTo[SafeArray[XInterfaceTypeDescription]]): Self = StObject.set(x, "getOptionalInterfaces", value.toJsFn)
    
    inline def setGetOptionalServices(value: CallbackTo[SafeArray[XServiceTypeDescription]]): Self = StObject.set(x, "getOptionalServices", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[SafeArray[XPropertyTypeDescription]]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setMandatoryInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = StObject.set(x, "MandatoryInterfaces", value.asInstanceOf[js.Any])
    
    inline def setMandatoryServices(value: SafeArray[XServiceTypeDescription]): Self = StObject.set(x, "MandatoryServices", value.asInstanceOf[js.Any])
    
    inline def setOptionalInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = StObject.set(x, "OptionalInterfaces", value.asInstanceOf[js.Any])
    
    inline def setOptionalServices(value: SafeArray[XServiceTypeDescription]): Self = StObject.set(x, "OptionalServices", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SafeArray[XPropertyTypeDescription]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
