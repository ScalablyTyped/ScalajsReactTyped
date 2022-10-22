package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateInputSrcButtonPresetsMod {
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/ButtonPresets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ButtonPresets(hasValuesSelectedIndexOnSelectionChange: ButtonPresetsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ButtonPresets")(hasValuesSelectedIndexOnSelectionChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ButtonPresetsProps
    extends StObject
       with AriaLabelingProps {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onSelectionChange(event: ReactEventFrom[org.scalajs.dom.Element], index: Double): Unit
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[String]
  }
  object ButtonPresetsProps {
    
    inline def apply(
      onSelectionChange: (ReactEventFrom[org.scalajs.dom.Element], Double) => Callback,
      values: js.Array[String]
    ): ButtonPresetsProps = {
      val __obj = js.Dynamic.literal(onSelectionChange = js.Any.fromFunction2((t0: ReactEventFrom[org.scalajs.dom.Element], t1: Double) => (onSelectionChange(t0, t1)).runNow()), values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonPresetsProps]
    }
    
    extension [Self <: ButtonPresetsProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnSelectionChange(value: (ReactEventFrom[org.scalajs.dom.Element], Double) => Callback): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2((t0: ReactEventFrom[org.scalajs.dom.Element], t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
