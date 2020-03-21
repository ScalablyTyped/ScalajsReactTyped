package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Rating", JSImport.Namespace)
@js.native
object libRatingMod extends js.Object {
  @js.native
  class RatingBase protected ()
    extends typingsJapgolly.officeUiFabricReact.ratingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  
  val Rating: FunctionComponent[IRatingProps] = js.native
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    /* 1 */ val Large: typingsJapgolly.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    /* 0 */ val Small: typingsJapgolly.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.ratingTypesMod.RatingSize with Double] = js.native
  }
  
}

