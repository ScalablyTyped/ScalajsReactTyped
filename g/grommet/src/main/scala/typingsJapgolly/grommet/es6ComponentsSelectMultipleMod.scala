package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.es6ComponentsSelectMod.BasicSelectProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsSelectMultipleMod {
  
  @JSImport("grommet/es6/components/SelectMultiple", "SelectMultiple")
  @js.native
  val SelectMultiple: FC[SelectMultipleExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'defaultValue' | 'help' | 'limit' | 'value' | 'showSelectedInline' | 'sortSelectedOnClose'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait SelectMultipleExtendedProps
    extends StObject
       with SelectMultipleProps
  object SelectMultipleExtendedProps {
    
    inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectMultipleExtendedProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectMultipleExtendedProps]
    }
  }
  
  trait SelectMultipleProps
    extends StObject
       with BasicSelectProps {
    
    var defaultValue: js.UndefOr[js.Array[String | Double | js.Object]] = js.undefined
    
    var help: js.UndefOr[String | Node] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var showSelectedInline: js.UndefOr[Boolean] = js.undefined
    
    var sortSelectedOnClose: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[js.Array[String | Double | js.Object]] = js.undefined
  }
  object SelectMultipleProps {
    
    inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectMultipleProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectMultipleProps]
    }
    
    extension [Self <: SelectMultipleProps](x: Self) {
      
      inline def setDefaultValue(value: js.Array[String | Double | js.Object]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | Double | js.Object)*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setHelp(value: String | Node): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHelpVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setHelpVdomElement(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setShowSelectedInline(value: Boolean): Self = StObject.set(x, "showSelectedInline", value.asInstanceOf[js.Any])
      
      inline def setShowSelectedInlineUndefined: Self = StObject.set(x, "showSelectedInline", js.undefined)
      
      inline def setSortSelectedOnClose(value: Boolean): Self = StObject.set(x, "sortSelectedOnClose", value.asInstanceOf[js.Any])
      
      inline def setSortSelectedOnCloseUndefined: Self = StObject.set(x, "sortSelectedOnClose", js.undefined)
      
      inline def setValue(value: js.Array[String | Double | js.Object]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double | js.Object)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
