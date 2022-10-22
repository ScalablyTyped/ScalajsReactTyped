package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.LocalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetLocalImgData
  extends StObject
     with BaseParams {
  
  var localId: String
  
  // 图片的localID
  // localData是图片的base64数据，可以用img标签显示
  @JSName("success")
  def success_MIgetLocalImgData(res: LocalData): Unit
}
object IgetLocalImgData {
  
  inline def apply(localId: String, success: LocalData => Callback): IgetLocalImgData = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: LocalData) => success(t0).runNow()))
    __obj.asInstanceOf[IgetLocalImgData]
  }
  
  extension [Self <: IgetLocalImgData](x: Self) {
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: LocalData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: LocalData) => value(t0).runNow()))
  }
}
