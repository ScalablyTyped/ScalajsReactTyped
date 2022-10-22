package typingsJapgolly.winjs.WinJS.Utilities

import japgolly.scalajs.react.Callback
import typingsJapgolly.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions and objects for scheduling and managing asynchronous tasks.
**/
object Scheduler {
  
  @js.native
  sealed trait Priority extends StObject
  //#region Enumerations
  /**
    * Represents a priority for a job managed by the Scheduler.
    **/
  @JSGlobal("WinJS.Utilities.Scheduler.Priority")
  @js.native
  object Priority extends StObject {
    
    /**
      * A priority higher than the normal priority level.
      **/
    @js.native
    sealed trait aboveNormal
      extends StObject
         with Priority
    
    /**
      * A priority less than the normal priority level.
      **/
    @js.native
    sealed trait belowNormal
      extends StObject
         with Priority
    
    /**
      * A high priority.
      **/
    @js.native
    sealed trait high
      extends StObject
         with Priority
    
    /**
      * The idle priority for work items.
      **/
    @js.native
    sealed trait idle
      extends StObject
         with Priority
    
    /**
      * The highest priority.
      **/
    @js.native
    sealed trait max
      extends StObject
         with Priority
    
    /**
      * The lowest priority.
      **/
    @js.native
    sealed trait min
      extends StObject
         with Priority
    
    /**
      * The normal priority for work items.
      **/
    @js.native
    sealed trait normal
      extends StObject
         with Priority
  }
  
  //#endregion Enumerations
  //#region Interfaces
  /**
    * Represents a work item that's executed by the Scheduler.
    **/
  trait IJob extends StObject {
    
    //#region Methods
    /**
      * Cancels the job.
      **/
    def cancel(): Unit
    
    //#endregion Methods
    //#region Properties
    /**
      * Gets a value that indicates whether the job has successfully completed.
      **/
    var completed: Boolean
    
    /**
      * Gets the unique numeric identifier assigned to the job.
      **/
    var id: Double
    
    /**
      * Gets or sets the name of the job.
      **/
    var name: String
    
    /**
      * Gets or sets the owner of the job.
      **/
    var owner: IOwnerToken
    
    /**
      * Pauses the job.
      **/
    def pause(): Unit
    
    /**
      * Gets or sets the priority of the job.
      **/
    var priority: Priority
    
    /**
      * Resumes the job.
      **/
    def resume(): Unit
  }
  object IJob {
    
    inline def apply(
      cancel: Callback,
      completed: Boolean,
      id: Double,
      name: String,
      owner: IOwnerToken,
      pause: Callback,
      priority: Priority,
      resume: Callback
    ): IJob = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, completed = completed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pause = pause.toJsFn, priority = priority.asInstanceOf[js.Any], resume = resume.toJsFn)
      __obj.asInstanceOf[IJob]
    }
    
    extension [Self <: IJob](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: IOwnerToken): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    }
  }
  
  /**
    * Provides a control mechanism that allows a job to cooperatively yield. This object is passed to your work function when you schedule it.
    **/
  trait IJobInfo extends StObject {
    
    //#endregion Methods
    //#region Properties
    /**
      * Gets the work item associated with this IJobInfo.
      **/
    var job: IJob
    
    //#region Methods
    /**
      * Uses a Promise to determine how long the scheduler should wait before rescheduling the job after it yields.
      * @param promise Once the work item yields, the scheduler will wait for this Promise to complete before rescheduling the job.
      **/
    def setPromise(promise: Promise[Any]): Unit
    
    /**
      * Specifies the next unit of work to run once this job yields.
      * @param work The next unit of work to run once this job yields.
      **/
    def setWork(work: js.Function): Unit
    
    /**
      * Gets a value that specifies whether the job should yield.
      **/
    var shouldYield: Boolean
  }
  object IJobInfo {
    
    inline def apply(
      job: IJob,
      setPromise: Promise[Any] => Callback,
      setWork: js.Function => Callback,
      shouldYield: Boolean
    ): IJobInfo = {
      val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], setPromise = js.Any.fromFunction1((t0: Promise[Any]) => setPromise(t0).runNow()), setWork = js.Any.fromFunction1((t0: js.Function) => setWork(t0).runNow()), shouldYield = shouldYield.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJobInfo]
    }
    
    extension [Self <: IJobInfo](x: Self) {
      
      inline def setJob(value: IJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      inline def setSetPromise(value: Promise[Any] => Callback): Self = StObject.set(x, "setPromise", js.Any.fromFunction1((t0: Promise[Any]) => value(t0).runNow()))
      
      inline def setSetWork(value: js.Function => Callback): Self = StObject.set(x, "setWork", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setShouldYield(value: Boolean): Self = StObject.set(x, "shouldYield", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an object that owns jobs. You can use this object to cancel a set of jobs.
    **/
  trait IOwnerToken extends StObject {
    
    //#region Methods
    /**
      * Synchronously cancels the job that this token owns, including paused and blocked jobs.
      **/
    def cancelAll(): Unit
  }
  object IOwnerToken {
    
    inline def apply(cancelAll: Callback): IOwnerToken = {
      val __obj = js.Dynamic.literal(cancelAll = cancelAll.toJsFn)
      __obj.asInstanceOf[IOwnerToken]
    }
    
    extension [Self <: IOwnerToken](x: Self) {
      
      inline def setCancelAll(value: Callback): Self = StObject.set(x, "cancelAll", value.toJsFn)
    }
  }
}
