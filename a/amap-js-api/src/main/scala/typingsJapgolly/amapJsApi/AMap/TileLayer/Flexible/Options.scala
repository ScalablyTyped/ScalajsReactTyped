package typingsJapgolly.amapJsApi.AMap.TileLayer.Flexible

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typingsJapgolly.amapJsApi.AMap.TileLayer.Options {
  /**
    * 内存中缓存的切片的数量上限
    */
  var cacheSize: js.UndefOr[Double] = js.undefined
  /**
    * 创建切片回调
    * @param x 横坐标
    * @param y 纵坐标
    * @param z 层级
    * @param success 成功回调
    * @param fail 失败回调
    */
  var createTile: js.UndefOr[
    js.Function5[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], 
      /* fail */ js.Function0[Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * 是否显示
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheSize: Int | Double = null,
    createTile: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Callback = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]) = null,
    map: Map = null,
    opacity: Int | Double = null,
    tileSize: Int | Double = null,
    tileUrl: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (createTile != null) __obj.updateDynamic("createTile")(js.Any.fromFunction5((t0: /* x */ scala.Double, t1: /* y */ scala.Double, t2: /* z */ scala.Double, t3: /* success */ js.Function1[
  /* tile */ org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLCanvasElement, 
  scala.Unit], t4: /* fail */ js.Function0[scala.Unit]) => createTile(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

