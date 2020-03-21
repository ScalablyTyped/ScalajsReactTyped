package typingsJapgolly.conventionalRecommendedBump.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type WhatBump = js.Function1[
    /* commits */ js.Array[
      typingsJapgolly.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol]
    ], 
    typingsJapgolly.conventionalRecommendedBump.mod.Options.WhatBump.Result
  ]
}
