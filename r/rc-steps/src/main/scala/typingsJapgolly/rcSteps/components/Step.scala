package typingsJapgolly.rcSteps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSteps.anon.Description
import typingsJapgolly.rcSteps.anon.Index
import typingsJapgolly.rcSteps.libInterfaceMod.Icons
import typingsJapgolly.rcSteps.libInterfaceMod.Status
import typingsJapgolly.rcSteps.libStepMod.StepProps
import typingsJapgolly.rcSteps.libStepsMod.ProgressDotRender
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("rc-steps", "Step")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.rcSteps.mod.Step] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStepClick(value: /* index */ Double => Callback): this.type = set("onStepClick", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
    
    inline def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Description) => Node): this.type = set("progressDot", js.Any.fromFunction2(value))
    
    inline def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def stepIcon(value: /* info */ Index => Node): this.type = set("stepIcon", js.Any.fromFunction1(value))
    
    inline def stepIndex(value: Double): this.type = set("stepIndex", value.asInstanceOf[js.Any])
    
    inline def stepNumber(value: Double): this.type = set("stepNumber", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subTitle(value: VdomNode): this.type = set("subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def tailContent(value: VdomNode): this.type = set("tailContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def tailContentNull: this.type = set("tailContent", null)
    
    inline def tailContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tailContent", js.Array(value*))
    
    inline def tailContentVdomElement(value: VdomElement): this.type = set("tailContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
