package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesRatingRatingIconMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[RatingIconProps, js.Object, Any] {
    def this(props: RatingIconProps) = this()
    def this(props: RatingIconProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  val default: ComponentClassP[RatingIconProps & js.Object] = js.native
  
  trait RatingIconProps
    extends StObject
       with StrictRatingIconProps
       with /* key */ StringDictionary[Any]
  object RatingIconProps {
    
    inline def apply(): RatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIconProps]
    }
  }
  
  trait StrictRatingIconProps extends StObject {
    
    /** Indicates activity of an icon. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An index of icon inside Rating. */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.undefined
    
    /**
      * Called on keyup.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onKeyUp: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.undefined
    
    /**
      * Called on mouseenter.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onMouseEnter: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.undefined
    
    /** Indicates selection of an icon. */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object StrictRatingIconProps {
    
    inline def apply(): StrictRatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingIconProps]
    }
    
    extension [Self <: StrictRatingIconProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyUp(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMouseEnter(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type _To = ComponentClassP[RatingIconProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesRatingRatingIconMod.foo` */
  override def _to: ComponentClassP[RatingIconProps & js.Object] = default
}
