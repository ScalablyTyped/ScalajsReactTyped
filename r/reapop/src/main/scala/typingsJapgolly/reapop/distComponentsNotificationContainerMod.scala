package typingsJapgolly.reapop

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reapop.anon.DismissNotification
import typingsJapgolly.reapop.reapopStrings.addEndListener
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationContainerMod {
  
  @JSImport("reapop/dist/components/NotificationContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Props = DismissNotification & (Omit[TransitionProps[Unit], addEndListener])
}
