package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsWatchOptionsMod {
  
  @JSImport("@ionic/core/dist/types/utils/watch-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findCheckedOption(el: Any, tagName: String): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findCheckedOption")(el.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def watchForOptions[T /* <: HTMLElement */](containerEl: HTMLElement, tagName: String, onChange: js.Function1[/* el */ js.UndefOr[T], Unit]): js.UndefOr[MutationObserver] = (^.asInstanceOf[js.Dynamic].applyDynamic("watchForOptions")(containerEl.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MutationObserver]]
}
