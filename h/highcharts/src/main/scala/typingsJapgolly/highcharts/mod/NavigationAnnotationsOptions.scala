package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationAnnotationsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's control
    * points. Each control point inherits options from controlPointOptions
    * object. Options from the controlPointOptions can be overwritten by
    * options in a specific control point.
    */
  var controlPointOptions: js.UndefOr[js.Object | NavigationAnnotationsControlPointOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allow an annotation to be
    * draggable by a user. Possible values are `"x"`, `"xy"`, `"y"` and `""`
    * (disabled).
    */
  var draggable: js.UndefOr[OptionsDraggableValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Events available in annotations.
    */
  var events: js.UndefOr[NavigationAnnotationsEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets an ID for an annotation.
    * Can be user later when removing an annotation in
    * Chart.removeAnnotation(id) method.
    */
  var id: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's labels.
    * Each label inherits options from the labelOptions object. An option from
    * the labelOptions can be overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[NavigationAnnotationsLabelOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of labels for the
    * annotation. For options that apply to multiple labels, they can be added
    * to the labelOptions.
    */
  var labels: js.UndefOr[js.Array[NavigationAnnotationsLabelsOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
    * Each shape inherits options from the shapeOptions object. An option from
    * the shapeOptions can be overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[NavigationAnnotationsShapeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
    * annotation. For options that apply to multiple shapes, then can be added
    * to the shapeOptions.
    */
  var shapes: js.UndefOr[js.Array[NavigationAnnotationsShapesOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the annotation is
    * visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the annotation.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigationAnnotationsOptions {
  @scala.inline
  def apply(
    controlPointOptions: js.Object | NavigationAnnotationsControlPointOptions = null,
    draggable: OptionsDraggableValue = null,
    events: NavigationAnnotationsEventsOptions = null,
    id: Double | String = null,
    labelOptions: NavigationAnnotationsLabelOptions = null,
    labels: js.Array[NavigationAnnotationsLabelsOptions] = null,
    shapeOptions: NavigationAnnotationsShapeOptions = null,
    shapes: js.Array[NavigationAnnotationsShapesOptions] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): NavigationAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    if (controlPointOptions != null) __obj.updateDynamic("controlPointOptions")(controlPointOptions.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelOptions != null) __obj.updateDynamic("labelOptions")(labelOptions.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAnnotationsOptions]
  }
}

