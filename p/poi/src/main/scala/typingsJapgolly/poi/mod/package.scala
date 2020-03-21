package typingsJapgolly.poi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Config = typingsJapgolly.poi.mod.Config_
  type ConfigLoader = typingsJapgolly.poi.mod.ConfigLoader_
  type HookHandler = js.Function2[
    /* config */ typingsJapgolly.webpackChain.mod.^, 
    /* opts */ typingsJapgolly.poi.mod.Opts, 
    scala.Unit
  ]
}
