package typingsJapgolly.gapiClientStorage.gapi.client

import typingsJapgolly.gapiClientStorage.gapiClientStorageStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Cloud Storage JSON API v1 */
  def apply(name: typingsJapgolly.gapiClientStorage.gapiClientStorageStrings.storage, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typingsJapgolly.gapiClientStorage.gapiClientStorageStrings.storage,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

