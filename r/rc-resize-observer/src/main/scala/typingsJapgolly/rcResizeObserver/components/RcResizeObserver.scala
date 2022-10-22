package typingsJapgolly.rcResizeObserver.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcResizeObserver.esCollectionMod.CollectionProps
import typingsJapgolly.rcResizeObserver.mod.ResizeObserverProps
import typingsJapgolly.rcResizeObserver.mod.SizeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcResizeObserver {
  
  object Collection {
    
    @JSImport("rc-resize-observer", "default.Collection")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Collection.type): SharedBuilder_CollectionProps103484790 = new SharedBuilder_CollectionProps103484790(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollectionProps): SharedBuilder_CollectionProps103484790 = new SharedBuilder_CollectionProps103484790(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-resize-observer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Node | (js.Function1[/* ref */ RefHandle[Any], Element])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* ref */ RefHandle[Any] => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onResize(value: (/* size */ SizeInfo, /* element */ HTMLElement) => Callback): this.type = set("onResize", js.Any.fromFunction2((t0: /* size */ SizeInfo, t1: /* element */ HTMLElement) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: RcResizeObserver.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResizeObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
