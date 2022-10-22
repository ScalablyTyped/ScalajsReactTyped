package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPopoverOpen extends StObject {
  
  var isPopoverOpen: Boolean
  
  var moveBy: YNumber
  
  def onClose(): Unit
  
  def onOpen(): Unit
  
  var popoverContentRef: MutableRefObject[Null]
}
object IsPopoverOpen {
  
  inline def apply(
    isPopoverOpen: Boolean,
    moveBy: YNumber,
    onClose: Callback,
    onOpen: Callback,
    popoverContentRef: MutableRefObject[Null]
  ): IsPopoverOpen = {
    val __obj = js.Dynamic.literal(isPopoverOpen = isPopoverOpen.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], onClose = onClose.toJsFn, onOpen = onOpen.toJsFn, popoverContentRef = popoverContentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPopoverOpen]
  }
  
  extension [Self <: IsPopoverOpen](x: Self) {
    
    inline def setIsPopoverOpen(value: Boolean): Self = StObject.set(x, "isPopoverOpen", value.asInstanceOf[js.Any])
    
    inline def setMoveBy(value: YNumber): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
    
    inline def setPopoverContentRef(value: MutableRefObject[Null]): Self = StObject.set(x, "popoverContentRef", value.asInstanceOf[js.Any])
  }
}
