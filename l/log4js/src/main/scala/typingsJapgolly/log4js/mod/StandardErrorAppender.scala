package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.stderr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardErrorAppender extends StObject {
  
  // (defaults to ColoredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  var `type`: stderr
}
object StandardErrorAppender {
  
  inline def apply(): StandardErrorAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stderr")
    __obj.asInstanceOf[StandardErrorAppender]
  }
  
  extension [Self <: StandardErrorAppender](x: Self) {
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: stderr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
