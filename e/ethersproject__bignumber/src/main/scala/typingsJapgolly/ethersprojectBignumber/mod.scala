package typingsJapgolly.ethersprojectBignumber

import typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumberish
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bignumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/bignumber", "BigNumber")
  @js.native
  open class BigNumber protected ()
    extends typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber {
    def this(constructorGuard: Any, hex: String) = this()
  }
  /* static members */
  object BigNumber {
    
    @JSImport("@ethersproject/bignumber", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: Any): typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber]
    
    inline def isBigNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean]
  }
  
  @JSImport("@ethersproject/bignumber", "FixedFormat")
  @js.native
  open class FixedFormat protected ()
    extends typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat {
    def this(constructorGuard: Any, signed: Boolean, width: Double, decimals: Double) = this()
  }
  /* static members */
  object FixedFormat {
    
    @JSImport("@ethersproject/bignumber", "FixedFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: Any): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat]
  }
  
  @JSImport("@ethersproject/bignumber", "FixedNumber")
  @js.native
  open class FixedNumber protected ()
    extends typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber {
    def this(constructorGuard: Any, hex: String, value: String) = this()
    def this(
      constructorGuard: Any,
      hex: String,
      value: String,
      format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat
    ) = this()
  }
  /* static members */
  object FixedNumber {
    
    @JSImport("@ethersproject/bignumber", "FixedNumber")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: Any): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def from(value: Any, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def from(value: Any, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def from(value: Any, format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    
    inline def fromBytes(value: BytesLike): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromBytes(value: BytesLike, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromBytes(value: BytesLike, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromBytes(value: BytesLike, format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromString(value: String, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromString(value: String, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    inline def fromString(value: String, format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    
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
      format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat
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
      format: typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat
    ): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber]
    
    inline def isFixedNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean]
  }
  
  inline def base16To36(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base16To36")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base36To16(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_base36To16")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatFixed(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatFixed(value: BigNumberish, decimals: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatFixed(value: BigNumberish, decimals: BigNumberish): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseFixed(value: String): typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber]
  inline def parseFixed(value: String, decimals: BigNumberish): typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFixed")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber]
}
