package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  /** 页面的初始数据 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 生命周期函数--监听页面隐藏 */
  var onHide: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面加载 */
  var onLoad: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.undefined
  /** 生命周期函数--监听页面渲染完成 */
  var onReady: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面显示 */
  var onShow: js.UndefOr[NoneParamCallback] = js.undefined
  /** 生命周期函数--监听页面卸载 */
  var onUnload: js.UndefOr[NoneParamCallback] = js.undefined
}

object PageOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    data: js.Any = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    onLoad: /* options */ js.Any => Callback = null,
    onReady: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    onUnload: js.UndefOr[Callback] = js.undefined
  ): PageOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* options */ js.Any) => onLoad(t0).runNow()))
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    onUnload.foreach(p => __obj.updateDynamic("onUnload")(p.toJsFn))
    __obj.asInstanceOf[PageOptions]
  }
}

