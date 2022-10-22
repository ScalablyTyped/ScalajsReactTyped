package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var option: typingsJapgolly.baseui.selectTypesMod.Option
  
  var optionState: IsHighlighted
}
object Option {
  
  inline def apply(option: typingsJapgolly.baseui.selectTypesMod.Option, optionState: IsHighlighted): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setOption(value: typingsJapgolly.baseui.selectTypesMod.Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionState(value: IsHighlighted): Self = StObject.set(x, "optionState", value.asInstanceOf[js.Any])
  }
}
