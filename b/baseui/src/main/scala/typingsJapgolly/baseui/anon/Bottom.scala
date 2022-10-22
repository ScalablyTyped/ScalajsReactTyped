package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  val bottom: typingsJapgolly.baseui.baseuiStrings.bottom
  
  val left: typingsJapgolly.baseui.baseuiStrings.left
  
  val right: typingsJapgolly.baseui.baseuiStrings.right
  
  val top: typingsJapgolly.baseui.baseuiStrings.top
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal(bottom = "bottom", left = "left", right = "right", top = "top")
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
