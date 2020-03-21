package typingsJapgolly.jestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Filter = js.Function1[
    /* testPaths */ js.Array[java.lang.String], 
    js.Promise[typingsJapgolly.jestCore.AnonFiltered]
  ]
  type TestPathCases = js.Array[typingsJapgolly.jestCore.AnonIsMatch]
  type TestRunData = js.Array[typingsJapgolly.jestCore.AnonMatches]
}
