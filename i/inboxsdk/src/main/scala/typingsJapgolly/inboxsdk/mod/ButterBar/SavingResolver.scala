package typingsJapgolly.inboxsdk.mod.ButterBar

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingResolver extends StObject {
  
  def reject(): Unit
  
  def resolve(): Unit
}
object SavingResolver {
  
  inline def apply(reject: Callback, resolve: Callback): SavingResolver = {
    val __obj = js.Dynamic.literal(reject = reject.toJsFn, resolve = resolve.toJsFn)
    __obj.asInstanceOf[SavingResolver]
  }
  
  extension [Self <: SavingResolver](x: Self) {
    
    inline def setReject(value: Callback): Self = StObject.set(x, "reject", value.toJsFn)
    
    inline def setResolve(value: Callback): Self = StObject.set(x, "resolve", value.toJsFn)
  }
}
