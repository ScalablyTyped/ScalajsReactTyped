package typingsJapgolly.faker

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.faker.Faker.Card
import typingsJapgolly.faker.Faker.ContextualCard
import typingsJapgolly.faker.Faker.Transaction
import typingsJapgolly.faker.Faker.UserCard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextualCard extends js.Object {
  def contextualCard(): ContextualCard = js.native
  def createCard(): Card = js.native
  def createTransaction(): Transaction = js.native
  def mustache(
    str: String,
    data: StringDictionary[String | (js.Function2[/* substring */ String, /* repeated */ js.Any, String])]
  ): String = js.native
  def randomize(): String = js.native
  def randomize[T](array: js.Array[T]): T = js.native
  def replaceSymbolWithNumber(): String = js.native
  def replaceSymbolWithNumber(string: String): String = js.native
  def replaceSymbolWithNumber(string: String, symbol: String): String = js.native
  def replaceSymbols(): String = js.native
  def replaceSymbols(string: String): String = js.native
  def shuffle(): js.Array[String] = js.native
  def shuffle[T](o: js.Array[T]): js.Array[T] = js.native
  def slugify(): String = js.native
  def slugify(string: String): String = js.native
  def userCard(): UserCard = js.native
}

