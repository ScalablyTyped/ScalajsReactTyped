package typingsJapgolly.reactUserTour

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactUserTour.reactUserTourStrings.bottom
import typingsJapgolly.reactUserTour.reactUserTourStrings.bottomLeft
import typingsJapgolly.reactUserTour.reactUserTourStrings.left
import typingsJapgolly.reactUserTour.reactUserTourStrings.right
import typingsJapgolly.reactUserTour.reactUserTourStrings.top
import typingsJapgolly.reactUserTour.reactUserTourStrings.topLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-user-tour", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-user-tour", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TourProps, js.Object, Any] {
    def this(props: TourProps) = this()
    def this(props: TourProps, context: Any) = this()
  }
  @JSImport("react-user-tour", JSImport.Default)
  @js.native
  def default: ComponentClassP[TourProps & js.Object] = js.native
  inline def default_=(x: ComponentClassP[TourProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait TourProps
    extends StObject
       with HTMLAttributes[Any] {
    
    /**
      A boolean value representing whether or not the tour should currently be displayed
      */
    var active: Boolean
    
    /**
      We provide an arrow that points to the selector, but you may optionally pass in your own React element in the place of the arrow provided.
      */
    var arrow: js.UndefOr[Any] = js.undefined
    
    /**
      If you choose to use the provided arrow, you can set the color here by passing in a hex value.
      */
    var arrowColor: js.UndefOr[String] = js.undefined
    
    /**
      If you choose to use the provided arrow, you can set the pixel size here with an integer value.
      */
    var arrowSize: js.UndefOr[Double] = js.undefined
    
    /**
      Text that will appear on the button that moves the tour backwards.
      Defaults to Back
      */
    var backButtonText: js.UndefOr[String] = js.undefined
    
    /**
      Optional style object for the container div around the buttons.
      */
    var buttonContainerStyle: js.UndefOr[Any] = js.undefined
    
    /**
      Optional style object for buttons displayed on component.
      */
    var buttonStyle: js.UndefOr[Any] = js.undefined
    
    /**
      Text that will appear on the button that closes the tour.
      Defaults to Close
      */
    var closeButtonText: js.UndefOr[String] = js.undefined
    
    /**
      Text that will appear on the button that finishes the tour.
      Defaults to Done
      */
    var doneButtonText: js.UndefOr[String] = js.undefined
    
    /**
      Boolean to disable the showing of next/back/done buttons.
      Set this to true if you want to insert your own buttons in the body.
      */
    var hideButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      Boolean to disable the showing of the close text in the upper left of
      the component. Set this to true if you want to insert your own close
      functionality or if you would like to disable the ability for the user
      to prematurely exit the tour.
      */
    var hideClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      Text that will appear on the button that moves the tour forward.
      Defaults to Next
      */
    var nextButtonText: js.UndefOr[String] = js.undefined
    
    /**
      function that fires when user clicks the Back button.
      Receives the previous step integer as a callback.
      For example, if current step is 2 and user clicks the Back button, onBack(1) will be called.
      */
    var onBack: js.Function
    
    /**
      function that fires when user clicks the X button or the Done Button.
      */
    var onCancel: js.Function
    
    /**
      function that fires when user clicks the Next button.
      Receives the next step integer as a callback.
      For example, if current step is 1 and user clicks the Next button, onNext(2) will be called.
      */
    var onNext: js.Function
    
    /**
      An integer representing the current active step of the tour
      */
    var step: Double
    
    /**
      An array of TourStep.
      */
    var steps: js.Array[TourStep]
    
    /**
      Optional style object.
      */
    @JSName("style")
    var style_TourProps: js.UndefOr[Any] = js.undefined
  }
  object TourProps {
    
    inline def apply(
      active: Boolean,
      onBack: js.Function,
      onCancel: js.Function,
      onNext: js.Function,
      step: Double,
      steps: js.Array[TourStep]
    ): TourProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBack = onBack.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onNext = onNext.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[TourProps]
    }
    
    extension [Self <: TourProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setArrow(value: Any): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      inline def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
      
      inline def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBackButtonText(value: String): Self = StObject.set(x, "backButtonText", value.asInstanceOf[js.Any])
      
      inline def setBackButtonTextUndefined: Self = StObject.set(x, "backButtonText", js.undefined)
      
      inline def setButtonContainerStyle(value: Any): Self = StObject.set(x, "buttonContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonContainerStyleUndefined: Self = StObject.set(x, "buttonContainerStyle", js.undefined)
      
      inline def setButtonStyle(value: Any): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setCloseButtonText(value: String): Self = StObject.set(x, "closeButtonText", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonTextUndefined: Self = StObject.set(x, "closeButtonText", js.undefined)
      
      inline def setDoneButtonText(value: String): Self = StObject.set(x, "doneButtonText", value.asInstanceOf[js.Any])
      
      inline def setDoneButtonTextUndefined: Self = StObject.set(x, "doneButtonText", js.undefined)
      
      inline def setHideButtons(value: Boolean): Self = StObject.set(x, "hideButtons", value.asInstanceOf[js.Any])
      
      inline def setHideButtonsUndefined: Self = StObject.set(x, "hideButtons", js.undefined)
      
      inline def setHideClose(value: Boolean): Self = StObject.set(x, "hideClose", value.asInstanceOf[js.Any])
      
      inline def setHideCloseUndefined: Self = StObject.set(x, "hideClose", js.undefined)
      
      inline def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
      
      inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
      
      inline def setOnBack(value: js.Function): Self = StObject.set(x, "onBack", value.asInstanceOf[js.Any])
      
      inline def setOnCancel(value: js.Function): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setOnNext(value: js.Function): Self = StObject.set(x, "onNext", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[TourStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: TourStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TourStep extends StObject {
    
    /**
      a react element representing the main body message of the tour step
      */
    var body: String | Element
    
    /**
      Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
      */
    var horizontalOffset: js.UndefOr[Double] = js.undefined
    
    /**
      Each step can also take an optional argument, position which will override the position of the tour component in relation to the selector that is determined by the application.
      */
    var position: js.UndefOr[left | right | top | topLeft | bottom | bottomLeft] = js.undefined
    
    /**
      CSS selector to be passed to document.querySelector()
      */
    var selector: String
    
    /**
      Index number of the step in the tour
      */
    var step: Double
    
    /**
      a react element representing the header of the current step
      */
    var title: String | Element
    
    /**
      Optional properties horizontalOffset and verticalOffset values allow to move tooltip around pointed element.
      */
    var verticalOffset: js.UndefOr[Double] = js.undefined
  }
  object TourStep {
    
    inline def apply(body: String | Element, selector: String, step: Double, title: String | Element): TourStep = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TourStep]
    }
    
    extension [Self <: TourStep](x: Self) {
      
      inline def setBody(value: String | Element): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVdomElement(value: VdomElement): Self = StObject.set(x, "body", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setPosition(value: left | right | top | topLeft | bottom | bottomLeft): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
}
