package typingsJapgolly.datadogSketchesJs

import typingsJapgolly.datadogSketchesJs.distDdsketchDdsketchMod.LogCollapsingSketchConfig
import typingsJapgolly.datadogSketchesJs.distDdsketchDdsketchMod.SketchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch", "DDSketch")
  @js.native
  /**
    * Initialize a new DDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    */
  open class DDSketch ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchDdsketchMod.DDSketch {
    def this(hasRelativeAccuracy: SketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch", "LogCollapsingHighestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingHighestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before highest indices are collapsed (default 2048)
    */
  open class LogCollapsingHighestDenseDDSketch ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchDdsketchMod.LogCollapsingHighestDenseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch", "LogCollapsingLowestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingLowestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before lowest indices are collapsed (default 2048)
    */
  open class LogCollapsingLowestDenseDDSketch ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchDdsketchMod.LogCollapsingLowestDenseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
}
