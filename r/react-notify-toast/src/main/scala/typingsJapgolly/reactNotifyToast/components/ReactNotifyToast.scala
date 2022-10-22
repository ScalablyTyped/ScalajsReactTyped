package typingsJapgolly.reactNotifyToast.components

import typingsJapgolly.reactNotifyToast.mod.NotificationProps
import typingsJapgolly.reactNotifyToast.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNotifyToast {
  
  @JSImport("react-notify-toast", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNotifyToast.type): SharedBuilder_NotificationProps347379641[default] = new SharedBuilder_NotificationProps347379641[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps347379641[default] = new SharedBuilder_NotificationProps347379641[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
