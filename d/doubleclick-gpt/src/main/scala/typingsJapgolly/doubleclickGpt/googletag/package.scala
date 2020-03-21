package typingsJapgolly.doubleclickGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googletag {
  type GeneralSize = typingsJapgolly.doubleclickGpt.googletag.SingleSize | typingsJapgolly.doubleclickGpt.googletag.MultiSize
  type MultiSize = js.Array[typingsJapgolly.doubleclickGpt.googletag.SingleSize]
  type NamedSize = java.lang.String | js.Array[java.lang.String]
  type SingleSize = typingsJapgolly.doubleclickGpt.googletag.SingleSizeArray | typingsJapgolly.doubleclickGpt.googletag.NamedSize
  type SingleSizeArray = js.Array[scala.Double]
  type SizeMapping = js.Array[typingsJapgolly.doubleclickGpt.googletag.GeneralSize]
  type SizeMappingArray = js.Array[typingsJapgolly.doubleclickGpt.googletag.SizeMapping]
}
