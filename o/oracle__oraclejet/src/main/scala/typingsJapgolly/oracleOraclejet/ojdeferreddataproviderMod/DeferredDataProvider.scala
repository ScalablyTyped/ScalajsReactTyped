package typingsJapgolly.oracleOraclejet.ojdeferreddataproviderMod

import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredDataProvider[K, D] extends DataProvider[K, D] {
  def addEventListener(eventType: String, listener: EventListener): js.Any = js.native
  def removeEventListener(eventType: String, listener: EventListener): js.Any = js.native
}

