package typingsJapgolly.wechatMiniprogram.anon

import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.IAnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var target: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
}
object Target {
  
  inline def apply(target: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setTarget(value: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
