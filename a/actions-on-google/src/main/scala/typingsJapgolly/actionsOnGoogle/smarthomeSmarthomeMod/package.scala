package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object smarthomeSmarthomeMod {
  type SmartHomeHandler[TRequest /* <: typingsJapgolly.actionsOnGoogle.apiV1Mod.SmartHomeV1Request */, TResponse /* <: typingsJapgolly.actionsOnGoogle.apiV1Mod.SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* framework */ typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  type SmartHomeHandlers = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeHandler[
      typingsJapgolly.actionsOnGoogle.apiV1Mod.SmartHomeV1Request, 
      typingsJapgolly.actionsOnGoogle.apiV1Mod.SmartHomeV1Response
    ]
  ]
  type SmartHome_ = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeOptions], 
    typingsJapgolly.actionsOnGoogle.assistantMod.AppHandler with typingsJapgolly.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeApp
  ]
}
