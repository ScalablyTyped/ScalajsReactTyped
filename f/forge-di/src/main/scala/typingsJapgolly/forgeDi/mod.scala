package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.configMod.Config
import typingsJapgolly.forgeDi.constructorMod.Constructor
import typingsJapgolly.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Binding protected ()
    extends typingsJapgolly.forgeDi.bindingMod.default {
    def this(forge: typingsJapgolly.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @js.native
  class ConfigurationError protected ()
    extends typingsJapgolly.forgeDi.configurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class Context ()
    extends typingsJapgolly.forgeDi.contextMod.default
  
  @js.native
  class Forge ()
    extends typingsJapgolly.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @js.native
  class FunctionResolver protected ()
    extends typingsJapgolly.forgeDi.functionResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  class InstanceResolver protected ()
    extends typingsJapgolly.forgeDi.instanceResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  class RegexInspector ()
    extends typingsJapgolly.forgeDi.regexInspectorMod.RegexInspector {
    /* CompleteClass */
    override var getParameterNames: js.Any = js.native
    /* CompleteClass */
    override def findConstructor(func: Constructor): Constructor = js.native
    /* CompleteClass */
    override def getDependencies(func: js.Function): js.Array[Dependency] = js.native
  }
  
  @js.native
  class ResolutionError protected ()
    extends typingsJapgolly.forgeDi.resolutionErrorMod.default {
    def this(name: String, hint: js.Any, context: typingsJapgolly.forgeDi.contextMod.default, message: String) = this()
  }
  
  @js.native
  abstract class Resolver protected ()
    extends typingsJapgolly.forgeDi.resolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default
    ) = this()
  }
  
  @js.native
  class SingletonLifecycle ()
    extends typingsJapgolly.forgeDi.singletonLifecycleMod.default
  
  @js.native
  class TransientLifecycle ()
    extends typingsJapgolly.forgeDi.transientLifecycleMod.TransientLifecycle {
    /* CompleteClass */
    override def resolve(
      resolver: typingsJapgolly.forgeDi.resolverMod.default,
      context: typingsJapgolly.forgeDi.contextMod.default,
      args: Arguments
    ): js.Any = js.native
  }
  
  @js.native
  class TypeResolver protected ()
    extends typingsJapgolly.forgeDi.typeResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  class default ()
    extends typingsJapgolly.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
  @js.native
  object Mode extends js.Object {
    /* "All" */ val All: typingsJapgolly.forgeDi.modeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typingsJapgolly.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typingsJapgolly.forgeDi.modeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.forgeDi.modeMod.Mode with String] = js.native
  }
  
}

