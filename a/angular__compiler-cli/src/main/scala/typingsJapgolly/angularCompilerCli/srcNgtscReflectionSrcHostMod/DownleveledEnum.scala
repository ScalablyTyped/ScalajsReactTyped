package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownleveledEnum extends StObject {
  
  var enumMembers: js.Array[EnumMember]
  
  var kind: `0`
}
object DownleveledEnum {
  
  inline def apply(enumMembers: js.Array[EnumMember]): DownleveledEnum = {
    val __obj = js.Dynamic.literal(enumMembers = enumMembers.asInstanceOf[js.Any], kind = 0)
    __obj.asInstanceOf[DownleveledEnum]
  }
  
  extension [Self <: DownleveledEnum](x: Self) {
    
    inline def setEnumMembers(value: js.Array[EnumMember]): Self = StObject.set(x, "enumMembers", value.asInstanceOf[js.Any])
    
    inline def setEnumMembersVarargs(value: EnumMember*): Self = StObject.set(x, "enumMembers", js.Array(value*))
    
    inline def setKind(value: `0`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
