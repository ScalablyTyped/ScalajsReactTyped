package typingsJapgolly.reactNativeReanimated.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeReanimated.mod.TransitionInOutProps
import typingsJapgolly.reactNativeReanimated.mod.TransitionProps
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.bottom
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeIn
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeInOut
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeOut
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.left
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.linear
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.right
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  object Change {
    
    @JSImport("react-native-reanimated", "Transition.Change")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def delayMs(value: Double): this.type = set("delayMs", value.asInstanceOf[js.Any])
      
      inline def durationMs(value: Double): this.type = set("durationMs", value.asInstanceOf[js.Any])
      
      inline def interpolation(value: linear | easeIn | easeOut | easeInOut): this.type = set("interpolation", value.asInstanceOf[js.Any])
      
      inline def propagation(value: top | bottom | left | right): this.type = set("propagation", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Change.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionProps & js.Object): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object In {
    
    @JSImport("react-native-reanimated", "Transition.In")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: In.type): SharedBuilder_TransitionInOutPropsObject_600153435 = new SharedBuilder_TransitionInOutPropsObject_600153435(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionInOutProps & js.Object): SharedBuilder_TransitionInOutPropsObject_600153435 = new SharedBuilder_TransitionInOutPropsObject_600153435(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Out {
    
    @JSImport("react-native-reanimated", "Transition.Out")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Out.type): SharedBuilder_TransitionInOutPropsObject_600153435 = new SharedBuilder_TransitionInOutPropsObject_600153435(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransitionInOutProps & js.Object): SharedBuilder_TransitionInOutPropsObject_600153435 = new SharedBuilder_TransitionInOutPropsObject_600153435(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Sequence {
    
    @JSImport("react-native-reanimated", "Transition.Sequence")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Sequence.type): SharedBuilder_Object_159303587[js.Object] = new SharedBuilder_Object_159303587[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): SharedBuilder_Object_159303587[js.Object] = new SharedBuilder_Object_159303587[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Together {
    
    @JSImport("react-native-reanimated", "Transition.Together")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Together.type): SharedBuilder_Object_159303587[js.Object] = new SharedBuilder_Object_159303587[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): SharedBuilder_Object_159303587[js.Object] = new SharedBuilder_Object_159303587[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-reanimated", "Transition")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Transition.type): SharedBuilder_Object_159303587[typingsJapgolly.reactNativeReanimated.mod.Transition] = new SharedBuilder_Object_159303587[typingsJapgolly.reactNativeReanimated.mod.Transition](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[typingsJapgolly.reactNativeReanimated.mod.Transition] = new SharedBuilder_Object_159303587[typingsJapgolly.reactNativeReanimated.mod.Transition](js.Array(this.component, p.asInstanceOf[js.Any]))
}
