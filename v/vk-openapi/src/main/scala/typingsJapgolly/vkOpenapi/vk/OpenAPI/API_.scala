package typingsJapgolly.vkOpenapi.vk.OpenAPI

import japgolly.scalajs.react.Callback
import typingsJapgolly.vkOpenapi.vk.OpenAPI.Api.API
import typingsJapgolly.vkOpenapi.vk.OpenAPI.Goal.GoalEvent
import typingsJapgolly.vkOpenapi.vk.OpenAPI.Goal.GoalParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait API_ extends StObject {
  
  var Api: API
  
  var Auth: typingsJapgolly.vkOpenapi.vk.OpenAPI.Auth.API
  
  def Goal(goalEvent: GoalEvent): Unit
  def Goal(goalEvent: GoalEvent, goalParams: GoalParams): Unit
  @JSName("Goal")
  var Goal_Original: typingsJapgolly.vkOpenapi.vk.OpenAPI.Goal.API
  
  var Observer: typingsJapgolly.vkOpenapi.vk.OpenAPI.Observer.API
  
  var Retargeting: typingsJapgolly.vkOpenapi.vk.OpenAPI.Retargeting.API
  
  var Widgets: typingsJapgolly.vkOpenapi.vk.OpenAPI.Widgets.API
  
  def init(params: InitParams): Unit
}
object API_ {
  
  inline def apply(
    Api: API,
    Auth: typingsJapgolly.vkOpenapi.vk.OpenAPI.Auth.API,
    Goal: (/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams]) => Callback,
    Observer: typingsJapgolly.vkOpenapi.vk.OpenAPI.Observer.API,
    Retargeting: typingsJapgolly.vkOpenapi.vk.OpenAPI.Retargeting.API,
    Widgets: typingsJapgolly.vkOpenapi.vk.OpenAPI.Widgets.API,
    init: InitParams => Callback
  ): API_ = {
    val __obj = js.Dynamic.literal(Api = Api.asInstanceOf[js.Any], Auth = Auth.asInstanceOf[js.Any], Goal = js.Any.fromFunction2((t0: /* goalEvent */ GoalEvent, t1: /* goalParams */ js.UndefOr[GoalParams]) => (Goal(t0, t1)).runNow()), Observer = Observer.asInstanceOf[js.Any], Retargeting = Retargeting.asInstanceOf[js.Any], Widgets = Widgets.asInstanceOf[js.Any], init = js.Any.fromFunction1((t0: InitParams) => init(t0).runNow()))
    __obj.asInstanceOf[API_]
  }
  
  extension [Self <: API_](x: Self) {
    
    inline def setApi(value: API): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: typingsJapgolly.vkOpenapi.vk.OpenAPI.Auth.API): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    inline def setGoal(value: (/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams]) => Callback): Self = StObject.set(x, "Goal", js.Any.fromFunction2((t0: /* goalEvent */ GoalEvent, t1: /* goalParams */ js.UndefOr[GoalParams]) => (value(t0, t1)).runNow()))
    
    inline def setInit(value: InitParams => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: InitParams) => value(t0).runNow()))
    
    inline def setObserver(value: typingsJapgolly.vkOpenapi.vk.OpenAPI.Observer.API): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
    
    inline def setRetargeting(value: typingsJapgolly.vkOpenapi.vk.OpenAPI.Retargeting.API): Self = StObject.set(x, "Retargeting", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: typingsJapgolly.vkOpenapi.vk.OpenAPI.Widgets.API): Self = StObject.set(x, "Widgets", value.asInstanceOf[js.Any])
  }
}
