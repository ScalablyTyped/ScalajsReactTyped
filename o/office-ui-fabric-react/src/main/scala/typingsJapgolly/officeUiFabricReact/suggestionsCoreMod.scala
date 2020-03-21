package typingsJapgolly.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsCore", JSImport.Namespace)
@js.native
object suggestionsCoreMod extends js.Object {
  @js.native
  class SuggestionsCore[T] protected ()
    extends BaseComponent[ISuggestionsCoreProps[T], js.Object] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
    var SuggestionsItemOfProperType: js.Any = js.native
    var _onClickTypedSuggestionsItem: js.Any = js.native
    var _onRemoveTypedSuggestionsItem: js.Any = js.native
    var _selectedElement: HTMLDivElement = js.native
    var currentIndex: Double = js.native
    var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    val selectedElement: js.UndefOr[HTMLDivElement] = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggestionsCore(): Unit = js.native
    def deselectAllSuggestions(): Unit = js.native
    def getCurrentItem(): ISuggestionModel[T] = js.native
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    def hasSuggestionSelected(): Boolean = js.native
    /**
      * Increments the selected suggestion index
      */
    def nextSuggestion(): Boolean = js.native
    /**
      * Decrements the selected suggestion index
      */
    def previousSuggestion(): Boolean = js.native
    def removeSuggestion(index: Double): Unit = js.native
    def scrollSelected(): Unit = js.native
    def setSelectedSuggestion(index: Double): Unit = js.native
  }
  
}

