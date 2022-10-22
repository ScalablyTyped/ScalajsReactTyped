package typingsJapgolly.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInt32HistogramMod {
  
  @JSImport("hdr-histogram-js/dist/Int32Histogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.hdrHistogramJs.distTypedArrayHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  type Int32Histogram = typingsJapgolly.hdrHistogramJs.distTypedArrayHistogramMod.default
}
