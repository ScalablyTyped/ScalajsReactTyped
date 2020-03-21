package typingsJapgolly.dispatchr.baseStoreMod

import typingsJapgolly.dispatchr.mod.DispatcherContext
import typingsJapgolly.dispatchr.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStore[S] extends Store[S] {
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  def addChangeListener(callback: js.Function0[Unit]): Unit = js.native
  def getContext(): DispatcherContext = js.native
  def removeChangeListener(callback: js.Function0[Unit]): Unit = js.native
  @JSName("shouldDehydrate")
  def shouldDehydrate_MBaseStore(): Boolean = js.native
}

