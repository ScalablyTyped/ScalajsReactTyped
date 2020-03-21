package typingsJapgolly.faker

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.faker.fakerStrings.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlphaNumeric extends js.Object {
  def alphaNumeric(): String = js.native
  def alphaNumeric(count: Double): String = js.native
  def arrayElement(): String = js.native
  def arrayElement[T](array: js.Array[T]): T = js.native
  def boolean(): Boolean = js.native
  def image(): String = js.native
  def locale(): String = js.native
  def number(): Double = js.native
  def number(max: Double): Double = js.native
  def number(options: AnonMax): Double = js.native
  def objectElement(): String = js.native
  def objectElement(`object`: StringDictionary[js.Any]): String = js.native
  def objectElement[T](`object`: StringDictionary[T], field: js.Any): T = js.native
  @JSName("objectElement")
  def objectElement_T_T[T](): T = js.native
  @JSName("objectElement")
  def objectElement_T_T[T](`object`: StringDictionary[T]): T = js.native
  @JSName("objectElement")
  def objectElement_key(`object`: StringDictionary[js.Any], field: key): String = js.native
  def uuid(): String = js.native
  def word(): String = js.native
  def word(`type`: String): String = js.native
  def words(): String = js.native
  def words(count: Double): String = js.native
}

