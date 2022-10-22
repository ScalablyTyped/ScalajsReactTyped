package typingsJapgolly.playable.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.playable.distSrcTestkitChomecastApiMockMod.CastContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstance extends StObject {
  
  def getInstance(): CastContext
}
object GetInstance {
  
  inline def apply(getInstance: CallbackTo[CastContext]): GetInstance = {
    val __obj = js.Dynamic.literal(getInstance = getInstance.toJsFn)
    __obj.asInstanceOf[GetInstance]
  }
  
  extension [Self <: GetInstance](x: Self) {
    
    inline def setGetInstance(value: CallbackTo[CastContext]): Self = StObject.set(x, "getInstance", value.toJsFn)
  }
}
