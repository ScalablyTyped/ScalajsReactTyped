package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.anon.IsEnded
import typingsJapgolly.wegameApi.wx.types.CustomAdStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生模板广告组件。原生模板广告组件是一个原生组件，层级比普通组件高。原生模板广告组件默认是隐藏的，需要调用 CustomAd.show() 将其显示。如果宽度可配置，原生模板广告会根据开发者设置的宽度进行等比缩放。
  */
trait CustomAd
  extends StObject
     with AdObject {
  
  /**
    * 隐藏原生模板广告。（某些模板广告无法隐藏）
    */
  def hide(): Unit
  
  /**
    * 查询原生模板广告展示状态。
    */
  def isShow(): Boolean
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  
  /**
    * 取消监听原生模板广告隐藏事件
    */
  def offHide(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  
  /**
    * 监听原生模板广告隐藏事件, 某些模板如矩阵格子模板用户点击关闭时也会触发该事件。
    */
  def onHide(callback: js.Function0[Unit]): Unit
  
  /**
    * 原生模板广告组件的样式
    */
  var style: CustomAdStyle
}
object CustomAd {
  
  inline def apply(
    adUnitId: String,
    destroy: Callback,
    hide: Callback,
    isShow: CallbackTo[Boolean],
    offClose: js.Function1[/* res */ IsEnded, Unit] => Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offHide: js.Function0[Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    onClose: js.Function1[/* res */ IsEnded, Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onHide: js.Function0[Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]],
    style: CustomAdStyle
  ): CustomAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, isShow = isShow.toJsFn, offClose = js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => offClose(t0).runNow()), offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offHide = js.Any.fromFunction1((t0: js.Function0[Unit]) => offHide(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), onClose = js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => onClose(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onHide = js.Any.fromFunction1((t0: js.Function0[Unit]) => onHide(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAd]
  }
  
  extension [Self <: CustomAd](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIsShow(value: CallbackTo[Boolean]): Self = StObject.set(x, "isShow", value.toJsFn)
    
    inline def setOffClose(value: js.Function1[/* res */ IsEnded, Unit] => Callback): Self = StObject.set(x, "offClose", js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => value(t0).runNow()))
    
    inline def setOffHide(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offHide", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnClose(value: js.Function1[/* res */ IsEnded, Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => value(t0).runNow()))
    
    inline def setOnHide(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setStyle(value: CustomAdStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
