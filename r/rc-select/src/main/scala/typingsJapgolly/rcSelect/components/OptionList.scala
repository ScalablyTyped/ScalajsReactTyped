package typingsJapgolly.rcSelect.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcSelect.libOptionListMod.OptionListProps
import typingsJapgolly.rcSelect.libOptionListMod.RefOptionListProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionList {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OptionList.type): Default[RefOptionListProps] = new Default[RefOptionListProps](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (Pick[OptionListProps, String]) & RefAttributes[RefOptionListProps]): Default[RefOptionListProps] = new Default[RefOptionListProps](js.Array(this.component, p.asInstanceOf[js.Any]))
}
