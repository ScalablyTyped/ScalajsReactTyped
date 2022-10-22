package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typingsJapgolly.semanticUiReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typingsJapgolly.semanticUiReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionablePortal {
  
  @JSImport("semantic-ui-react", "TransitionablePortal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.TransitionablePortal] {
    
    inline def onClose(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps & TransitionablePortalState) => (value(t0, t1)).runNow()))
    
    inline def onHide(
      value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Callback
    ): this.type = set("onHide", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData & TransitionablePortalState) => (value(t0, t1)).runNow()))
    
    inline def onOpen(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps & TransitionablePortalState) => (value(t0, t1)).runNow()))
    
    inline def onStart(
      value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Callback
    ): this.type = set("onStart", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ TransitionEventData & TransitionablePortalState) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def transition(value: TransitionProps): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TransitionablePortal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransitionablePortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
