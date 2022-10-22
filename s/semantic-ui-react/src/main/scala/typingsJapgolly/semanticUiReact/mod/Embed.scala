package typingsJapgolly.semanticUiReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import typingsJapgolly.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Embed")
@js.native
open class Embed protected ()
  extends Component[EmbedProps, js.Object, Any] {
  def this(props: EmbedProps) = this()
  def this(props: EmbedProps, context: Any) = this()
}
object Embed {
  
  inline def apply: ComponentClassP[EmbedProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Embed").asInstanceOf[ComponentClassP[EmbedProps & js.Object]]
}
