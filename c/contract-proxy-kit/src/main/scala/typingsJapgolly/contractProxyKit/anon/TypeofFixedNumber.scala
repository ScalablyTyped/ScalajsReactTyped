package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.ethers.mod.ethers.FixedNumber
import typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumber
import typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumberish
import typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedFormat
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFixedNumber
  extends StObject
     with Instantiable3[/* constructorGuard */ Any, /* hex */ String, /* value */ String, FixedNumber] {
  
  def from(value: Any): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def from(value: Any, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def fromValue(value: BigNumber): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: Unit, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: String): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: Double): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish, format: FixedFormat): typingsJapgolly.ethersprojectBignumber.libFixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
