package typingsJapgolly.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tern.libTernMod.FilesQuery
  - typingsJapgolly.tern.libTernMod.RenameQuery
  - typingsJapgolly.tern.libTernMod.TypeQuery
  - typingsJapgolly.tern.libTernMod.RefsQuery
  - typingsJapgolly.tern.libTernMod.CompletionsQuery
  - typingsJapgolly.tern.libTernMod.DocumentationQuery
  - typingsJapgolly.tern.libTernMod.PropertiesQuery
  - typingsJapgolly.tern.libTernMod.DefinitionQuery
*/
trait Query extends StObject
object Query {
  
  inline def CompletionsQuery(end: Double | Position, file: String): typingsJapgolly.tern.libTernMod.CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("completions")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.CompletionsQuery]
  }
  
  inline def DefinitionQuery(end: Double | Position, file: String): typingsJapgolly.tern.libTernMod.DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.DefinitionQuery]
  }
  
  inline def DocumentationQuery(end: Double | Position, file: String): typingsJapgolly.tern.libTernMod.DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("documentation")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.DocumentationQuery]
  }
  
  inline def FilesQuery(): typingsJapgolly.tern.libTernMod.FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("files")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.FilesQuery]
  }
  
  inline def PropertiesQuery(): typingsJapgolly.tern.libTernMod.PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("properties")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.PropertiesQuery]
  }
  
  inline def RefsQuery(end: Double | Position, file: String): typingsJapgolly.tern.libTernMod.RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("refs")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.RefsQuery]
  }
  
  inline def RenameQuery(end: Double | Position, file: String, newName: String): typingsJapgolly.tern.libTernMod.RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rename")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.RenameQuery]
  }
  
  inline def TypeQuery(end: Double | Position, file: String): typingsJapgolly.tern.libTernMod.TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typingsJapgolly.tern.libTernMod.TypeQuery]
  }
}
