package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.wixStyleReact.distTypesPulseAnimationMod.PulseAnimationProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.B10
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.G10
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.P10
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.R10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PulseAnimation {
  
  inline def apply(color: B10 | R10 | P10 | G10): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PulseAnimationProps]))
  }
  
  @JSImport("wix-style-react", "PulseAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.PulseAnimation] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: BorderRadius[String | Double]): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def delay(value: String | Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): this.type = set("onEnd", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onStart(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): this.type = set("onStart", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
  }
  
  def withProps(p: PulseAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
