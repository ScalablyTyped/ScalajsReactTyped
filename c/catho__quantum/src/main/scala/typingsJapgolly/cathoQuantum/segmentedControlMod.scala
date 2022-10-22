package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.cathoQuantum.anon.Icon
import typingsJapgolly.cathoQuantum.anon.`20`
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedControlMod {
  
  @JSImport("@catho/quantum/SegmentedControl", "SegmentedControl")
  @js.native
  val SegmentedControl: FC[SegmentedControlProps] = js.native
  
  trait SegmentedControlProps extends StObject {
    
    var darkMode: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[Icon]
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[`20`] = js.undefined
  }
  object SegmentedControlProps {
    
    inline def apply(items: js.Array[Icon]): SegmentedControlProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    extension [Self <: SegmentedControlProps](x: Self) {
      
      inline def setDarkMode(value: Boolean): Self = StObject.set(x, "darkMode", value.asInstanceOf[js.Any])
      
      inline def setDarkModeUndefined: Self = StObject.set(x, "darkMode", js.undefined)
      
      inline def setItems(value: js.Array[Icon]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Icon*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTheme(value: `20`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
