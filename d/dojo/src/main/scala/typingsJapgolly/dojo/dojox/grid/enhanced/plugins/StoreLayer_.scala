package typingsJapgolly.dojo.dojox.grid.enhanced.plugins

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_StoreLayer.html
  *
  *
  */
trait StoreLayer_ extends js.Object {
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(
    store: js.Any,
    funcName: js.Any,
    layer: typingsJapgolly.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer,
    layerFuncName: js.Any
  ): js.Any
}

object StoreLayer_ {
  @scala.inline
  def apply(
    wrap: (js.Any, js.Any, typingsJapgolly.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, js.Any) => CallbackTo[js.Any]
  ): StoreLayer_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("wrap")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: typingsJapgolly.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, t3: js.Any) => wrap(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[StoreLayer_]
  }
}

