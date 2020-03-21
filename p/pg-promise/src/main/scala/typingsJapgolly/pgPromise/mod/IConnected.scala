package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.pgSubsetMod.IClient
import typingsJapgolly.spex.mod.ISpexBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Database object in connected state;
@js.native
trait IConnected[Ext, C /* <: IClient */]
  extends IBaseProtocol[Ext]
     with ISpexBase {
  val client: C = js.native
  def done(): Unit = js.native
}

