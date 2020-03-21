package typingsJapgolly.entriaRelayExperimental.useLegacyPaginationFragmentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.entriaRelayExperimental.AnonOnComplete
import typingsJapgolly.entriaRelayExperimental.useLoadMoreFunctionMod.LoadMoreFn
import typingsJapgolly.entriaRelayExperimental.useRefetchableFragmentNodeMod.Options
import typingsJapgolly.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnTypePaginationFragment[TQuery /* <: OperationType */, TKey, TFragmentData] extends js.Object {
  var data: TFragmentData
  var hasNext: Boolean
  var hasPrevious: Boolean
  var isLoadingNext: Boolean
  var isLoadingPrevious: Boolean
  var loadNext: LoadMoreFn
  var loadPrevious: LoadMoreFn
  var refetch: RefetchFnDynamic[TQuery, TKey, Options]
}

object ReturnTypePaginationFragment {
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
  ): ReturnTypePaginationFragment[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.updateDynamic("loadNext")(js.Any.fromFunction2((t0: /* count */ scala.Double, t1: /* options */ js.UndefOr[typingsJapgolly.entriaRelayExperimental.AnonOnComplete]) => loadNext(t0, t1).runNow()))
    __obj.updateDynamic("loadPrevious")(js.Any.fromFunction2((t0: /* count */ scala.Double, t1: /* options */ js.UndefOr[typingsJapgolly.entriaRelayExperimental.AnonOnComplete]) => loadPrevious(t0, t1).runNow()))
    __obj.asInstanceOf[ReturnTypePaginationFragment[TQuery, TKey, TFragmentData]]
  }
}

