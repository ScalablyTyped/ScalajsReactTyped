package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.anon.`0`
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcCheckableContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/CheckableContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/CheckableContext", "CheckableContext")
  @js.native
  val CheckableContext: Context[CheckableContextType] = js.native
  
  inline def useCheckableContext(): js.Tuple2[CheckableContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableContext")().asInstanceOf[js.Tuple2[CheckableContextType, Boolean]]
  
  inline def useCheckableProps(hasValue: `0`): js.Tuple2[UseCheckablePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableProps")(hasValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseCheckablePropsReturn, Boolean]]
  
  trait CheckableContextType extends StObject {
    
    var checkedValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var onCheck: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* newValue */ String, Unit]] = js.undefined
  }
  object CheckableContextType {
    
    inline def apply(): CheckableContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckableContextType]
    }
    
    extension [Self <: CheckableContextType](x: Self) {
      
      inline def setCheckedValue(value: String | js.Array[String]): Self = StObject.set(x, "checkedValue", value.asInstanceOf[js.Any])
      
      inline def setCheckedValueUndefined: Self = StObject.set(x, "checkedValue", js.undefined)
      
      inline def setCheckedValueVarargs(value: String*): Self = StObject.set(x, "checkedValue", js.Array(value*))
      
      inline def setOnCheck(value: (/* event */ ReactEventFrom[Element], /* newValue */ String) => Callback): Self = StObject.set(x, "onCheck", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* newValue */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/CheckableContext.CheckableContextType, 'checkedValue'> & {  checked :boolean | undefined} */
  trait UseCheckablePropsReturn extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onCheck: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* newValue */ String, Unit]] = js.undefined
  }
  object UseCheckablePropsReturn {
    
    inline def apply(): UseCheckablePropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCheckablePropsReturn]
    }
    
    extension [Self <: UseCheckablePropsReturn](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setOnCheck(value: (/* event */ ReactEventFrom[Element], /* newValue */ String) => Callback): Self = StObject.set(x, "onCheck", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* newValue */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
    }
  }
}
