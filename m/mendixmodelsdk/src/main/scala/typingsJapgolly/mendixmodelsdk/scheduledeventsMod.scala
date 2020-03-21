package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/scheduledevents", JSImport.Namespace)
@js.native
object scheduledeventsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object scheduledevents extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
      */
    @js.native
    trait IScheduledEvent extends IDocument
    
    @js.native
    class IntervalType () extends AbstractEnum
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class ScheduledEvent protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FScheduledEvent: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MScheduledEvent(): FolderBase = js.native
      def enabled(): Boolean = js.native
      def enabled(newValue: Boolean): js.Any = js.native
      def interval(): Double = js.native
      def interval(newValue: Double): js.Any = js.native
      def intervalType(): IntervalType = js.native
      def intervalType(newValue: IntervalType): js.Any = js.native
      def microflow(): js.Any = js.native
      def microflow(newValue: IMicroflow): js.Any = js.native
      def microflowQualifiedName(): String | Null = js.native
      @JSName("microflow")
      def microflow_Union(): IMicroflow | Null = js.native
      def startDateTime(): String = js.native
      def startDateTime(newValue: String): js.Any = js.native
      def timeZone(): TimeZoneEnum = js.native
      def timeZone(newValue: TimeZoneEnum): js.Any = js.native
    }
    
    @js.native
    class TimeZoneEnum () extends AbstractEnum
    
    /* static members */
    @js.native
    object IntervalType extends js.Object {
      var Day: IntervalType = js.native
      var Hour: IntervalType = js.native
      var Minute: IntervalType = js.native
      var Month: IntervalType = js.native
      var Second: IntervalType = js.native
      var Week: IntervalType = js.native
      var Year: IntervalType = js.native
    }
    
    /* static members */
    @js.native
    object ScheduledEvent extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ScheduledEvent unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ScheduledEvent = js.native
    }
    
    /* static members */
    @js.native
    object TimeZoneEnum extends js.Object {
      var Server: TimeZoneEnum = js.native
      var UTC: TimeZoneEnum = js.native
    }
    
  }
  
}

