package typingsJapgolly.moonjs.mod

import typingsJapgolly.moonjs.moonjsStrings.Numbersigntext
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElement extends js.Object {
  def apply(tag: String, attrs: Record[String, _]): VDomElement = js.native
  def apply(tag: String, attrs: Record[String, _], metadata: js.Any): VDomElement = js.native
  def apply(tag: String, attrs: Record[String, _], metadata: js.Any, children: String): VDomElement = js.native
  def apply(tag: String, attrs: Record[String, _], metadata: js.Any, children: js.Array[VDomElement]): VDomElement = js.native
  def apply(tag: Instance[js.Object], attrs: Record[String, _]): VDomElement = js.native
  def apply(tag: Instance[js.Object], attrs: Record[String, _], metadata: js.Any): VDomElement = js.native
  def apply(tag: Instance[js.Object], attrs: Record[String, _], metadata: js.Any, children: String): VDomElement = js.native
  def apply(
    tag: Instance[js.Object],
    attrs: Record[String, _],
    metadata: js.Any,
    children: js.Array[VDomElement]
  ): VDomElement = js.native
  def apply(tag: Numbersigntext, attrs: Record[String, _]): VDomElement = js.native
  def apply(tag: Numbersigntext, attrs: Record[String, _], metadata: js.Any): VDomElement = js.native
  def apply(tag: Numbersigntext, attrs: Record[String, _], metadata: js.Any, children: String): VDomElement = js.native
}

