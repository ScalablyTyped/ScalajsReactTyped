package typingsJapgolly.antvComponent.libTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /** 自定义 render 函数，注意绘制的 shape/group 需要设置 id */
  def render(container: IGroup): Unit
}
object ShapeAnnotationCfg {
  
  inline def apply(container: IGroup, render: IGroup => Callback): ShapeAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], render = js.Any.fromFunction1((t0: IGroup) => render(t0).runNow()))
    __obj.asInstanceOf[ShapeAnnotationCfg]
  }
  
  extension [Self <: ShapeAnnotationCfg](x: Self) {
    
    inline def setRender(value: IGroup => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: IGroup) => value(t0).runNow()))
  }
}
