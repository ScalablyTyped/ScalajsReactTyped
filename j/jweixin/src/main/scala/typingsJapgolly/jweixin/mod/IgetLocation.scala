package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.Accuracy
import typingsJapgolly.jweixin.jweixinStrings.gcj02
import typingsJapgolly.jweixin.jweixinStrings.wgs84
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetLocation
  extends StObject
     with BaseParams {
  
  // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
  @JSName("success")
  def success_MIgetLocation(res: Accuracy): Unit
  
  var `type`: wgs84 | gcj02
}
object IgetLocation {
  
  inline def apply(success: Accuracy => Callback, `type`: wgs84 | gcj02): IgetLocation = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Accuracy) => success(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgetLocation]
  }
  
  extension [Self <: IgetLocation](x: Self) {
    
    inline def setSuccess(value: Accuracy => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Accuracy) => value(t0).runNow()))
    
    inline def setType(value: wgs84 | gcj02): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
