package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.navigationItemMod.NavigationItem
import typingsJapgolly.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins", JSImport.Namespace)
@js.native
object outputPluginsMod extends js.Object {
  @js.native
  class AssetsPlugin ()
    extends typingsJapgolly.typedoc.assetsPluginMod.AssetsPlugin
  
  @js.native
  class JavascriptIndexPlugin ()
    extends typingsJapgolly.typedoc.javascriptIndexPluginMod.JavascriptIndexPlugin
  
  @js.native
  class LayoutPlugin ()
    extends typingsJapgolly.typedoc.layoutPluginMod.LayoutPlugin
  
  @js.native
  class MarkedLinksPlugin ()
    extends typingsJapgolly.typedoc.markedLinksPluginMod.MarkedLinksPlugin
  
  @js.native
  class MarkedPlugin ()
    extends typingsJapgolly.typedoc.markedPluginMod.MarkedPlugin
  
  @js.native
  class NavigationPlugin ()
    extends typingsJapgolly.typedoc.navigationPluginMod.NavigationPlugin
  
  @js.native
  class PrettyPrintPlugin ()
    extends typingsJapgolly.typedoc.prettyPrintPluginMod.PrettyPrintPlugin
  
  @js.native
  class TocPlugin ()
    extends typingsJapgolly.typedoc.tocPluginMod.TocPlugin
  
  /* static members */
  @js.native
  object MarkedLinksPlugin extends js.Object {
    def splitLinkText(text: String): AnonCaption = js.native
  }
  
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    var IGNORED_TAGS: AnonArea = js.native
    var PRE_TAGS: AnonCode = js.native
  }
  
  /* static members */
  @js.native
  object TocPlugin extends js.Object {
    def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
    def buildToc(
      model: Reflection,
      trail: js.Array[Reflection],
      parent: NavigationItem,
      restriction: js.Array[String]
    ): Unit = js.native
  }
  
}

