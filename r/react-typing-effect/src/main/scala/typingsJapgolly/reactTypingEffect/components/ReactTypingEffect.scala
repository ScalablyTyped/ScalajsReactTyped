package typingsJapgolly.reactTypingEffect.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactTypingEffect.mod.ReactTypingEffectProps
import typingsJapgolly.reactTypingEffect.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypingEffect {
  
  inline def apply(text: String | js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTypingEffectProps]))
  }
  
  @JSImport("react-typing-effect", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursor(value: String): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def cursorClassName(value: String): this.type = set("cursorClassName", value.asInstanceOf[js.Any])
    
    inline def displayTextRenderer(value: (/* text */ String, /* i */ Double) => Element): this.type = set("displayTextRenderer", js.Any.fromFunction2(value))
    
    inline def eraseDelay(value: Double): this.type = set("eraseDelay", value.asInstanceOf[js.Any])
    
    inline def eraseSpeed(value: Double): this.type = set("eraseSpeed", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def staticText(value: String): this.type = set("staticText", value.asInstanceOf[js.Any])
    
    inline def typingDelay(value: Double): this.type = set("typingDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactTypingEffectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
