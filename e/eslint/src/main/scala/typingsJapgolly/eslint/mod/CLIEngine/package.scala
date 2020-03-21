package typingsJapgolly.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CLIEngine {
  type Formatter = js.Function2[
    /* results */ js.Array[typingsJapgolly.eslint.mod.CLIEngine.LintResult], 
    /* data */ js.UndefOr[typingsJapgolly.eslint.mod.CLIEngine.LintResultData], 
    java.lang.String
  ]
}
