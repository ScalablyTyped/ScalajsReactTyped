package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTarget2Mod.HotkeysTarget2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTarget2Mod.HotkeysTarget2RenderProps
import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysUseHotkeysMod.UseHotkeysOptions
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HotkeysTarget2 {
  
  inline def apply(
    children: Element | (js.Function1[/* props */ HotkeysTarget2RenderProps, Element]),
    hotkeys: js.Array[HotkeyConfig]
  ): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hotkeys = hotkeys.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HotkeysTarget2Props]))
  }
  
  @JSImport("@blueprintjs/core", "HotkeysTarget2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def options(value: UseHotkeysOptions): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HotkeysTarget2Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
