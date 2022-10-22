package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the position of the axis labels with respect to the axis on the scale of the crossing axis. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait ChartAxisLabelPosition extends StObject
object ChartAxisLabelPosition {
  
  /**
    * The labels are placed adjacent to the axis. When the axis itself is placed at the minimum or maximum of the scale ( that is when the property
    * CrossoverPosition equals ChartAxisPosition_MINIMUM or ChartAxisPosition_MAXIMUM) the labels are placed outside the coordinate system. Otherwise the
    * labels are placed adjacent to the axis on that side that belongs to the lower values on the crossing axis. E.g. when the ChartAxisLabelPosition is set
    * to NEAR_AXIS for an y axis the labels are placed adjacent to the y axis on that side that belongs to the lower x values.
    */
  inline def NEAR_AXIS: `0` = 0.asInstanceOf[`0`]
  
  /** The labels are placed adjacent to the axis on the opposite side as for NEAR_AXIS. */
  inline def NEAR_AXIS_OTHER_SIDE: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its maximum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its maximum value.
    */
  inline def OUTSIDE_END: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The labels are placed outside the coordinate region on that side where the crossing axis has its minimum value. E.g. when this is set for an y axis
    * the labels are placed outside the diagram on that side where to the x axis has its minimum value.
    */
  inline def OUTSIDE_START: `2` = 2.asInstanceOf[`2`]
}
