package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libCheckboxCheckboxItemMod.CheckboxItemProps
import typingsJapgolly.antDesignReactNative.libCheckboxCheckboxItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxItem {
  
  @JSImport("@ant-design/react-native/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CheckboxItem.type): SharedBuilder_CheckboxItemProps_1831421440[default] = new SharedBuilder_CheckboxItemProps_1831421440[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxItemProps): SharedBuilder_CheckboxItemProps_1831421440[default] = new SharedBuilder_CheckboxItemProps_1831421440[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
