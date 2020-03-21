package typingsJapgolly.reactGeosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.address
  - typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.establishment
  - typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.geocode
  - typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis
  - typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis
*/
trait QueryType extends js.Object

object QueryType {
  @scala.inline
  def LeftparenthesiscitiesRightparenthesis: typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis = this.cast("(cities)")
  @scala.inline
  def LeftparenthesisregionsRightparenthesis: typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis = this.cast("(regions)")
  @scala.inline
  def address: typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typingsJapgolly.reactGeosuggest.reactGeosuggestStrings.geocode = this.cast("geocode")
}

