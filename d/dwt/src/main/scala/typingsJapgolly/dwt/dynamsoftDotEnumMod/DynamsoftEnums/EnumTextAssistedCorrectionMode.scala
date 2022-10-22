package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextAssistedCorrectionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextAssistedCorrectionMode")
@js.native
object EnumTextAssistedCorrectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextAssistedCorrectionMode & Double] = js.native
  
  @js.native
  sealed trait TACM_AUTO
    extends StObject
       with EnumTextAssistedCorrectionMode
  /* 1 */ val TACM_AUTO: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextAssistedCorrectionMode.TACM_AUTO & Double = js.native
  
  @js.native
  sealed trait TACM_SKIP
    extends StObject
       with EnumTextAssistedCorrectionMode
  /* 0 */ val TACM_SKIP: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextAssistedCorrectionMode.TACM_SKIP & Double = js.native
  
  @js.native
  sealed trait TACM_VERIFYING
    extends StObject
       with EnumTextAssistedCorrectionMode
  /* 2 */ val TACM_VERIFYING: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextAssistedCorrectionMode.TACM_VERIFYING & Double = js.native
  
  @js.native
  sealed trait TACM_VERIFYING_PATCHING
    extends StObject
       with EnumTextAssistedCorrectionMode
  /* 4 */ val TACM_VERIFYING_PATCHING: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTextAssistedCorrectionMode.TACM_VERIFYING_PATCHING & Double = js.native
}
