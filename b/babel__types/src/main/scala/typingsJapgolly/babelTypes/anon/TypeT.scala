package typingsJapgolly.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeT[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typingsJapgolly.babelTypes.babelTypesStrings.AnyTypeAnnotation, typingsJapgolly.babelTypes.babelTypesStrings.ArgumentPlaceholder, typingsJapgolly.babelTypes.babelTypesStrings.ArrayExpression */ Any */] extends StObject {
  
  var `type`: T
}
object TypeT {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typingsJapgolly.babelTypes.babelTypesStrings.AnyTypeAnnotation, typingsJapgolly.babelTypes.babelTypesStrings.ArgumentPlaceholder, typingsJapgolly.babelTypes.babelTypesStrings.ArrayExpression */ Any */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  extension [Self <: TypeT[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252, starting with typingsJapgolly.babelTypes.babelTypesStrings.AnyTypeAnnotation, typingsJapgolly.babelTypes.babelTypesStrings.ArgumentPlaceholder, typingsJapgolly.babelTypes.babelTypesStrings.ArrayExpression */ Any */](x: Self & TypeT[T]) {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
