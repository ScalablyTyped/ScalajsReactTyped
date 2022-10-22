package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcTable.libSugarColumnGroupMod.ColumnGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnGroup {
  
  inline def apply[RecordType](children: Element | js.Array[Element]): SharedBuilder_ColumnGroupProps_1147588062[RecordType] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_ColumnGroupProps_1147588062[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
  }
  
  @JSImport("rc-table", "ColumnGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps_1147588062[RecordType] = new SharedBuilder_ColumnGroupProps_1147588062[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
