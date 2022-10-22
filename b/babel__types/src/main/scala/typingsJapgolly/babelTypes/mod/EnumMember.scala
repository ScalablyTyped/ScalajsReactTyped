package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.EnumBooleanMember_
  - typingsJapgolly.babelTypes.mod.EnumNumberMember_
  - typingsJapgolly.babelTypes.mod.EnumStringMember_
  - typingsJapgolly.babelTypes.mod.EnumDefaultedMember_
*/
trait EnumMember
  extends StObject
     with _Node
object EnumMember {
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typingsJapgolly.babelTypes.mod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumBooleanMember_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typingsJapgolly.babelTypes.mod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typingsJapgolly.babelTypes.mod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumNumberMember_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typingsJapgolly.babelTypes.mod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumStringMember_]
  }
}
