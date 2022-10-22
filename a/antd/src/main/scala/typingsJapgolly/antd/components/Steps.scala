package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.finish
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.navigation
import typingsJapgolly.antd.antdStrings.process
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.antdStrings.wait
import typingsJapgolly.antd.libStepsMod.StepsProps
import typingsJapgolly.rcSteps.anon.Description
import typingsJapgolly.rcSteps.libStepsMod.ProgressDotRender
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @JSImport("antd", "Steps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    inline def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* current */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* current */ Double) => value(t0).runNow()))
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def progressDot(value: Boolean | ProgressDotRender): this.type = set("progressDot", value.asInstanceOf[js.Any])
    
    inline def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Description) => japgolly.scalajs.react.facade.React.Node): this.type = set("progressDot", js.Any.fromFunction2(value))
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: wait | process | finish | error): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: default | navigation): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
