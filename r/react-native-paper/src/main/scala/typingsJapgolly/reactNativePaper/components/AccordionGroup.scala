package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.reactNativePaper.libTypescriptComponentsListListAccordionGroupMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccordionGroup {
  
  @JSImport("react-native-paper", "List.AccordionGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AccordionGroup.type): SharedBuilder_Props_1242071912 = new SharedBuilder_Props_1242071912(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1242071912 = new SharedBuilder_Props_1242071912(js.Array(this.component, p.asInstanceOf[js.Any]))
}
