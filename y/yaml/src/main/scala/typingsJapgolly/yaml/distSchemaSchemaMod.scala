package typingsJapgolly.yaml

import typingsJapgolly.std.Record
import typingsJapgolly.yaml.anon.ReadonlyToStringOptions
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distOptionsMod.SchemaOptions
import typingsJapgolly.yaml.distSchemaTypesMod.CollectionTag
import typingsJapgolly.yaml.distSchemaTypesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaSchemaMod {
  
  @JSImport("yaml/dist/schema/Schema", "Schema")
  @js.native
  open class Schema protected () extends StObject {
    def this(hasCompatCustomTagsMergeResolveKnownTagsSchemaSortMapEntriesToStringDefaults: SchemaOptions) = this()
    
    var compat: (js.Array[CollectionTag | ScalarTag]) | Null = js.native
    
    var knownTags: Record[String, CollectionTag | ScalarTag] = js.native
    
    var merge: Boolean = js.native
    
    var name: String = js.native
    
    var sortMapEntries: (js.Function2[/* a */ Pair[Any, Any], /* b */ Pair[Any, Any], Double]) | Null = js.native
    
    var tags: js.Array[CollectionTag | ScalarTag] = js.native
    
    var toStringOptions: ReadonlyToStringOptions | Null = js.native
  }
}
