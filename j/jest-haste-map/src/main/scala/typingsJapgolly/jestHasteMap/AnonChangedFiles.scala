package typingsJapgolly.jestHasteMap

import typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`0`
import typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`1`
import typingsJapgolly.jestHasteMap.typesMod.InternalHasteMap
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedFiles extends js.Object {
  var changedFiles: js.UndefOr[
    Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ] = js.undefined
  var hasteMap: InternalHasteMap
  var removedFiles: Map[
    String, 
    js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  ]
}

object AnonChangedFiles {
  @scala.inline
  def apply(
    hasteMap: InternalHasteMap,
    removedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ],
    changedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ] = null
  ): AnonChangedFiles = {
    val __obj = js.Dynamic.literal(hasteMap = hasteMap.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedFiles]
  }
}

