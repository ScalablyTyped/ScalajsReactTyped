package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBounceAnimationMod.BounceAnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BounceAnimation {
  
  @JSImport("wix-style-react", "BounceAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.BounceAnimation] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def delay(value: String | Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): this.type = set("onEnd", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onStart(value: /* event */ ReactAnimationEventFrom[HTMLDivElement] => Callback): this.type = set("onStart", js.Any.fromFunction1((t0: /* event */ ReactAnimationEventFrom[HTMLDivElement]) => value(t0).runNow()))
  }
  
  implicit def make(companion: BounceAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BounceAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
