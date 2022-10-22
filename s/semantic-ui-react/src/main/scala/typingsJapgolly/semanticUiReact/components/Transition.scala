package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Transition.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_TransitionGroupProps1414684637[typingsJapgolly.semanticUiReact.mod.Transition.Group] = new SharedBuilder_TransitionGroupProps1414684637[typingsJapgolly.semanticUiReact.mod.Transition.Group](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionGroupProps): SharedBuilder_TransitionGroupProps1414684637[typingsJapgolly.semanticUiReact.mod.Transition.Group] = new SharedBuilder_TransitionGroupProps1414684637[typingsJapgolly.semanticUiReact.mod.Transition.Group](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Transition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Transition] {
    
    inline def animation(value: SemanticTRANSITIONS | String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def directional(value: Boolean): this.type = set("directional", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double | String | TransitionPropDuration): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def mountOnShow(value: Boolean): this.type = set("mountOnShow", value.asInstanceOf[js.Any])
    
    inline def onComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Callback): this.type = set("onComplete", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData) => (value(t0, t1)).runNow()))
    
    inline def onHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Callback): this.type = set("onHide", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData) => (value(t0, t1)).runNow()))
    
    inline def onShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Callback): this.type = set("onShow", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData) => (value(t0, t1)).runNow()))
    
    inline def onStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Callback): this.type = set("onStart", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData) => (value(t0, t1)).runNow()))
    
    inline def reactKey(value: String): this.type = set("reactKey", value.asInstanceOf[js.Any])
    
    inline def transitionOnMount(value: Boolean): this.type = set("transitionOnMount", value.asInstanceOf[js.Any])
    
    inline def unmountOnHide(value: Boolean): this.type = set("unmountOnHide", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Transition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
