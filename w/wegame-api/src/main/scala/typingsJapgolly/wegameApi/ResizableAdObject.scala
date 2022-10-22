package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableAdObject
  extends StObject
     with AdObject {
  
  /**
    * 隐藏广告
    */
  def hide(): Unit
  
  /**
    * 取消监听广告缩放事件
    */
  def offResize(callback: js.Function1[/* res */ Width, Unit]): Unit
  
  /**
    * 监听广告缩放
    */
  def onResize(callback: js.Function1[/* res */ Width, Unit]): Unit
}
object ResizableAdObject {
  
  inline def apply(
    adUnitId: String,
    destroy: Callback,
    hide: Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offLoad: js.Function0[Unit] => Callback,
    offResize: js.Function1[/* res */ Width, Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onLoad: js.Function0[Unit] => Callback,
    onResize: js.Function1[/* res */ Width, Unit] => Callback,
    show: CallbackTo[js.Promise[Unit]]
  ): ResizableAdObject = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], destroy = destroy.toJsFn, hide = hide.toJsFn, offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => offLoad(t0).runNow()), offResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => offResize(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onLoad = js.Any.fromFunction1((t0: js.Function0[Unit]) => onLoad(t0).runNow()), onResize = js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => onResize(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[ResizableAdObject]
  }
  
  extension [Self <: ResizableAdObject](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOffResize(value: js.Function1[/* res */ Width, Unit] => Callback): Self = StObject.set(x, "offResize", js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => value(t0).runNow()))
    
    inline def setOnResize(value: js.Function1[/* res */ Width, Unit] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: js.Function1[/* res */ Width, Unit]) => value(t0).runNow()))
  }
}
