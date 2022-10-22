package typingsJapgolly.askmethatRating

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MutationRecord
import typingsJapgolly.askmethatRating.distAmtRatingPopoverMod.AskmethatRatingPopoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("askmethat-rating", "AskmethatRating")
  @js.native
  open class AskmethatRating protected () extends StObject {
    /**
      * constructor with div element, default rating value & default options
      *
      * @param element This is the html container for the rating elements
      * @param defaultValue Default value set when the plugin render the rating
      * @param options Default option base on AskmethatRatingOptions type
      */
    def this(element: HTMLDivElement) = this()
    def this(element: HTMLDivElement, defaultValue: Double) = this()
    def this(element: HTMLDivElement, defaultValue: Double, options: Any) = this()
    def this(element: HTMLDivElement, defaultValue: Unit, options: Any) = this()
    
    /**
      * Default option base on @type IAskmethatRatingOptions
      */
    /* private */ var _defaultOptions: Any = js.native
    
    /* private */ var changeEvent: Any = js.native
    
    /**
      * @function get the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    /**
      * @function set the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    var defaultOptions: AskmethatRatingOptions = js.native
    
    /**
      * @function Calculate the value according to the step provided in options
      * @param  {Number} value:number the current value
      * @return {Number} the new value according to step
      */
    /* protected */ def getValueAccordingToStep(value: Double): Double = js.native
    
    /**
      * Init popover if needed
      */
    /* private */ def initPopover(): Any = js.native
    
    /* private */ var mouseMove: Any = js.native
    
    /**
      * This is fired by mutation observer when an attribute changed in the hidden input
      * Is protected to have some unit tests
      *
      * @param mutations list of mutations record
      */
    /* protected */ def mutationDisableEvent(mutations: js.Array[MutationRecord]): Unit = js.native
    
    /**
      * Check if disabled attribute is added or removed from the input
      * Update readonly status if needed for the rating
      */
    /* private */ def mutationEvent(): Any = js.native
    
    /**
      * @function mouse out event in rating
      * @param  {type} event?: Event {event}
      */
    /* private */ def onMouseLeave(event: Any): Any = js.native
    
    /**
      * @function mouse event enter in rating
      * @param  {type} event?: Event {event}
      */
    /* private */ def onMouseMove(event: Any): Any = js.native
    
    /**
      * @function when a rating is clicked
      * @param  {type} event : Event {event object}
      */
    /* private */ def onRatingClick(event: Any): Any = js.native
    
    /* private */ var pValue: Any = js.native
    
    /* private */ var parentElement: Any = js.native
    
    /* private */ var ratingClick: Any = js.native
    
    /**
      * render a new rating, by default value is the minRating
      *
      * @param value this is the default value set when the plugin is rendered, by default IAskmethatRatingOptions.minRating
      */
    def render(): Unit = js.native
    def render(value: Double): Unit = js.native
    
    /**
      * @function set or unset the active class and color
      * @param  {HTMLSpanElement} current :  current span element
      * @param  {number} current :  value needed for the if
      */
    /* protected */ def setOrUnsetActive(value: Double): Unit = js.native
    
    /* private */ var styleSheet: Any = js.native
    
    /**
      * @function get the current value for the rating
      */
    /**
      * @function set a new value for the rating
      *
      * @param _value this is the new value you want to set to the rating
      * @returns the current number
      */
    var value: Double = js.native
  }
  /* static members */
  object AskmethatRating {
    
    @JSImport("askmethat-rating", "AskmethatRating")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @function static method to retrieve with identifier the value
      * @param  {string} identifier: string container identifier
      * @return {number} current rating
      */
    inline def value(identifier: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(identifier.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @js.native
  sealed trait AskmethatRatingSteps extends StObject
  @JSImport("askmethat-rating", "AskmethatRatingSteps")
  @js.native
  object AskmethatRatingSteps extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AskmethatRatingSteps & Double] = js.native
    
    /**
      * Step 0.1 per 0.1
      */
    @js.native
    sealed trait DecimalStep
      extends StObject
         with AskmethatRatingSteps
    /* 0 */ val DecimalStep: typingsJapgolly.askmethatRating.mod.AskmethatRatingSteps.DecimalStep & Double = js.native
    
    /**
      * Step 0.5 per 0.5
      */
    @js.native
    sealed trait HalfStep
      extends StObject
         with AskmethatRatingSteps
    /* 1 */ val HalfStep: typingsJapgolly.askmethatRating.mod.AskmethatRatingSteps.HalfStep & Double = js.native
    
    /**
      * Step 1 per 1
      */
    @js.native
    sealed trait OnePerOneStep
      extends StObject
         with AskmethatRatingSteps
    /* 2 */ val OnePerOneStep: typingsJapgolly.askmethatRating.mod.AskmethatRatingSteps.OnePerOneStep & Double = js.native
  }
  
  trait AskmethatRatingOptions extends StObject {
    
    /**
      * Color when the rating is not hovered
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Class to display as rating (FontAwesome or Rating for exemple)
      */
    var fontClass: js.UndefOr[String] = js.undefined
    
    var hoverColor: js.UndefOr[String] = js.undefined
    
    /**
      * Input name (Default is AskmethatRating)
      */
    var inputName: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum rating that the plugin display
      */
    var maxRating: js.UndefOr[Double] = js.undefined
    
    /**
      * Mininmum rating that the user can set
      */
    var minRating: js.UndefOr[Double] = js.undefined
    
    /**
      * options if popover is set. Put element as readonly
      */
    var popover: js.UndefOr[AskmethatRatingPopoverOptions] = js.undefined
    
    /**
      * Set the rating to readonly
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The stepping for the rating
      */
    var step: js.UndefOr[AskmethatRatingSteps] = js.undefined
  }
  object AskmethatRatingOptions {
    
    inline def apply(): AskmethatRatingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AskmethatRatingOptions]
    }
    
    extension [Self <: AskmethatRatingOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      inline def setFontClassUndefined: Self = StObject.set(x, "fontClass", js.undefined)
      
      inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      inline def setMaxRating(value: Double): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setMaxRatingUndefined: Self = StObject.set(x, "maxRating", js.undefined)
      
      inline def setMinRating(value: Double): Self = StObject.set(x, "minRating", value.asInstanceOf[js.Any])
      
      inline def setMinRatingUndefined: Self = StObject.set(x, "minRating", js.undefined)
      
      inline def setPopover(value: AskmethatRatingPopoverOptions): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
      
      inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setStep(value: AskmethatRatingSteps): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
