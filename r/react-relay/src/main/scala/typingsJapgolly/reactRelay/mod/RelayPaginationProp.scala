package typingsJapgolly.reactRelay.mod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayPaginationProp extends js.Object {
  val environment: typingsJapgolly.relayRuntime.mod.Environment = js.native
  var refetch: js.UndefOr[scala.Nothing] = js.native
  def hasMore(): Boolean = js.native
  def isLoading(): Boolean = js.native
  def loadMore(pageSize: Double): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: Null, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double, observerOrCallback: Null, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
}

