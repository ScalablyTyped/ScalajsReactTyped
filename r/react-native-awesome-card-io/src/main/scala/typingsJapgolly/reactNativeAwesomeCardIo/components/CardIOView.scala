package typingsJapgolly.reactNativeAwesomeCardIo.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardDetails
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIODetectionMode
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardIOView {
  
  inline def apply(didScanCard: CardDetails => Callback): Builder = {
    val __props = js.Dynamic.literal(didScanCard = js.Any.fromFunction1((t0: CardDetails) => didScanCard(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CardIOViewProps]))
  }
  
  @JSImport("react-native-awesome-card-io", "CardIOView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOView] {
    
    inline def allowFreelyRotatingCardGuide(value: Boolean): this.type = set("allowFreelyRotatingCardGuide", value.asInstanceOf[js.Any])
    
    inline def detectionMode(value: CardIODetectionMode): this.type = set("detectionMode", value.asInstanceOf[js.Any])
    
    inline def guideColor(value: String | Double): this.type = set("guideColor", value.asInstanceOf[js.Any])
    
    inline def hideCardIOLogo(value: Boolean): this.type = set("hideCardIOLogo", value.asInstanceOf[js.Any])
    
    inline def languageOrLocale(value: String): this.type = set("languageOrLocale", value.asInstanceOf[js.Any])
    
    inline def scanExpiry(value: Boolean): this.type = set("scanExpiry", value.asInstanceOf[js.Any])
    
    inline def scanInstructions(value: String): this.type = set("scanInstructions", value.asInstanceOf[js.Any])
    
    inline def scannedImageDuration(value: Double): this.type = set("scannedImageDuration", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def useCardIOLogo(value: Boolean): this.type = set("useCardIOLogo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardIOViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
