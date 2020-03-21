package typingsJapgolly.jestAxe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IToHaveNoViolations = js.Function1[
    /* results */ js.UndefOr[typingsJapgolly.jestAxe.PartialAxeResults], 
    typingsJapgolly.jestAxe.mod.AssertionsResult
  ]
  type JestAxe = js.Function2[
    /* html */ org.scalajs.dom.raw.Element | java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.jestAxe.mod.AxeOptions], 
    js.Promise[typingsJapgolly.axeCore.mod.AxeResults]
  ]
}
