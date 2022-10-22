package typingsJapgolly.forgeDi

import typingsJapgolly.forgeDi.distFrameworkArgumentsMod.Arguments
import typingsJapgolly.forgeDi.distFrameworkDependencyMod.Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversResolverMod {
  
  /* note: abstract class */ @JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Resolver {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default
    ) = this()
    
    /* protected */ /* CompleteClass */
    var binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default = js.native
    
    /* CompleteClass */
    var dependencies: js.Array[Dependency] = js.native
    
    /* protected */ /* CompleteClass */
    var forge: typingsJapgolly.forgeDi.distForgeMod.default = js.native
    
    /* CompleteClass */
    override def resolve(context: typingsJapgolly.forgeDi.distFrameworkContextMod.default, args: Arguments): Any = js.native
    
    /* protected */ /* CompleteClass */
    override def resolveDependencies(
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      dependencies: js.Array[Dependency],
      args: Arguments
    ): Any = js.native
  }
  
  trait Resolver extends StObject {
    
    /* protected */ var binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default
    
    var dependencies: js.Array[Dependency]
    
    /* protected */ var forge: typingsJapgolly.forgeDi.distForgeMod.default
    
    def resolve(context: typingsJapgolly.forgeDi.distFrameworkContextMod.default, args: Arguments): Any
    
    /* protected */ def resolveDependencies(
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      dependencies: js.Array[Dependency],
      args: Arguments
    ): Any
  }
  object Resolver {
    
    inline def apply(
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      dependencies: js.Array[Dependency],
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      resolve: (typingsJapgolly.forgeDi.distFrameworkContextMod.default, Arguments) => Any,
      resolveDependencies: (typingsJapgolly.forgeDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => Any
    ): Resolver = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve), resolveDependencies = js.Any.fromFunction3(resolveDependencies))
      __obj.asInstanceOf[Resolver]
    }
    
    extension [Self <: Resolver](x: Self) {
      
      inline def setBinding(value: typingsJapgolly.forgeDi.distFrameworkBindingMod.default): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setForge(value: typingsJapgolly.forgeDi.distForgeMod.default): Self = StObject.set(x, "forge", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: (typingsJapgolly.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setResolveDependencies(
        value: (typingsJapgolly.forgeDi.distFrameworkContextMod.default, js.Array[Dependency], Arguments) => Any
      ): Self = StObject.set(x, "resolveDependencies", js.Any.fromFunction3(value))
    }
  }
}
