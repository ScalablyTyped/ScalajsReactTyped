package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object valueMod {
  type Value = scala.Double | java.lang.String | typingsJapgolly.popmotion.valueMod.ValueMap | typingsJapgolly.popmotion.valueMod.ValueList
  type ValueList = js.Array[scala.Double | java.lang.String]
  type ValueMap = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
}
