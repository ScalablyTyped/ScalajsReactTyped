package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.microsoftAjax.Sys.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component
  extends StObject
     with IMenuItem
     with IDisposable {
  
  var _lastHeightUpdate: Double
  
  var _lastLeftUpdate: Double
  
  var _lastTopUpdate: Double
  
  var _lastWidthUpdate: Double
  
  def addChild(child: Component): scala.Unit
  
  def addChildAtIndex(child: Component, index: Double): Any
  
  def appendChildrenToElement(elm: Element): scala.Unit
  
  def createChildArray(): scala.Unit
  
  def doDelayedInit(): scala.Unit
  
  def ensureCorrectChildType(): scala.Unit
  
  def ensureDOMElementAndEmpty(): scala.Unit
  
  def getChild(id: String): Component
  
  def getChildByTitle(title: String): Component
  
  def getTextValue(): String
  
  def get_cssClass(): String
  
  def get_description(): String
  
  def get_domElementTagName(): String
  
  def get_enabled(): Boolean
  
  def get_id(): String
  
  def get_needsDelayIniting(): Boolean
  
  def get_parent(): Component
  
  def get_root(): Component
  
  def get_title(): String
  
  def get_visible(): Boolean
  
  def get_visibleInDOM(): Boolean
  
  def initRootMember(root: Component): Any
  
  def onEnabledChanged(enabled: Boolean): Any
  
  def onMenuClosed(): scala.Unit
  
  def raiseCommandEvent(commandId: String, `type`: CommandType, properties: Any): Any
  
  def receiveFocus(): scala.Unit
  
  def removeChild(id: String): scala.Unit
  
  def removeChildren(): scala.Unit
  
  def set_description(description: String): String
  
  def set_enabled(value: Boolean): Boolean
  
  def set_id(id: String): scala.Unit
  
  def set_parent(value: Component): Component
  
  def set_title(title: String): String
  
  def set_visible(value: Boolean): Boolean
  
  def valueIsDirty(lastUpdate: Double): Boolean
}
object Component {
  
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
    initRootMember: Component => Any,
    onEnabledChanged: Boolean => Any,
    onMenuClosed: Callback,
    raiseCommandEvent: (String, CommandType, Any) => Any,
    receiveFocus: Callback,
    removeChild: String => Callback,
    removeChildren: Callback,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => Callback,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    valueIsDirty: Double => Boolean
  ): Component = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1((t0: Component) => addChild(t0).runNow()), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1((t0: Element) => appendChildrenToElement(t0).runNow()), createChildArray = createChildArray.toJsFn, dispose = dispose.toJsFn, doDelayedInit = doDelayedInit.toJsFn, ensureCorrectChildType = ensureCorrectChildType.toJsFn, ensureDOMElementAndEmpty = ensureDOMElementAndEmpty.toJsFn, getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = getTextValue.toJsFn, get_cssClass = get_cssClass.toJsFn, get_description = get_description.toJsFn, get_domElementTagName = get_domElementTagName.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_needsDelayIniting = get_needsDelayIniting.toJsFn, get_parent = get_parent.toJsFn, get_root = get_root.toJsFn, get_title = get_title.toJsFn, get_visible = get_visible.toJsFn, get_visibleInDOM = get_visibleInDOM.toJsFn, initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = receiveFocus.toJsFn, removeChild = js.Any.fromFunction1((t0: String) => removeChild(t0).runNow()), removeChildren = removeChildren.toJsFn, set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setAddChild(value: Component => Callback): Self = StObject.set(x, "addChild", js.Any.fromFunction1((t0: Component) => value(t0).runNow()))
    
    inline def setAddChildAtIndex(value: (Component, Double) => Any): Self = StObject.set(x, "addChildAtIndex", js.Any.fromFunction2(value))
    
    inline def setAppendChildrenToElement(value: Element => Callback): Self = StObject.set(x, "appendChildrenToElement", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setCreateChildArray(value: Callback): Self = StObject.set(x, "createChildArray", value.toJsFn)
    
    inline def setDoDelayedInit(value: Callback): Self = StObject.set(x, "doDelayedInit", value.toJsFn)
    
    inline def setEnsureCorrectChildType(value: Callback): Self = StObject.set(x, "ensureCorrectChildType", value.toJsFn)
    
    inline def setEnsureDOMElementAndEmpty(value: Callback): Self = StObject.set(x, "ensureDOMElementAndEmpty", value.toJsFn)
    
    inline def setGetChild(value: String => Component): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
    
    inline def setGetChildByTitle(value: String => Component): Self = StObject.set(x, "getChildByTitle", js.Any.fromFunction1(value))
    
    inline def setGetTextValue(value: CallbackTo[String]): Self = StObject.set(x, "getTextValue", value.toJsFn)
    
    inline def setGet_cssClass(value: CallbackTo[String]): Self = StObject.set(x, "get_cssClass", value.toJsFn)
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_domElementTagName(value: CallbackTo[String]): Self = StObject.set(x, "get_domElementTagName", value.toJsFn)
    
    inline def setGet_enabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enabled", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_needsDelayIniting(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_needsDelayIniting", value.toJsFn)
    
    inline def setGet_parent(value: CallbackTo[Component]): Self = StObject.set(x, "get_parent", value.toJsFn)
    
    inline def setGet_root(value: CallbackTo[Component]): Self = StObject.set(x, "get_root", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_visible(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_visible", value.toJsFn)
    
    inline def setGet_visibleInDOM(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_visibleInDOM", value.toJsFn)
    
    inline def setInitRootMember(value: Component => Any): Self = StObject.set(x, "initRootMember", js.Any.fromFunction1(value))
    
    inline def setOnEnabledChanged(value: Boolean => Any): Self = StObject.set(x, "onEnabledChanged", js.Any.fromFunction1(value))
    
    inline def setOnMenuClosed(value: Callback): Self = StObject.set(x, "onMenuClosed", value.toJsFn)
    
    inline def setRaiseCommandEvent(value: (String, CommandType, Any) => Any): Self = StObject.set(x, "raiseCommandEvent", js.Any.fromFunction3(value))
    
    inline def setReceiveFocus(value: Callback): Self = StObject.set(x, "receiveFocus", value.toJsFn)
    
    inline def setRemoveChild(value: String => Callback): Self = StObject.set(x, "removeChild", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveChildren(value: Callback): Self = StObject.set(x, "removeChildren", value.toJsFn)
    
    inline def setSet_description(value: String => String): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    inline def setSet_enabled(value: Boolean => Boolean): Self = StObject.set(x, "set_enabled", js.Any.fromFunction1(value))
    
    inline def setSet_id(value: String => Callback): Self = StObject.set(x, "set_id", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_parent(value: Component => Component): Self = StObject.set(x, "set_parent", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => String): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_visible(value: Boolean => Boolean): Self = StObject.set(x, "set_visible", js.Any.fromFunction1(value))
    
    inline def setValueIsDirty(value: Double => Boolean): Self = StObject.set(x, "valueIsDirty", js.Any.fromFunction1(value))
    
    inline def set_lastHeightUpdate(value: Double): Self = StObject.set(x, "_lastHeightUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastLeftUpdate(value: Double): Self = StObject.set(x, "_lastLeftUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastTopUpdate(value: Double): Self = StObject.set(x, "_lastTopUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastWidthUpdate(value: Double): Self = StObject.set(x, "_lastWidthUpdate", value.asInstanceOf[js.Any])
  }
}
