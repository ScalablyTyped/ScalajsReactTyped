package typingsJapgolly.axeWebdriverjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnalyzeCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* results */ typingsJapgolly.axeWebdriverjs.mod.AxeAnalysis, 
    scala.Unit
  ]
  type DeprecatedAnalyzeCallback = js.Function1[/* results */ typingsJapgolly.axeWebdriverjs.mod.AxeAnalysis, scala.Unit]
}
