package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateErrorNotice extends StObject {
  
  def createErrorNotice(message: String): Unit
  
  def createNotice(notice: PartialNoticePickNoticeco): Unit
  
  def removeAllNotices(): Unit
  
  def removeNotice(noticeId: String): Unit
}
object CreateErrorNotice {
  
  inline def apply(
    createErrorNotice: String => Callback,
    createNotice: PartialNoticePickNoticeco => Callback,
    removeAllNotices: Callback,
    removeNotice: String => Callback
  ): CreateErrorNotice = {
    val __obj = js.Dynamic.literal(createErrorNotice = js.Any.fromFunction1((t0: String) => createErrorNotice(t0).runNow()), createNotice = js.Any.fromFunction1((t0: PartialNoticePickNoticeco) => createNotice(t0).runNow()), removeAllNotices = removeAllNotices.toJsFn, removeNotice = js.Any.fromFunction1((t0: String) => removeNotice(t0).runNow()))
    __obj.asInstanceOf[CreateErrorNotice]
  }
  
  extension [Self <: CreateErrorNotice](x: Self) {
    
    inline def setCreateErrorNotice(value: String => Callback): Self = StObject.set(x, "createErrorNotice", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateNotice(value: PartialNoticePickNoticeco => Callback): Self = StObject.set(x, "createNotice", js.Any.fromFunction1((t0: PartialNoticePickNoticeco) => value(t0).runNow()))
    
    inline def setRemoveAllNotices(value: Callback): Self = StObject.set(x, "removeAllNotices", value.toJsFn)
    
    inline def setRemoveNotice(value: String => Callback): Self = StObject.set(x, "removeNotice", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
