package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleAppender extends StObject {
  
  // (defaults to ColoredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  var `type`: console
}
object ConsoleAppender {
  
  inline def apply(): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("console")
    __obj.asInstanceOf[ConsoleAppender]
  }
  
  extension [Self <: ConsoleAppender](x: Self) {
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: console): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
