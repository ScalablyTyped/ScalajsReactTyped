package typingsJapgolly.jestHasteMap

import typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`0`
import typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`1`
import typingsJapgolly.jestHasteMap.typesMod.InternalHasteMap
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasteMap extends js.Object {
  var hasteMap: InternalHasteMap
  var removedFiles: Map[
    String, 
    js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  ]
}

object AnonHasteMap {
  @scala.inline
  def apply(
    hasteMap: InternalHasteMap,
    removedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ): AnonHasteMap = {
    val __obj = js.Dynamic.literal(hasteMap = hasteMap.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHasteMap]
  }
}

