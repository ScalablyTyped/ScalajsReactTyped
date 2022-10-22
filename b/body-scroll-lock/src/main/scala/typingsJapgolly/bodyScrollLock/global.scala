package typingsJapgolly.bodyScrollLock

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.bodyScrollLock.mod.BodyScrollOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object bodyScrollLock {
    
    @JSGlobal("bodyScrollLock")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearAllBodyScrollLocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllBodyScrollLocks")().asInstanceOf[Unit]
    
    inline def disableBodyScroll(targetElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def disableBodyScroll(targetElement: Element, options: BodyScrollOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def disableBodyScroll(targetElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def disableBodyScroll(targetElement: HTMLElement, options: BodyScrollOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enableBodyScroll(targetElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def enableBodyScroll(targetElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
