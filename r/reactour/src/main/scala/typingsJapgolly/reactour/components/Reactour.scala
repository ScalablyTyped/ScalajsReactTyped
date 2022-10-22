package typingsJapgolly.reactour.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactour.mod.CustomHelperProps
import typingsJapgolly.reactour.mod.ReactourAccessibilityOptions
import typingsJapgolly.reactour.mod.ReactourProps
import typingsJapgolly.reactour.mod.ReactourStep
import typingsJapgolly.reactour.mod.default
import typingsJapgolly.reactour.reactourStrings.esc
import typingsJapgolly.reactour.reactourStrings.left
import typingsJapgolly.reactour.reactourStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reactour {
  
  inline def apply(
    isOpen: Boolean,
    onRequestClose: ReactMouseEventFrom[HTMLDivElement] => Callback,
    steps: js.Array[ReactourStep]
  ): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => onRequestClose(t0).runNow()), steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactourProps]))
  }
  
  @JSImport("reactour", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def CustomHelper(value: /* hasProps */ CustomHelperProps => Element): this.type = set("CustomHelper", js.Any.fromFunction1(value))
    
    inline def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    
    inline def accessibilityOptions(value: ReactourAccessibilityOptions): this.type = set("accessibilityOptions", value.asInstanceOf[js.Any])
    
    inline def badgeContent(value: (/* current */ Double, /* total */ Double) => Node): this.type = set("badgeContent", js.Any.fromFunction2(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeWithMask(value: Boolean): this.type = set("closeWithMask", value.asInstanceOf[js.Any])
    
    inline def disableDotsNavigation(value: Boolean): this.type = set("disableDotsNavigation", value.asInstanceOf[js.Any])
    
    inline def disableFocusLock(value: Boolean): this.type = set("disableFocusLock", value.asInstanceOf[js.Any])
    
    inline def disableInteraction(value: Boolean): this.type = set("disableInteraction", value.asInstanceOf[js.Any])
    
    inline def disableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): this.type = set("disableKeyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def disableKeyboardNavigationVarargs(value: (esc | right | left)*): this.type = set("disableKeyboardNavigation", js.Array(value*))
    
    inline def getCurrentStep(value: /* currentStep */ Double => Callback): this.type = set("getCurrentStep", js.Any.fromFunction1((t0: /* currentStep */ Double) => value(t0).runNow()))
    
    inline def goToStep(value: Double): this.type = set("goToStep", value.asInstanceOf[js.Any])
    
    inline def highlightedMaskClassName(value: String): this.type = set("highlightedMaskClassName", value.asInstanceOf[js.Any])
    
    inline def inViewThreshold(value: Double): this.type = set("inViewThreshold", value.asInstanceOf[js.Any])
    
    inline def lastStepNextButton(value: VdomNode): this.type = set("lastStepNextButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def lastStepNextButtonNull: this.type = set("lastStepNextButton", null)
    
    inline def lastStepNextButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("lastStepNextButton", js.Array(value*))
    
    inline def lastStepNextButtonVdomElement(value: VdomElement): this.type = set("lastStepNextButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    
    inline def maskSpace(value: Double): this.type = set("maskSpace", value.asInstanceOf[js.Any])
    
    inline def nextButton(value: VdomNode): this.type = set("nextButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def nextButtonNull: this.type = set("nextButton", null)
    
    inline def nextButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextButton", js.Array(value*))
    
    inline def nextButtonVdomElement(value: VdomElement): this.type = set("nextButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextStep(value: Callback): this.type = set("nextStep", value.toJsFn)
    
    inline def onAfterOpen(value: /* target */ HTMLDivElement => Callback): this.type = set("onAfterOpen", js.Any.fromFunction1((t0: /* target */ HTMLDivElement) => value(t0).runNow()))
    
    inline def onBeforeClose(value: /* target */ HTMLDivElement => Callback): this.type = set("onBeforeClose", js.Any.fromFunction1((t0: /* target */ HTMLDivElement) => value(t0).runNow()))
    
    inline def prevButton(value: VdomNode): this.type = set("prevButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def prevButtonNull: this.type = set("prevButton", null)
    
    inline def prevButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevButton", js.Array(value*))
    
    inline def prevButtonVdomElement(value: VdomElement): this.type = set("prevButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def prevStep(value: Callback): this.type = set("prevStep", value.toJsFn)
    
    inline def rounded(value: Double): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def scrollDuration(value: Double): this.type = set("scrollDuration", value.asInstanceOf[js.Any])
    
    inline def scrollOffset(value: Double): this.type = set("scrollOffset", value.asInstanceOf[js.Any])
    
    inline def showButtons(value: Boolean): this.type = set("showButtons", value.asInstanceOf[js.Any])
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def showNavigation(value: Boolean): this.type = set("showNavigation", value.asInstanceOf[js.Any])
    
    inline def showNavigationNumber(value: Boolean): this.type = set("showNavigationNumber", value.asInstanceOf[js.Any])
    
    inline def showNumber(value: Boolean): this.type = set("showNumber", value.asInstanceOf[js.Any])
    
    inline def startAt(value: Double): this.type = set("startAt", value.asInstanceOf[js.Any])
    
    inline def update(value: String): this.type = set("update", value.asInstanceOf[js.Any])
    
    inline def updateDelay(value: Double): this.type = set("updateDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactourProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
