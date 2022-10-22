package typingsJapgolly.forgeDi

import typingsJapgolly.forgeDi.distFrameworkArgumentsMod.Arguments
import typingsJapgolly.forgeDi.distLifecyclesLifecycleMod.Lifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLifecyclesTransientLifecycleMod {
  
  @JSImport("forge-di/dist/lifecycles/TransientLifecycle", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TransientLifecycle {
    
    /* CompleteClass */
    override def resolve(
      resolver: typingsJapgolly.forgeDi.distResolversResolverMod.default,
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      args: Arguments
    ): Any = js.native
  }
  
  trait TransientLifecycle
    extends StObject
       with Lifecycle
  object TransientLifecycle {
    
    inline def apply(
      resolve: (typingsJapgolly.forgeDi.distResolversResolverMod.default, typingsJapgolly.forgeDi.distFrameworkContextMod.default, Arguments) => Any
    ): TransientLifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[TransientLifecycle]
    }
  }
}
