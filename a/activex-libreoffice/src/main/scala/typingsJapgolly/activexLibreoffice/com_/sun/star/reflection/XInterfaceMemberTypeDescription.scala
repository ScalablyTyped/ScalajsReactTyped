package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for reflected interface members.
  * @see XInterfaceAttributeTypeDescription
  * @see XInterfaceMethodTypeDescription
  */
trait XInterfaceMemberTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns name of member
    * @returns member name
    */
  val MemberName: String
  
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  val Position: Double
  
  /**
    * Returns name of member
    * @returns member name
    */
  def getMemberName(): String
  
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  def getPosition(): Double
}
object XInterfaceMemberTypeDescription {
  
  inline def apply(
    MemberName: String,
    Name: String,
    Position: Double,
    TypeClass: TypeClass,
    acquire: Callback,
    getMemberName: CallbackTo[String],
    getName: CallbackTo[String],
    getPosition: CallbackTo[Double],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceMemberTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMemberName = getMemberName.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceMemberTypeDescription]
  }
  
  extension [Self <: XInterfaceMemberTypeDescription](x: Self) {
    
    inline def setGetMemberName(value: CallbackTo[String]): Self = StObject.set(x, "getMemberName", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setMemberName(value: String): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
