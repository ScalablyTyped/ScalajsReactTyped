package typingsJapgolly.openrct2.mod.global

import typingsJapgolly.openrct2.openrct2Strings.groupbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupBoxWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var `type`: groupbox
}
object GroupBoxWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): GroupBoxWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("groupbox")
    __obj.asInstanceOf[GroupBoxWidget]
  }
  
  extension [Self <: GroupBoxWidget](x: Self) {
    
    inline def setType(value: groupbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
