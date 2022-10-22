package typingsJapgolly.datatablesNet.DataTables

import typingsJapgolly.datatablesNet.datatablesNetStrings.`type`
import typingsJapgolly.datatablesNet.datatablesNetStrings.display
import typingsJapgolly.datatablesNet.datatablesNetStrings.filter
import typingsJapgolly.datatablesNet.datatablesNetStrings.set
import typingsJapgolly.datatablesNet.datatablesNetStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionColumnData extends StObject {
  
  def apply(row: Any, t: display | sort | filter | `type`, s: Unit, meta: CellMetaSettings): Any = js.native
  def apply(row: Any, t: set, s: Any, meta: CellMetaSettings): Unit = js.native
}
