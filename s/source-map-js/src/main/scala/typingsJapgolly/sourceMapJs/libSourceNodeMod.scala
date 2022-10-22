package typingsJapgolly.sourceMapJs

import typingsJapgolly.sourceMapJs.mod.SourceMapConsumer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSourceNodeMod {
  
  @JSImport("source-map-js/lib/source-node", "SourceNode")
  @js.native
  open class SourceNode ()
    extends typingsJapgolly.sourceMapJs.mod.SourceNode {
    def this(line: Double, column: Double, source: String) = this()
    def this(line: Double, column: Double, source: String, chunk: String) = this()
    def this(line: Double, column: Double, source: String, chunk: String, name: String) = this()
    def this(line: Double, column: Double, source: String, chunk: Unit, name: String) = this()
  }
  /* static members */
  object SourceNode {
    
    @JSImport("source-map-js/lib/source-node", "SourceNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer): typingsJapgolly.sourceMapJs.mod.SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringWithSourceMap")(code.asInstanceOf[js.Any], sourceMapConsumer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sourceMapJs.mod.SourceNode]
    inline def fromStringWithSourceMap(code: String, sourceMapConsumer: SourceMapConsumer, relativePath: String): typingsJapgolly.sourceMapJs.mod.SourceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStringWithSourceMap")(code.asInstanceOf[js.Any], sourceMapConsumer.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sourceMapJs.mod.SourceNode]
  }
}
