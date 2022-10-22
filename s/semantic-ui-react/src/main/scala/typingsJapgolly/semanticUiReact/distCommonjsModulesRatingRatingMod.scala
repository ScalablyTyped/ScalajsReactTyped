package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.auto
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.heart
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.star
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesRatingRatingMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[RatingProps, js.Object, Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
    @js.native
    val ^ : RatingComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", "default.Icon")
    @js.native
    open class Icon protected ()
      extends Component[RatingIconProps, js.Object, Any] {
      def this(props: RatingIconProps) = this()
      def this(props: RatingIconProps, context: Any) = this()
    }
    
    type _To = RatingComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: RatingComponent = ^
  }
  
  @js.native
  trait RatingComponent
    extends StObject
       with ComponentClass[RatingProps, js.Object] {
    
    var Icon: ComponentClassP[RatingIconProps & js.Object] = js.native
  }
  
  trait RatingProps
    extends StObject
       with StrictRatingProps
       with /* key */ StringDictionary[Any]
  object RatingProps {
    
    inline def apply(): RatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingProps]
    }
  }
  
  trait StrictRatingProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * You can clear the rating by clicking on the current start rating.
      * By default a rating will be only clearable if there is 1 icon.
      * Setting to `true`/`false` will allow or disallow a user to clear their rating.
      */
    var clearable: js.UndefOr[Boolean | auto] = js.undefined
    
    /** The initial rating value. */
    var defaultRating: js.UndefOr[Double | String] = js.undefined
    
    /** You can disable or enable interactive rating.  Makes a read-only rating. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A rating can use a set of star or heart icons. */
    var icon: js.UndefOr[star | heart] = js.undefined
    
    /** The total number of icons. */
    var maxRating: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Called after user selects a new rating.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onRate: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ RatingProps, Unit]
      ] = js.undefined
    
    /** The current number of active icons. */
    var rating: js.UndefOr[Double | String] = js.undefined
    
    /** A progress bar can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.undefined
  }
  object StrictRatingProps {
    
    inline def apply(): StrictRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingProps]
    }
    
    extension [Self <: StrictRatingProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearable(value: Boolean | auto): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setDefaultRating(value: Double | String): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
      
      inline def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: star | heart): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaxRating(value: Double | String): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setMaxRatingUndefined: Self = StObject.set(x, "maxRating", js.undefined)
      
      inline def setOnRate(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ RatingProps) => Callback): Self = StObject.set(x, "onRate", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ RatingProps) => (value(t0, t1)).runNow()))
      
      inline def setOnRateUndefined: Self = StObject.set(x, "onRate", js.undefined)
      
      inline def setRating(value: Double | String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
