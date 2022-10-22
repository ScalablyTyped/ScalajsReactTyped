package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  val click: typingsJapgolly.baseui.baseuiStrings.click
  
  val hover: typingsJapgolly.baseui.baseuiStrings.hover
}
object Click {
  
  inline def apply(): Click = {
    val __obj = js.Dynamic.literal(click = "click", hover = "hover")
    __obj.asInstanceOf[Click]
  }
  
  extension [Self <: Click](x: Self) {
    
    inline def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setHover(value: hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
  }
}
