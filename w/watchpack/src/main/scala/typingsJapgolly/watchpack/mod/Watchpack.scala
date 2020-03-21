package typingsJapgolly.watchpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.Timer
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watchpack extends EventEmitter {
  var aggregateTimeout: Timer = js.native
  var aggregatedChanges: js.Array[String] = js.native
  var dirWatchers: js.Array[typingsJapgolly.watchpack.watcherMod.^] = js.native
  var fileWatchers: js.Array[typingsJapgolly.watchpack.watcherMod.^] = js.native
  var mtimes: StringDictionary[Double] = js.native
  var options: WatchOptions = js.native
  var paused: Boolean = js.native
  var watcherOptions: WatcherOptions = js.native
  def _dirWatcher(item: String, watcher: typingsJapgolly.watchpack.watcherMod.^): typingsJapgolly.watchpack.watcherMod.^ = js.native
  def _fileWatcher(file: String, watcher: typingsJapgolly.watchpack.watcherMod.^): typingsJapgolly.watchpack.watcherMod.^ = js.native
  def _onChange(item: String, mtime: Double): Unit = js.native
  def _onChange(item: String, mtime: Double, file: String): Unit = js.native
  def _onTimeout(): Unit = js.native
  def close(): Unit = js.native
  def getTimes(): StringDictionary[Double] = js.native
  def pause(): Unit = js.native
  def watch(files: js.Array[String], directories: js.Array[String]): Unit = js.native
  def watch(files: js.Array[String], directories: js.Array[String], startTime: Double): Unit = js.native
}

