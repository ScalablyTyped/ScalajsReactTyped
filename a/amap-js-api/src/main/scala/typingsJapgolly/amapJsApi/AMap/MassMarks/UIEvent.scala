package typingsJapgolly.amapJsApi.AMap.MassMarks

import typingsJapgolly.amapJsApi.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Event<N, {  target  :I,   data  :I extends amap-js-api.AMap.MassMarks<infer D> ? D : amap-js-api.AMap.MassMarks.Data}> */
trait UIEvent[N /* <: String */, I] extends js.Object {
  var `type`: N
  var value: AnonData[I]
}

object UIEvent {
  @scala.inline
  def apply[N /* <: String */, I](`type`: N, value: AnonData[I]): UIEvent[N, I] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEvent[N, I]]
  }
}

