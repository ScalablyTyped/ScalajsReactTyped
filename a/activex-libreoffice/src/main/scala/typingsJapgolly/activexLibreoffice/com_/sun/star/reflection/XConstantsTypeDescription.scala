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
  * Reflects a constants group.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANTS.
  * @since OOo 1.1.2
  */
trait XConstantsTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  val Constants: SafeArray[XConstantTypeDescription]
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  def getConstants(): SafeArray[XConstantTypeDescription]
}
object XConstantsTypeDescription {
  
  inline def apply(
    Constants: SafeArray[XConstantTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: Callback,
    getConstants: CallbackTo[SafeArray[XConstantTypeDescription]],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XConstantsTypeDescription = {
    val __obj = js.Dynamic.literal(Constants = Constants.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConstants = getConstants.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConstantsTypeDescription]
  }
  
  extension [Self <: XConstantsTypeDescription](x: Self) {
    
    inline def setConstants(value: SafeArray[XConstantTypeDescription]): Self = StObject.set(x, "Constants", value.asInstanceOf[js.Any])
    
    inline def setGetConstants(value: CallbackTo[SafeArray[XConstantTypeDescription]]): Self = StObject.set(x, "getConstants", value.toJsFn)
  }
}
