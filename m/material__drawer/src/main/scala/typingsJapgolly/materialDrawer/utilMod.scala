package typingsJapgolly.materialDrawer

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialDom.focusTrapMod.FocusOptions
import typingsJapgolly.materialDom.focusTrapMod.FocusTrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/drawer/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  
  type MDCDrawerFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}
