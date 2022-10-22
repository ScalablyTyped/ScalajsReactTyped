package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTerminatePhase extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTerminatePhase")
@js.native
object EnumTerminatePhase extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTerminatePhase & Double] = js.native
  
  @js.native
  sealed trait TP_BARCODE_LOCALIZED
    extends StObject
       with EnumTerminatePhase
  /* 8 */ val TP_BARCODE_LOCALIZED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_LOCALIZED & Double = js.native
  
  @js.native
  sealed trait TP_BARCODE_RECOGNIZED
    extends StObject
       with EnumTerminatePhase
  /* 32 */ val TP_BARCODE_RECOGNIZED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_RECOGNIZED & Double = js.native
  
  @js.native
  sealed trait TP_BARCODE_TYPE_DETERMINED
    extends StObject
       with EnumTerminatePhase
  /* 16 */ val TP_BARCODE_TYPE_DETERMINED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_BARCODE_TYPE_DETERMINED & Double = js.native
  
  @js.native
  sealed trait TP_IMAGE_BINARIZED
    extends StObject
       with EnumTerminatePhase
  /* 4 */ val TP_IMAGE_BINARIZED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_IMAGE_BINARIZED & Double = js.native
  
  @js.native
  sealed trait TP_IMAGE_PREPROCESSED
    extends StObject
       with EnumTerminatePhase
  /* 2 */ val TP_IMAGE_PREPROCESSED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_IMAGE_PREPROCESSED & Double = js.native
  
  @js.native
  sealed trait TP_REGION_PREDETECTED
    extends StObject
       with EnumTerminatePhase
  /* 1 */ val TP_REGION_PREDETECTED: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumTerminatePhase.TP_REGION_PREDETECTED & Double = js.native
}
