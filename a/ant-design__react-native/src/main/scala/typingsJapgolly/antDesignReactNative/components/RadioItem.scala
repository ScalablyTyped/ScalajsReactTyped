package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libRadioRadioItemMod.RadioItemProps
import typingsJapgolly.antDesignReactNative.libRadioRadioItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioItem {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadioItem.type): SharedBuilder_RadioItemProps_202278406[default] = new SharedBuilder_RadioItemProps_202278406[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioItemProps): SharedBuilder_RadioItemProps_202278406[default] = new SharedBuilder_RadioItemProps_202278406[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
