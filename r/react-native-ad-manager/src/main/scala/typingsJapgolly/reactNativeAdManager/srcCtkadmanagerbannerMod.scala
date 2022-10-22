package typingsJapgolly.reactNativeAdManager

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeAdManager.helperTypesMod.BannerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCtkadmanagerbannerMod {
  
  /**
    * Display a DFP Publisher banner
    */
  @JSImport("react-native-ad-manager/src/CTKAdManagerBanner", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[BannerProps, js.Object, Any]
  
  @JSImport("react-native-ad-manager/src/CTKAdManagerBanner", "simulatorId")
  @js.native
  val simulatorId: String = js.native
  
  /**
    * Display a DFP Publisher banner
    */
  type Banner = japgolly.scalajs.react.facade.React.Component[BannerProps & js.Object, js.Object]
}
