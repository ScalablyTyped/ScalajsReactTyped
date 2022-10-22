package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClipboardStatics extends StObject {
  
  def clear(): Unit
  
  def flush(): Unit
  
  def getContent(): DataPackageView
  
  var oncontentchanged: Any
  
  def setContent(content: DataPackage): Unit
}
object IClipboardStatics {
  
  inline def apply(
    clear: Callback,
    flush: Callback,
    getContent: CallbackTo[DataPackageView],
    oncontentchanged: Any,
    setContent: DataPackage => Callback
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, flush = flush.toJsFn, getContent = getContent.toJsFn, oncontentchanged = oncontentchanged.asInstanceOf[js.Any], setContent = js.Any.fromFunction1((t0: DataPackage) => setContent(t0).runNow()))
    __obj.asInstanceOf[IClipboardStatics]
  }
  
  extension [Self <: IClipboardStatics](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setGetContent(value: CallbackTo[DataPackageView]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setOncontentchanged(value: Any): Self = StObject.set(x, "oncontentchanged", value.asInstanceOf[js.Any])
    
    inline def setSetContent(value: DataPackage => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: DataPackage) => value(t0).runNow()))
  }
}
