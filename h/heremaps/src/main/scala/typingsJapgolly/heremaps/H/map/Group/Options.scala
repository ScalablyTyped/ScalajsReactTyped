package typingsJapgolly.heremaps.H.map.Group

import typingsJapgolly.heremaps.H.map.Object
import typingsJapgolly.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a group
  * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
  * @property visibility {boolean=} - Indicates whether the map object is visible, default is true
  * @property zIndex {number=} - The z-index value of the map object, default is 0
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
  * an object.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
  * @property objects {Array<H.map.Object>=} - A list of map objects to add initially to this group.
  */
trait Options extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var objects: js.UndefOr[js.Array[Object]] = js.undefined
  var provider: js.UndefOr[Provider] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    objects: js.Array[Object] = null,
    provider: Provider = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

