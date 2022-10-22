package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumReturnType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ReturnType")
@js.native
object EnumReturnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumReturnType & Double] = js.native
  
  @js.native
  sealed trait RT_AUTO
    extends StObject
       with EnumReturnType
  /* -1 */ val RT_AUTO: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumReturnType.RT_AUTO & Double = js.native
  
  @js.native
  sealed trait RT_BASE64
    extends StObject
       with EnumReturnType
  /* 2 */ val RT_BASE64: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumReturnType.RT_BASE64 & Double = js.native
  
  @js.native
  sealed trait RT_BINARY
    extends StObject
       with EnumReturnType
  /* 1 */ val RT_BINARY: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumReturnType.RT_BINARY & Double = js.native
}
