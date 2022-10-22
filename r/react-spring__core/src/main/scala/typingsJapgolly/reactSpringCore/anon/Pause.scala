package typingsJapgolly.reactSpringCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationResolver
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pause[T /* <: AnimationTarget[Any] */] extends StObject {
  
  def pause(): Unit
  
  def resume(): Unit
  
  def start(props: RunAsyncProps[T], resolve: AnimationResolver[T]): Unit
}
object Pause {
  
  inline def apply[T /* <: AnimationTarget[Any] */](pause: Callback, resume: Callback, start: (RunAsyncProps[T], AnimationResolver[T]) => Callback): Pause[T] = {
    val __obj = js.Dynamic.literal(pause = pause.toJsFn, resume = resume.toJsFn, start = js.Any.fromFunction2((t0: RunAsyncProps[T], t1: AnimationResolver[T]) => (start(t0, t1)).runNow()))
    __obj.asInstanceOf[Pause[T]]
  }
  
  extension [Self <: Pause[?], T /* <: AnimationTarget[Any] */](x: Self & Pause[T]) {
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setStart(value: (RunAsyncProps[T], AnimationResolver[T]) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: RunAsyncProps[T], t1: AnimationResolver[T]) => (value(t0, t1)).runNow()))
  }
}
