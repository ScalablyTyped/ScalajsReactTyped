package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object assistantMod {
  type AppHandler = typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.OmniHandler with typingsJapgolly.actionsOnGoogle.assistantMod.BaseApp
  type Plugin[TService, TPlugin] = js.Function1[
    /* app */ typingsJapgolly.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any, 
    (typingsJapgolly.actionsOnGoogle.assistantMod.AppHandler with TService with js.Any with TPlugin) | scala.Unit
  ]
}
