package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects a typedef or sequence type. The type class of this description is TypeClass_TYPEDEF or TypeClass_SEQUENCE. */
trait XIndirectTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  val ReferencedType: XTypeDescription
  
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  def getReferencedType(): XTypeDescription
}
object XIndirectTypeDescription {
  
  inline def apply(
    Name: String,
    ReferencedType: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getName: CallbackTo[String],
    getReferencedType: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XIndirectTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ReferencedType = ReferencedType.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getName = getName.toJsFn, getReferencedType = getReferencedType.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIndirectTypeDescription]
  }
  
  extension [Self <: XIndirectTypeDescription](x: Self) {
    
    inline def setGetReferencedType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getReferencedType", value.toJsFn)
    
    inline def setReferencedType(value: XTypeDescription): Self = StObject.set(x, "ReferencedType", value.asInstanceOf[js.Any])
  }
}
