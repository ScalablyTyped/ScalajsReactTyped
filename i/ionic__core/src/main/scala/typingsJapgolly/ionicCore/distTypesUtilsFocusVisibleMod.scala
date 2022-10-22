package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.anon.Destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsFocusVisibleMod {
  
  @JSImport("@ionic/core/dist/types/utils/focus-visible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startFocusVisible(): Destroy = ^.asInstanceOf[js.Dynamic].applyDynamic("startFocusVisible")().asInstanceOf[Destroy]
  inline def startFocusVisible(rootEl: HTMLElement): Destroy = ^.asInstanceOf[js.Dynamic].applyDynamic("startFocusVisible")(rootEl.asInstanceOf[js.Any]).asInstanceOf[Destroy]
}
