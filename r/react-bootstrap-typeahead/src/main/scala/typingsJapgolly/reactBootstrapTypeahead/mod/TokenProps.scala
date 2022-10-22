package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProps
  extends StObject
     with HTMLProps[HTMLDivElement] {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var option: Option
}
object TokenProps {
  
  inline def apply(option: Option): TokenProps = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProps]
  }
  
  extension [Self <: TokenProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
