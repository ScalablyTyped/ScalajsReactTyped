package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "PulsingBeaconAnimationStyles")
@js.native
object PulsingBeaconAnimationStyles extends js.Object {
  var continuousPulseAnimationDouble: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  var continuousPulseAnimationSingle: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
}

