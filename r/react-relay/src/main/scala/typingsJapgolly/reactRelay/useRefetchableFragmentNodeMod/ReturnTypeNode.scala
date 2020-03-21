package typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends js.Object {
  var fragmentData: js.Any
  var fragmentRef: js.Any
  var refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  def disableStoreUpdates(): Unit
  def enableStoreUpdates(): Unit
}

object ReturnTypeNode {
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions](
    disableStoreUpdates: Callback,
    enableStoreUpdates: Callback,
    fragmentData: js.Any,
    fragmentRef: js.Any,
    refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  ): ReturnTypeNode[TQuery, TKey, TOptions] = {
    val __obj = js.Dynamic.literal(fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.updateDynamic("disableStoreUpdates")(disableStoreUpdates.toJsFn)
    __obj.updateDynamic("enableStoreUpdates")(enableStoreUpdates.toJsFn)
    __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
  }
}

