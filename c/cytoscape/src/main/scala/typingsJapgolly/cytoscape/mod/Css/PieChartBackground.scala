package typingsJapgolly.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties allow you to create pie chart backgrounds on nodes.
  * Note that 16 slices maximum are supported per node,
  * so in the properties 1 <= i <= 16.
  * Of course, you must specify a numerical value for each property in place of i.
  * Each nonzero sized slice is placed in order of i,
  * starting from the 12 o’clock position and working clockwise.
  *
  * You may find it useful to reserve a number to a particular
  * colour for all nodes in your stylesheet.
  * Then you can specify values for pie-i-background-size
  * accordingly for each node via a mapper.
  * This would allow you to create consistently coloured
  * pie charts in each node of the graph based on element data.
  *
  * http://js.cytoscape.org/#style/pie-chart-background
  */
trait PieChartBackground extends js.Object {
  /**
    * The colour of the node’s ith pie chart slice.
    */
  var `pie-i-background-color`: PropertyValueNode[Colour]
  /**
    * The opacity of the node’s ith pie chart slice.
    */
  var `pie-i-background-opacity`: PropertyValueNode[Double]
  /**
    * The size of the node’s ith pie chart slice, measured in percent (e.g. 25% or 25).
    */
  var `pie-i-background-size`: PropertyValueNode[Double]
  /**
    * The diameter of the pie, measured as a percent of node size (e.g. 100%) or an absolute length (e.g. 25px).
    */
  var `pie-size`: PropertyValueNode[String]
}

object PieChartBackground {
  @scala.inline
  def apply(
    `pie-i-background-color`: PropertyValueNode[Colour],
    `pie-i-background-opacity`: PropertyValueNode[Double],
    `pie-i-background-size`: PropertyValueNode[Double],
    `pie-size`: PropertyValueNode[String]
  ): PieChartBackground = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pie-i-background-color")(`pie-i-background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-i-background-opacity")(`pie-i-background-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-i-background-size")(`pie-i-background-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("pie-size")(`pie-size`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartBackground]
  }
}

