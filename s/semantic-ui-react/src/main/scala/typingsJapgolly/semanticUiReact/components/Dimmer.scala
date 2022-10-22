package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerInnerMod.DimmerInnerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDimmerDimmerMod.DimmerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dimmer {
  
  object Dimmable {
    
    @JSImport("semantic-ui-react", "Dimmer.Dimmable")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Dimmable.type): SharedBuilder_DimmerDimmableProps947604590[typingsJapgolly.semanticUiReact.mod.Dimmer.Dimmable] = new SharedBuilder_DimmerDimmableProps947604590[typingsJapgolly.semanticUiReact.mod.Dimmer.Dimmable](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DimmerDimmableProps): SharedBuilder_DimmerDimmableProps947604590[typingsJapgolly.semanticUiReact.mod.Dimmer.Dimmable] = new SharedBuilder_DimmerDimmableProps947604590[typingsJapgolly.semanticUiReact.mod.Dimmer.Dimmable](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Inner {
    
    @JSImport("semantic-ui-react", "Dimmer.Inner")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Inner.type): SharedBuilder_DimmerInnerProps_513963287[typingsJapgolly.semanticUiReact.mod.Dimmer.Inner] = new SharedBuilder_DimmerInnerProps_513963287[typingsJapgolly.semanticUiReact.mod.Dimmer.Inner](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DimmerInnerProps): SharedBuilder_DimmerInnerProps_513963287[typingsJapgolly.semanticUiReact.mod.Dimmer.Inner] = new SharedBuilder_DimmerInnerProps_513963287[typingsJapgolly.semanticUiReact.mod.Dimmer.Inner](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Dimmer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Dimmer] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def page(value: Boolean): this.type = set("page", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dimmer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DimmerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
