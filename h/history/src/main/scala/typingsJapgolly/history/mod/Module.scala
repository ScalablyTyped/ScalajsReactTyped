package typingsJapgolly.history.mod

import typingsJapgolly.history.Fn0
import typingsJapgolly.history.FnCall
import typingsJapgolly.history.FnCallLocation
import typingsJapgolly.history.FnCallLvRv
import typingsJapgolly.history.FnCallOptions
import typingsJapgolly.history.FnCallPathStateKeyCurrentLocation
import typingsJapgolly.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typingsJapgolly.history.createHashHistoryMod.HashHistoryBuildOptions
import typingsJapgolly.history.createMemoryHistoryMod.MemoryHistory
import typingsJapgolly.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  @JSName("createBrowserHistory")
  var createBrowserHistory_Original: FnCall = js.native
  @JSName("createHashHistory")
  var createHashHistory_Original: FnCallOptions = js.native
  @JSName("createLocation")
  var createLocation_Original: FnCallPathStateKeyCurrentLocation = js.native
  @JSName("createMemoryHistory")
  var createMemoryHistory_Original: Fn0 = js.native
  @JSName("createPath")
  var createPath_Original: FnCallLocation = js.native
  @JSName("locationsAreEqual")
  var locationsAreEqual_Original: FnCallLvRv = js.native
  @JSName("parsePath")
  var parsePath_Original: js.Function1[/* path */ Path, Location[LocationState]] = js.native
  def createBrowserHistory[S](): History[S] = js.native
  def createBrowserHistory[S](options: BrowserHistoryBuildOptions): History[S] = js.native
  def createHashHistory[S](): History[S] = js.native
  def createHashHistory[S](options: HashHistoryBuildOptions): History[S] = js.native
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  def createMemoryHistory[S](): MemoryHistory[S] = js.native
  def createMemoryHistory[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
  def createPath[S](location: LocationDescriptorObject[S]): Path = js.native
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
  def parsePath(path: Path): Location[LocationState] = js.native
}

