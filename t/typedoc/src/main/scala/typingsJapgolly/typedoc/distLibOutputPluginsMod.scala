package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibOutputRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputPluginsMod {
  
  @JSImport("typedoc/dist/lib/output/plugins", "AssetsPlugin")
  @js.native
  open class AssetsPlugin protected ()
    extends typingsJapgolly.typedoc.distLibOutputPluginsAssetsPluginMod.AssetsPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "JavascriptIndexPlugin")
  @js.native
  open class JavascriptIndexPlugin protected ()
    extends typingsJapgolly.typedoc.distLibOutputPluginsJavascriptIndexPluginMod.JavascriptIndexPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output/plugins", "MarkedPlugin")
  @js.native
  open class MarkedPlugin protected ()
    extends typingsJapgolly.typedoc.distLibOutputThemesMarkedPluginMod.MarkedPlugin {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
  }
}
