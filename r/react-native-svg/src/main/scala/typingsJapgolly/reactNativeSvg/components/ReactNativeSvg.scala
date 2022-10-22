package typingsJapgolly.reactNativeSvg.components

import typingsJapgolly.reactNativeSvg.libTypescriptElementsSvgMod.SvgProps
import typingsJapgolly.reactNativeSvg.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvg {
  
  @JSImport("react-native-svg", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeSvg.type): SharedBuilder_SvgProps1854535879[default] = new SharedBuilder_SvgProps1854535879[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps1854535879[default] = new SharedBuilder_SvgProps1854535879[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
