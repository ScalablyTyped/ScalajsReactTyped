package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Uik
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an interface type, supporting multiple inheritance.
  *
  * This type supersedes {@link XInterfaceTypeDescription} , which only supported single inheritance.
  * @since OOo 2.0
  */
trait XInterfaceTypeDescription2
  extends StObject
     with XInterfaceTypeDescription {
  
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  val BaseTypes: SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  val OptionalBaseTypes: SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  def getBaseTypes(): SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  def getOptionalBaseTypes(): SafeArray[XTypeDescription]
}
object XInterfaceTypeDescription2 {
  
  inline def apply(
    BaseType: XTypeDescription,
    BaseTypes: SafeArray[XTypeDescription],
    Members: SafeArray[XInterfaceMemberTypeDescription],
    Name: String,
    OptionalBaseTypes: SafeArray[XTypeDescription],
    TypeClass: TypeClass,
    Uik: Uik,
    acquire: Callback,
    getBaseType: CallbackTo[XTypeDescription],
    getBaseTypes: CallbackTo[SafeArray[XTypeDescription]],
    getMembers: CallbackTo[SafeArray[XInterfaceMemberTypeDescription]],
    getName: CallbackTo[String],
    getOptionalBaseTypes: CallbackTo[SafeArray[XTypeDescription]],
    getTypeClass: CallbackTo[TypeClass],
    getUik: CallbackTo[Uik],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceTypeDescription2 = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], BaseTypes = BaseTypes.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalBaseTypes = OptionalBaseTypes.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], Uik = Uik.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBaseType = getBaseType.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getMembers = getMembers.toJsFn, getName = getName.toJsFn, getOptionalBaseTypes = getOptionalBaseTypes.toJsFn, getTypeClass = getTypeClass.toJsFn, getUik = getUik.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceTypeDescription2]
  }
  
  extension [Self <: XInterfaceTypeDescription2](x: Self) {
    
    inline def setBaseTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "BaseTypes", value.asInstanceOf[js.Any])
    
    inline def setGetBaseTypes(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getBaseTypes", value.toJsFn)
    
    inline def setGetOptionalBaseTypes(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getOptionalBaseTypes", value.toJsFn)
    
    inline def setOptionalBaseTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "OptionalBaseTypes", value.asInstanceOf[js.Any])
  }
}
