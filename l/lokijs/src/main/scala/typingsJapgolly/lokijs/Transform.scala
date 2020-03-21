package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsStrings.compoundsort
import typingsJapgolly.lokijs.lokijsStrings.eqJoin
import typingsJapgolly.lokijs.lokijsStrings.find
import typingsJapgolly.lokijs.lokijsStrings.limit
import typingsJapgolly.lokijs.lokijsStrings.map
import typingsJapgolly.lokijs.lokijsStrings.mapReduce
import typingsJapgolly.lokijs.lokijsStrings.offset
import typingsJapgolly.lokijs.lokijsStrings.remove
import typingsJapgolly.lokijs.lokijsStrings.simplesort
import typingsJapgolly.lokijs.lokijsStrings.sort
import typingsJapgolly.lokijs.lokijsStrings.update
import typingsJapgolly.lokijs.lokijsStrings.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var dataOptions: js.UndefOr[js.Any] = js.undefined
  var desc: js.UndefOr[Boolean] = js.undefined
  var joinData: js.UndefOr[js.Any] = js.undefined
  var leftJoinKey: js.UndefOr[js.Any] = js.undefined
  var mapFun: js.UndefOr[js.Any] = js.undefined
  var mapFunction: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var reduceFunction: js.UndefOr[js.Any] = js.undefined
  var rightJoinKey: js.UndefOr[js.Any] = js.undefined
  var `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  var value: js.UndefOr[js.Any] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove,
    dataOptions: js.Any = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    joinData: js.Any = null,
    leftJoinKey: js.Any = null,
    mapFun: js.Any = null,
    mapFunction: js.Any = null,
    property: String = null,
    reduceFunction: js.Any = null,
    rightJoinKey: js.Any = null,
    value: js.Any = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dataOptions != null) __obj.updateDynamic("dataOptions")(dataOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (joinData != null) __obj.updateDynamic("joinData")(joinData.asInstanceOf[js.Any])
    if (leftJoinKey != null) __obj.updateDynamic("leftJoinKey")(leftJoinKey.asInstanceOf[js.Any])
    if (mapFun != null) __obj.updateDynamic("mapFun")(mapFun.asInstanceOf[js.Any])
    if (mapFunction != null) __obj.updateDynamic("mapFunction")(mapFunction.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (reduceFunction != null) __obj.updateDynamic("reduceFunction")(reduceFunction.asInstanceOf[js.Any])
    if (rightJoinKey != null) __obj.updateDynamic("rightJoinKey")(rightJoinKey.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

