package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  @JSName("$color")
  var $color: typingsJapgolly.baseui.badgeTypesMod.Color
  
  @JSName("$hidden")
  var $hidden: js.UndefOr[Boolean] = js.undefined
}
object Hidden {
  
  inline def apply($color: typingsJapgolly.baseui.badgeTypesMod.Color): Hidden = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def set$color(value: typingsJapgolly.baseui.badgeTypesMod.Color): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$hidden(value: Boolean): Self = StObject.set(x, "$hidden", value.asInstanceOf[js.Any])
    
    inline def set$hiddenUndefined: Self = StObject.set(x, "$hidden", js.undefined)
  }
}
