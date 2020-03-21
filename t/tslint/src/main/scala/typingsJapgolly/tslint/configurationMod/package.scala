package typingsJapgolly.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configurationMod {
  type RawRuleConfig = js.UndefOr[
    scala.Null | scala.Boolean | js.Array[js.Any] | typingsJapgolly.tslint.AnonSeverity
  ]
  type RawRulesConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.tslint.configurationMod.RawRuleConfig]
}
