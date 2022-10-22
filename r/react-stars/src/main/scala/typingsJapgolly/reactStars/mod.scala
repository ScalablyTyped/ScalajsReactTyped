package typingsJapgolly.reactStars

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stars", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactStarsProps, js.Object, Any]
  
  type ReactStars = japgolly.scalajs.react.facade.React.Component[ReactStarsProps & js.Object, js.Object]
  
  trait ReactStarsProps extends StObject {
    
    /** Which character you want to use as a star */
    var char: js.UndefOr[String] = js.undefined
    
    /** Name of parent class */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of inactive star (this supports any CSS valid value) */
    var color1: js.UndefOr[String] = js.undefined
    
    /** Color of selected or active star */
    var color2: js.UndefOr[String] = js.undefined
    
    /** How many total stars you want */
    var count: js.UndefOr[Double] = js.undefined
    
    /** Should you be able to select rating or just see rating (for reusability) */
    var edit: js.UndefOr[Boolean] = js.undefined
    
    /** Should component use half stars, if not the decimal part will be dropped otherwise normal algebra rools will apply to round to half stars */
    var half: js.UndefOr[Boolean] = js.undefined
    
    /** Will be invoked any time the rating is changed */
    var onChange: js.UndefOr[js.Function1[/* new_rating */ Double, Unit]] = js.undefined
    
    /** Size of stars (in px) */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Set rating value */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ReactStarsProps {
    
    inline def apply(): ReactStarsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactStarsProps]
    }
    
    extension [Self <: ReactStarsProps](x: Self) {
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      inline def setColor1Undefined: Self = StObject.set(x, "color1", js.undefined)
      
      inline def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      inline def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setHalf(value: Boolean): Self = StObject.set(x, "half", value.asInstanceOf[js.Any])
      
      inline def setHalfUndefined: Self = StObject.set(x, "half", js.undefined)
      
      inline def setOnChange(value: /* new_rating */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* new_rating */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
