package typingsJapgolly.geodesy.latlonEllipsoidalReferenceframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CartesianReferenceFrame
  extends typingsJapgolly.geodesy.latlonEllipsoidalMod.Cartesian {
  def convertReferenceFrame(toReferenceFrame: ReferenceFrame): CartesianReferenceFrame = js.native
  def epoch(): Double = js.native
  def referenceFrame(): ReferenceFrame = js.native
  def toLatLon(): LatLonEllipsoidalReferenceFrame = js.native
}

