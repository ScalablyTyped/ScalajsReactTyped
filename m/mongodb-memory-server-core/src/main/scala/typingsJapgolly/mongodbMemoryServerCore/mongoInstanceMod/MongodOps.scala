package typingsJapgolly.mongodbMemoryServerCore.mongoInstanceMod

import typingsJapgolly.mongodbMemoryServerCore.AnonArgs
import typingsJapgolly.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsJapgolly.mongodbMemoryServerCore.typesMod.DebugPropT
import typingsJapgolly.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongodOps extends js.Object {
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var debug: js.UndefOr[DebugPropT] = js.undefined
  var instance: AnonArgs
  var spawn: js.UndefOr[SpawnOptions] = js.undefined
}

object MongodOps {
  @scala.inline
  def apply(
    instance: AnonArgs,
    binary: MongoBinaryOpts = null,
    debug: DebugPropT = null,
    spawn: SpawnOptions = null
  ): MongodOps = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongodOps]
  }
}

