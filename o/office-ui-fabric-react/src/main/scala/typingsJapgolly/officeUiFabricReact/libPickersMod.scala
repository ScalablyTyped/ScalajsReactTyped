package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.CreateGenericItem
import typingsJapgolly.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsJapgolly.officeUiFabricReact.anon.IGenericItemkeyKey
import typingsJapgolly.officeUiFabricReact.anon.Items
import typingsJapgolly.officeUiFabricReact.anon.OnRenderItem
import typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofillProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSelectedProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSelectedStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSelectedStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSuggestionProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSuggestionStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSuggestionStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionsProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionsStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionsStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionsItemStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionsItemStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemSuggestionProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemSuggestionStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemSuggestionStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickersMod {
  
  @JSImport("office-ui-fabric-react/lib/Pickers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BaseAutoFill")
  @js.native
  open class BaseAutoFill protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePeoplePicker")
  @js.native
  open class BasePeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
  @js.native
  open class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  /* static members */
  object BasePicker {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(newProps: IBasePickerProps[Any]): Items | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any]).asInstanceOf[Items | Null]
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePickerListBelow")
  @js.native
  open class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.BasePickerListBelow[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePicker")
  @js.native
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase")
  @js.native
  open class CompactPeoplePickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.CompactPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object CompactPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for CompactPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePicker")
  @js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase")
  @js.native
  open class ListPeoplePickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.ListPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object ListPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for ListPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "MemberListPeoplePicker")
  @js.native
  open class MemberListPeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.MemberListPeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePicker")
  @js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase")
  @js.native
  open class NormalPeoplePickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.NormalPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object NormalPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for NormalPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItem")
  @js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  
  inline def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PeoplePickerItemBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItemSuggestion")
  @js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  
  inline def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PeoplePickerItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionActionType")
  @js.native
  object SuggestionActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType & Double
      ] = js.native
    
    /* 1 */ val forceResolve: typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.forceResolve & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.none & Double = js.native
    
    /* 2 */ val searchMore: typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.searchMore & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "Suggestions")
  @js.native
  open class Suggestions[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionsController")
  @js.native
  open class SuggestionsController[T] ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.SuggestionsController[T]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionsItem")
  @js.native
  open class SuggestionsItem[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.SuggestionsItem[T] {
    def this(props: ISuggestionItemProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItem")
  @js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  
  inline def TagItemBase(props: ITagItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItemSuggestion")
  @js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  
  inline def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagPicker")
  @js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase")
  @js.native
  open class TagPickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.TagPickerBase {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  object TagPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase.defaultProps")
    @js.native
    def defaultProps: OnRenderItem = js.native
    inline def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ValidationState")
  @js.native
  object ValidationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState & Double
      ] = js.native
    
    /* 2 */ val invalid: typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState.invalid & Double = js.native
    
    /* 0 */ val valid: typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState.valid & Double = js.native
    
    /* 1 */ val warning: typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState.warning & Double = js.native
  }
  
  inline def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericItem")(name.asInstanceOf[js.Any], currentValidationState.asInstanceOf[js.Any])).asInstanceOf[IGenericItemkeyKey]
  
  inline def getBasePickerStyles(props: IBasePickerStyleProps): IBasePickerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasePickerStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IBasePickerStyles]
  
  inline def getPeoplePickerItemStyles(props: IPeoplePickerItemSelectedStyleProps): IPeoplePickerItemSelectedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeoplePickerItemStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPeoplePickerItemSelectedStyles]
  
  inline def getPeoplePickerItemSuggestionStyles(props: IPeoplePickerItemSuggestionStyleProps): IPeoplePickerItemSuggestionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeoplePickerItemSuggestionStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPeoplePickerItemSuggestionStyles]
  
  inline def getSuggestionsItemStyles(props: ISuggestionsItemStyleProps): ISuggestionsItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionsItemStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISuggestionsItemStyles]
  
  inline def getSuggestionsStyles(props: ISuggestionsStyleProps): ISuggestionsStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionsStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISuggestionsStyles]
  
  inline def getTagItemStyles(props: ITagItemStyleProps): ITagItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagItemStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITagItemStyles]
  
  inline def getTagItemSuggestionStyles(props: ITagItemSuggestionStyleProps): ITagItemSuggestionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagItemSuggestionStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITagItemSuggestionStyles]
}
