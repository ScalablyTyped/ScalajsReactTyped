package typingsJapgolly.reactJoyride.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactJoyride.mod.CallBackProps
import typingsJapgolly.reactJoyride.mod.Locale
import typingsJapgolly.reactJoyride.mod.Props
import typingsJapgolly.reactJoyride.mod.Step
import typingsJapgolly.reactJoyride.mod.StoreHelpers
import typingsJapgolly.reactJoyride.mod.Styles
import typingsJapgolly.reactJoyride.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJoyride {
  
  inline def apply(steps: js.Array[Step]): Builder = {
    val __props = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-joyride", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def beaconComponent(value: ElementType): this.type = set("beaconComponent", value.asInstanceOf[js.Any])
    
    inline def callback(value: /* data */ CallBackProps => Callback): this.type = set("callback", js.Any.fromFunction1((t0: /* data */ CallBackProps) => value(t0).runNow()))
    
    inline def continuous(value: Boolean): this.type = set("continuous", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def disableCloseOnEsc(value: Boolean): this.type = set("disableCloseOnEsc", value.asInstanceOf[js.Any])
    
    inline def disableOverlay(value: Boolean): this.type = set("disableOverlay", value.asInstanceOf[js.Any])
    
    inline def disableOverlayClose(value: Boolean): this.type = set("disableOverlayClose", value.asInstanceOf[js.Any])
    
    inline def disableScrollParentFix(value: Boolean): this.type = set("disableScrollParentFix", value.asInstanceOf[js.Any])
    
    inline def disableScrolling(value: Boolean): this.type = set("disableScrolling", value.asInstanceOf[js.Any])
    
    inline def floaterProps(value: Props): this.type = set("floaterProps", value.asInstanceOf[js.Any])
    
    inline def getHelpers(value: /* helpers */ StoreHelpers => Any): this.type = set("getHelpers", js.Any.fromFunction1(value))
    
    inline def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    
    inline def hideCloseButton(value: Boolean): this.type = set("hideCloseButton", value.asInstanceOf[js.Any])
    
    inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def run(value: Boolean): this.type = set("run", value.asInstanceOf[js.Any])
    
    inline def scrollDuration(value: Double): this.type = set("scrollDuration", value.asInstanceOf[js.Any])
    
    inline def scrollOffset(value: Double): this.type = set("scrollOffset", value.asInstanceOf[js.Any])
    
    inline def scrollToFirstStep(value: Boolean): this.type = set("scrollToFirstStep", value.asInstanceOf[js.Any])
    
    inline def showProgress(value: Boolean): this.type = set("showProgress", value.asInstanceOf[js.Any])
    
    inline def showSkipButton(value: Boolean): this.type = set("showSkipButton", value.asInstanceOf[js.Any])
    
    inline def spotlightClicks(value: Boolean): this.type = set("spotlightClicks", value.asInstanceOf[js.Any])
    
    inline def spotlightPadding(value: Double): this.type = set("spotlightPadding", value.asInstanceOf[js.Any])
    
    inline def stepIndex(value: Double): this.type = set("stepIndex", value.asInstanceOf[js.Any])
    
    inline def styles(value: Styles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tooltipComponent(value: ElementType): this.type = set("tooltipComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
