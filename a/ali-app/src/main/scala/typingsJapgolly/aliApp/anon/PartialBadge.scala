package typingsJapgolly.aliApp.anon

import typingsJapgolly.aliApp.aliAppStrings.more
import typingsJapgolly.aliApp.aliAppStrings.none
import typingsJapgolly.aliApp.aliAppStrings.num
import typingsJapgolly.aliApp.aliAppStrings.point
import typingsJapgolly.aliApp.aliAppStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.Badge> */
trait PartialBadge extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[none | point | num | text | more | String] = js.undefined
}
object PartialBadge {
  
  inline def apply(): PartialBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBadge]
  }
  
  extension [Self <: PartialBadge](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: none | point | num | text | more | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
