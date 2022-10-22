package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolver extends StObject {
  
  def resolve(arg0: typingsJapgolly.parcelTypes.anon.Dependency): Async[js.UndefOr[ResolveResult | Null]]
}
object Resolver {
  
  inline def apply(resolve: typingsJapgolly.parcelTypes.anon.Dependency => Async[js.UndefOr[ResolveResult | Null]]): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Resolver]
  }
  
  extension [Self <: Resolver](x: Self) {
    
    inline def setResolve(value: typingsJapgolly.parcelTypes.anon.Dependency => Async[js.UndefOr[ResolveResult | Null]]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
