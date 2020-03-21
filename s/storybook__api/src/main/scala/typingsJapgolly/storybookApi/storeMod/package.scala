package typingsJapgolly.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storeMod {
  type CallBack = js.Function1[/* s */ typingsJapgolly.storybookApi.mod.State, scala.Unit]
  type GetState = js.Function0[typingsJapgolly.storybookApi.mod.State]
  type InputFnPatch = js.Function1[
    /* s */ typingsJapgolly.storybookApi.mod.State, 
    typingsJapgolly.storybookApi.storeMod.Patch
  ]
  type InputPatch = typingsJapgolly.storybookApi.storeMod.Patch | typingsJapgolly.storybookApi.storeMod.InputFnPatch
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
}
