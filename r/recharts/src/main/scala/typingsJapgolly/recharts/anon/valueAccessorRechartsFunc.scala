package typingsJapgolly.recharts.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.LabelFormatter
import typingsJapgolly.recharts.mod.LabelListProps
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.PositionType
import typingsJapgolly.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  valueAccessor :recharts.recharts.RechartsFunction,   dataKey :never | undefined} & {  angle :number | undefined,   children :std.Array<react.react.ReactNode> | react.react.ReactNode | undefined,   className :string | undefined,   clockWise :boolean | undefined,   content :react.react.ReactElement | recharts.recharts.ContentRenderer<recharts.recharts.LabelProps> | undefined,   data :number | undefined,   formatter :recharts.recharts.LabelFormatter | undefined,   id :string | undefined,   offset :number | undefined,   position :recharts.recharts.PositionType | undefined} */
trait valueAccessorRechartsFunc
  extends StObject
     with LabelListProps {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var clockWise: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[Element | ContentRenderer[LabelProps]] = js.undefined
  
  var data: js.UndefOr[Double] = js.undefined
  
  var dataKey: js.UndefOr[scala.Nothing] = js.undefined
  
  var formatter: js.UndefOr[LabelFormatter] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[PositionType] = js.undefined
  
  var valueAccessor: RechartsFunction
}
object valueAccessorRechartsFunc {
  
  inline def apply(valueAccessor: RechartsFunction): valueAccessorRechartsFunc = {
    val __obj = js.Dynamic.literal(valueAccessor = valueAccessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[valueAccessorRechartsFunc]
  }
  
  extension [Self <: valueAccessorRechartsFunc](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClockWise(value: Boolean): Self = StObject.set(x, "clockWise", value.asInstanceOf[js.Any])
    
    inline def setClockWiseUndefined: Self = StObject.set(x, "clockWise", js.undefined)
    
    inline def setContent(value: Element | ContentRenderer[LabelProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: LabelProps => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormatter(value: /* label */ String | Double => Node): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setValueAccessor(value: RechartsFunction): Self = StObject.set(x, "valueAccessor", value.asInstanceOf[js.Any])
  }
}
