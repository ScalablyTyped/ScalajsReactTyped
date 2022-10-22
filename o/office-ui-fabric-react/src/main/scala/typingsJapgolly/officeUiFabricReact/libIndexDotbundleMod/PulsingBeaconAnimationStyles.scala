package typingsJapgolly.officeUiFabricReact.libIndexDotbundleMod

import typingsJapgolly.uifabricMergeStyles.libIrawstyleMod.IRawStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PulsingBeaconAnimationStyles {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PulsingBeaconAnimationStyles")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PulsingBeaconAnimationStyles.continuousPulseAnimationDouble")
  @js.native
  def continuousPulseAnimationDouble: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  inline def continuousPulseAnimationDouble(
    beaconColorOne: String,
    beaconColorTwo: String,
    innerDimension: String,
    outerDimension: String,
    borderWidth: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("continuousPulseAnimationDouble")(beaconColorOne.asInstanceOf[js.Any], beaconColorTwo.asInstanceOf[js.Any], innerDimension.asInstanceOf[js.Any], outerDimension.asInstanceOf[js.Any], borderWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def continuousPulseAnimationDouble_=(
    x: js.Function5[
      /* beaconColorOne */ String, 
      /* beaconColorTwo */ String, 
      /* innerDimension */ String, 
      /* outerDimension */ String, 
      /* borderWidth */ String, 
      String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("continuousPulseAnimationDouble")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PulsingBeaconAnimationStyles.continuousPulseAnimationSingle")
  @js.native
  def continuousPulseAnimationSingle: js.Function5[
    /* beaconColorOne */ String, 
    /* beaconColorTwo */ String, 
    /* innerDimension */ String, 
    /* outerDimension */ String, 
    /* borderWidth */ String, 
    String
  ] = js.native
  inline def continuousPulseAnimationSingle(
    beaconColorOne: String,
    beaconColorTwo: String,
    innerDimension: String,
    outerDimension: String,
    borderWidth: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("continuousPulseAnimationSingle")(beaconColorOne.asInstanceOf[js.Any], beaconColorTwo.asInstanceOf[js.Any], innerDimension.asInstanceOf[js.Any], outerDimension.asInstanceOf[js.Any], borderWidth.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def continuousPulseAnimationSingle_=(
    x: js.Function5[
      /* beaconColorOne */ String, 
      /* beaconColorTwo */ String, 
      /* innerDimension */ String, 
      /* outerDimension */ String, 
      /* borderWidth */ String, 
      String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("continuousPulseAnimationSingle")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "PulsingBeaconAnimationStyles.createDefaultAnimation")
  @js.native
  def createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
  inline def createDefaultAnimation(animationName: String): IRawStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultAnimation")(animationName.asInstanceOf[js.Any]).asInstanceOf[IRawStyle]
  inline def createDefaultAnimation(animationName: String, delayLength: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultAnimation")(animationName.asInstanceOf[js.Any], delayLength.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def createDefaultAnimation_=(x: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDefaultAnimation")(x.asInstanceOf[js.Any])
}
