package typingsJapgolly.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 上传任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
trait PlusUploaderUploadEvent extends StObject {
  
  /**
    * 上传任务状态变化事件
    * 当上传任务状态发生变化时触发此事件，事件原型参考UploadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var statechanged: js.UndefOr[String] = js.undefined
}
object PlusUploaderUploadEvent {
  
  inline def apply(): PlusUploaderUploadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusUploaderUploadEvent]
  }
  
  extension [Self <: PlusUploaderUploadEvent](x: Self) {
    
    inline def setStatechanged(value: String): Self = StObject.set(x, "statechanged", value.asInstanceOf[js.Any])
    
    inline def setStatechangedUndefined: Self = StObject.set(x, "statechanged", js.undefined)
  }
}
