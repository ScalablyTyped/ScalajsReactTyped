package typingsJapgolly.vegaTypings.transformMod

import typingsJapgolly.vegaTypings.markMod.Compare
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import typingsJapgolly.vegaTypings.utilMod.Vector2
import typingsJapgolly.vegaTypings.vegaTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  var frame: js.UndefOr[(Vector2[Double | SignalRef | Null]) | SignalRef] = js.undefined
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var ignorePeers: js.UndefOr[Boolean | SignalRef] = js.undefined
  var ops: js.UndefOr[js.Array[AggregateOp | WindowOnlyOp | SignalRef]] = js.undefined
  var params: js.UndefOr[(js.Array[Double | SignalRef | Null]) | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: window
}

object WindowTransform {
  @scala.inline
  def apply(
    `type`: window,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    frame: (Vector2[Double | SignalRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    ignorePeers: Boolean | SignalRef = null,
    ops: js.Array[AggregateOp | WindowOnlyOp | SignalRef] = null,
    params: (js.Array[Double | SignalRef | Null]) | SignalRef = null,
    sort: Compare = null
  ): WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ignorePeers != null) __obj.updateDynamic("ignorePeers")(ignorePeers.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowTransform]
  }
}

