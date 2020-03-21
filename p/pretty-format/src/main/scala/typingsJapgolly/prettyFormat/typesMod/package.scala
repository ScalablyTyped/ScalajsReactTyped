package typingsJapgolly.prettyFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Indent = js.Function1[/* arg0 */ java.lang.String, java.lang.String]
  type Plugins = js.Array[typingsJapgolly.prettyFormat.typesMod.Plugin]
  type Print = js.Function1[/* arg0 */ js.Any, java.lang.String]
  type Printer = js.Function6[
    /* val */ js.Any, 
    /* config */ typingsJapgolly.prettyFormat.typesMod.Config, 
    /* indentation */ java.lang.String, 
    /* depth */ scala.Double, 
    /* refs */ typingsJapgolly.prettyFormat.typesMod.Refs, 
    /* hasCalledToJSON */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ]
  type Refs = js.Array[js.Any]
  type Test = js.Function1[/* arg0 */ js.Any, scala.Boolean]
}
