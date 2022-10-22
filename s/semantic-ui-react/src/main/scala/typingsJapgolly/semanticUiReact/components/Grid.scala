package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridColumnMod.GridColumnProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridMod.GridProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridMod.GridReversedProp
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsGridGridRowMod.GridRowProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.equal
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.horizontally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.internally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertically
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  object Column {
    
    @JSImport("semantic-ui-react", "Grid.Column")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Column.type): SharedBuilder_GridColumnProps_1699554840 = new SharedBuilder_GridColumnProps_1699554840(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GridColumnProps): SharedBuilder_GridColumnProps_1699554840 = new SharedBuilder_GridColumnProps_1699554840(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Row {
    
    @JSImport("semantic-ui-react", "Grid.Row")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Row.type): SharedBuilder_GridRowProps1010730367 = new SharedBuilder_GridRowProps1010730367(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GridRowProps): SharedBuilder_GridRowProps1010730367 = new SharedBuilder_GridRowProps1010730367(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def celled(value: Boolean | internally): this.type = set("celled", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columns(value: SemanticWIDTHS | equal): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def container(value: Boolean): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def divided(value: Boolean | vertically): this.type = set("divided", value.asInstanceOf[js.Any])
    
    inline def doubling(value: Boolean): this.type = set("doubling", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def padded(value: Boolean | horizontally | vertically): this.type = set("padded", value.asInstanceOf[js.Any])
    
    inline def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
    
    inline def reversed(value: GridReversedProp): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    inline def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
    
    inline def stretched(value: Boolean): this.type = set("stretched", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
