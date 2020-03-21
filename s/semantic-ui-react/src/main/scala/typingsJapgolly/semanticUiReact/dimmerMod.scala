package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.dimmerDimmerMod.DimmerComponent
import typingsJapgolly.semanticUiReact.dimmerDimmerMod.DimmerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer", JSImport.Namespace)
@js.native
object dimmerMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[DimmerProps, ComponentState, js.Any] {
    def this(props: DimmerProps) = this()
    def this(props: DimmerProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[DimmerComponent] {
    @js.native
    class Inner ()
      extends typingsJapgolly.semanticUiReact.dimmerInnerMod.default
    
  }
  
}

