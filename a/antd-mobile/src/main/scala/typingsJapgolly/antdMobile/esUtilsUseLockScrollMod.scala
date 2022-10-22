package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antdMobile.antdMobileStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseLockScrollMod {
  
  @JSImport("antd-mobile/es/utils/use-lock-scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLockScroll(rootRef: RefHandle[HTMLElement], shouldLock: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLockScroll")(rootRef.asInstanceOf[js.Any], shouldLock.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLockScroll_strict(rootRef: RefHandle[HTMLElement], shouldLock: strict): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLockScroll")(rootRef.asInstanceOf[js.Any], shouldLock.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
