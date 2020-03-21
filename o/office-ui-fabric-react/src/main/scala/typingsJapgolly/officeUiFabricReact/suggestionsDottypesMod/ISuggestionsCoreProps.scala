package typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsCoreProps[T]
  extends ClassAttributes[js.Any] {
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  /**
    * How the suggestion should look in the suggestion list.
    */
  var onRenderSuggestion: js.UndefOr[
    js.Function2[/* props */ T, /* suggestionItemProps */ ISuggestionItemProps[T], Element]
  ] = js.native
  /**
    * Function to fire when one of the optional remove buttons on a suggestion is clicked.
    */
  var onSuggestionRemove: js.UndefOr[
    js.Function3[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      /* item */ js.UndefOr[IPersonaProps], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Maximum number of suggestions to show in the full suggestion list.
    */
  var resultsMaximumNumber: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to loop around to the top or bottom of the suggestions
    * on calling nextSuggestion and previousSuggestion, respectively
    */
  var shouldLoopSelection: Boolean = js.native
  /**
    * Indicates whether to show a button with each suggestion to remove that suggestion.
    */
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
  /**
    * The list of Suggestions that will be displayed
    */
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
  /**
    * Screen reader message to read when there are suggestions available.
    */
  var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions.
    */
  var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
  /**
    * the classname of the suggestionitem.
    */
  var suggestionsItemClassName: js.UndefOr[String] = js.native
  /**
    * What should occur when a suggestion is clicked
    */
  def onSuggestionClick(): Unit = js.native
  def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: js.Any): Unit = js.native
  def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: js.Any, index: Double): Unit = js.native
}

