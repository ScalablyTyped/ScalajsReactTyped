package typingsJapgolly.nodelibFsWalk

import typingsJapgolly.nodelibFsScandir.mod.AsyncCallback
import typingsJapgolly.nodelibFsScandir.settingsMod.Options
import typingsJapgolly.nodelibFsScandir.settingsMod.default
import typingsJapgolly.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofscandir extends js.Object {
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def __promisify__(path: String): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
}

