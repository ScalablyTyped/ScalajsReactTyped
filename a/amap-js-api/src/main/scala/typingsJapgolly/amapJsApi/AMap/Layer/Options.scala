package typingsJapgolly.amapJsApi.AMap.Layer

import typingsJapgolly.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 所属的地图对象
    */
  var map: js.UndefOr[Map] = js.undefined
}

object Options {
  @scala.inline
  def apply(map: Map = null): Options = {
    val __obj = js.Dynamic.literal()
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

