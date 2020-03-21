package typingsJapgolly.ol.vectorImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageLayer
  extends typingsJapgolly.ol.baseVectorMod.default[
      typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] | typingsJapgolly.ol.sourceVectorTileMod.default
    ] {
  def getImageRatio(): Double = js.native
}

