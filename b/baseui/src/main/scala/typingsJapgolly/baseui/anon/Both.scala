package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.both
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Both extends StObject {
  
  val both: typingsJapgolly.baseui.baseuiStrings.both
  
  val left: typingsJapgolly.baseui.baseuiStrings.left
  
  val none: typingsJapgolly.baseui.baseuiStrings.none
  
  val right: typingsJapgolly.baseui.baseuiStrings.right
}
object Both {
  
  inline def apply(): Both = {
    val __obj = js.Dynamic.literal(both = "both", left = "left", none = "none", right = "right")
    __obj.asInstanceOf[Both]
  }
  
  extension [Self <: Both](x: Self) {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
