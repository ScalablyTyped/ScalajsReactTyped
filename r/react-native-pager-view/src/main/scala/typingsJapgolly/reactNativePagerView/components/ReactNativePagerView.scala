package typingsJapgolly.reactNativePagerView.components

import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.PagerViewProps
import typingsJapgolly.reactNativePagerView.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePagerView {
  
  @JSImport("react-native-pager-view", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativePagerView.type): SharedBuilder_PagerViewProps1154672662[default] = new SharedBuilder_PagerViewProps1154672662[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PagerViewProps): SharedBuilder_PagerViewProps1154672662[default] = new SharedBuilder_PagerViewProps1154672662[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
