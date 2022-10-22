package typingsJapgolly.hummerEnv

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocket extends StObject {
  
  /**
    * @summary 链接关闭时的回调
    * @param cb 回调函数, 回调参数 event: {code:错误码(number), reason: 错误原因(string)}
    */
  def onclose(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
      Unit
    ]
  ): Unit
  
  /**
    * @summary 链接出错时的回调
    * @param cb 回调函数
    */
  def onerror(cb: js.Function0[Unit]): Unit
  
  /**
    * @summary 接收消息的回调
    * @param cb 回调函数 , 回调参数 event : {data: 消息文本(string)}
    */
  def onmessage(
    cb: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
      Unit
    ]
  ): Unit
  
  /**
    * @summary 链接连上时的回调
    * @param cb 回调函数
    */
  def onopen(cb: js.Function0[Unit]): Unit
}
object WebSocket {
  
  inline def apply(
    onclose: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
      Unit
    ] => Callback,
    onerror: js.Function0[Unit] => Callback,
    onmessage: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
      Unit
    ] => Callback,
    onopen: js.Function0[Unit] => Callback
  ): WebSocket = {
    val __obj = js.Dynamic.literal(onclose = js.Any.fromFunction1((t0: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
      Unit
    ]) => onclose(t0).runNow()), onerror = js.Any.fromFunction1((t0: js.Function0[Unit]) => onerror(t0).runNow()), onmessage = js.Any.fromFunction1((t0: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
      Unit
    ]) => onmessage(t0).runNow()), onopen = js.Any.fromFunction1((t0: js.Function0[Unit]) => onopen(t0).runNow()))
    __obj.asInstanceOf[WebSocket]
  }
  
  extension [Self <: WebSocket](x: Self) {
    
    inline def setOnclose(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "onclose", js.Any.fromFunction1((t0: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketCloseEvent */ /* ev */ Any, 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setOnerror(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnmessage(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "onmessage", js.Any.fromFunction1((t0: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_info.WebSocketMessageEvent */ /* ev */ Any, 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setOnopen(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onopen", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
