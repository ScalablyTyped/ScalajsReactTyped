package typingsJapgolly.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataProvider extends js.Object {
  var bounds: js.UndefOr[Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var title: String
}

object MapDataProvider {
  @scala.inline
  def apply(
    title: String,
    bounds: Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral = null,
    link: String = null
  ): MapDataProvider = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataProvider]
  }
}

