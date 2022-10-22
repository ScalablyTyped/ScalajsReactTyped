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
  * Reflects a module.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::MODULE.
  * @since OOo 1.1.2
  */
trait XModuleTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  val Members: SafeArray[XTypeDescription]
  
  /**
    * Returns the type descriptions for the members of this module.
    * @returns a sequence containing type descriptions.
    */
  def getMembers(): SafeArray[XTypeDescription]
}
object XModuleTypeDescription {
  
  inline def apply(
    Members: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: Callback,
    getMembers: CallbackTo[SafeArray[XTypeDescription]],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XModuleTypeDescription = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMembers = getMembers.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XModuleTypeDescription]
  }
  
  extension [Self <: XModuleTypeDescription](x: Self) {
    
    inline def setGetMembers(value: CallbackTo[SafeArray[XTypeDescription]]): Self = StObject.set(x, "getMembers", value.toJsFn)
    
    inline def setMembers(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
  }
}
