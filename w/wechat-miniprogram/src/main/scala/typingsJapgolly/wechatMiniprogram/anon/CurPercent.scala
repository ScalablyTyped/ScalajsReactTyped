package typingsJapgolly.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurPercent extends StObject {
  
  var curPercent: Double
}
object CurPercent {
  
  inline def apply(curPercent: Double): CurPercent = {
    val __obj = js.Dynamic.literal(curPercent = curPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurPercent]
  }
  
  extension [Self <: CurPercent](x: Self) {
    
    inline def setCurPercent(value: Double): Self = StObject.set(x, "curPercent", value.asInstanceOf[js.Any])
  }
}
