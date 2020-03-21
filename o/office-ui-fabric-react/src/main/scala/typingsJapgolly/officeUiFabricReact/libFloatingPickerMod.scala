package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsJapgolly.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/FloatingPicker", JSImport.Namespace)
@js.native
object libFloatingPickerMod extends js.Object {
  @js.native
  class BaseFloatingPeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.floatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class FloatingPeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.floatingPickerMod.FloatingPeoplePicker
  
  @js.native
  class SuggestionsControl[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.floatingPickerMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.floatingPickerMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @js.native
  class SuggestionsHeaderFooterItem ()
    extends typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionsHeaderFooterItem
  
  @js.native
  class SuggestionsStore[T] ()
    extends typingsJapgolly.officeUiFabricReact.floatingPickerMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object SuggestionItemType extends js.Object {
    /* 2 */ val footer: typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    /* 0 */ val header: typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    /* 1 */ val suggestion: typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.suggestionsControlMod.SuggestionItemType with Double
      ] = js.native
  }
  
}

