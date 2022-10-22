package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.messagePassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePassThroughLayout
  extends StObject
     with Layout {
  
  var `type`: messagePassThrough
}
object MessagePassThroughLayout {
  
  inline def apply(): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("messagePassThrough")
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
  
  extension [Self <: MessagePassThroughLayout](x: Self) {
    
    inline def setType(value: messagePassThrough): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
