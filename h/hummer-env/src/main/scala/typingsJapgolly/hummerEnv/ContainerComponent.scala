package typingsJapgolly.hummerEnv

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerComponent extends StObject {
  
  /**
    * 添加子视图
    * @param view 子视图
    */
  def appendChild(view: HummerComponent): Unit
  
  /**
    * 在指定子视图前插入一个子视图
    *
    * @param view 新的子视图
    * @param existingChild 指定的子视图
    */
  def insertBefore(view: HummerComponent, existingChild: HummerComponent): Unit
  
  /**
    * 移除所有子视图
    */
  def removeAll(): Unit
  
  /**
    * 移除子视图
    * @param view 子视图
    */
  def removeChild(view: HummerComponent): Unit
  
  /**
    * 把指定的子视图替换成另一个子视图
    *
    * @param newView 新的子视图
    * @param oldView 指定的子视图
    */
  def replaceChild(newView: HummerComponent, oldView: HummerComponent): Unit
}
object ContainerComponent {
  
  inline def apply(
    appendChild: HummerComponent => Callback,
    insertBefore: (HummerComponent, HummerComponent) => Callback,
    removeAll: Callback,
    removeChild: HummerComponent => Callback,
    replaceChild: (HummerComponent, HummerComponent) => Callback
  ): ContainerComponent = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1((t0: HummerComponent) => appendChild(t0).runNow()), insertBefore = js.Any.fromFunction2((t0: HummerComponent, t1: HummerComponent) => (insertBefore(t0, t1)).runNow()), removeAll = removeAll.toJsFn, removeChild = js.Any.fromFunction1((t0: HummerComponent) => removeChild(t0).runNow()), replaceChild = js.Any.fromFunction2((t0: HummerComponent, t1: HummerComponent) => (replaceChild(t0, t1)).runNow()))
    __obj.asInstanceOf[ContainerComponent]
  }
  
  extension [Self <: ContainerComponent](x: Self) {
    
    inline def setAppendChild(value: HummerComponent => Callback): Self = StObject.set(x, "appendChild", js.Any.fromFunction1((t0: HummerComponent) => value(t0).runNow()))
    
    inline def setInsertBefore(value: (HummerComponent, HummerComponent) => Callback): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2((t0: HummerComponent, t1: HummerComponent) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAll(value: Callback): Self = StObject.set(x, "removeAll", value.toJsFn)
    
    inline def setRemoveChild(value: HummerComponent => Callback): Self = StObject.set(x, "removeChild", js.Any.fromFunction1((t0: HummerComponent) => value(t0).runNow()))
    
    inline def setReplaceChild(value: (HummerComponent, HummerComponent) => Callback): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2((t0: HummerComponent, t1: HummerComponent) => (value(t0, t1)).runNow()))
  }
}
