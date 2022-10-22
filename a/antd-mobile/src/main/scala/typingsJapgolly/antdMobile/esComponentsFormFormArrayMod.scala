package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcFieldForm.esInterfaceMod.StoreValue
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFormFormArrayMod {
  
  @JSImport("antd-mobile/es/components/form/form-array", "FormArray")
  @js.native
  val FormArray: FC[FormArrayProps] = js.native
  
  trait FormArrayField extends StObject {
    
    var index: Double
    
    var key: Double
  }
  object FormArrayField {
    
    inline def apply(index: Double, key: Double): FormArrayField = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormArrayField]
    }
    
    extension [Self <: FormArrayField](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormArrayOperation extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: Unit, insertIndex: Double): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, insertIndex: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  trait FormArrayProps extends StObject {
    
    def children(fields: js.Array[FormArrayField], operation: FormArrayOperation): js.Array[Element]
    
    var initialValue: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String | Double | (js.Array[String | Double])
    
    var onAdd: js.UndefOr[js.Function1[/* operation */ FormArrayOperation, Unit]] = js.undefined
    
    var renderAdd: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var renderHeader: js.UndefOr[
        js.Function2[/* field */ FormArrayField, /* operation */ FormArrayOperation, Node]
      ] = js.undefined
  }
  object FormArrayProps {
    
    inline def apply(
      children: (js.Array[FormArrayField], FormArrayOperation) => js.Array[Element],
      name: String | Double | (js.Array[String | Double])
    ): FormArrayProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormArrayProps]
    }
    
    extension [Self <: FormArrayProps](x: Self) {
      
      inline def setChildren(value: (js.Array[FormArrayField], FormArrayOperation) => js.Array[Element]): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setInitialValue(value: js.Array[Any]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInitialValueVarargs(value: Any*): Self = StObject.set(x, "initialValue", js.Array(value*))
      
      inline def setName(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setOnAdd(value: /* operation */ FormArrayOperation => Callback): Self = StObject.set(x, "onAdd", js.Any.fromFunction1((t0: /* operation */ FormArrayOperation) => value(t0).runNow()))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setRenderAdd(value: CallbackTo[Node]): Self = StObject.set(x, "renderAdd", value.toJsFn)
      
      inline def setRenderAddUndefined: Self = StObject.set(x, "renderAdd", js.undefined)
      
      inline def setRenderHeader(value: (/* field */ FormArrayField, /* operation */ FormArrayOperation) => Node): Self = StObject.set(x, "renderHeader", js.Any.fromFunction2(value))
      
      inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    }
  }
}
