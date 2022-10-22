package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.anon.HandleDialogClose
import typingsJapgolly.blueprintjsCore.anon.PartialOmitHotkeysDialog2
import typingsJapgolly.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysContextInstance
import typingsJapgolly.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysContextState
import typingsJapgolly.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysProviderProps
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HotkeysProvider {
  
  inline def apply(children: ReactChild): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HotkeysProviderProps]))
  }
  
  @JSImport("@blueprintjs/core", "HotkeysProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dialogProps(value: PartialOmitHotkeysDialog2): this.type = set("dialogProps", value.asInstanceOf[js.Any])
    
    inline def renderDialog(value: (/* state */ HotkeysContextState, /* contextActions */ HandleDialogClose) => Element): this.type = set("renderDialog", js.Any.fromFunction2(value))
    
    inline def value(value: HotkeysContextInstance): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HotkeysProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
