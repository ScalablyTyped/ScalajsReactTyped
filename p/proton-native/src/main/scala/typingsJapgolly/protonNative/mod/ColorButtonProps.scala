package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.protonNative.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorButtonProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * The initial color for the ColorButton. Can be passed as standard color seen in CSS (a color name, hex, rgb, rgba, hsl, hsla).
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Called when the color is changed for the ColorButton. The current color is passed as an object of RGBA.
    */
  var onChange: js.UndefOr[js.Function1[/* color */ A, Unit]] = js.undefined
}
object ColorButtonProps {
  
  inline def apply(): ColorButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorButtonProps]
  }
  
  extension [Self <: ColorButtonProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOnChange(value: /* color */ A => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* color */ A) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
