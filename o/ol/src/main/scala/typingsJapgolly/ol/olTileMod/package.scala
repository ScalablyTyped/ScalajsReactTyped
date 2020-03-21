package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object olTileMod {
  type LoadFunction = js.Function2[/* p0 */ typingsJapgolly.ol.olTileMod.Tile, /* p1 */ java.lang.String, scala.Unit]
  type UrlFunction = js.Function3[
    /* p0 */ typingsJapgolly.ol.tilecoordMod.TileCoord, 
    /* p1 */ scala.Double, 
    /* p2 */ typingsJapgolly.ol.projectionMod.default, 
    java.lang.String
  ]
}
