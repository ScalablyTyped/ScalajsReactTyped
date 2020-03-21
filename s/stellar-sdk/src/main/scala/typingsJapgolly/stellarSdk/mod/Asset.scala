package typingsJapgolly.stellarSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Asset")
@js.native
class Asset protected ()
  extends typingsJapgolly.stellarBase.mod.Asset {
  def this(code: String) = this()
  def this(code: String, issuer: String) = this()
}

/* static members */
@JSImport("stellar-sdk", "Asset")
@js.native
object Asset extends js.Object {
  def fromOperation(xdr: typingsJapgolly.stellarBase.mod.xdr.Asset): typingsJapgolly.stellarBase.mod.Asset = js.native
  def native(): typingsJapgolly.stellarBase.mod.Asset = js.native
}

