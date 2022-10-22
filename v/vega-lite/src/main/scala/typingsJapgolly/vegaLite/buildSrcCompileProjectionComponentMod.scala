package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileSplitMod.Split
import typingsJapgolly.vegaTypings.typesSpecProjectionMod.Projection
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileProjectionComponentMod {
  
  @JSImport("vega-lite/build/src/compile/projection/component", "ProjectionComponent")
  @js.native
  open class ProjectionComponent protected () extends Split[Projection] {
    def this(
      name: String,
      specifiedProjection: typingsJapgolly.vegaLite.buildSrcProjectionMod.Projection[SignalRef],
      size: js.Array[SignalRef],
      data: js.Array[String | SignalRef]
    ) = this()
    
    var data: js.Array[String | SignalRef] = js.native
    
    /**
      * Whether the projection parameters should fit provided data.
      */
    def isFit: Boolean = js.native
    
    var merged: Boolean = js.native
    
    var size: js.Array[SignalRef] = js.native
    
    var specifiedProjection: typingsJapgolly.vegaLite.buildSrcProjectionMod.Projection[SignalRef] = js.native
  }
}
