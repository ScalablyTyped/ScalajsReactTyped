package typingsJapgolly.tern.libTernMod

import typingsJapgolly.tern.anon.QueryDocumentationQuery
import typingsJapgolly.tern.anon.QueryFilesQuery
import typingsJapgolly.tern.anon.QueryPropertiesQuery
import typingsJapgolly.tern.anon.QueryRefsQuery
import typingsJapgolly.tern.anon.QueryRenameQuery
import typingsJapgolly.tern.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRegistry extends StObject {
  
  var completions: typingsJapgolly.tern.anon.Query
  
  var definition: typingsJapgolly.tern.anon.QueryResult
  
  var documentation: QueryDocumentationQuery
  
  var files: QueryFilesQuery
  
  var properties: QueryPropertiesQuery
  
  var refs: QueryRefsQuery
  
  var rename: QueryRenameQuery
  
  var `type`: Result
}
object QueryRegistry {
  
  inline def apply(
    completions: typingsJapgolly.tern.anon.Query,
    definition: typingsJapgolly.tern.anon.QueryResult,
    documentation: QueryDocumentationQuery,
    files: QueryFilesQuery,
    properties: QueryPropertiesQuery,
    refs: QueryRefsQuery,
    rename: QueryRenameQuery,
    `type`: Result
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
  
  extension [Self <: QueryRegistry](x: Self) {
    
    inline def setCompletions(value: typingsJapgolly.tern.anon.Query): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: typingsJapgolly.tern.anon.QueryResult): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: QueryDocumentationQuery): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: QueryFilesQuery): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: QueryPropertiesQuery): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRefs(value: QueryRefsQuery): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRename(value: QueryRenameQuery): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setType(value: Result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
