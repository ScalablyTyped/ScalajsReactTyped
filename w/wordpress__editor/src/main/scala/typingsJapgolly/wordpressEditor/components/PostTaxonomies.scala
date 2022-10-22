package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.Taxonomy
import typingsJapgolly.wordpressEditor.componentsPostTaxonomiesMod.PostTaxonomies.Props
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostTaxonomies {
  
  @JSImport("@wordpress/editor", "PostTaxonomies")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def taxonomyWrapper(value: (/* content */ Node, /* taxonomy */ Taxonomy[edit]) => Element): this.type = set("taxonomyWrapper", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: PostTaxonomies.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
