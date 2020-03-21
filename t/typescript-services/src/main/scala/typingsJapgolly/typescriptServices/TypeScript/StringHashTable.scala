package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.StringHashTable")
@js.native
class StringHashTable[T] () extends IHashTable[T] {
  var itemCount: js.Any = js.native
  var table: js.Any = js.native
  /* CompleteClass */
  override def add(key: String, data: T): Boolean = js.native
  /* CompleteClass */
  override def addOrUpdate(key: String, data: T): Boolean = js.native
  /* CompleteClass */
  override def count(): Double = js.native
  /* CompleteClass */
  override def every(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  /* CompleteClass */
  override def getAllKeys(): js.Array[String] = js.native
  /* CompleteClass */
  override def lookup(key: String): T = js.native
  /* CompleteClass */
  override def map(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Unit = js.native
  def remove(key: String): Unit = js.native
  /* CompleteClass */
  override def some(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
}

