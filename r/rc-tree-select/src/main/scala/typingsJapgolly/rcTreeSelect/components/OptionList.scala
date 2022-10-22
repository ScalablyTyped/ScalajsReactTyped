package typingsJapgolly.rcTreeSelect.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcTreeSelect.esOptionListMod.ReviseRefOptionListProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OptionList.type): Default[ReviseRefOptionListProps] = new Default[ReviseRefOptionListProps](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RefAttributes[ReviseRefOptionListProps]): Default[ReviseRefOptionListProps] = new Default[ReviseRefOptionListProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
