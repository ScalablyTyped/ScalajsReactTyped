package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesStickyStickyMod.StickyProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Sticky")
@js.native
open class Sticky protected ()
  extends Component[StickyProps, js.Object, Any] {
  def this(props: StickyProps) = this()
  def this(props: StickyProps, context: Any) = this()
}
object Sticky {
  
  inline def apply: ComponentClassP[StickyProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Sticky").asInstanceOf[ComponentClassP[StickyProps & js.Object]]
}
