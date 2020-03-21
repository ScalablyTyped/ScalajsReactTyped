package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.eventsMod.PageEvent
import typingsJapgolly.typedoc.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/PrettyPrintPlugin", JSImport.Namespace)
@js.native
object prettyPrintPluginMod extends js.Object {
  @js.native
  class PrettyPrintPlugin () extends AbstractComponent[Renderer] {
    def onRendererEndPage(event: PageEvent): Unit = js.native
  }
  
  /* static members */
  @js.native
  object PrettyPrintPlugin extends js.Object {
    var IGNORED_TAGS: AnonArea = js.native
    var PRE_TAGS: AnonCode = js.native
  }
  
}

