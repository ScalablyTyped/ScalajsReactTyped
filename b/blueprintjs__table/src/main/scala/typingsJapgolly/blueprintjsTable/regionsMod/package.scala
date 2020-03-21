package typingsJapgolly.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object regionsMod {
  type IRegionStyler = js.Function2[
    /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, 
    /* quadrantType */ js.UndefOr[typingsJapgolly.blueprintjsTable.tableQuadrantMod.QuadrantType], 
    typingsJapgolly.react.mod.CSSProperties
  ]
}
