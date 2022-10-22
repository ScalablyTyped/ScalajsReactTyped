package typingsJapgolly.weixinApp.anon

import typingsJapgolly.weixinApp.weixinAppInts.`-90`
import typingsJapgolly.weixinApp.weixinAppInts.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: typingsJapgolly.weixinApp.weixinAppInts.`0` | `90` | `-90`
}
object Direction {
  
  inline def apply(direction: typingsJapgolly.weixinApp.weixinAppInts.`0` | `90` | `-90`): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: typingsJapgolly.weixinApp.weixinAppInts.`0` | `90` | `-90`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
