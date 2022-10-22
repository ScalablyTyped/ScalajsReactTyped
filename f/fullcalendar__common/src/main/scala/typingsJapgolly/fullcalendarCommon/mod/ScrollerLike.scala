package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerLike extends StObject {
  
  def needsXScrolling(): Boolean
  
  def needsYScrolling(): Boolean
}
object ScrollerLike {
  
  inline def apply(needsXScrolling: CallbackTo[Boolean], needsYScrolling: CallbackTo[Boolean]): ScrollerLike = {
    val __obj = js.Dynamic.literal(needsXScrolling = needsXScrolling.toJsFn, needsYScrolling = needsYScrolling.toJsFn)
    __obj.asInstanceOf[ScrollerLike]
  }
  
  extension [Self <: ScrollerLike](x: Self) {
    
    inline def setNeedsXScrolling(value: CallbackTo[Boolean]): Self = StObject.set(x, "needsXScrolling", value.toJsFn)
    
    inline def setNeedsYScrolling(value: CallbackTo[Boolean]): Self = StObject.set(x, "needsYScrolling", value.toJsFn)
  }
}
