package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 动态消息的模板信息
  *
  * 最低基础库： `2.4.0` */
trait UpdatableMessageFrontEndTemplateInfo extends StObject {
  
  /** 参数列表 */
  var parameterList: UpdatableMessageFrontEndParameter
}
object UpdatableMessageFrontEndTemplateInfo {
  
  inline def apply(parameterList: UpdatableMessageFrontEndParameter): UpdatableMessageFrontEndTemplateInfo = {
    val __obj = js.Dynamic.literal(parameterList = parameterList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndTemplateInfo]
  }
  
  extension [Self <: UpdatableMessageFrontEndTemplateInfo](x: Self) {
    
    inline def setParameterList(value: UpdatableMessageFrontEndParameter): Self = StObject.set(x, "parameterList", value.asInstanceOf[js.Any])
  }
}
