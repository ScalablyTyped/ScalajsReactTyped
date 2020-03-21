package typingsJapgolly.jestRunner.typesMod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jestRunner.AnonIsWatchMode
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWatcher
  extends EventEmitter
     with Instantiable1[/* hasIsWatchMode */ AnonIsWatchMode, TestWatcher] {
  var state: WatcherState = js.native
  def isInterrupted(): Boolean = js.native
  def isWatchMode(): Boolean = js.native
  def setState(state: WatcherState): Unit = js.native
}

