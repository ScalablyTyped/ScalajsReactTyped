package typingsJapgolly.dojo.dojox.grid.enhanced.plugins.filter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/FilterLayer.html
  *
  *
  */
trait FilterLayer_ extends js.Object {
  /**
    *
    */
  def ClientSideFilterLayer(): Unit
  /**
    *
    */
  def ServerSideFilterLayer(): Unit
  /**
    * Wrap the store with the given layer.
    *
    * @param store The store to be wrapped.
    * @param funcName
    * @param layer The layer to be used
    * @param layerFuncName
    */
  def wrap(store: js.Any, funcName: js.Any, layer: StoreLayer, layerFuncName: js.Any): js.Any
}

object FilterLayer_ {
  @scala.inline
  def apply(
    ClientSideFilterLayer: Callback,
    ServerSideFilterLayer: Callback,
    wrap: (js.Any, js.Any, StoreLayer, js.Any) => CallbackTo[js.Any]
  ): FilterLayer_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClientSideFilterLayer")(ClientSideFilterLayer.toJsFn)
    __obj.updateDynamic("ServerSideFilterLayer")(ServerSideFilterLayer.toJsFn)
    __obj.updateDynamic("wrap")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: typingsJapgolly.dojo.dojox.grid.enhanced.plugins.StoreLayer.StoreLayer, t3: js.Any) => wrap(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[FilterLayer_]
  }
}

