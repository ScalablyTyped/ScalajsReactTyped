package typingsJapgolly.expoXcpretty.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject extends StObject {
  
  def reject(error: js.Error): Unit
  
  def resolve(buildOutput: String): Unit
  
  var xcodeProjectName: js.UndefOr[String] = js.undefined
}
object Reject {
  
  inline def apply(reject: js.Error => Callback, resolve: String => Callback): Reject = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1((t0: js.Error) => reject(t0).runNow()), resolve = js.Any.fromFunction1((t0: String) => resolve(t0).runNow()))
    __obj.asInstanceOf[Reject]
  }
  
  extension [Self <: Reject](x: Self) {
    
    inline def setReject(value: js.Error => Callback): Self = StObject.set(x, "reject", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setResolve(value: String => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setXcodeProjectName(value: String): Self = StObject.set(x, "xcodeProjectName", value.asInstanceOf[js.Any])
    
    inline def setXcodeProjectNameUndefined: Self = StObject.set(x, "xcodeProjectName", js.undefined)
  }
}
