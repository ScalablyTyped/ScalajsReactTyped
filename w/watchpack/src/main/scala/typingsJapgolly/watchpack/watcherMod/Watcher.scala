package typingsJapgolly.watchpack.watcherMod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watcher extends EventEmitter {
  var data: Double = js.native
  var directoryWatcher: typingsJapgolly.watchpack.directoryWatcherMod.^ = js.native
  var path: String = js.native
  var startTime: Double = js.native
  def checkStartTime(mtime: Double, initial: Boolean): Boolean = js.native
  def close(): Unit = js.native
}

