package typingsJapgolly.inkTextAnimation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.glitch
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.neon
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.pulse
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.radar
import typingsJapgolly.inkTextAnimation.inkTextAnimationStrings.rainbow
import typingsJapgolly.inkTextAnimation.mod.InkTextAnimationProps
import typingsJapgolly.inkTextAnimation.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkTextAnimation {
  
  @JSImport("ink-text-animation", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def name(value: rainbow | pulse | glitch | radar | neon): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InkTextAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InkTextAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
