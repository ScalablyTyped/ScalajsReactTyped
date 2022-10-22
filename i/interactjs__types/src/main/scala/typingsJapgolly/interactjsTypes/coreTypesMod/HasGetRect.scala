package typingsJapgolly.interactjsTypes.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasGetRect extends StObject {
  
  def getRect(element: Element): Rect
}
object HasGetRect {
  
  inline def apply(getRect: Element => Rect): HasGetRect = {
    val __obj = js.Dynamic.literal(getRect = js.Any.fromFunction1(getRect))
    __obj.asInstanceOf[HasGetRect]
  }
  
  extension [Self <: HasGetRect](x: Self) {
    
    inline def setGetRect(value: Element => Rect): Self = StObject.set(x, "getRect", js.Any.fromFunction1(value))
  }
}
