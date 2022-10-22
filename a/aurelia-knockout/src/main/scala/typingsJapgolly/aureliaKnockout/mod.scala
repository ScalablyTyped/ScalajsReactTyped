package typingsJapgolly.aureliaKnockout

import org.scalajs.dom.Element
import typingsJapgolly.aureliaBinding.mod.ObserverLocator
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import typingsJapgolly.aureliaLoader.mod.Loader
import typingsJapgolly.aureliaTemplating.mod.CompositionEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-knockout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-knockout", "KnockoutBindable")
  @js.native
  open class KnockoutBindable protected ()
    extends typingsJapgolly.aureliaKnockout.distCommonjsKnockoutBindableMod.KnockoutBindable {
    def this(observerLocator: ObserverLocator) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutComposition")
  @js.native
  open class KnockoutComposition protected ()
    extends typingsJapgolly.aureliaKnockout.distCommonjsKnockoutCompositionMod.KnockoutComposition {
    def this(compositionEngine: CompositionEngine, container: Container, loader: Loader) = this()
  }
  
  @JSImport("aurelia-knockout", "KnockoutCustomAttribute")
  @js.native
  open class KnockoutCustomAttribute protected ()
    extends typingsJapgolly.aureliaKnockout.distCommonjsKnockoutCustomAttributeMod.KnockoutCustomAttribute {
    def this(element: Element) = this()
  }
  /* static members */
  object KnockoutCustomAttribute {
    
    @JSImport("aurelia-knockout", "KnockoutCustomAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  }
  
  @JSImport("aurelia-knockout", "RequirePolyfill")
  @js.native
  open class RequirePolyfill protected ()
    extends typingsJapgolly.aureliaKnockout.distCommonjsRequirePolyfillMod.RequirePolyfill {
    def this(loader: Loader) = this()
  }
  
  inline def configure(frameworkConfig: typingsJapgolly.aureliaKnockout.anon.Container): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(frameworkConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
