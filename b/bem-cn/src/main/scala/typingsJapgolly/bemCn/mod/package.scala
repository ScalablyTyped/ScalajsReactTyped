package typingsJapgolly.bemCn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BemCn = js.Function1[/* blockName */ java.lang.String, typingsJapgolly.bemCn.mod.Block_]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsJapgolly.bemCn.mod.BemBlock
    - typingsJapgolly.bemCn.AnonToString
    - `js.undefined`
  */
  type BemMix = js.UndefOr[
    typingsJapgolly.bemCn.mod._BemMix | js.Array[java.lang.String] | java.lang.String
  ]
  type BemMods = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | js.Any]
  type BemState = typingsJapgolly.std.Record[java.lang.String, scala.Boolean]
  type Block_ = typingsJapgolly.bemCn.mod.IBlock with java.lang.String
}
