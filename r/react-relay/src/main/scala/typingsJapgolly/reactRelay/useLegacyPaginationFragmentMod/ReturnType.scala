package typingsJapgolly.reactRelay.useLegacyPaginationFragmentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactRelay.AnonOnComplete
import typingsJapgolly.reactRelay.useLoadMoreFunctionMod.LoadMoreFn
import typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.Options
import typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnType[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData
  var hasNext: Boolean
  var hasPrevious: Boolean
  var isLoadingNext: Boolean
  var isLoadingPrevious: Boolean
  var loadNext: LoadMoreFn
  var loadPrevious: LoadMoreFn
  var refetch: RefetchFnDynamic[TQuery, TKey, Options]
}

object ReturnType {
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    isLoadingNext: Boolean,
    isLoadingPrevious: Boolean,
    loadNext: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => CallbackTo[Disposable],
    loadPrevious: (/* count */ Double, /* options */ js.UndefOr[AnonOnComplete]) => CallbackTo[Disposable],
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnType[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.updateDynamic("loadNext")(js.Any.fromFunction2((t0: /* count */ scala.Double, t1: /* options */ js.UndefOr[typingsJapgolly.reactRelay.AnonOnComplete]) => loadNext(t0, t1).runNow()))
    __obj.updateDynamic("loadPrevious")(js.Any.fromFunction2((t0: /* count */ scala.Double, t1: /* options */ js.UndefOr[typingsJapgolly.reactRelay.AnonOnComplete]) => loadPrevious(t0, t1).runNow()))
    __obj.asInstanceOf[ReturnType[TQuery, TKey, TFragmentData]]
  }
}

