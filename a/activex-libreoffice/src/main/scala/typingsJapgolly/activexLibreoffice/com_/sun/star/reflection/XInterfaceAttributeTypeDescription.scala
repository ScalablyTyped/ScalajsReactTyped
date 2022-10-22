package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an interface attribute type.
  *
  * This type is superseded by {@link XInterfaceAttributeTypeDescription2} , which supports extended attributes.
  *
  * The type class of this type is TypeClass_INTERFACE_ATTRIBUTE.
  */
trait XInterfaceAttributeTypeDescription
  extends StObject
     with XInterfaceMemberTypeDescription {
  
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  val Type: XTypeDescription
  
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  def getType(): XTypeDescription
  
  /**
    * Returns true, if this attribute is read-only.
    * @returns true, if attribute is read-only
    */
  def isReadOnly(): Boolean
}
object XInterfaceAttributeTypeDescription {
  
  inline def apply(
    MemberName: String,
    Name: String,
    Position: Double,
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getMemberName: CallbackTo[String],
    getName: CallbackTo[String],
    getPosition: CallbackTo[Double],
    getType: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceAttributeTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMemberName = getMemberName.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getType = getType.toJsFn, getTypeClass = getTypeClass.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription]
  }
  
  extension [Self <: XInterfaceAttributeTypeDescription](x: Self) {
    
    inline def setGetType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setType(value: XTypeDescription): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
