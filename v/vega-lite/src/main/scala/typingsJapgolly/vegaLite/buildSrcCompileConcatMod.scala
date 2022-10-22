package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcSpecConcatMod.NormalizedConcatSpec
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileConcatMod {
  
  @JSImport("vega-lite/build/src/compile/concat", "ConcatModel")
  @js.native
  open class ConcatModel protected () extends Model {
    def this(spec: NormalizedConcatSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    /* private */ var getChildren: Any = js.native
    
    def parseAxisGroup(): Unit = js.native
  }
}
