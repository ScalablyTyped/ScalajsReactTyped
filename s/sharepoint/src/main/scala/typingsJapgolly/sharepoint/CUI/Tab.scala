package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab
  extends StObject
     with RibbonComponent {
  
  def get_command(): String
  
  def get_contextual(): Boolean
  
  def get_contextualGroupId(): String
  
  def get_currentScalingIndex(): Double
  
  def get_scaling(): String
  
  def get_selected(): Boolean
  
  def scaleDown(): scala.Unit
  
  def scaleMax(): scala.Unit
  
  def scaleUp(): scala.Unit
  
  def set_selected(isSelected: Boolean): scala.Unit
}
object Tab {
  
  inline def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => Callback,
    addChildAtIndex: (Component, Double) => Any,
    appendChildrenToElement: Element => Callback,
    createChildArray: Callback,
    dispose: Callback,
    doDelayedInit: Callback,
    ensureCorrectChildType: Callback,
    ensureDOMElementAndEmpty: Callback,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: CallbackTo[String],
    get_command: CallbackTo[String],
    get_contextual: CallbackTo[Boolean],
    get_contextualGroupId: CallbackTo[String],
    get_cssClass: CallbackTo[String],
    get_currentScalingIndex: CallbackTo[Double],
    get_description: CallbackTo[String],
    get_domElementTagName: CallbackTo[String],
    get_enabled: CallbackTo[Boolean],
    get_id: CallbackTo[String],
    get_needsDelayIniting: CallbackTo[Boolean],
    get_parent: CallbackTo[Component],
    get_ribbon: CallbackTo[Ribbon],
    get_root: CallbackTo[Component],
    get_scaling: CallbackTo[String],
    get_selected: CallbackTo[Boolean],
    get_title: CallbackTo[String],
    get_visible: CallbackTo[Boolean],
    get_visibleInDOM: CallbackTo[Boolean],
    initRootMember: Component => Any,
    onEnabledChanged: Boolean => Any,
    onMenuClosed: Callback,
    raiseCommandEvent: (String, CommandType, Any) => Any,
    receiveFocus: Callback,
    removeChild: String => Callback,
    removeChildren: Callback,
    scaleDown: Callback,
    scaleMax: Callback,
    scaleUp: Callback,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => Callback,
    set_parent: Component => Component,
    set_selected: Boolean => Callback,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    valueIsDirty: Double => Boolean
  ): Tab = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1((t0: Component) => addChild(t0).runNow()), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1((t0: Element) => appendChildrenToElement(t0).runNow()), createChildArray = createChildArray.toJsFn, dispose = dispose.toJsFn, doDelayedInit = doDelayedInit.toJsFn, ensureCorrectChildType = ensureCorrectChildType.toJsFn, ensureDOMElementAndEmpty = ensureDOMElementAndEmpty.toJsFn, getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = getTextValue.toJsFn, get_command = get_command.toJsFn, get_contextual = get_contextual.toJsFn, get_contextualGroupId = get_contextualGroupId.toJsFn, get_cssClass = get_cssClass.toJsFn, get_currentScalingIndex = get_currentScalingIndex.toJsFn, get_description = get_description.toJsFn, get_domElementTagName = get_domElementTagName.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_needsDelayIniting = get_needsDelayIniting.toJsFn, get_parent = get_parent.toJsFn, get_ribbon = get_ribbon.toJsFn, get_root = get_root.toJsFn, get_scaling = get_scaling.toJsFn, get_selected = get_selected.toJsFn, get_title = get_title.toJsFn, get_visible = get_visible.toJsFn, get_visibleInDOM = get_visibleInDOM.toJsFn, initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = receiveFocus.toJsFn, removeChild = js.Any.fromFunction1((t0: String) => removeChild(t0).runNow()), removeChildren = removeChildren.toJsFn, scaleDown = scaleDown.toJsFn, scaleMax = scaleMax.toJsFn, scaleUp = scaleUp.toJsFn, set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_parent = js.Any.fromFunction1(set_parent), set_selected = js.Any.fromFunction1((t0: Boolean) => set_selected(t0).runNow()), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setGet_command(value: CallbackTo[String]): Self = StObject.set(x, "get_command", value.toJsFn)
    
    inline def setGet_contextual(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_contextual", value.toJsFn)
    
    inline def setGet_contextualGroupId(value: CallbackTo[String]): Self = StObject.set(x, "get_contextualGroupId", value.toJsFn)
    
    inline def setGet_currentScalingIndex(value: CallbackTo[Double]): Self = StObject.set(x, "get_currentScalingIndex", value.toJsFn)
    
    inline def setGet_scaling(value: CallbackTo[String]): Self = StObject.set(x, "get_scaling", value.toJsFn)
    
    inline def setGet_selected(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_selected", value.toJsFn)
    
    inline def setScaleDown(value: Callback): Self = StObject.set(x, "scaleDown", value.toJsFn)
    
    inline def setScaleMax(value: Callback): Self = StObject.set(x, "scaleMax", value.toJsFn)
    
    inline def setScaleUp(value: Callback): Self = StObject.set(x, "scaleUp", value.toJsFn)
    
    inline def setSet_selected(value: Boolean => Callback): Self = StObject.set(x, "set_selected", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
