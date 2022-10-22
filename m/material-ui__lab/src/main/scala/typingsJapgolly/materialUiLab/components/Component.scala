package typingsJapgolly.materialUiLab.components

import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.overridableComponentMod.DefaultComponentProps
import typingsJapgolly.materialUiLab.materialUiLabStrings.button
import typingsJapgolly.materialUiLab.tabListTabListMod.TabListTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("@material-ui/lab/TabList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Component.type): SharedBuilder_DefaultComponentProps_1844487730 = new SharedBuilder_DefaultComponentProps_1844487730(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: DefaultComponentProps[
      TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
    ]
  ): SharedBuilder_DefaultComponentProps_1844487730 = new SharedBuilder_DefaultComponentProps_1844487730(js.Array(this.component, p.asInstanceOf[js.Any]))
}
