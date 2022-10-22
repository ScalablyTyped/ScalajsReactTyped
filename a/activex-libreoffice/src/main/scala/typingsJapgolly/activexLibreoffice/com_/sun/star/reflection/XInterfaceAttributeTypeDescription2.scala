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
  * Reflects an interface attribute, supporting extended attributes that are bound or raise exceptions.
  *
  * This type supersedes {@link XInterfaceAttributeTypeDescription} , which does not support extended attributes.
  * @since OOo 2.0
  */
trait XInterfaceAttributeTypeDescription2
  extends StObject
     with XInterfaceAttributeTypeDescription {
  
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  val GetExceptions: SafeArray[XCompoundTypeDescription]
  
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: SafeArray[XCompoundTypeDescription]
  
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): SafeArray[XCompoundTypeDescription]
  
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): SafeArray[XCompoundTypeDescription]
  
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): Boolean
}
object XInterfaceAttributeTypeDescription2 {
  
  inline def apply(
    GetExceptions: SafeArray[XCompoundTypeDescription],
    MemberName: String,
    Name: String,
    Position: Double,
    SetExceptions: SafeArray[XCompoundTypeDescription],
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getGetExceptions: CallbackTo[SafeArray[XCompoundTypeDescription]],
    getMemberName: CallbackTo[String],
    getName: CallbackTo[String],
    getPosition: CallbackTo[Double],
    getSetExceptions: CallbackTo[SafeArray[XCompoundTypeDescription]],
    getType: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    isBound: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XInterfaceAttributeTypeDescription2 = {
    val __obj = js.Dynamic.literal(GetExceptions = GetExceptions.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], SetExceptions = SetExceptions.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGetExceptions = getGetExceptions.toJsFn, getMemberName = getMemberName.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getSetExceptions = getSetExceptions.toJsFn, getType = getType.toJsFn, getTypeClass = getTypeClass.toJsFn, isBound = isBound.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInterfaceAttributeTypeDescription2]
  }
  
  extension [Self <: XInterfaceAttributeTypeDescription2](x: Self) {
    
    inline def setGetExceptions(value: SafeArray[XCompoundTypeDescription]): Self = StObject.set(x, "GetExceptions", value.asInstanceOf[js.Any])
    
    inline def setGetGetExceptions(value: CallbackTo[SafeArray[XCompoundTypeDescription]]): Self = StObject.set(x, "getGetExceptions", value.toJsFn)
    
    inline def setGetSetExceptions(value: CallbackTo[SafeArray[XCompoundTypeDescription]]): Self = StObject.set(x, "getSetExceptions", value.toJsFn)
    
    inline def setIsBound(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBound", value.toJsFn)
    
    inline def setSetExceptions(value: SafeArray[XCompoundTypeDescription]): Self = StObject.set(x, "SetExceptions", value.asInstanceOf[js.Any])
  }
}
