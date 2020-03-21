package typingsJapgolly.stylelintWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter = js.Function2[
    /* messages */ js.Array[typingsJapgolly.stylelintWebpackPlugin.mod.Message], 
    /* source */ java.lang.String, 
    java.lang.String
  ]
  type StylelintWebpackPlugin = typingsJapgolly.webpack.mod.Plugin
}
