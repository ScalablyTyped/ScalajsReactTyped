package typingsJapgolly.meteorAstronomy

import typingsJapgolly.meteorAstronomy.MeteorAstronomy.RemoveCallback
import typingsJapgolly.meteorAstronomy.MeteorAstronomy.SaveAndValidateCallback
import typingsJapgolly.meteorAstronomy.MeteorAstronomy.SaveAndValidateOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCopy[T] extends js.Object {
  def copy(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
  def copy(save: Boolean): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
  def get(field: String): js.Any = js.native
  def get(fields: js.Array[String]): Partial[T] = js.native
  def getModified(): js.Any = js.native
  def getModifiedValues(): Partial[T] = js.native
  def getModifiedValues(options: AnonOld): Partial[T] = js.native
  def getModifier(): js.Any = js.native
  def isModified(): Boolean = js.native
  def isModified(field: String): Boolean = js.native
  def raw(): T = js.native
  def raw(field: String): js.Any = js.native
  def raw(fields: js.Array[String]): Partial[T] = js.native
  def remove(): Unit = js.native
  def remove(callback: RemoveCallback): Unit = js.native
  def save(): Unit = js.native
  def save(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
  def save(optionsOrCallback: SaveAndValidateOptions[String]): Unit = js.native
  def save(options: SaveAndValidateOptions[String], callback: SaveAndValidateCallback): Unit = js.native
  def set(field: String, value: js.Any): Unit = js.native
  def set(fields: Partial[T]): Unit = js.native
  def set(fields: Partial[T], options: AnonCast): Unit = js.native
  def validate(): Unit = js.native
  def validate(optionsOrCallback: SaveAndValidateCallback): Unit = js.native
  def validate(optionsOrCallback: SaveAndValidateOptions[String]): Unit = js.native
  def validate(options: SaveAndValidateOptions[String], callback: SaveAndValidateCallback): Unit = js.native
}

