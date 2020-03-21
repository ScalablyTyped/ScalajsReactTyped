package typingsJapgolly.scriptExtHtmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ScriptMatchingPattern = typingsJapgolly.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typingsJapgolly.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type ScriptMatchingPatternPre = typingsJapgolly.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typingsJapgolly.scriptExtHtmlWebpackPlugin.ScriptMatchingPatternHash
}
