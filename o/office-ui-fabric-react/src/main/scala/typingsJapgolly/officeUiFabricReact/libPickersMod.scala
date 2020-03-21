package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typingsJapgolly.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Pickers", JSImport.Namespace)
@js.native
object libPickersMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsJapgolly.officeUiFabricReact.autofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.basePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typingsJapgolly.officeUiFabricReact.basePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.CompactPeoplePickerBase
  
  @js.native
  class ListPeoplePickerBase ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.ListPeoplePickerBase
  
  @js.native
  class MemberListPeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.basePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.NormalPeoplePickerBase
  
  @js.native
  class Suggestions[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] ()
    extends typingsJapgolly.officeUiFabricReact.suggestionsItemMod.SuggestionsItem[T]
  
  @js.native
  class TagPickerBase ()
    extends typingsJapgolly.officeUiFabricReact.pickersMod.TagPickerBase
  
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = js.native
  def TagItemBase(props: ITagItemProps): Element = js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: AnonEnableAutofillOnKeyPress = js.native
  }
  
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    /** Default props for CompactPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    /** Default props for ListPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    /** Default props for NormalPeoplePicker. */
    var defaultProps: AnonCreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    /* 1 */ val forceResolve: typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve with Double = js.native
    /* 0 */ val none: typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none with Double = js.native
    /* 2 */ val searchMore: typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: AnonOnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    /* 2 */ val invalid: typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    /* 0 */ val valid: typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    /* 1 */ val warning: typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState with Double
      ] = js.native
  }
  
}

