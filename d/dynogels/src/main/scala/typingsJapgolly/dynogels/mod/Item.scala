package typingsJapgolly.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  def destroy(): Unit = js.native
  def destroy(callback: DynogelsItemCallback): Unit = js.native
  def destroy(options: DestroyItemOptions): Unit = js.native
  def destroy(options: DestroyItemOptions, callback: DynogelsItemCallback): Unit = js.native
  def get(): StringDictionary[js.Any] = js.native
  def get(key: String): js.Any = js.native
  def save(): Unit = js.native
  def save(callback: DynogelsItemCallback): Unit = js.native
  def set(params: js.Object): Item = js.native
  def toJSON(): js.Any = js.native
  def toPlainObject(): js.Any = js.native
  def update(): Unit = js.native
  def update(callback: DynogelsItemCallback): Unit = js.native
  def update(options: UpdateItemOptions): Unit = js.native
  def update(options: UpdateItemOptions, callback: DynogelsItemCallback): Unit = js.native
}

