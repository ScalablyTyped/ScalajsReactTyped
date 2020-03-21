package typingsJapgolly.storybookAddonKnobs.knobStoreMod

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.storybookAddonKnobs.AnonDefaultValue
import typingsJapgolly.storybookAddonKnobs.typeanygroupIdstringundef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/KnobStore", JSImport.Default)
@js.native
class default () extends KnobStore {
  /* CompleteClass */
  override var callbacks: js.Array[Callback] = js.native
  /* CompleteClass */
  override var store: Record[String, KnobStoreKnob] = js.native
  /* CompleteClass */
  override def get(key: String): typeanygroupIdstringundef | AnonDefaultValue = js.native
  /* CompleteClass */
  override def getAll(): Record[String, KnobStoreKnob] = js.native
  /* CompleteClass */
  override def has(key: String): Boolean = js.native
  /* CompleteClass */
  override def markAllUnused(): Unit = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def set(key: String, value: KnobStoreKnob): Unit = js.native
  /* CompleteClass */
  override def subscribe(cb: Callback): Unit = js.native
  /* CompleteClass */
  override def unsubscribe(cb: Callback): Unit = js.native
  /* CompleteClass */
  override def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
}

