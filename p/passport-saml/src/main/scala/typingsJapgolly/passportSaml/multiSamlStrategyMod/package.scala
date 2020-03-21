package typingsJapgolly.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  type SamlOptionsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* samlOptions */ js.UndefOr[typingsJapgolly.passportSaml.mod.SamlConfig], 
    scala.Unit
  ]
}
