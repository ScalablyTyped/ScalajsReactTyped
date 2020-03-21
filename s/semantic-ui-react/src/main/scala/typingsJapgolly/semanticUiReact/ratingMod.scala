package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.ratingRatingMod.RatingComponent
import typingsJapgolly.semanticUiReact.ratingRatingMod.RatingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Rating", JSImport.Namespace)
@js.native
object ratingMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[RatingProps, ComponentState, js.Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[RatingComponent]
  
}

