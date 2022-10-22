package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a singleton, supporting interface-based singletons.
  *
  * This type supersedes {@link XSingletonTypeDescription} , which only supports obsolete, service-based singletons.
  * @since OOo 2.0
  */
trait XSingletonTypeDescription2
  extends StObject
     with XSingletonTypeDescription {
  
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  val Interface: XTypeDescription
  
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  def getInterface(): XTypeDescription
  
  /**
    * Returns whether this object reflects an interface-based singleton.
    * @returns `TRUE` if this object reflects an interface-based singleton, and `FALSE` if this object reflects an obsolete, service-based singleton
    */
  def isInterfaceBased(): Boolean
}
object XSingletonTypeDescription2 {
  
  inline def apply(
    Interface: XTypeDescription,
    Name: String,
    Service: XServiceTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getInterface: CallbackTo[XTypeDescription],
    getName: CallbackTo[String],
    getService: CallbackTo[XServiceTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    isInterfaceBased: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XSingletonTypeDescription2 = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInterface = getInterface.toJsFn, getName = getName.toJsFn, getService = getService.toJsFn, getTypeClass = getTypeClass.toJsFn, isInterfaceBased = isInterfaceBased.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSingletonTypeDescription2]
  }
  
  extension [Self <: XSingletonTypeDescription2](x: Self) {
    
    inline def setGetInterface(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getInterface", value.toJsFn)
    
    inline def setInterface(value: XTypeDescription): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setIsInterfaceBased(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInterfaceBased", value.toJsFn)
  }
}
