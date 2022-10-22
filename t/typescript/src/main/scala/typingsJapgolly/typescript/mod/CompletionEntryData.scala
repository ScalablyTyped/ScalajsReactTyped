package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typescript.mod.CompletionEntryDataUnresolved
  - typingsJapgolly.typescript.mod.CompletionEntryDataResolved
*/
trait CompletionEntryData extends StObject
object CompletionEntryData {
  
  inline def CompletionEntryDataResolved(exportName: java.lang.String, moduleSpecifier: java.lang.String): typingsJapgolly.typescript.mod.CompletionEntryDataResolved = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], moduleSpecifier = moduleSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typescript.mod.CompletionEntryDataResolved]
  }
  
  inline def CompletionEntryDataUnresolved(exportMapKey: java.lang.String, exportName: java.lang.String): typingsJapgolly.typescript.mod.CompletionEntryDataUnresolved = {
    val __obj = js.Dynamic.literal(exportMapKey = exportMapKey.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typescript.mod.CompletionEntryDataUnresolved]
  }
}
