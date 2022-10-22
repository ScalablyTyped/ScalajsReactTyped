package typingsJapgolly.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTabBarOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[Boolean] = js.undefined
}
object ShowTabBarOptions {
  
  inline def apply(): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowTabBarOptions]
  }
  
  extension [Self <: ShowTabBarOptions](x: Self) {
    
    inline def setAniamtion(value: Boolean): Self = StObject.set(x, "aniamtion", value.asInstanceOf[js.Any])
    
    inline def setAniamtionUndefined: Self = StObject.set(x, "aniamtion", js.undefined)
  }
}
