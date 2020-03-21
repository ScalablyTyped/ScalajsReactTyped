package typingsJapgolly.uirouterAngularjs.mod.core

import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookFn
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsJapgolly.uirouterCore.transitionInterfaceMod.HookRegOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typingsJapgolly.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
  ) = this()
  def this(
    tranSvc: typingsJapgolly.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typingsJapgolly.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
    options: HookRegOptions
  ) = this()
}

