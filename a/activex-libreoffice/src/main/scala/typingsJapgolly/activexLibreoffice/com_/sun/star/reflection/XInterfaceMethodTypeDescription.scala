package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an interface method type. The type class of this type is TypeClass_INTERFACE_METHOD. */
trait XInterfaceMethodTypeDescription
  extends StObject
     with XInterfaceMemberTypeDescription {
  
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  val Exceptions: SafeArray[XTypeDescription]
  
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  val Parameters: SafeArray[XMethodParameter]
  
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  val ReturnType: XTypeDescription
  
  /**
    * Returns declared exceptions that may occur upon invocations of the method.
    * @returns declared exceptions of method
    */
  def getExceptions(): SafeArray[XTypeDescription]
  
  /**
    * Returns all parameters of the method in order of IDL declaration.
    * @returns method parameters
    */
  def getParameters(): SafeArray[XMethodParameter]
  
  /**
    * Returns the method's return type.
    * @returns method's return type
    */
  def getReturnType(): XTypeDescription
  
  /**
    * Returns true, if this method is declared oneway.
    * @returns true, if this method is declared oneway
    */
  def isOneway(): Boolean
}
object XInterfaceMethodTypeDescription {
  
  inline def apply(
    Exceptions: SafeArray[XTypeDescription],
    MemberName: String,
    Name: String,
    Parameters: SafeArray[XMethodParameter],
    Position: Double,
    ReturnType: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getExceptions: CallbackTo[SafeArray[XTypeDescription]],
    getMemberName: CallbackTo[String],
    getName: CallbackTo[String],
    getParameters: CallbackTo[SafeArray[XMethodParameter]],
    getPosition: CallbackTo[Double],
    getReturnType: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    isOneway: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceMethodTypeDescription = {
    val __obj = js.Dynamic.literal(Exceptions = Exceptions.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ReturnType = ReturnType.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getExceptions = getExceptions.toJsFn, getMemberName = getMemberName.toJsFn, getName = getName.toJsFn, getParameters = getParameters.toJsFn, getPosition = getPosition.toJsFn, getReturnType = getReturnType.toJsFn, getTypeClass = getTypeClass.toJsFn, isOneway = isOneway.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceMethodTypeDescription]
  }
  
  extension [Self <: XInterfaceMethodTypeDescription](x: Self) {
    
    inline def setExceptions(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "Exceptions", value.asInstanceOf[js.Any])
    
    inline def setGetExceptions(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getExceptions", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[SafeArray[XMethodParameter]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetReturnType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getReturnType", value.toJsFn)
    
    inline def setIsOneway(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOneway", value.toJsFn)
    
    inline def setParameters(value: SafeArray[XMethodParameter]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: XTypeDescription): Self = StObject.set(x, "ReturnType", value.asInstanceOf[js.Any])
  }
}
