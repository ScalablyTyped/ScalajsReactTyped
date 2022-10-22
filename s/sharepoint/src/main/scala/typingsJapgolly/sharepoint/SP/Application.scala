package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.UI.Control
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Application {
  
  object UI {
    
    trait DefaultFormsInformation extends StObject {
      
      var DefaultForms: FormsInfo
      
      var OtherForms: Any
    }
    object DefaultFormsInformation {
      
      inline def apply(DefaultForms: FormsInfo, OtherForms: Any): DefaultFormsInformation = {
        val __obj = js.Dynamic.literal(DefaultForms = DefaultForms.asInstanceOf[js.Any], OtherForms = OtherForms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultFormsInformation]
      }
      
      extension [Self <: DefaultFormsInformation](x: Self) {
        
        inline def setDefaultForms(value: FormsInfo): Self = StObject.set(x, "DefaultForms", value.asInstanceOf[js.Any])
        
        inline def setOtherForms(value: Any): Self = StObject.set(x, "OtherForms", value.asInstanceOf[js.Any])
      }
    }
    
    trait DefaultFormsInformationRequestor extends StObject {
      
      def onDefaultFormsInformationRetrieveFailure(): Unit
      
      def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit
    }
    object DefaultFormsInformationRequestor {
      
      inline def apply(
        onDefaultFormsInformationRetrieveFailure: Callback,
        onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Callback
      ): DefaultFormsInformationRequestor = {
        val __obj = js.Dynamic.literal(onDefaultFormsInformationRetrieveFailure = onDefaultFormsInformationRetrieveFailure.toJsFn, onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1((t0: DefaultFormsInformation) => onDefaultFormsInformationRetrieveSuccess(t0).runNow()))
        __obj.asInstanceOf[DefaultFormsInformationRequestor]
      }
      
      extension [Self <: DefaultFormsInformationRequestor](x: Self) {
        
        inline def setOnDefaultFormsInformationRetrieveFailure(value: Callback): Self = StObject.set(x, "onDefaultFormsInformationRetrieveFailure", value.toJsFn)
        
        inline def setOnDefaultFormsInformationRetrieveSuccess(value: DefaultFormsInformation => Callback): Self = StObject.set(x, "onDefaultFormsInformationRetrieveSuccess", js.Any.fromFunction1((t0: DefaultFormsInformation) => value(t0).runNow()))
      }
    }
    
    trait DefaultFormsMenuBuilder extends StObject
    
    trait FormsInfo extends StObject {
      
      var ContentTypeName: String
      
      var DisplayFormUrl: String
      
      var EditFormUrl: String
      
      var NewFormUrl: String
    }
    object FormsInfo {
      
      inline def apply(ContentTypeName: String, DisplayFormUrl: String, EditFormUrl: String, NewFormUrl: String): FormsInfo = {
        val __obj = js.Dynamic.literal(ContentTypeName = ContentTypeName.asInstanceOf[js.Any], DisplayFormUrl = DisplayFormUrl.asInstanceOf[js.Any], EditFormUrl = EditFormUrl.asInstanceOf[js.Any], NewFormUrl = NewFormUrl.asInstanceOf[js.Any])
        __obj.asInstanceOf[FormsInfo]
      }
      
      extension [Self <: FormsInfo](x: Self) {
        
        inline def setContentTypeName(value: String): Self = StObject.set(x, "ContentTypeName", value.asInstanceOf[js.Any])
        
        inline def setDisplayFormUrl(value: String): Self = StObject.set(x, "DisplayFormUrl", value.asInstanceOf[js.Any])
        
        inline def setEditFormUrl(value: String): Self = StObject.set(x, "EditFormUrl", value.asInstanceOf[js.Any])
        
        inline def setNewFormUrl(value: String): Self = StObject.set(x, "NewFormUrl", value.asInstanceOf[js.Any])
      }
    }
    
    trait MoreColorsPage
      extends StObject
         with Control {
      
      def get_moreColorsPicker(): MoreColorsPicker
      
      def set_moreColorsPicker(value: MoreColorsPicker): Unit
    }
    object MoreColorsPage {
      
      inline def apply(
        addCssClass: String => Callback,
        add_disposing: js.Function => Callback,
        add_propertyChanged: js.Function => Callback,
        beginUpdate: Callback,
        dispose: Callback,
        endUpdate: Callback,
        get_element: CallbackTo[HTMLElement],
        get_events: CallbackTo[Any],
        get_id: CallbackTo[String],
        get_isInitialized: CallbackTo[Boolean],
        get_isUpdating: CallbackTo[Boolean],
        get_moreColorsPicker: CallbackTo[MoreColorsPicker],
        initialize: Callback,
        onBubbleEvent: (Any, Any) => Boolean,
        raiseBubbleEvent: (Any, Any) => Callback,
        raisePropertyChanged: String => Callback,
        removeCssClass: String => Callback,
        remove_disposing: js.Function => Callback,
        remove_propertyChanged: js.Function => Callback,
        set_id: String => Callback,
        set_moreColorsPicker: MoreColorsPicker => Callback,
        toggleCssClass: String => Callback,
        updated: Callback
      ): MoreColorsPage = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_moreColorsPicker = get_moreColorsPicker.toJsFn, initialize = initialize.toJsFn, onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_moreColorsPicker = js.Any.fromFunction1((t0: MoreColorsPicker) => set_moreColorsPicker(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updated = updated.toJsFn)
        __obj.asInstanceOf[MoreColorsPage]
      }
      
      extension [Self <: MoreColorsPage](x: Self) {
        
        inline def setGet_moreColorsPicker(value: CallbackTo[MoreColorsPicker]): Self = StObject.set(x, "get_moreColorsPicker", value.toJsFn)
        
        inline def setSet_moreColorsPicker(value: MoreColorsPicker => Callback): Self = StObject.set(x, "set_moreColorsPicker", js.Any.fromFunction1((t0: MoreColorsPicker) => value(t0).runNow()))
      }
    }
    
    trait MoreColorsPicker
      extends StObject
         with Control {
      
      def get_colorValue(): String
      
      def set_colorValue(value: String): Unit
    }
    object MoreColorsPicker {
      
      inline def apply(
        addCssClass: String => Callback,
        add_disposing: js.Function => Callback,
        add_propertyChanged: js.Function => Callback,
        beginUpdate: Callback,
        dispose: Callback,
        endUpdate: Callback,
        get_colorValue: CallbackTo[String],
        get_element: CallbackTo[HTMLElement],
        get_events: CallbackTo[Any],
        get_id: CallbackTo[String],
        get_isInitialized: CallbackTo[Boolean],
        get_isUpdating: CallbackTo[Boolean],
        initialize: Callback,
        onBubbleEvent: (Any, Any) => Boolean,
        raiseBubbleEvent: (Any, Any) => Callback,
        raisePropertyChanged: String => Callback,
        removeCssClass: String => Callback,
        remove_disposing: js.Function => Callback,
        remove_propertyChanged: js.Function => Callback,
        set_colorValue: String => Callback,
        set_id: String => Callback,
        toggleCssClass: String => Callback,
        updated: Callback
      ): MoreColorsPicker = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_colorValue = get_colorValue.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, initialize = initialize.toJsFn, onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_colorValue = js.Any.fromFunction1((t0: String) => set_colorValue(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updated = updated.toJsFn)
        __obj.asInstanceOf[MoreColorsPicker]
      }
      
      extension [Self <: MoreColorsPicker](x: Self) {
        
        inline def setGet_colorValue(value: CallbackTo[String]): Self = StObject.set(x, "get_colorValue", value.toJsFn)
        
        inline def setSet_colorValue(value: String => Callback): Self = StObject.set(x, "set_colorValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
    
    trait ThemeWebPage
      extends StObject
         with Control {
      
      def add_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]): Unit
      
      def get_thmxThemes(): Any
      
      def onThemeSelectionChanged(evt: DomEvent): Unit
      
      def remove_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]): Unit
      
      def set_thmxThemes(value: Any): Unit
      
      def updateThemeDisplay(): Unit
    }
    object ThemeWebPage {
      
      inline def apply(
        addCssClass: String => Callback,
        add_disposing: js.Function => Callback,
        add_propertyChanged: js.Function => Callback,
        add_themeDisplayUpdated: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback,
        beginUpdate: Callback,
        dispose: Callback,
        endUpdate: Callback,
        get_element: CallbackTo[HTMLElement],
        get_events: CallbackTo[Any],
        get_id: CallbackTo[String],
        get_isInitialized: CallbackTo[Boolean],
        get_isUpdating: CallbackTo[Boolean],
        get_thmxThemes: CallbackTo[Any],
        initialize: Callback,
        onBubbleEvent: (Any, Any) => Boolean,
        onThemeSelectionChanged: DomEvent => Callback,
        raiseBubbleEvent: (Any, Any) => Callback,
        raisePropertyChanged: String => Callback,
        removeCssClass: String => Callback,
        remove_disposing: js.Function => Callback,
        remove_propertyChanged: js.Function => Callback,
        remove_themeDisplayUpdated: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback,
        set_id: String => Callback,
        set_thmxThemes: Any => Callback,
        toggleCssClass: String => Callback,
        updateThemeDisplay: Callback,
        updated: Callback
      ): ThemeWebPage = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_themeDisplayUpdated = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => add_themeDisplayUpdated(t0).runNow()), beginUpdate = beginUpdate.toJsFn, dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_thmxThemes = get_thmxThemes.toJsFn, initialize = initialize.toJsFn, onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), onThemeSelectionChanged = js.Any.fromFunction1((t0: DomEvent) => onThemeSelectionChanged(t0).runNow()), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_themeDisplayUpdated = js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => remove_themeDisplayUpdated(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_thmxThemes = js.Any.fromFunction1((t0: Any) => set_thmxThemes(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateThemeDisplay = updateThemeDisplay.toJsFn, updated = updated.toJsFn)
        __obj.asInstanceOf[ThemeWebPage]
      }
      
      extension [Self <: ThemeWebPage](x: Self) {
        
        inline def setAdd_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback): Self = StObject.set(x, "add_themeDisplayUpdated", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => value(t0).runNow()))
        
        inline def setGet_thmxThemes(value: CallbackTo[Any]): Self = StObject.set(x, "get_thmxThemes", value.toJsFn)
        
        inline def setOnThemeSelectionChanged(value: DomEvent => Callback): Self = StObject.set(x, "onThemeSelectionChanged", js.Any.fromFunction1((t0: DomEvent) => value(t0).runNow()))
        
        inline def setRemove_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit] => Callback): Self = StObject.set(x, "remove_themeDisplayUpdated", js.Any.fromFunction1((t0: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]) => value(t0).runNow()))
        
        inline def setSet_thmxThemes(value: Any => Callback): Self = StObject.set(x, "set_thmxThemes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
        
        inline def setUpdateThemeDisplay(value: Callback): Self = StObject.set(x, "updateThemeDisplay", value.toJsFn)
      }
    }
    
    trait ViewInformationRequestor extends StObject {
      
      def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit
    }
    object ViewInformationRequestor {
      
      inline def apply(onViewInformationReturned: ViewSelectorGroups => Callback): ViewInformationRequestor = {
        val __obj = js.Dynamic.literal(onViewInformationReturned = js.Any.fromFunction1((t0: ViewSelectorGroups) => onViewInformationReturned(t0).runNow()))
        __obj.asInstanceOf[ViewInformationRequestor]
      }
      
      extension [Self <: ViewInformationRequestor](x: Self) {
        
        inline def setOnViewInformationReturned(value: ViewSelectorGroups => Callback): Self = StObject.set(x, "onViewInformationReturned", js.Any.fromFunction1((t0: ViewSelectorGroups) => value(t0).runNow()))
      }
    }
    
    trait ViewSelectorGroups extends StObject {
      
      var DefaultView: ViewSelectorMenuItem
      
      var ModeratedViews: Any
      
      var OtherViews: Any
      
      var PersonalViews: Any
      
      var PublicViews: Any
      
      var ViewCreation: Any
    }
    object ViewSelectorGroups {
      
      inline def apply(
        DefaultView: ViewSelectorMenuItem,
        ModeratedViews: Any,
        OtherViews: Any,
        PersonalViews: Any,
        PublicViews: Any,
        ViewCreation: Any
      ): ViewSelectorGroups = {
        val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], ModeratedViews = ModeratedViews.asInstanceOf[js.Any], OtherViews = OtherViews.asInstanceOf[js.Any], PersonalViews = PersonalViews.asInstanceOf[js.Any], PublicViews = PublicViews.asInstanceOf[js.Any], ViewCreation = ViewCreation.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorGroups]
      }
      
      extension [Self <: ViewSelectorGroups](x: Self) {
        
        inline def setDefaultView(value: ViewSelectorMenuItem): Self = StObject.set(x, "DefaultView", value.asInstanceOf[js.Any])
        
        inline def setModeratedViews(value: Any): Self = StObject.set(x, "ModeratedViews", value.asInstanceOf[js.Any])
        
        inline def setOtherViews(value: Any): Self = StObject.set(x, "OtherViews", value.asInstanceOf[js.Any])
        
        inline def setPersonalViews(value: Any): Self = StObject.set(x, "PersonalViews", value.asInstanceOf[js.Any])
        
        inline def setPublicViews(value: Any): Self = StObject.set(x, "PublicViews", value.asInstanceOf[js.Any])
        
        inline def setViewCreation(value: Any): Self = StObject.set(x, "ViewCreation", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorMenuBuilder extends StObject
    
    trait ViewSelectorMenuItem extends StObject {
      
      var ActionScriptText: String
      
      var Description: String
      
      var GroupId: Double
      
      var Id: String
      
      var ImageSourceUrl: String
      
      var ItemType: String
      
      var NavigateUrl: String
      
      var Sequence: Double
      
      var Text: String
    }
    object ViewSelectorMenuItem {
      
      inline def apply(
        ActionScriptText: String,
        Description: String,
        GroupId: Double,
        Id: String,
        ImageSourceUrl: String,
        ItemType: String,
        NavigateUrl: String,
        Sequence: Double,
        Text: String
      ): ViewSelectorMenuItem = {
        val __obj = js.Dynamic.literal(ActionScriptText = ActionScriptText.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], NavigateUrl = NavigateUrl.asInstanceOf[js.Any], Sequence = Sequence.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorMenuItem]
      }
      
      extension [Self <: ViewSelectorMenuItem](x: Self) {
        
        inline def setActionScriptText(value: String): Self = StObject.set(x, "ActionScriptText", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        inline def setGroupId(value: Double): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setImageSourceUrl(value: String): Self = StObject.set(x, "ImageSourceUrl", value.asInstanceOf[js.Any])
        
        inline def setItemType(value: String): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
        
        inline def setNavigateUrl(value: String): Self = StObject.set(x, "NavigateUrl", value.asInstanceOf[js.Any])
        
        inline def setSequence(value: Double): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorMenuOptions extends StObject {
      
      var listId: String
      
      var showApproverView: Boolean
      
      var showCreateView: Boolean
      
      var showEditView: Boolean
      
      var showMergeView: Boolean
      
      var showRepairView: Boolean
      
      var viewId: String
      
      var viewParameters: String
    }
    object ViewSelectorMenuOptions {
      
      inline def apply(
        listId: String,
        showApproverView: Boolean,
        showCreateView: Boolean,
        showEditView: Boolean,
        showMergeView: Boolean,
        showRepairView: Boolean,
        viewId: String,
        viewParameters: String
      ): ViewSelectorMenuOptions = {
        val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any], showApproverView = showApproverView.asInstanceOf[js.Any], showCreateView = showCreateView.asInstanceOf[js.Any], showEditView = showEditView.asInstanceOf[js.Any], showMergeView = showMergeView.asInstanceOf[js.Any], showRepairView = showRepairView.asInstanceOf[js.Any], viewId = viewId.asInstanceOf[js.Any], viewParameters = viewParameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorMenuOptions]
      }
      
      extension [Self <: ViewSelectorMenuOptions](x: Self) {
        
        inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        inline def setShowApproverView(value: Boolean): Self = StObject.set(x, "showApproverView", value.asInstanceOf[js.Any])
        
        inline def setShowCreateView(value: Boolean): Self = StObject.set(x, "showCreateView", value.asInstanceOf[js.Any])
        
        inline def setShowEditView(value: Boolean): Self = StObject.set(x, "showEditView", value.asInstanceOf[js.Any])
        
        inline def setShowMergeView(value: Boolean): Self = StObject.set(x, "showMergeView", value.asInstanceOf[js.Any])
        
        inline def setShowRepairView(value: Boolean): Self = StObject.set(x, "showRepairView", value.asInstanceOf[js.Any])
        
        inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        inline def setViewParameters(value: String): Self = StObject.set(x, "viewParameters", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorSubMenu extends StObject {
      
      var ImageSourceUrl: String
      
      var SubMenuItems: Any
      
      var Text: String
    }
    object ViewSelectorSubMenu {
      
      inline def apply(ImageSourceUrl: String, SubMenuItems: Any, Text: String): ViewSelectorSubMenu = {
        val __obj = js.Dynamic.literal(ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], SubMenuItems = SubMenuItems.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorSubMenu]
      }
      
      extension [Self <: ViewSelectorSubMenu](x: Self) {
        
        inline def setImageSourceUrl(value: String): Self = StObject.set(x, "ImageSourceUrl", value.asInstanceOf[js.Any])
        
        inline def setSubMenuItems(value: Any): Self = StObject.set(x, "SubMenuItems", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      }
    }
    
    trait WikiPageNameInPlaceEditor extends StObject {
      
      def editingPageCallback(): Unit
      
      def savingPageCallback(): Unit
    }
    object WikiPageNameInPlaceEditor {
      
      inline def apply(editingPageCallback: Callback, savingPageCallback: Callback): WikiPageNameInPlaceEditor = {
        val __obj = js.Dynamic.literal(editingPageCallback = editingPageCallback.toJsFn, savingPageCallback = savingPageCallback.toJsFn)
        __obj.asInstanceOf[WikiPageNameInPlaceEditor]
      }
      
      extension [Self <: WikiPageNameInPlaceEditor](x: Self) {
        
        inline def setEditingPageCallback(value: Callback): Self = StObject.set(x, "editingPageCallback", value.toJsFn)
        
        inline def setSavingPageCallback(value: Callback): Self = StObject.set(x, "savingPageCallback", value.toJsFn)
      }
    }
  }
}
