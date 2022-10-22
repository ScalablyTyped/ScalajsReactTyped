package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.grommet.anon.Id
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsRadioButtonGroupMod {
  
  @JSImport("grommet/es6/components/RadioButtonGroup", "RadioButtonGroup")
  @js.native
  val RadioButtonGroup: FC[RadioButtonGroupExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'children' | 'onClick' | 'onChange'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait RadioButtonGroupExtendedProps
    extends StObject
       with RadioButtonGroupProps
       with BoxProps
  object RadioButtonGroupExtendedProps {
    
    inline def apply(name: String, options: js.Array[String | Double | Boolean | Id]): RadioButtonGroupExtendedProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupExtendedProps]
    }
  }
  
  trait RadioButtonGroupProps extends StObject {
    
    var children: js.UndefOr[js.Function] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    var options: js.Array[String | Double | Boolean | Id]
    
    var value: js.UndefOr[String | Double | Boolean | js.Object] = js.undefined
  }
  object RadioButtonGroupProps {
    
    inline def apply(name: String, options: js.Array[String | Double | Boolean | Id]): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    extension [Self <: RadioButtonGroupProps](x: Self) {
      
      inline def setChildren(value: js.Function): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[String | Double | Boolean | Id]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (String | Double | Boolean | Id)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: String | Double | Boolean | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
