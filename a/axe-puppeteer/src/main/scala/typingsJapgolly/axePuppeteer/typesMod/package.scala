package typingsJapgolly.axePuppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnalyzeCB = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsJapgolly.axeCore.mod.AxeResults], 
    scala.Unit
  ]
}
