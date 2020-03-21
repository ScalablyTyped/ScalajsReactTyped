package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styleStyleMod {
  type GeometryFunction = js.Function1[
    /* p0 */ typingsJapgolly.ol.olFeatureMod.FeatureLike, 
    typingsJapgolly.ol.geometryMod.default | typingsJapgolly.ol.renderFeatureMod.default
  ]
  type RenderFunction = js.Function2[
    /* p0 */ typingsJapgolly.ol.coordinateMod.Coordinate | (js.Array[
      js.Array[typingsJapgolly.ol.coordinateMod.Coordinate] | typingsJapgolly.ol.coordinateMod.Coordinate
    ]), 
    /* p1 */ typingsJapgolly.ol.renderMod.State, 
    scala.Unit
  ]
  type StyleFunction = js.Function2[
    /* p0 */ typingsJapgolly.ol.olFeatureMod.FeatureLike, 
    /* p1 */ scala.Double, 
    typingsJapgolly.ol.styleStyleMod.Style | js.Array[typingsJapgolly.ol.styleStyleMod.Style]
  ]
  type StyleLike = typingsJapgolly.ol.styleStyleMod.Style | js.Array[typingsJapgolly.ol.styleStyleMod.Style] | typingsJapgolly.ol.styleStyleMod.StyleFunction
}
