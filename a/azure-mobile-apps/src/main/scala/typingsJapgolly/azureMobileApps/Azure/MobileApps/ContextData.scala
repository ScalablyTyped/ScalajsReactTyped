package typingsJapgolly.azureMobileApps.Azure.MobileApps

import typingsJapgolly.azureMobileApps.Azure.MobileApps.Data.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextData extends StObject {
  
  def apply(table: TableDefinition): Table = js.native
  
  def execute(q: SqlQueryDefinition): Thenable[Any] = js.native
}
