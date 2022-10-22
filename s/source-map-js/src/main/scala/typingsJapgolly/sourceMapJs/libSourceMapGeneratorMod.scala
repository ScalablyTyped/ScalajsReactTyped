package typingsJapgolly.sourceMapJs

import typingsJapgolly.sourceMapJs.mod.SourceMapConsumer
import typingsJapgolly.sourceMapJs.mod.StartOfSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSourceMapGeneratorMod {
  
  @JSImport("source-map-js/lib/source-map-generator", "SourceMapGenerator")
  @js.native
  open class SourceMapGenerator ()
    extends typingsJapgolly.sourceMapJs.mod.SourceMapGenerator {
    def this(startOfSourceMap: StartOfSourceMap) = this()
  }
  /* static members */
  object SourceMapGenerator {
    
    @JSImport("source-map-js/lib/source-map-generator", "SourceMapGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSourceMap(sourceMapConsumer: SourceMapConsumer): typingsJapgolly.sourceMapJs.mod.SourceMapGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSourceMap")(sourceMapConsumer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sourceMapJs.mod.SourceMapGenerator]
  }
}
