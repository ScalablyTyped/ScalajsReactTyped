package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libFlexFlexDotnativeMod.FlexProps
import typingsJapgolly.antdMobileRn.libFlexFlexDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexDotnative {
  
  @JSImport("antd-mobile-rn/lib/flex/Flex.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FlexDotnative.type): SharedBuilder_FlexProps1821550928[default] = new SharedBuilder_FlexProps1821550928[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): SharedBuilder_FlexProps1821550928[default] = new SharedBuilder_FlexProps1821550928[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
