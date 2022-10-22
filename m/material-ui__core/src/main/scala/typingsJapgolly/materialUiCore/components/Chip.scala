package typingsJapgolly.materialUiCore.components

import typingsJapgolly.materialUiCore.chipChipMod.ChipTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.DefaultComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chip {
  
  @JSImport("@material-ui/core", "Chip")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Chip.type): SharedBuilder_DefaultComponentProps_875088282 = new SharedBuilder_DefaultComponentProps_875088282(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultComponentProps[ChipTypeMap[js.Object, div]]): SharedBuilder_DefaultComponentProps_875088282 = new SharedBuilder_DefaultComponentProps_875088282(js.Array(this.component, p.asInstanceOf[js.Any]))
}
