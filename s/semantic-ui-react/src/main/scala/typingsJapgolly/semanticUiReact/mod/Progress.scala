package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesProgressProgressMod.ProgressProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Progress")
@js.native
open class Progress protected ()
  extends Component[ProgressProps, js.Object, Any] {
  def this(props: ProgressProps) = this()
  def this(props: ProgressProps, context: Any) = this()
}
object Progress {
  
  inline def apply: ComponentClassP[ProgressProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Progress").asInstanceOf[ComponentClassP[ProgressProps & js.Object]]
}
