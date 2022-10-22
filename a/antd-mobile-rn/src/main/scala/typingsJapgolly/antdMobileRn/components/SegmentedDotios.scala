package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libSegmentedControlSegmentedDotiosMod.SegmentedControlProps
import typingsJapgolly.antdMobileRn.libSegmentedControlSegmentedDotiosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedDotios {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SegmentedDotios.type): SharedBuilder_SegmentedControlProps_124579113[default] = new SharedBuilder_SegmentedControlProps_124579113[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SegmentedControlProps): SharedBuilder_SegmentedControlProps_124579113[default] = new SharedBuilder_SegmentedControlProps_124579113[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
