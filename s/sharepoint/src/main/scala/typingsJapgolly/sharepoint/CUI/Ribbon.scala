package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ribbon
  extends StObject
     with Root {
  
  def addChildAtIndex(child: Any, index: Double): scala.Unit
  
  def addContextualGroup(id: String, title: String, color: Any, command: String): Any
  
  def get_contextualGroupIds(): js.Array[String]
  
  def hideContextualGroup(id: String): scala.Unit
  
  def refresh(): scala.Unit
  
  def removeContextualGroup(id: String): scala.Unit
  
  def setFocus(): scala.Unit
  
  def setFocusOnCurrentTab(): scala.Unit
  
  def setFocusOnRibbon(): scala.Unit
  
  def showContextualGroup(id: String): scala.Unit
}
object Ribbon {
  
  inline def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => Callback,
    addChildAtIndex: (Any, Double) => Callback,
    addContextualGroup: (String, String, Any, String) => Any,
    appendChildrenToElement: Element => Callback,
    createChildArray: Callback,
    dispose: Callback,
    doDelayedInit: Callback,
    ensureCorrectChildType: Callback,
    ensureDOMElementAndEmpty: Callback,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: CallbackTo[String],
    get_contextualGroupIds: CallbackTo[js.Array[String]],
    get_cssClass: CallbackTo[String],
    get_description: CallbackTo[String],
    get_domElementTagName: CallbackTo[String],
    get_enabled: CallbackTo[Boolean],
    get_id: CallbackTo[String],
    get_needsDelayIniting: CallbackTo[Boolean],
    get_parent: CallbackTo[Component],
    get_root: CallbackTo[Component],
    get_title: CallbackTo[String],
    get_visible: CallbackTo[Boolean],
    get_visibleInDOM: CallbackTo[Boolean],
    hideContextualGroup: String => Callback,
    initRootMember: Component => Any,
    onEnabledChanged: Boolean => Any,
    onMenuClosed: Callback,
    raiseCommandEvent: (String, CommandType, Any) => Any,
    receiveFocus: Callback,
    refresh: Callback,
    removeChild: String => Callback,
    removeChildren: Callback,
    removeContextualGroup: String => Callback,
    setFocus: Callback,
    setFocusOnCurrentTab: Callback,
    setFocusOnRibbon: Callback,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => Callback,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    showContextualGroup: String => Callback,
    valueIsDirty: Double => Boolean
  ): Ribbon = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1((t0: Component) => addChild(t0).runNow()), addChildAtIndex = js.Any.fromFunction2((t0: Any, t1: Double) => (addChildAtIndex(t0, t1)).runNow()), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1((t0: Element) => appendChildrenToElement(t0).runNow()), createChildArray = createChildArray.toJsFn, dispose = dispose.toJsFn, doDelayedInit = doDelayedInit.toJsFn, ensureCorrectChildType = ensureCorrectChildType.toJsFn, ensureDOMElementAndEmpty = ensureDOMElementAndEmpty.toJsFn, getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = getTextValue.toJsFn, get_contextualGroupIds = get_contextualGroupIds.toJsFn, get_cssClass = get_cssClass.toJsFn, get_description = get_description.toJsFn, get_domElementTagName = get_domElementTagName.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_needsDelayIniting = get_needsDelayIniting.toJsFn, get_parent = get_parent.toJsFn, get_root = get_root.toJsFn, get_title = get_title.toJsFn, get_visible = get_visible.toJsFn, get_visibleInDOM = get_visibleInDOM.toJsFn, hideContextualGroup = js.Any.fromFunction1((t0: String) => hideContextualGroup(t0).runNow()), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = receiveFocus.toJsFn, refresh = refresh.toJsFn, removeChild = js.Any.fromFunction1((t0: String) => removeChild(t0).runNow()), removeChildren = removeChildren.toJsFn, removeContextualGroup = js.Any.fromFunction1((t0: String) => removeContextualGroup(t0).runNow()), setFocus = setFocus.toJsFn, setFocusOnCurrentTab = setFocusOnCurrentTab.toJsFn, setFocusOnRibbon = setFocusOnRibbon.toJsFn, set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1((t0: String) => showContextualGroup(t0).runNow()), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Ribbon]
  }
  
  extension [Self <: Ribbon](x: Self) {
    
    inline def setAddChildAtIndex(value: (Any, Double) => Callback): Self = StObject.set(x, "addChildAtIndex", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setAddContextualGroup(value: (String, String, Any, String) => Any): Self = StObject.set(x, "addContextualGroup", js.Any.fromFunction4(value))
    
    inline def setGet_contextualGroupIds(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_contextualGroupIds", value.toJsFn)
    
    inline def setHideContextualGroup(value: String => Callback): Self = StObject.set(x, "hideContextualGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRemoveContextualGroup(value: String => Callback): Self = StObject.set(x, "removeContextualGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSetFocusOnCurrentTab(value: Callback): Self = StObject.set(x, "setFocusOnCurrentTab", value.toJsFn)
    
    inline def setSetFocusOnRibbon(value: Callback): Self = StObject.set(x, "setFocusOnRibbon", value.toJsFn)
    
    inline def setShowContextualGroup(value: String => Callback): Self = StObject.set(x, "showContextualGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
