package typingsJapgolly.reactNavigation.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNavigation.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-navigation", "SafeAreaView")
@js.native
open class SafeAreaView protected ()
  extends Component[SafeAreaViewProps, js.Object, Any] {
  def this(props: SafeAreaViewProps) = this()
  def this(props: SafeAreaViewProps, context: Any) = this()
}
object SafeAreaView {
  
  inline def apply: ComponentClassP[SafeAreaViewProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("SafeAreaView").asInstanceOf[ComponentClassP[SafeAreaViewProps & js.Object]]
}
