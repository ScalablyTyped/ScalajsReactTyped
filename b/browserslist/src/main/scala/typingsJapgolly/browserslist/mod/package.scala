package typingsJapgolly.browserslist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** statistics from `Browserslist` files */
  type MyStats = typingsJapgolly.browserslist.browserslistStrings.`my stats`
  type Stats = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]]
  /**
    * Which statistics should be used.
    * Country code or custom statistics.
    * Pass `"my stats"` to load statistics
    * from `Browserslist` files
    */
  type StatsOptions = java.lang.String | typingsJapgolly.browserslist.mod.MyStats | typingsJapgolly.browserslist.mod.Stats
}
