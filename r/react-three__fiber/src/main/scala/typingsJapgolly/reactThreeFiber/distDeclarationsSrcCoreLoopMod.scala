package typingsJapgolly.reactThreeFiber

import typingsJapgolly.reactThreeFiber.anon.Advance
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Root
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreLoopMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/loop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def createLoop[TCanvas](roots: Map[TCanvas, Root]): Advance = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoop")(roots.asInstanceOf[js.Any]).asInstanceOf[Advance]
  
  inline def flushGlobalEffects(`type`: GlobalEffectType, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushGlobalEffects")(`type`.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.before
    - typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.after
    - typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.tail
  */
  trait GlobalEffectType extends StObject
  object GlobalEffectType {
    
    inline def after: typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.after = "after".asInstanceOf[typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.after]
    
    inline def before: typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.before = "before".asInstanceOf[typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.before]
    
    inline def tail: typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.tail = "tail".asInstanceOf[typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.tail]
  }
  
  type GlobalRenderCallback = js.Function1[/* timeStamp */ Double, Unit]
}
