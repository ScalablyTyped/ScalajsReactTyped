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
  * Reflects an interface type.
  *
  * This type is superseded by {@link XInterfaceTypeDescription2} , which supports multiple inheritance.
  * @see XInterfaceMemberTypeDescription
  */
trait XInterfaceTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  val BaseType: XTypeDescription
  
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  val Members: SafeArray[XInterfaceMemberTypeDescription]
  
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  val Uik: typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Uik
  
  /**
    * Returns the base interface or null, if the reflected interface is not inherited from another.
    *
    * This method is deprecated, as it only supports single inheritance. See {@link XInterfaceTypeDescription2} for a replacement that supports multiple
    * inheritance.
    * @deprecated Deprecated
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription
  
  /**
    * Returns the members of the interfaces, i.e. attributes and methods.
    * @returns interface members
    */
  def getMembers(): SafeArray[XInterfaceMemberTypeDescription]
  
  /**
    * Deprecated. UIK are not used anymore, a type is uniquely identified by its name. ;  Returns the UIK, i.e. the unique identifier of the interface.
    * @deprecated Deprecated
    * @returns uik of the interface
    */
  def getUik(): typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Uik
}
object XInterfaceTypeDescription {
  
  inline def apply(
    BaseType: XTypeDescription,
    Members: SafeArray[XInterfaceMemberTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    Uik: Uik,
    acquire: Callback,
    getBaseType: CallbackTo[XTypeDescription],
    getMembers: CallbackTo[SafeArray[XInterfaceMemberTypeDescription]],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    getUik: CallbackTo[Uik],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], Uik = Uik.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBaseType = getBaseType.toJsFn, getMembers = getMembers.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, getUik = getUik.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceTypeDescription]
  }
  
  extension [Self <: XInterfaceTypeDescription](x: Self) {
    
    inline def setBaseType(value: XTypeDescription): Self = StObject.set(x, "BaseType", value.asInstanceOf[js.Any])
    
    inline def setGetBaseType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getBaseType", value.toJsFn)
    
    inline def setGetMembers(value: CallbackTo[SafeArray[XInterfaceMemberTypeDescription]]): Self = StObject.set(x, "getMembers", value.toJsFn)
    
    inline def setGetUik(value: CallbackTo[Uik]): Self = StObject.set(x, "getUik", value.toJsFn)
    
    inline def setMembers(value: SafeArray[XInterfaceMemberTypeDescription]): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setUik(value: Uik): Self = StObject.set(x, "Uik", value.asInstanceOf[js.Any])
  }
}
