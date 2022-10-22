package typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component

import japgolly.scalajs.react.Callback
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Page.IResizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageLifetimes extends StObject {
  
  /** 页面生命周期回调—监听页面隐藏
    *
    * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
    */
  def hide(): Unit
  
  /** 页面生命周期回调—监听页面尺寸变化
    *
    * 所在页面尺寸变化时执行
    */
  def resize(size: IResizeOption): Unit
  
  /** 页面生命周期回调—监听页面显示
    *
    * 页面显示/切入前台时触发。
    */
  def show(): Unit
}
object PageLifetimes {
  
  inline def apply(hide: Callback, resize: IResizeOption => Callback, show: Callback): PageLifetimes = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, resize = js.Any.fromFunction1((t0: IResizeOption) => resize(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[PageLifetimes]
  }
  
  extension [Self <: PageLifetimes](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setResize(value: IResizeOption => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: IResizeOption) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
