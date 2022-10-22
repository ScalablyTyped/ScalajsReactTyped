package typingsJapgolly.hummerEnv

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootComponent[T] extends StObject {
  
  /**
    * @summary  页面显示
    */
  def onAppear(): T
  
  /**
    * @summary  页面返回事件 返回true表示要拦截返回事件，不做页面关闭；返回false表示不做拦截，可以正常关闭页面
    */
  def onBack(): /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any
  
  def onCreate(): T
  
  /**
    * @summary  页面销毁
    */
  def onDestroy(): T
  
  /**
    * @summary  页面隐藏
    */
  def onDisappear(): T
}
object RootComponent {
  
  inline def apply[T](
    onAppear: CallbackTo[T],
    onBack: CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any
    ],
    onCreate: CallbackTo[T],
    onDestroy: CallbackTo[T],
    onDisappear: CallbackTo[T]
  ): RootComponent[T] = {
    val __obj = js.Dynamic.literal(onAppear = onAppear.toJsFn, onBack = onBack.toJsFn, onCreate = onCreate.toJsFn, onDestroy = onDestroy.toJsFn, onDisappear = onDisappear.toJsFn)
    __obj.asInstanceOf[RootComponent[T]]
  }
  
  extension [Self <: RootComponent[?], T](x: Self & RootComponent[T]) {
    
    inline def setOnAppear(value: CallbackTo[T]): Self = StObject.set(x, "onAppear", value.toJsFn)
    
    inline def setOnBack(
      value: CallbackTo[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? T : boolean */ js.Any
        ]
    ): Self = StObject.set(x, "onBack", value.toJsFn)
    
    inline def setOnCreate(value: CallbackTo[T]): Self = StObject.set(x, "onCreate", value.toJsFn)
    
    inline def setOnDestroy(value: CallbackTo[T]): Self = StObject.set(x, "onDestroy", value.toJsFn)
    
    inline def setOnDisappear(value: CallbackTo[T]): Self = StObject.set(x, "onDisappear", value.toJsFn)
  }
}
