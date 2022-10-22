package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseResizeEffectMod {
  
  @JSImport("antd-mobile/es/utils/use-resize-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeEffect[T /* <: HTMLElement */](effect: js.Function1[/* target */ T, Unit], targetRef: RefHandle[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeEffect")(effect.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
