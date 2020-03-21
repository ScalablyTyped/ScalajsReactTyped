package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.optionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/component", JSImport.Namespace)
@js.native
object sourcesComponentMod extends js.Object {
  @js.native
  class ComponentSource () extends AbstractComponent[Options] {
    var addComponent: js.Any = js.native
    var knownComponents: js.Any = js.native
    var onComponentAdded: js.Any = js.native
    var onComponentRemoved: js.Any = js.native
    var removeComponent: js.Any = js.native
  }
  
}

