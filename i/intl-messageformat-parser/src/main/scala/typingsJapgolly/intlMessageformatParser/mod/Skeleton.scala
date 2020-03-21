package typingsJapgolly.intlMessageformatParser.mod

import typingsJapgolly.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typingsJapgolly.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.intlMessageformatParser.mod.NumberSkeleton
  - typingsJapgolly.intlMessageformatParser.mod.DateTimeSkeleton
*/
trait Skeleton extends js.Object

object Skeleton {
  @scala.inline
  def NumberSkeleton(tokens: js.Array[NumberSkeletonToken], `type`: `0`, location: Location = null): Skeleton = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
  @scala.inline
  def DateTimeSkeleton(pattern: String, `type`: `1`, location: Location = null): Skeleton = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
}

