package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.TransitionPropstimeoutnum
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.EnterAnimation
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.ExitAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toggle {
  
  inline def apply(timeout: Double): Builder = {
    val __props = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransitionPropstimeoutnum]))
  }
  
  @JSImport("wix-style-react/dist/types/Transition/Toggle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animateOnLoad(value: Boolean): this.type = set("animateOnLoad", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def enterAnimation(value: EnterAnimation): this.type = set("enterAnimation", value.asInstanceOf[js.Any])
    
    inline def exitAnimation(value: ExitAnimation): this.type = set("exitAnimation", value.asInstanceOf[js.Any])
    
    inline def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def onStart(value: Callback): this.type = set("onStart", value.toJsFn)
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransitionPropstimeoutnum): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
