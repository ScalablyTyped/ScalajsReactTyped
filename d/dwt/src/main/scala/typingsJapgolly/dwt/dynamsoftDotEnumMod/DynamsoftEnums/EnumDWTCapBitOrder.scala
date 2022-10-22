package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapBitOrder extends StObject
/** ICAP_BITORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitOrder")
@js.native
object EnumDWTCapBitOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitOrder & Double] = js.native
  
  @js.native
  sealed trait TWBO_LSBFIRST
    extends StObject
       with EnumDWTCapBitOrder
  /* 0 */ val TWBO_LSBFIRST: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapBitOrder.TWBO_LSBFIRST & Double = js.native
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST
    extends StObject
       with EnumDWTCapBitOrder
  /* 1 */ val TWBO_MSBFIRST: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapBitOrder.TWBO_MSBFIRST & Double = js.native
}
