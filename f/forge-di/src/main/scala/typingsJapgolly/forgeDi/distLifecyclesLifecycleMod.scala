package typingsJapgolly.forgeDi

import typingsJapgolly.forgeDi.distFrameworkArgumentsMod.Arguments
import typingsJapgolly.forgeDi.distResolversResolverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLifecyclesLifecycleMod {
  
  trait Lifecycle extends StObject {
    
    def resolve(
      resolver: default,
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      args: Arguments
    ): Any
  }
  object Lifecycle {
    
    inline def apply(resolve: (default, typingsJapgolly.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Lifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[Lifecycle]
    }
    
    extension [Self <: Lifecycle](x: Self) {
      
      inline def setResolve(value: (default, typingsJapgolly.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
    }
  }
}
