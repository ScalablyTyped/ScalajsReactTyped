package typingsJapgolly.antvG2.libInterfaceMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antvG2.anon.ParsePosition
import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeAnnotationOption
  extends StObject
     with AnnotationBaseOption {
  
  /**
    * @title 自定义 Annotation 绘制函数
    */
  def render(container: IGroup, view: View, helpers: ParsePosition): Unit
}
object ShapeAnnotationOption {
  
  inline def apply(render: (IGroup, View, ParsePosition) => Callback): ShapeAnnotationOption = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3((t0: IGroup, t1: View, t2: ParsePosition) => (render(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ShapeAnnotationOption]
  }
  
  extension [Self <: ShapeAnnotationOption](x: Self) {
    
    inline def setRender(value: (IGroup, View, ParsePosition) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: IGroup, t1: View, t2: ParsePosition) => (value(t0, t1, t2)).runNow()))
  }
}
