package typingsJapgolly.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----设置导航条
trait SetNavigationBarTitleOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 页面标题 */
  var title: String
}
object SetNavigationBarTitleOptions {
  
  inline def apply(title: String): SetNavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarTitleOptions]
  }
  
  extension [Self <: SetNavigationBarTitleOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
