package typingsJapgolly.agenda

import typingsJapgolly.agenda.distAgendaMod.AgendaConfig
import typingsJapgolly.agenda.distJobMod.JobAttributes
import typingsJapgolly.agenda.distJobMod.JobAttributesData
import typingsJapgolly.mongodb.mod.AnyError
import typingsJapgolly.mongodb.mod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @class Agenda
    * @param {Object} config - Agenda Config
    * @param {Function} cb - Callback after Agenda has started and connected to mongo
    * @property {Object} _name - Name of the current Agenda queue
    * @property {Number} _processEvery
    * @property {Number} _defaultConcurrency
    * @property {Number} _maxConcurrency
    * @property {Number} _defaultLockLimit
    * @property {Number} _lockLimit
    * @property {Object} _definitions
    * @property {Object} _runningJobs
    * @property {Object} _lockedJobs
    * @property {Object} _jobQueue
    * @property {Number} _defaultLockLifetime
    * @property {Object} _sort
    * @property {Object} _indices
    * @property {Boolean} _isLockingOnTheFly - true if 'lockingOnTheFly' is currently running. Prevent concurrent execution of this method.
    * @property {Map} _isJobQueueFilling - A map of jobQueues and if the 'jobQueueFilling' method is currently running for a given map. 'lockingOnTheFly' and 'jobQueueFilling' should not run concurrently for the same jobQueue. It can cause that lock limits aren't honored.
    * @property {Array} _jobsToLock
    */
  @JSImport("agenda", JSImport.Default)
  @js.native
  /**
    * Constructs a new Agenda object.
    * @param config Optional configuration to initialize the Agenda.
    * @param cb Optional callback called with the MongoDB collection.
    */
  open class default ()
    extends typingsJapgolly.agenda.distAgendaMod.Agenda {
    def this(config: AgendaConfig) = this()
    def this(
      config: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
    def this(
      config: AgendaConfig,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
  }
  
  /**
    * @class Agenda
    * @param {Object} config - Agenda Config
    * @param {Function} cb - Callback after Agenda has started and connected to mongo
    * @property {Object} _name - Name of the current Agenda queue
    * @property {Number} _processEvery
    * @property {Number} _defaultConcurrency
    * @property {Number} _maxConcurrency
    * @property {Number} _defaultLockLimit
    * @property {Number} _lockLimit
    * @property {Object} _definitions
    * @property {Object} _runningJobs
    * @property {Object} _lockedJobs
    * @property {Object} _jobQueue
    * @property {Number} _defaultLockLifetime
    * @property {Object} _sort
    * @property {Object} _indices
    * @property {Boolean} _isLockingOnTheFly - true if 'lockingOnTheFly' is currently running. Prevent concurrent execution of this method.
    * @property {Map} _isJobQueueFilling - A map of jobQueues and if the 'jobQueueFilling' method is currently running for a given map. 'lockingOnTheFly' and 'jobQueueFilling' should not run concurrently for the same jobQueue. It can cause that lock limits aren't honored.
    * @property {Array} _jobsToLock
    */
  @JSImport("agenda", "Agenda")
  @js.native
  /**
    * Constructs a new Agenda object.
    * @param config Optional configuration to initialize the Agenda.
    * @param cb Optional callback called with the MongoDB collection.
    */
  open class Agenda ()
    extends typingsJapgolly.agenda.distAgendaMod.Agenda {
    def this(config: AgendaConfig) = this()
    def this(
      config: Unit,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
    def this(
      config: AgendaConfig,
      cb: js.Function2[/* error */ js.UndefOr[AnyError], /* collection */ Collection[Any] | Null, Unit]
    ) = this()
  }
  
  /**
    * @class
    * @param {Object} args - Job Options
    * @property {Object} agenda - The Agenda instance
    * @property {Object} attrs
    */
  @JSImport("agenda", "Job")
  @js.native
  open class Job[T /* <: JobAttributesData */] protected ()
    extends typingsJapgolly.agenda.distJobMod.Job[T] {
    def this(options: JobAttributes[T]) = this()
  }
  
  @JSImport("agenda", "JobPriority")
  @js.native
  object JobPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.agenda.distAgendaDefineMod.JobPriority & Double] = js.native
    
    /* 10 */ val high: typingsJapgolly.agenda.distAgendaDefineMod.JobPriority.high & Double = js.native
    
    /* 20 */ val highest: typingsJapgolly.agenda.distAgendaDefineMod.JobPriority.highest & Double = js.native
    
    /* -10 */ val low: typingsJapgolly.agenda.distAgendaDefineMod.JobPriority.low & Double = js.native
    
    /* -20 */ val lowest: typingsJapgolly.agenda.distAgendaDefineMod.JobPriority.lowest & Double = js.native
    
    /* 0 */ val normal: typingsJapgolly.agenda.distAgendaDefineMod.JobPriority.normal & Double = js.native
  }
}
