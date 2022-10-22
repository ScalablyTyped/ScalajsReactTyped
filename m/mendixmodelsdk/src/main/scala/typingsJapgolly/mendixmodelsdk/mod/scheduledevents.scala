package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduledevents {
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.DaySchedule")
  @js.native
  open class DaySchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.DaySchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DaySchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.DaySchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DaySchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySchedule]
    
    /**
      * Creates and returns a new DaySchedule instance in the SDK and on the server.
      * The new DaySchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.DaySelector")
  @js.native
  open class DaySelector protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.DaySelector {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DaySelector {
    
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector.First")
    @js.native
    def First: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector = js.native
    inline def First_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("First")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector.Fourth")
    @js.native
    def Fourth: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector = js.native
    inline def Fourth_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fourth")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector.Last")
    @js.native
    def Last: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector = js.native
    inline def Last_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector.Second")
    @js.native
    def Second: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector = js.native
    inline def Second_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.DaySelector.Third")
    @js.native
    def Third: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector = js.native
    inline def Third_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Third")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.HourSchedule")
  @js.native
  open class HourSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.HourSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object HourSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.HourSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new HourSchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.HourSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.HourSchedule]
    
    /**
      * Creates and returns a new HourSchedule instance in the SDK and on the server.
      * The new HourSchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.HourSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.HourSchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.HourSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.HourSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.IntervalType")
  @js.native
  open class IntervalType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.IntervalType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IntervalType {
    
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Day")
    @js.native
    def Day: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Day_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Hour")
    @js.native
    def Hour: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Hour_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hour")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Minute")
    @js.native
    def Minute: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Minute_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Month")
    @js.native
    def Month: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Month_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Second")
    @js.native
    def Second: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Second_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Week")
    @js.native
    def Week: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Week_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Year")
    @js.native
    def Year: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Year_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.MinuteSchedule")
  @js.native
  open class MinuteSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.MinuteSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MinuteSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.MinuteSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MinuteSchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MinuteSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MinuteSchedule]
    
    /**
      * Creates and returns a new MinuteSchedule instance in the SDK and on the server.
      * The new MinuteSchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MinuteSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MinuteSchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MinuteSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MinuteSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.MonthDateSchedule")
  @js.native
  open class MonthDateSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.MonthDateSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MonthDateSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.MonthDateSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MonthDateSchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthDateSchedule]
    
    /**
      * Creates and returns a new MonthDateSchedule instance in the SDK and on the server.
      * The new MonthDateSchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthDateSchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthDateSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthDateSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "scheduledevents.MonthSchedule")
  @js.native
  open class MonthSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.MonthSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MonthSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.MonthSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.MonthWeekdaySchedule")
  @js.native
  open class MonthWeekdaySchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.MonthWeekdaySchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MonthWeekdaySchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.MonthWeekdaySchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MonthWeekdaySchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthWeekdaySchedule]
    
    /**
      * Creates and returns a new MonthWeekdaySchedule instance in the SDK and on the server.
      * The new MonthWeekdaySchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.MonthWeekdaySchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthWeekdaySchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.MonthWeekdaySchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.OverlapStrategy")
  @js.native
  open class OverlapStrategy protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.OverlapStrategy {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object OverlapStrategy {
    
    @JSImport("mendixmodelsdk", "scheduledevents.OverlapStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.OverlapStrategy.DelayNext")
    @js.native
    def DelayNext: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.OverlapStrategy = js.native
    inline def DelayNext_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.OverlapStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DelayNext")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.OverlapStrategy.SkipNext")
    @js.native
    def SkipNext: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.OverlapStrategy = js.native
    inline def SkipNext_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.OverlapStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkipNext")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
    */
  /**
    * In version 9.12.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "scheduledevents.Schedule")
  @js.native
  open class Schedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.Schedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Schedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.Schedule")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Schedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Schedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent")
  @js.native
  open class ScheduledEvent protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.ScheduledEvent {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ScheduledEvent {
    
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum")
  @js.native
  open class TimeZoneEnum protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.TimeZoneEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object TimeZoneEnum {
    
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum.Server")
    @js.native
    def Server: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    inline def Server_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum.UTC")
    @js.native
    def UTC: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    inline def UTC_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.WeekSchedule")
  @js.native
  open class WeekSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.WeekSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WeekSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.WeekSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WeekSchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.WeekSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.WeekSchedule]
    
    /**
      * Creates and returns a new WeekSchedule instance in the SDK and on the server.
      * The new WeekSchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.WeekSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.WeekSchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.WeekSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.WeekSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.Weekday")
  @js.native
  open class Weekday protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.Weekday {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object Weekday {
    
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Friday")
    @js.native
    def Friday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Friday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Friday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Monday")
    @js.native
    def Monday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Monday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Monday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Saturday")
    @js.native
    def Saturday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Saturday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Saturday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Sunday")
    @js.native
    def Sunday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Sunday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sunday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Thursday")
    @js.native
    def Thursday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Thursday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thursday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Tuesday")
    @js.native
    def Tuesday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Tuesday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tuesday")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.Weekday.Wednesday")
    @js.native
    def Wednesday: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday = js.native
    inline def Wednesday_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wednesday")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.YearDateSchedule")
  @js.native
  open class YearDateSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.YearDateSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object YearDateSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.YearDateSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new YearDateSchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearDateSchedule]
    
    /**
      * Creates and returns a new YearDateSchedule instance in the SDK and on the server.
      * The new YearDateSchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearDateSchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearDateSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearDateSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "scheduledevents.YearSchedule")
  @js.native
  open class YearSchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.YearSchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object YearSchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.YearSchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearSchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearSchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.12.0: introduced
    */
  @JSImport("mendixmodelsdk", "scheduledevents.YearWeekdaySchedule")
  @js.native
  open class YearWeekdaySchedule protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.scheduledevents.YearWeekdaySchedule {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object YearWeekdaySchedule {
    
    @JSImport("mendixmodelsdk", "scheduledevents.YearWeekdaySchedule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new YearWeekdaySchedule instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearWeekdaySchedule]
    
    /**
      * Creates and returns a new YearWeekdaySchedule instance in the SDK and on the server.
      * The new YearWeekdaySchedule will be automatically stored in the 'schedule' property
      * of the parent ScheduledEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.12.0 and higher
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.ScheduledEvent): typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.YearWeekdaySchedule]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearWeekdaySchedule.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.YearWeekdaySchedule.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenScheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
