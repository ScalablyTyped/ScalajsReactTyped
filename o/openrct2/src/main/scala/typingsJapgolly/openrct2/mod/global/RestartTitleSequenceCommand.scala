package typingsJapgolly.openrct2.mod.global

import typingsJapgolly.openrct2.openrct2Strings.restart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var `type`: restart
}
object RestartTitleSequenceCommand {
  
  inline def apply(): RestartTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("restart")
    __obj.asInstanceOf[RestartTitleSequenceCommand]
  }
  
  extension [Self <: RestartTitleSequenceCommand](x: Self) {
    
    inline def setType(value: restart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
