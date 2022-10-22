package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.EnumBooleanBody_
  - typingsJapgolly.babelTypes.mod.EnumNumberBody_
  - typingsJapgolly.babelTypes.mod.EnumStringBody_
  - typingsJapgolly.babelTypes.mod.EnumSymbolBody_
*/
trait EnumBody
  extends StObject
     with _Node
object EnumBody {
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typingsJapgolly.babelTypes.mod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumBooleanBody_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typingsJapgolly.babelTypes.mod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumNumberBody_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typingsJapgolly.babelTypes.mod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumStringBody_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typingsJapgolly.babelTypes.mod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EnumSymbolBody_]
  }
}
