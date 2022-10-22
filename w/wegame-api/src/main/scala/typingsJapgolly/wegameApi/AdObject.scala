package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdObject extends StObject {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String
  
  /**
    * 销毁广告
    */
  def destroy(): Unit
  
  /**
    * 取消监听广告错误事件
    */
  def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 取消监听广告加载事件
    */
  def offLoad(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听广告错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 监听广告加载事件
    */
  def onLoad(callback: js.Function0[Unit]): Unit
  
  /**
    * 显示广告。
    */
  def show(): js.Promise[Unit]
}
object AdObject {
  
  inline def apply(
    adUnitId: String,
    destroy: Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]]
  ): AdObject = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[AdObject]
  }
  
  extension [Self <: AdObject](x: Self) {
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOffError(value: js.Function1[/* res */ ErrMsg, Unit] => Callback): Self = StObject.set(x, "offError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => value(t0).runNow()))
    
    inline def setOffLoad(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offLoad", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => value(t0).runNow()))
    
    inline def setOnLoad(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setShow(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "show", value.toJsFn)
  }
}
