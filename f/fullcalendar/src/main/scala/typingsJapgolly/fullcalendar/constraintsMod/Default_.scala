package typingsJapgolly.fullcalendar.constraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Constraints", "Default")
@js.native
class Default_ protected () extends js.Object {
  def this(eventManager: js.Any, _calendar: js.Any) = this()
  var _calendar: js.Any = js.native
  var eventManager: js.Any = js.native
  def buildCurrentBusinessFootprints(isAllDay: js.Any): js.Array[_] = js.native
  def collectOverlapEventFootprints(peerEventFootprints: js.Any, targetFootprint: js.Any): js.Array[_] = js.native
  def constraintValToFootprints(constraintVal: js.Any, isAllDay: js.Any): js.Array[_] = js.native
  def eventInstancesToFootprints(eventInstances: js.Any): js.Array[_] = js.native
  def eventRangeToEventFootprints(eventRange: js.Any): js.Array[typingsJapgolly.fullcalendar.eventFootprintMod.default] = js.native
  def eventRangesToEventFootprints(eventRanges: js.Any): js.Array[_] = js.native
  def footprintContainsFootprint(outerFootprint: js.Any, innerFootprint: js.Any): js.Any = js.native
  def footprintsIntersect(footprint0: js.Any, footprint1: js.Any): js.Any = js.native
  def getPeerEventInstances(eventDef: js.Any): js.Any = js.native
  def isEventInstanceGroupAllowed(eventInstanceGroup: js.Any): Boolean = js.native
  def isFootprintAllowed(componentFootprint: js.Any, peerEventFootprints: js.Any, constraintVal: js.Any, overlapVal: js.Any): Boolean = js.native
  def isFootprintAllowed(
    componentFootprint: js.Any,
    peerEventFootprints: js.Any,
    constraintVal: js.Any,
    overlapVal: js.Any,
    subjectEventInstance: js.Any
  ): Boolean = js.native
  def isFootprintWithinConstraints(componentFootprint: js.Any, constraintFootprints: js.Any): Boolean = js.native
  def isSelectionFootprintAllowed(componentFootprint: js.Any): Boolean = js.native
  def opt(name: js.Any): js.Any = js.native
  def parseEventDefToInstances(eventInput: js.Any): js.Any = js.native
  def parseFootprints(rawInput: js.Any): js.Array[typingsJapgolly.fullcalendar.componentFootprintMod.default] = js.native
}

