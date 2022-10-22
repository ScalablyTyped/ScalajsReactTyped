package typingsJapgolly.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactDevtoolsInline.commonsMod.IndexSourceMap
  - typingsJapgolly.reactDevtoolsInline.commonsMod.BasicSourceMap
*/
trait MixedSourceMap extends StObject
object MixedSourceMap {
  
  inline def BasicSourceMap(mappings: String, names: js.Array[String], sources: js.Array[String], version: Double): typingsJapgolly.reactDevtoolsInline.commonsMod.BasicSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.BasicSourceMap]
  }
  
  inline def IndexSourceMap(mappings: Unit, sections: js.Array[IndexSourceMapSection], sourcesContent: Unit, version: Double): typingsJapgolly.reactDevtoolsInline.commonsMod.IndexSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.IndexSourceMap]
  }
}
