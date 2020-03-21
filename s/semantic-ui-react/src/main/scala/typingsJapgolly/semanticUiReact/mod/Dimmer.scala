package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.dimmerDimmerMod.DimmerComponent
import typingsJapgolly.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsJapgolly.semanticUiReact.dimmerInnerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react", "Dimmer")
@js.native
class Dimmer protected ()
  extends Component[DimmerProps, ComponentState, js.Any] {
  def this(props: DimmerProps) = this()
  def this(props: DimmerProps, context: js.Any) = this()
}

@JSImport("semantic-ui-react", "Dimmer")
@js.native
object Dimmer extends TopLevel[DimmerComponent] {
  @js.native
  class Inner () extends default
  
}

