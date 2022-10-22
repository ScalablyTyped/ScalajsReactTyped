package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.FixedContent
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.mod.PullHookChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHook {
  
  @JSImport("react-onsenui", "PullHook")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.PullHook] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fixedContent(value: Boolean): this.type = set("fixedContent", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ PullHookChangeEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ PullHookChangeEvent) => value(t0).runNow()))
    
    inline def onLoad(value: /* done */ js.Function0[Unit] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* done */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def onPull(value: Callback): this.type = set("onPull", value.toJsFn)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def thresholdHeight(value: Double): this.type = set("thresholdHeight", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PullHook.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & FixedContent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
