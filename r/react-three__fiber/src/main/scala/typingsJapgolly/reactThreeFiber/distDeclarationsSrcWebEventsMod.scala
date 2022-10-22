package typingsJapgolly.reactThreeFiber

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.EventManager
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcWebEventsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/web/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPointerEvents(store: UseBoundStore[RootState]): EventManager[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPointerEvents")(store.asInstanceOf[js.Any]).asInstanceOf[EventManager[HTMLElement]]
}
