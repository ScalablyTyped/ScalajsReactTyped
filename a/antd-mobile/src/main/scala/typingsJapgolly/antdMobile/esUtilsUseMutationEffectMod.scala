package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseMutationEffectMod {
  
  @JSImport("antd-mobile/es/utils/use-mutation-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutationEffect(effect: js.Function0[Unit], targetRef: RefHandle[HTMLElement], options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationEffect")(effect.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
