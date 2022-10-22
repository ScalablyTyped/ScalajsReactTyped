package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.backdrop
import typingsJapgolly.baseui.baseuiStrings.closeButton
import typingsJapgolly.baseui.baseuiStrings.escape_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backdrop extends StObject {
  
  val backdrop: typingsJapgolly.baseui.baseuiStrings.backdrop
  
  val closeButton: typingsJapgolly.baseui.baseuiStrings.closeButton
  
  val escape: escape_
}
object Backdrop {
  
  inline def apply(): Backdrop = {
    val __obj = js.Dynamic.literal(backdrop = "backdrop", closeButton = "closeButton", escape = "escape")
    __obj.asInstanceOf[Backdrop]
  }
  
  extension [Self <: Backdrop](x: Self) {
    
    inline def setBackdrop(value: backdrop): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setCloseButton(value: closeButton): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: escape_): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
