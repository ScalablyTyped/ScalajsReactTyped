package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutSubscription extends StObject {
  
  def dispose(): Unit
}
object KnockoutSubscription {
  
  inline def apply(dispose: Callback): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[KnockoutSubscription]
  }
  
  extension [Self <: KnockoutSubscription](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
