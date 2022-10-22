package typingsJapgolly.reactNativeAnimatedProgress.components

import typingsJapgolly.reactNativeAnimatedProgress.mod.AnimatedProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeAnimatedProgress {
  
  @JSImport("react-native-animated-progress", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeAnimatedProgress.type): SharedBuilder_AnimatedProgressProps610217855 = new SharedBuilder_AnimatedProgressProps610217855(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnimatedProgressProps): SharedBuilder_AnimatedProgressProps610217855 = new SharedBuilder_AnimatedProgressProps610217855(js.Array(this.component, p.asInstanceOf[js.Any]))
}
