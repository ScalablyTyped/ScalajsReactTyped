package typingsJapgolly.materialUiLab.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialUiLab.useAutocompleteUseAutocompleteMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
  var anchorEl: Null | HTMLElement
  
  var dirty: Boolean
  
  var focused: Boolean
  
  var focusedTag: Double
  
  def getClearProps(): js.Object
  
  def getInputLabelProps(): js.Object
  
  def getInputProps(): js.Object
  
  def getListboxProps(): js.Object
  
  def getOptionProps(hasOptionIndex: Option[T]): js.Object
  
  def getPopupIndicatorProps(): js.Object
  
  def getRootProps(): js.Object
  
  def getTagProps(hasIndex: Index): js.Object
  
  var groupedOptions: js.Array[T]
  
  var id: String
  
  var inputValue: String
  
  var popupOpen: Boolean
  
  def setAnchorEl(): Unit
  
  var value: Value[T, Multiple, DisableClearable, FreeSolo]
}
object AnchorEl {
  
  inline def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: CallbackTo[js.Object],
    getInputLabelProps: CallbackTo[js.Object],
    getInputProps: CallbackTo[js.Object],
    getListboxProps: CallbackTo[js.Object],
    getOptionProps: Option[T] => js.Object,
    getPopupIndicatorProps: CallbackTo[js.Object],
    getRootProps: CallbackTo[js.Object],
    getTagProps: Index => js.Object,
    groupedOptions: js.Array[T],
    id: String,
    inputValue: String,
    popupOpen: Boolean,
    setAnchorEl: Callback,
    value: Value[T, Multiple, DisableClearable, FreeSolo]
  ): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = getClearProps.toJsFn, getInputLabelProps = getInputLabelProps.toJsFn, getInputProps = getInputProps.toJsFn, getListboxProps = getListboxProps.toJsFn, getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = getPopupIndicatorProps.toJsFn, getRootProps = getRootProps.toJsFn, getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = setAnchorEl.toJsFn, value = value.asInstanceOf[js.Any], anchorEl = null)
    __obj.asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  extension [Self <: AnchorEl[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](x: Self & (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) {
    
    inline def setAnchorEl(value: HTMLElement): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedTag(value: Double): Self = StObject.set(x, "focusedTag", value.asInstanceOf[js.Any])
    
    inline def setGetClearProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getClearProps", value.toJsFn)
    
    inline def setGetInputLabelProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getInputLabelProps", value.toJsFn)
    
    inline def setGetInputProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getInputProps", value.toJsFn)
    
    inline def setGetListboxProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getListboxProps", value.toJsFn)
    
    inline def setGetOptionProps(value: Option[T] => js.Object): Self = StObject.set(x, "getOptionProps", js.Any.fromFunction1(value))
    
    inline def setGetPopupIndicatorProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getPopupIndicatorProps", value.toJsFn)
    
    inline def setGetRootProps(value: CallbackTo[js.Object]): Self = StObject.set(x, "getRootProps", value.toJsFn)
    
    inline def setGetTagProps(value: Index => js.Object): Self = StObject.set(x, "getTagProps", js.Any.fromFunction1(value))
    
    inline def setGroupedOptions(value: js.Array[T]): Self = StObject.set(x, "groupedOptions", value.asInstanceOf[js.Any])
    
    inline def setGroupedOptionsVarargs(value: T*): Self = StObject.set(x, "groupedOptions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
    
    inline def setSetAnchorEl(value: Callback): Self = StObject.set(x, "setAnchorEl", value.toJsFn)
    
    inline def setValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
