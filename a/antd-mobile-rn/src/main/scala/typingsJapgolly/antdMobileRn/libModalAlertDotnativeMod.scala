package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antdMobileRn.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalAlertDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/alert.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: Node, content: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(title: Node, content: Node, actions: js.Array[Text]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
