package typingsJapgolly.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Stats {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.webpack.webpackStrings.`errors-only`
    - typingsJapgolly.webpack.webpackStrings.`errors-warnings`
    - typingsJapgolly.webpack.webpackStrings.minimal
    - typingsJapgolly.webpack.webpackStrings.none
    - typingsJapgolly.webpack.webpackStrings.normal
    - typingsJapgolly.webpack.webpackStrings.verbose
  */
  type Preset = typingsJapgolly.webpack.mod.Stats._Preset | scala.Boolean
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  ]) | js.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webpack.mod.Stats.Preset
    - typingsJapgolly.webpack.mod.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = typingsJapgolly.webpack.mod.Stats._ToJsonOptions | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webpack.mod.Stats.Preset
    - typingsJapgolly.webpack.mod.Stats.ToStringOptionsObject
  */
  type ToStringOptions = typingsJapgolly.webpack.mod.Stats._ToStringOptions | scala.Boolean
}
