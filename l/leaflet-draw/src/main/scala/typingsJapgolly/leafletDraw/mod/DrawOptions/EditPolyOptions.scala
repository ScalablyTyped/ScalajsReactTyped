package typingsJapgolly.leafletDraw.mod.DrawOptions

import typingsJapgolly.leaflet.mod.FeatureGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditPolyOptions extends js.Object {
  /**
    * Determines if line segments can cross
    *
    * @default true
    */
  var allowIntersection: Boolean
  /**
    * Edit handler options. Set to false to disable handler.
    */
  var edit: EditHandlerOptions
  /**
    * This is the FeatureGroup that stores all editable shapes
    * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
    */
  var featureGroup: FeatureGroup_[_]
  /**
    * Set polygon editing options
    */
  var poly: EditPolyOptions
  /**
    * Delete handler options. Set to false to disable handler.
    */
  var remove: js.Any
}

object EditPolyOptions {
  @scala.inline
  def apply(
    allowIntersection: Boolean,
    edit: EditHandlerOptions,
    featureGroup: FeatureGroup_[_],
    poly: EditPolyOptions,
    remove: js.Any
  ): EditPolyOptions = {
    val __obj = js.Dynamic.literal(allowIntersection = allowIntersection.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], featureGroup = featureGroup.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditPolyOptions]
  }
}

