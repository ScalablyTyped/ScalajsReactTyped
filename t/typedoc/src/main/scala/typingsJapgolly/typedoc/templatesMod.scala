package typingsJapgolly.typedoc

import typingsJapgolly.handlebars.Handlebars.RuntimeOptions
import typingsJapgolly.handlebars.Handlebars.TemplateDelegate
import typingsJapgolly.typedoc.stackMod.Resource
import typingsJapgolly.typedoc.stackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  @js.native
  class PartialStack () extends TemplateStack {
    var registeredNames: js.Any = js.native
  }
  
  @js.native
  class Template[T] () extends Resource {
    var template: js.UndefOr[js.Any] = js.native
    def getTemplate(): TemplateDelegate[T] = js.native
    def render(context: js.Any): String = js.native
    def render(context: js.Any, options: RuntimeOptions): String = js.native
  }
  
  @js.native
  class TemplateStack ()
    extends ResourceStack[Template[js.Any]]
  
}

