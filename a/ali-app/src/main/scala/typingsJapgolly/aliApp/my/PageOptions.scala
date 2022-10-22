package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 下拉刷新 https://docs.alipay.com/mini/api/ui-pulldown
/**
  * Page 实现的接口对象
  */
trait PageOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var data: Any
  
  def onError(): Unit
  
  def onHide(): Unit
  
  def onLaunch(options: Options): Unit
  
  /**
    * 下拉刷新
    * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
    * 需要在页面对应的 .json 配置文件中配置 "pullRefresh": true 选项，才能开启下拉刷新事件。
    * 当处理完数据刷新后，调用 my.stopPullDownRefresh 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  
  def onShow(options: Options): Unit
}
object PageOptions {
  
  inline def apply(
    data: Any,
    onError: Callback,
    onHide: Callback,
    onLaunch: Options => Callback,
    onShow: Options => Callback
  ): PageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onError = onError.toJsFn, onHide = onHide.toJsFn, onLaunch = js.Any.fromFunction1((t0: Options) => onLaunch(t0).runNow()), onShow = js.Any.fromFunction1((t0: Options) => onShow(t0).runNow()))
    __obj.asInstanceOf[PageOptions]
  }
  
  extension [Self <: PageOptions](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
    
    inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnLaunch(value: Options => Callback): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
    
    inline def setOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    inline def setOnShow(value: Options => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
  }
}
