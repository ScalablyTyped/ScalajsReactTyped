package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialAnnotationsArrowcolor
import typingsJapgolly.plotlyJs.PartialCameraCenter
import typingsJapgolly.plotlyJs.PartialDomain
import typingsJapgolly.plotlyJs.PartialPoint
import typingsJapgolly.plotlyJs.PartialSceneAxisAutorange
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.closest
import typingsJapgolly.plotlyJs.plotlyJsStrings.cube
import typingsJapgolly.plotlyJs.plotlyJsStrings.data
import typingsJapgolly.plotlyJs.plotlyJsStrings.manual
import typingsJapgolly.plotlyJs.plotlyJsStrings.orbit
import typingsJapgolly.plotlyJs.plotlyJsStrings.pan
import typingsJapgolly.plotlyJs.plotlyJsStrings.turntable
import typingsJapgolly.plotlyJs.plotlyJsStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]
  var aspectmode: auto | cube | data | manual
  var aspectratio: PartialPoint
  var bgcolor: String
  var camera: PartialCameraCenter
  var captureevents: Boolean
  var domain: PartialDomain
  var dragmode: orbit | turntable | zoom | pan | `false`
  var hovermode: closest | `false`
  var xaxis: PartialSceneAxisAutorange
  var yaxis: PartialSceneAxisAutorange
  var zaxis: PartialSceneAxisAutorange
}

object Scene {
  @scala.inline
  def apply(
    annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCameraCenter,
    captureevents: Boolean,
    domain: PartialDomain,
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: PartialSceneAxisAutorange,
    yaxis: PartialSceneAxisAutorange,
    zaxis: PartialSceneAxisAutorange
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scene]
  }
}

