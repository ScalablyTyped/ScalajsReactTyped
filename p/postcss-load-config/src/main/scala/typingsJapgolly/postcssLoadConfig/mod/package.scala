package typingsJapgolly.postcssLoadConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = typingsJapgolly.std.Plugin | (typingsJapgolly.std.Transformer[js.Any, js.Any]) | typingsJapgolly.postcss.mod.Processor
}
