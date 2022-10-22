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
  * Deprecated, UNOIDL does not have a union concept.
  * @deprecated Deprecated
  */
trait XUnionTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  val DefaultDiscriminant: Any
  
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  val DefaultMemberType: XTypeDescription
  
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  val DiscriminantType: XTypeDescription
  
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  val Discriminants: SafeArray[Any]
  
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  val MemberNames: SafeArray[String]
  
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  val MemberTypes: SafeArray[XTypeDescription]
  
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  def getDefaultDiscriminant(): Any
  
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  def getDefaultMemberType(): XTypeDescription
  
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  def getDiscriminantType(): XTypeDescription
  
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  def getDiscriminants(): SafeArray[Any]
  
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  def getMemberNames(): SafeArray[String]
  
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  def getMemberTypes(): SafeArray[XTypeDescription]
}
object XUnionTypeDescription {
  
  inline def apply(
    DefaultDiscriminant: Any,
    DefaultMemberType: XTypeDescription,
    DiscriminantType: XTypeDescription,
    Discriminants: SafeArray[Any],
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: Callback,
    getDefaultDiscriminant: CallbackTo[Any],
    getDefaultMemberType: CallbackTo[XTypeDescription],
    getDiscriminantType: CallbackTo[XTypeDescription],
    getDiscriminants: CallbackTo[SafeArray[Any]],
    getMemberNames: CallbackTo[SafeArray[String]],
    getMemberTypes: CallbackTo[SafeArray[XTypeDescription]],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XUnionTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultDiscriminant = DefaultDiscriminant.asInstanceOf[js.Any], DefaultMemberType = DefaultMemberType.asInstanceOf[js.Any], DiscriminantType = DiscriminantType.asInstanceOf[js.Any], Discriminants = Discriminants.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultDiscriminant = getDefaultDiscriminant.toJsFn, getDefaultMemberType = getDefaultMemberType.toJsFn, getDiscriminantType = getDiscriminantType.toJsFn, getDiscriminants = getDiscriminants.toJsFn, getMemberNames = getMemberNames.toJsFn, getMemberTypes = getMemberTypes.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUnionTypeDescription]
  }
  
  extension [Self <: XUnionTypeDescription](x: Self) {
    
    inline def setDefaultDiscriminant(value: Any): Self = StObject.set(x, "DefaultDiscriminant", value.asInstanceOf[js.Any])
    
    inline def setDefaultMemberType(value: XTypeDescription): Self = StObject.set(x, "DefaultMemberType", value.asInstanceOf[js.Any])
    
    inline def setDiscriminantType(value: XTypeDescription): Self = StObject.set(x, "DiscriminantType", value.asInstanceOf[js.Any])
    
    inline def setDiscriminants(value: SafeArray[Any]): Self = StObject.set(x, "Discriminants", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultDiscriminant(value: CallbackTo[Any]): Self = StObject.set(x, "getDefaultDiscriminant", value.toJsFn)
    
    inline def setGetDefaultMemberType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getDefaultMemberType", value.toJsFn)
    
    inline def setGetDiscriminantType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getDiscriminantType", value.toJsFn)
    
    inline def setGetDiscriminants(value: CallbackTo[SafeArray[Any]]): Self = StObject.set(x, "getDiscriminants", value.toJsFn)
    
    inline def setGetMemberNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getMemberNames", value.toJsFn)
    
    inline def setGetMemberTypes(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getMemberTypes", value.toJsFn)
    
    inline def setMemberNames(value: SafeArray[String]): Self = StObject.set(x, "MemberNames", value.asInstanceOf[js.Any])
    
    inline def setMemberTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "MemberTypes", value.asInstanceOf[js.Any])
  }
}
