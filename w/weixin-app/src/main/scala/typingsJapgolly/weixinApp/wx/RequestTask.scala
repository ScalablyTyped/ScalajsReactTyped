package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 返回一个 requestTask 对象，通过 requestTask，可中断请求任务。
  */
trait RequestTask extends StObject {
  
  def abort(): Unit
}
object RequestTask {
  
  inline def apply(abort: Callback): RequestTask = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[RequestTask]
  }
  
  extension [Self <: RequestTask](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
  }
}
