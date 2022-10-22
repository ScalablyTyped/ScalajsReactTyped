package typingsJapgolly.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rollup.anon.Mappings
  - typingsJapgolly.rollup.mod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends StObject
object DecodedSourceMapOrMissing {
  
  inline def ExistingDecodedSourceMap(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): typingsJapgolly.rollup.mod.ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rollup.mod.ExistingDecodedSourceMap]
  }
  
  inline def Mappings(plugin: String): typingsJapgolly.rollup.anon.Mappings = {
    val __obj = js.Dynamic.literal(missing = true, plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.Mappings]
  }
}
