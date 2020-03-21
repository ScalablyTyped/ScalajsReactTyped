package typingsJapgolly.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectableMod {
  type ISelectedRegionTransform = js.Function3[
    /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, 
    /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, 
    /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData], 
    typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
  ]
}
