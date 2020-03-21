package typingsJapgolly.parchment.storeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.parchment.blotMod.Formattable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/store", JSImport.Default)
@js.native
class default protected () extends AttributorStore {
  def this(domNode: HTMLElement) = this()
  /* CompleteClass */
  override var attributes: js.Any = js.native
  /* CompleteClass */
  override var domNode: js.Any = js.native
  /* CompleteClass */
  override def attribute(attribute: typingsJapgolly.parchment.attributorMod.default, value: js.Any): Unit = js.native
  /* CompleteClass */
  override def build(): Unit = js.native
  /* CompleteClass */
  override def copy(target: Formattable): Unit = js.native
  /* CompleteClass */
  override def move(target: Formattable): Unit = js.native
  /* CompleteClass */
  override def values(): StringDictionary[js.Any] = js.native
}

