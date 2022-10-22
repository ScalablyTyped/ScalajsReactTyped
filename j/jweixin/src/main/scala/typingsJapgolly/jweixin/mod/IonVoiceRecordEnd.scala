package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonVoiceRecordEnd
  extends StObject
     with BaseParams {
  
  // 录音时间超过一分钟没有停止的时候会执行 complete 回调
  @JSName("complete")
  def complete_MIonVoiceRecordEnd(res: Resouce): Unit
}
object IonVoiceRecordEnd {
  
  inline def apply(complete: Resouce => Callback): IonVoiceRecordEnd = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Resouce) => complete(t0).runNow()))
    __obj.asInstanceOf[IonVoiceRecordEnd]
  }
  
  extension [Self <: IonVoiceRecordEnd](x: Self) {
    
    inline def setComplete(value: Resouce => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Resouce) => value(t0).runNow()))
  }
}
