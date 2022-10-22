package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreOptionsMod.PerActionDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/core/types.HasGetRect & {  options :@interactjs/types.@interactjs/core/options.PerActionDefaults} */
trait HasGetRectoptionsPerActio extends StObject {
  
  def getRect(element: typingsJapgolly.interactjsTypes.coreTypesMod.Element): typingsJapgolly.interactjsTypes.coreTypesMod.Rect
  
  var options: PerActionDefaults
}
object HasGetRectoptionsPerActio {
  
  inline def apply(
    getRect: typingsJapgolly.interactjsTypes.coreTypesMod.Element => typingsJapgolly.interactjsTypes.coreTypesMod.Rect,
    options: PerActionDefaults
  ): HasGetRectoptionsPerActio = {
    val __obj = js.Dynamic.literal(getRect = js.Any.fromFunction1(getRect), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasGetRectoptionsPerActio]
  }
  
  extension [Self <: HasGetRectoptionsPerActio](x: Self) {
    
    inline def setGetRect(
      value: typingsJapgolly.interactjsTypes.coreTypesMod.Element => typingsJapgolly.interactjsTypes.coreTypesMod.Rect
    ): Self = StObject.set(x, "getRect", js.Any.fromFunction1(value))
    
    inline def setOptions(value: PerActionDefaults): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
