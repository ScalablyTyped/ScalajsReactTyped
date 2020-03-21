package typingsJapgolly.reactRelay.mod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayRefetchProp extends js.Object {
  var environment: typingsJapgolly.relayRuntime.mod.Environment = js.native
  var hasMore: js.UndefOr[scala.Nothing] = js.native
  def refetch(refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables]): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: ObserverOrCallback,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: ObserverOrCallback,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Null,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Null, observerOrCallback: ObserverOrCallback): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Null,
    observerOrCallback: ObserverOrCallback,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Variables): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Variables,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Variables, observerOrCallback: ObserverOrCallback): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Variables,
    observerOrCallback: ObserverOrCallback,
    options: RefetchOptions
  ): Disposable = js.native
}

