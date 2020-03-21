package typingsJapgolly.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataOverlayType extends js.Object

/** Specifies whether the overlay is a link or one or more actors. */
@JSGlobal("SP.Social.SocialDataOverlayType")
@js.native
object SocialDataOverlayType extends js.Object {
  @js.native
  sealed trait actors extends SocialDataOverlayType
  
  @js.native
  sealed trait link extends SocialDataOverlayType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataOverlayType with Double] = js.native
  /* 1 */ @js.native
  object actors extends TopLevel[actors with Double]
  
  /* 0 */ @js.native
  object link extends TopLevel[link with Double]
  
}

