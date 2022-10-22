package typingsJapgolly.kbar

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.kbar.anon.IgnoreWhenFocused
import typingsJapgolly.kbar.anon.OmitActionid
import typingsJapgolly.kbar.libTypesMod.Action
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("kbar/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Priority {
    
    @JSImport("kbar/lib/utils", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar/lib/utils", "Priority.HIGH")
    @js.native
    def HIGH: Double = js.native
    inline def HIGH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar/lib/utils", "Priority.LOW")
    @js.native
    def LOW: Double = js.native
    inline def LOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar/lib/utils", "Priority.NORMAL")
    @js.native
    def NORMAL: Double = js.native
    inline def NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
  }
  
  inline def createAction(params: OmitActionid): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def getScrollbarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")().asInstanceOf[Double]
  
  inline def isModKey(event: ReactKeyboardEventFrom[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isModKey(event: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isModKey(event: MouseEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKey")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def randomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomId")().asInstanceOf[String]
  
  inline def shouldRejectKeystrokes(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldRejectKeystrokes")().asInstanceOf[Boolean | Null]
  inline def shouldRejectKeystrokes(hasIgnoreWhenFocused: IgnoreWhenFocused): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldRejectKeystrokes")(hasIgnoreWhenFocused.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def swallowEvent(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("swallowEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsomorphicLayout(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayout")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayout(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayout")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useOuterClick(dom: RefHandle[HTMLElement], cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOuterClick")(dom.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usePointerMovedSinceMount(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usePointerMovedSinceMount")().asInstanceOf[Boolean]
  
  inline def useThrottledValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useThrottledValue[T](value: T, ms: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottledValue")(value.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[T]
}
