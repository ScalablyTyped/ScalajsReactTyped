package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeDi.anon.Partialdefault
import typingsJapgolly.forgeDi.distFrameworkConfigMod.Config
import typingsJapgolly.forgeDi.distFrameworkConstructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forge-di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("forge-di", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.forgeDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "Binding")
  @js.native
  open class Binding protected ()
    extends typingsJapgolly.forgeDi.distFrameworkBindingMod.default {
    def this(forge: typingsJapgolly.forgeDi.distForgeMod.default, name: String) = this()
  }
  
  @JSImport("forge-di", "ConfigurationError")
  @js.native
  open class ConfigurationError protected ()
    extends typingsJapgolly.forgeDi.distErrorsConfigurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @JSImport("forge-di", "Context")
  @js.native
  open class Context ()
    extends typingsJapgolly.forgeDi.distFrameworkContextMod.default
  
  @JSImport("forge-di", "Forge")
  @js.native
  open class Forge ()
    extends typingsJapgolly.forgeDi.distForgeMod.default {
    def this(config: Config) = this()
  }
  
  @JSImport("forge-di", "FunctionResolver")
  @js.native
  open class FunctionResolver protected ()
    extends typingsJapgolly.forgeDi.distResolversFunctionResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @JSImport("forge-di", "InstanceResolver")
  @js.native
  open class InstanceResolver protected ()
    extends typingsJapgolly.forgeDi.distResolversInstanceResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      instance: Any
    ) = this()
  }
  
  @JSImport("forge-di", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.forgeDi.distFrameworkModeMod.Mode & String] = js.native
    
    /* "All" */ val All: typingsJapgolly.forgeDi.distFrameworkModeMod.Mode.All & String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typingsJapgolly.forgeDi.distFrameworkModeMod.Mode.AtLeastOne & String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typingsJapgolly.forgeDi.distFrameworkModeMod.Mode.AtMostOne & String = js.native
  }
  
  @JSImport("forge-di", "RegexInspector")
  @js.native
  open class RegexInspector ()
    extends typingsJapgolly.forgeDi.distInspectorsRegexInspectorMod.default
  
  @JSImport("forge-di", "ResolutionError")
  @js.native
  open class ResolutionError protected ()
    extends typingsJapgolly.forgeDi.distErrorsResolutionErrorMod.default {
    def this(
      name: String,
      hint: Any,
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      message: String
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("forge-di", "Resolver")
  @js.native
  open class Resolver protected ()
    extends typingsJapgolly.forgeDi.distResolversResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default
    ) = this()
  }
  
  @JSImport("forge-di", "SingletonLifecycle")
  @js.native
  open class SingletonLifecycle ()
    extends typingsJapgolly.forgeDi.distLifecyclesSingletonLifecycleMod.default
  
  @JSImport("forge-di", "TransientLifecycle")
  @js.native
  open class TransientLifecycle ()
    extends typingsJapgolly.forgeDi.distLifecyclesTransientLifecycleMod.default
  
  @JSImport("forge-di", "TypeResolver")
  @js.native
  open class TypeResolver protected ()
    extends typingsJapgolly.forgeDi.distResolversTypeResolverMod.default {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  inline def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(hints.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T]]
}
