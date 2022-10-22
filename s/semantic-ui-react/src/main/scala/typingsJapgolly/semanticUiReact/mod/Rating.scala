package typingsJapgolly.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingMod.RatingComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingMod.RatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Rating")
@js.native
open class Rating protected ()
  extends Component[RatingProps, js.Object, Any] {
  def this(props: RatingProps) = this()
  def this(props: RatingProps, context: Any) = this()
}
object Rating extends Shortcut {
  
  @JSImport("semantic-ui-react", "Rating")
  @js.native
  val ^ : RatingComponent = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("semantic-ui-react", "Rating.Icon")
  @js.native
  open class IconCls protected ()
    extends Component[RatingIconProps, js.Object, Any] {
    def this(props: RatingIconProps) = this()
    def this(props: RatingIconProps, context: Any) = this()
  }
  
  type _To = RatingComponent
  
  /* This means you don't have to write `^`, but can instead just say `Rating.foo` */
  override def _to: RatingComponent = ^
}
