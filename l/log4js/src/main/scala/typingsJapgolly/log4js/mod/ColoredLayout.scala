package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.colored
import typingsJapgolly.log4js.log4jsStrings.coloured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColoredLayout
  extends StObject
     with Layout {
  
  var `type`: colored | coloured
}
object ColoredLayout {
  
  inline def apply(`type`: colored | coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColoredLayout]
  }
  
  extension [Self <: ColoredLayout](x: Self) {
    
    inline def setType(value: colored | coloured): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
