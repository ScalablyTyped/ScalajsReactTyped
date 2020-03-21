package typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPlugin {
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[
    /* plugin */ typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin, 
    typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
  ]
}
