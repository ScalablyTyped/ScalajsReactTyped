package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.AnonHighlightProperty
import typingsJapgolly.reactInstantsearchCore.AnonIsHighlighted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProvided[TDoc] extends js.Object {
  /**
    * function to retrieve and parse an attribute from a hit. It takes a configuration object with 3 attributes:
    * * highlightProperty which is the property that contains the highlight structure from the records,
    * * attribute which is the name of the attribute (it can be either a string or an array of strings) to look for,
    * * hit which is the hit from Algolia.
    * It returns an array of objects {value: string, isHighlighted: boolean}.
    * If the element that corresponds to the attribute is an array of strings, it will return a nested array of objects.
    * In this case you should cast the result:
    * ```ts
    * highlight({
    *  attribute: 'my_string_array',
    *  hit,
    *  highlightProperty: '_highlightResult'
    * }) as Array<Array<{value: string, isHighlighted: boolean}>>
    * ```
    */
  def highlight(configuration: AnonHighlightProperty[TDoc]): js.Array[AnonIsHighlighted]
}

object HighlightProvided {
  @scala.inline
  def apply[TDoc](highlight: AnonHighlightProperty[TDoc] => CallbackTo[js.Array[AnonIsHighlighted]]): HighlightProvided[TDoc] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("highlight")(js.Any.fromFunction1((t0: typingsJapgolly.reactInstantsearchCore.AnonHighlightProperty[TDoc]) => highlight(t0).runNow()))
    __obj.asInstanceOf[HighlightProvided[TDoc]]
  }
}

