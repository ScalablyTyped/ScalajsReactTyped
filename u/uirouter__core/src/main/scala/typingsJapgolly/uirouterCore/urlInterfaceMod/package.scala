package typingsJapgolly.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urlInterfaceMod {
  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[typingsJapgolly.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typingsJapgolly.uirouterCore.routerMod.UIRouter], 
    java.lang.String | typingsJapgolly.uirouterCore.stateMod.TargetState | typingsJapgolly.uirouterCore.stateInterfaceMod.TargetStateDef | scala.Unit
  ]
  type UrlRuleMatchFn = js.Function2[
    /* url */ js.UndefOr[typingsJapgolly.uirouterCore.urlInterfaceMod.UrlParts], 
    /* router */ js.UndefOr[typingsJapgolly.uirouterCore.routerMod.UIRouter], 
    js.Any
  ]
}
