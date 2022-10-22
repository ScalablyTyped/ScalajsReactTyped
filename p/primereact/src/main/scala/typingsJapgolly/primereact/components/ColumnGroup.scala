package typingsJapgolly.primereact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.primereact.columngroupColumngroupMod.ColumnGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnGroup {
  
  @JSImport("primereact", "ColumnGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ColumnGroup.type): Default[typingsJapgolly.primereact.mod.ColumnGroup] = new Default[typingsJapgolly.primereact.mod.ColumnGroup](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColumnGroupProps): Default[typingsJapgolly.primereact.mod.ColumnGroup] = new Default[typingsJapgolly.primereact.mod.ColumnGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
