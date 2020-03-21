package typingsJapgolly.cucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHook = js.Function2[
    /* event */ typingsJapgolly.cucumber.mod.events.Event, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type GlobalHookCode = js.Function1[
    /* callback */ js.UndefOr[typingsJapgolly.cucumber.mod.CallbackStepDefinition], 
    scala.Unit
  ]
  type HookCode = js.ThisFunction2[
    /* this */ typingsJapgolly.cucumber.mod.World, 
    /* scenario */ typingsJapgolly.cucumber.mod.HookScenarioResult, 
    /* callback */ js.UndefOr[typingsJapgolly.cucumber.mod.CallbackStepDefinition], 
    scala.Unit
  ]
  type StepDefinitionCode = js.ThisFunction1[/* this */ typingsJapgolly.cucumber.mod.World, /* repeated */ js.Any, js.Any]
  type SupportCodeConsumer = js.Function1[
    /* stepDefinitions */ typingsJapgolly.cucumber.mod.StepDefinitions with typingsJapgolly.cucumber.mod.Hooks, 
    scala.Unit
  ]
  type World = org.scalablytyped.runtime.StringDictionary[js.Any]
}
