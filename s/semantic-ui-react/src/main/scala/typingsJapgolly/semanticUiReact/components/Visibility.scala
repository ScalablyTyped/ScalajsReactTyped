package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData
import typingsJapgolly.semanticUiReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityOnPassed
import typingsJapgolly.semanticUiReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.events
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.repaint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Visibility {
  
  @JSImport("semantic-ui-react", "Visibility")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Visibility] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def context(value: Document | Window | HTMLElement): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def continuous(value: Boolean): this.type = set("continuous", value.asInstanceOf[js.Any])
    
    inline def fireOnMount(value: Boolean): this.type = set("fireOnMount", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double | String | (js.Array[Double | String])): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetVarargs(value: (Double | String)*): this.type = set("offset", js.Array(value*))
    
    inline def onBottomPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onBottomPassed", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onBottomPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onBottomPassedReverse", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onBottomVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onBottomVisible", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onBottomVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onBottomVisibleReverse", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onOffScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onOffScreen", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onOnScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onOnScreen", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onPassed(value: VisibilityOnPassed): this.type = set("onPassed", value.asInstanceOf[js.Any])
    
    inline def onPassing(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onPassing", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onPassingReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onPassingReverse", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onTopPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onTopPassed", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onTopPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onTopPassedReverse", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onTopVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onTopVisible", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onTopVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onTopVisibleReverse", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def onUpdate(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback): this.type = set("onUpdate", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ VisibilityEventData) => (value(t0, t1)).runNow()))
    
    inline def once(value: Boolean): this.type = set("once", value.asInstanceOf[js.Any])
    
    inline def updateOn(value: events | repaint): this.type = set("updateOn", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Visibility.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VisibilityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
