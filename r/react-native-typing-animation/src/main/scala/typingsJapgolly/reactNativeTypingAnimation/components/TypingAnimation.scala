package typingsJapgolly.reactNativeTypingAnimation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleSheetProperties
import typingsJapgolly.reactNativeTypingAnimation.mod.TypingAnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypingAnimation {
  
  @JSImport("react-native-typing-animation", "TypingAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dotAmplitude(value: Double): this.type = set("dotAmplitude", value.asInstanceOf[js.Any])
    
    inline def dotColor(value: String): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    inline def dotMargin(value: Double): this.type = set("dotMargin", value.asInstanceOf[js.Any])
    
    inline def dotRadius(value: Double): this.type = set("dotRadius", value.asInstanceOf[js.Any])
    
    inline def dotSpeed(value: Double): this.type = set("dotSpeed", value.asInstanceOf[js.Any])
    
    inline def dotStyles(value: StyleSheetProperties): this.type = set("dotStyles", value.asInstanceOf[js.Any])
    
    inline def dotX(value: Double): this.type = set("dotX", value.asInstanceOf[js.Any])
    
    inline def dotY(value: Double): this.type = set("dotY", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleSheetProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TypingAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TypingAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
