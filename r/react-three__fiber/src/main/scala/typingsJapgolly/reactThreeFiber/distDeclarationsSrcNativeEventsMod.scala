package typingsJapgolly.reactThreeFiber

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcNativeEventsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/native/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTouchEvents(store: UseBoundStore[RootState]): EventManager[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTouchEvents")(store.asInstanceOf[js.Any]).asInstanceOf[EventManager[HTMLElement]]
}
