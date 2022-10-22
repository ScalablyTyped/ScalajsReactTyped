package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.anon.LabelValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsProps extends StObject {
  
  val fit: js.UndefOr[Boolean] = js.undefined
  
  val invert: js.UndefOr[Boolean] = js.undefined
  
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  val options: js.UndefOr[js.Array[LabelValue]] = js.undefined
  
  val secondary: js.UndefOr[Boolean] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val value: js.UndefOr[String] = js.undefined
}
object TabsProps {
  
  inline def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  extension [Self <: TabsProps](x: Self) {
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOptions(value: js.Array[LabelValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: LabelValue*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
