package typingsJapgolly.oracleOraclejet.ojcontextMod

import typingsJapgolly.oracleOraclejet.AnonDescription
import typingsJapgolly.oracleOraclejet.AnonDescriptionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusyContext extends js.Object {
  def addBusyState(options: AnonDescription): js.Function0[Unit] = js.native
  def applicationBootstrapComplete(): js.UndefOr[scala.Nothing] = js.native
  def clear(): js.UndefOr[scala.Nothing] = js.native
  def dump(): js.UndefOr[scala.Nothing] = js.native
  def dump(message: String): js.UndefOr[scala.Nothing] = js.native
  def getBusyStates(): js.Array[AnonDescriptionId] = js.native
  def isReady(): Boolean = js.native
  def whenReady(): js.Promise[Boolean | js.Error] = js.native
  def whenReady(timeout: Double): js.Promise[Boolean | js.Error] = js.native
}

