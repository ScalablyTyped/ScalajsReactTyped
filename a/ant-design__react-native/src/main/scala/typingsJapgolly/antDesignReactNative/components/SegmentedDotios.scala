package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libSegmentedControlSegmentedDotiosMod.SegmentedControlProps
import typingsJapgolly.antDesignReactNative.libSegmentedControlSegmentedDotiosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedDotios {
  
  @JSImport("@ant-design/react-native/lib/segmented-control/segmented.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SegmentedDotios.type): SharedBuilder_SegmentedControlProps323123367[default] = new SharedBuilder_SegmentedControlProps323123367[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SegmentedControlProps): SharedBuilder_SegmentedControlProps323123367[default] = new SharedBuilder_SegmentedControlProps323123367[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
