package typingsJapgolly.ethers.mod

import typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumberish
import typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "FixedNumber")
@js.native
open class FixedNumber protected ()
  extends typingsJapgolly.ethersprojectBignumber.mod.FixedNumber {
  def this(constructorGuard: Any, hex: String, value: String) = this()
  def this(constructorGuard: Any, hex: String, value: String, format: FixedFormat) = this()
}
/* static members */
object FixedNumber {
  
  @JSImport("ethers", "FixedNumber")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(value: Any): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def from(value: Any, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromBytes(value: BytesLike): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromBytes(value: BytesLike, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromString(value: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromString(value: String, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def fromValue(value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: Unit,
    format: String
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: Unit,
    format: Double
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: Unit,
    format: FixedFormat
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber, decimals: BigNumberish): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: String
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: Double
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  inline def fromValue(
    value: typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber,
    decimals: BigNumberish,
    format: FixedFormat
  ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
  
  inline def isFixedNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean]
}
