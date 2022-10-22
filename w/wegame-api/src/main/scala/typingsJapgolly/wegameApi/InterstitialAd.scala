package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.anon.IsEnded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 插屏广告组件。插屏广告组件是一个原生组件，层级比普通组件高。插屏广告组件每次创建都会返回一个全新的实例（小程序端的插屏广告实例不允许跨页面使用），默认是隐藏的，需要调用 InterstitialAd.show() 将其显示。
  */
trait InterstitialAd
  extends StObject
     with AdObject {
  
  /**
    * 加载广告
    */
  def load(): js.Promise[Unit]
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
  
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ IsEnded, Unit]): Unit
}
object InterstitialAd {
  
  inline def apply(
    adUnitId: String,
    destroy: Callback,
    load: CallbackTo[js.Promise[Unit]],
    offClose: js.Function1[/* res */ IsEnded, Unit] => Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    onClose: js.Function1[/* res */ IsEnded, Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]]
  ): InterstitialAd = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, load = load.toJsFn, offClose = js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => offClose(t0).runNow()), offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), onClose = js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => onClose(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[InterstitialAd]
  }
  
  extension [Self <: InterstitialAd](x: Self) {
    
    inline def setLoad(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def setOffClose(value: js.Function1[/* res */ IsEnded, Unit] => Callback): Self = StObject.set(x, "offClose", js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => value(t0).runNow()))
    
    inline def setOnClose(value: js.Function1[/* res */ IsEnded, Unit] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: js.Function1[/* res */ IsEnded, Unit]) => value(t0).runNow()))
  }
}
