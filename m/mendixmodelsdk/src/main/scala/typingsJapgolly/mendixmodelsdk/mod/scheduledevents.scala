package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "scheduledevents")
@js.native
object scheduledevents extends js.Object {
  @js.native
  class IntervalType ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.scheduledevents.IntervalType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
    */
  @js.native
  class ScheduledEvent protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.scheduledevents.ScheduledEvent {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class TimeZoneEnum ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.scheduledevents.TimeZoneEnum
  
  /* static members */
  @js.native
  object IntervalType extends js.Object {
    var Day: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Hour: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Minute: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Month: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Second: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Week: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    var Year: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
  }
  
  /* static members */
  @js.native
  object ScheduledEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent = js.native
  }
  
  /* static members */
  @js.native
  object TimeZoneEnum extends js.Object {
    var Server: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    var UTC: typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
  }
  
}

