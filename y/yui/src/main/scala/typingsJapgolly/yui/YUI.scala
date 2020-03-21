package typingsJapgolly.yui

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.yui.Y.IConfig
import typingsJapgolly.yui.YUITest.IAssert
import typingsJapgolly.yui.YUITest.YUITestStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YUI extends js.Object {
  var Assert: IAssert = js.native
  var Test: YUITestStatic = js.native
  def add(name: String, fn: js.Function2[/* Y */ this.type, /* name */ String, _], version: String): YUI = js.native
  def add(
    name: String,
    fn: js.Function2[/* Y */ this.type, /* name */ String, _],
    version: String,
    details: IConfig
  ): YUI = js.native
  def mix(receiver: js.Function, supplier: js.Function): js.Any = js.native
  def mix(receiver: js.Function, supplier: js.Function, overwrite: Boolean): js.Any = js.native
  def mix(receiver: js.Function, supplier: js.Function, overwrite: Boolean, whitelist: js.Array[String]): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Function,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double
  ): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Function,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double,
    merge: Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Function, supplier: js.Object): js.Any = js.native
  def mix(receiver: js.Function, supplier: js.Object, overwrite: Boolean): js.Any = js.native
  def mix(receiver: js.Function, supplier: js.Object, overwrite: Boolean, whitelist: js.Array[String]): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Object,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double
  ): js.Any = js.native
  def mix(
    receiver: js.Function,
    supplier: js.Object,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double,
    merge: Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Function): js.Any = js.native
  def mix(receiver: js.Object, supplier: js.Function, overwrite: Boolean): js.Any = js.native
  def mix(receiver: js.Object, supplier: js.Function, overwrite: Boolean, whitelist: js.Array[String]): js.Any = js.native
  def mix(
    receiver: js.Object,
    supplier: js.Function,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double
  ): js.Any = js.native
  def mix(
    receiver: js.Object,
    supplier: js.Function,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double,
    merge: Boolean
  ): js.Any = js.native
  //Function|Object|YUI
  def mix(receiver: js.Object, supplier: js.Object): js.Any = js.native
  def mix(receiver: js.Object, supplier: js.Object, overwrite: Boolean): js.Any = js.native
  def mix(receiver: js.Object, supplier: js.Object, overwrite: Boolean, whitelist: js.Array[String]): js.Any = js.native
  def mix(
    receiver: js.Object,
    supplier: js.Object,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double
  ): js.Any = js.native
  def mix(
    receiver: js.Object,
    supplier: js.Object,
    overwrite: Boolean,
    whitelist: js.Array[String],
    mode: Double,
    merge: Boolean
  ): js.Any = js.native
}

@JSGlobal("YUI")
@js.native
object YUI extends TopLevel[YUI]

