package typingsJapgolly.jestUtil

import typingsJapgolly.jestTypes.configMod.ConfigGlobals
import typingsJapgolly.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/installCommonGlobals", JSImport.Namespace)
@js.native
object installCommonGlobalsMod extends js.Object {
  def default(globalObject: Global, globals: ConfigGlobals): Global with ConfigGlobals = js.native
}

