package typingsJapgolly.onfleetNodeOnfleet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`0`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`10`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`12`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`13`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`14`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`1`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`2`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`3`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`4`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`5`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`6`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`7`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`8`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`9`
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated
import typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesWebhooksMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Webhook {
    
    /* CompleteClass */
    override def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
    
    /* CompleteClass */
    override def deleteOne(id: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
  }
  
  @js.native
  sealed trait WebhookTriggerName extends StObject
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", "WebhookTriggerName")
  @js.native
  object WebhookTriggerName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebhookTriggerName & String] = js.native
    
    @js.native
    sealed trait SmsRecipientResponseMissed
      extends StObject
         with WebhookTriggerName
    /* "smsRecipientResponseMissed" */ val SmsRecipientResponseMissed: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed & String = js.native
    
    @js.native
    sealed trait TaskArrival
      extends StObject
         with WebhookTriggerName
    /* "taskArrival" */ val TaskArrival: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival & String = js.native
    
    @js.native
    sealed trait TaskAssigned
      extends StObject
         with WebhookTriggerName
    /* "taskAssigned" */ val TaskAssigned: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned & String = js.native
    
    @js.native
    sealed trait TaskCloned
      extends StObject
         with WebhookTriggerName
    /* "taskCloned" */ val TaskCloned: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned & String = js.native
    
    @js.native
    sealed trait TaskCompleted
      extends StObject
         with WebhookTriggerName
    /* "taskCompleted" */ val TaskCompleted: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted & String = js.native
    
    @js.native
    sealed trait TaskCreated
      extends StObject
         with WebhookTriggerName
    /* "taskCreated" */ val TaskCreated: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated & String = js.native
    
    @js.native
    sealed trait TaskDelayed
      extends StObject
         with WebhookTriggerName
    /* "taskDelayed" */ val TaskDelayed: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed & String = js.native
    
    @js.native
    sealed trait TaskDeleted
      extends StObject
         with WebhookTriggerName
    /* "taskDeleted" */ val TaskDeleted: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted & String = js.native
    
    @js.native
    sealed trait TaskEta
      extends StObject
         with WebhookTriggerName
    /* "taskEta" */ val TaskEta: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta & String = js.native
    
    @js.native
    sealed trait TaskFailed
      extends StObject
         with WebhookTriggerName
    /* "taskFailed" */ val TaskFailed: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed & String = js.native
    
    @js.native
    sealed trait TaskStarted
      extends StObject
         with WebhookTriggerName
    /* "taskStarted" */ val TaskStarted: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted & String = js.native
    
    @js.native
    sealed trait TaskUnassigned
      extends StObject
         with WebhookTriggerName
    /* "taskUnassigned" */ val TaskUnassigned: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned & String = js.native
    
    @js.native
    sealed trait TaskUpdated
      extends StObject
         with WebhookTriggerName
    /* "taskUpdated" */ val TaskUpdated: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated & String = js.native
    
    @js.native
    sealed trait WorkerDuty
      extends StObject
         with WebhookTriggerName
    /* "workerDuty" */ val WorkerDuty: typingsJapgolly.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty & String = js.native
  }
  
  trait GetWebhookResult
    extends StObject
       with WebhookResult {
    
    var isEnabled: Boolean
  }
  object GetWebhookResult {
    
    inline def apply(
      count: Double,
      id: String,
      isEnabled: Boolean,
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): GetWebhookResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebhookResult]
    }
    
    extension [Self <: GetWebhookResult](x: Self) {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnfleetWebhook extends StObject {
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`
    
    var url: String
  }
  object OnfleetWebhook {
    
    inline def apply(
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): OnfleetWebhook = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetWebhook]
    }
    
    extension [Self <: OnfleetWebhook](x: Self) {
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Webhook extends StObject {
    
    def create(webhook: OnfleetWebhook): js.Promise[WebhookResult]
    
    def deleteOne(id: String): js.Promise[Unit]
    
    def get(): js.Promise[js.Array[GetWebhookResult]]
  }
  object Webhook {
    
    inline def apply(
      create: OnfleetWebhook => js.Promise[WebhookResult],
      deleteOne: String => js.Promise[Unit],
      get: CallbackTo[js.Promise[js.Array[GetWebhookResult]]]
    ): Webhook = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = get.toJsFn)
      __obj.asInstanceOf[Webhook]
    }
    
    extension [Self <: Webhook](x: Self) {
      
      inline def setCreate(value: OnfleetWebhook => js.Promise[WebhookResult]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDeleteOne(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteOne", js.Any.fromFunction1(value))
      
      inline def setGet(value: CallbackTo[js.Promise[js.Array[GetWebhookResult]]]): Self = StObject.set(x, "get", value.toJsFn)
    }
  }
  
  trait WebhookResult extends StObject {
    
    var count: Double
    
    var id: String
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`
    
    var url: String
  }
  object WebhookResult {
    
    inline def apply(
      count: Double,
      id: String,
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): WebhookResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResult]
    }
    
    extension [Self <: WebhookResult](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerId
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerName
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerIdTriggerName
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskFailed
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCreated
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCloned
    - typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed
  */
  trait WebhookTriggerType extends StObject
  object WebhookTriggerType {
    
    inline def TriggerId(triggerName: TaskStarted): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerId = {
      val __obj = js.Dynamic.literal(triggerId = 0, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerId]
    }
    
    inline def TriggerIdTriggerName(triggerName: TaskArrival): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerIdTriggerName = {
      val __obj = js.Dynamic.literal(triggerId = 2, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerIdTriggerName]
    }
    
    inline def TriggerName(triggerName: TaskEta): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerName = {
      val __obj = js.Dynamic.literal(triggerId = 1, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerName]
    }
    
    inline def TriggerNameSmsRecipientResponseMissed(triggerName: SmsRecipientResponseMissed): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed = {
      val __obj = js.Dynamic.literal(triggerId = 14, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed]
    }
    
    inline def TriggerNameTaskAssigned(triggerName: TaskAssigned): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned = {
      val __obj = js.Dynamic.literal(triggerId = 9, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned]
    }
    
    inline def TriggerNameTaskCloned(triggerName: TaskCloned): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCloned = {
      val __obj = js.Dynamic.literal(triggerId = 13, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCloned]
    }
    
    inline def TriggerNameTaskCompleted(triggerName: TaskCompleted): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted = {
      val __obj = js.Dynamic.literal(triggerId = 3, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted]
    }
    
    inline def TriggerNameTaskCreated(triggerName: TaskCreated): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCreated = {
      val __obj = js.Dynamic.literal(triggerId = 6, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskCreated]
    }
    
    inline def TriggerNameTaskDelayed(triggerName: TaskDelayed): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed = {
      val __obj = js.Dynamic.literal(triggerId = 12, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed]
    }
    
    inline def TriggerNameTaskDeleted(triggerName: TaskDeleted): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted = {
      val __obj = js.Dynamic.literal(triggerId = 8, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted]
    }
    
    inline def TriggerNameTaskFailed(triggerName: TaskFailed): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskFailed = {
      val __obj = js.Dynamic.literal(triggerId = 4, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskFailed]
    }
    
    inline def TriggerNameTaskUnassigned(triggerName: TaskUnassigned): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned = {
      val __obj = js.Dynamic.literal(triggerId = 10, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned]
    }
    
    inline def TriggerNameTaskUpdated(triggerName: TaskUpdated): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated = {
      val __obj = js.Dynamic.literal(triggerId = 7, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated]
    }
    
    inline def TriggerNameWorkerDuty(triggerName: WorkerDuty): typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty = {
      val __obj = js.Dynamic.literal(triggerId = 5, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty]
    }
  }
}
