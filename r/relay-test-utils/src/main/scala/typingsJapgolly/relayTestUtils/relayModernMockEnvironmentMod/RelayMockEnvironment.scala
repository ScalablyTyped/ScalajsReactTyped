package typingsJapgolly.relayTestUtils.relayModernMockEnvironmentMod

import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OptimisticUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayMockEnvironment
  extends MockEnvironment
     with Environment {
  var configName: js.UndefOr[String | Null] = js.native
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit = js.native
  def revertUpdate(update: OptimisticUpdate): Unit = js.native
}

