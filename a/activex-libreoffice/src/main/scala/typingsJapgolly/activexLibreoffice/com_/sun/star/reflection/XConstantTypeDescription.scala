package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a constant.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANT.
  *
  * Constants may be contained in constants groups and modules.
  * @see XModuleTypeDescription
  * @see XConstantsTypeDescription
  * @since OOo 1.1.2
  */
trait XConstantTypeDescription
  extends StObject
     with XTypeDescription {
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: Any
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): Any
}
object XConstantTypeDescription {
  
  inline def apply(
    ConstantValue: Any,
    Name: String,
    TypeClass: TypeClass,
    acquire: Callback,
    getConstantValue: CallbackTo[Any],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConstantValue = getConstantValue.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConstantTypeDescription]
  }
  
  extension [Self <: XConstantTypeDescription](x: Self) {
    
    inline def setConstantValue(value: Any): Self = StObject.set(x, "ConstantValue", value.asInstanceOf[js.Any])
    
    inline def setGetConstantValue(value: CallbackTo[Any]): Self = StObject.set(x, "getConstantValue", value.toJsFn)
  }
}
