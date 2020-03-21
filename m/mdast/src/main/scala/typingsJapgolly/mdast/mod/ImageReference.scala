package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.imageReference
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageReference
  extends StaticPhrasingContent
     with Node
     with Reference
     with Alternative {
  @JSName("type")
  var type_ImageReference: imageReference
}

object ImageReference {
  @scala.inline
  def apply(
    identifier: String,
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageReference]
  }
}

