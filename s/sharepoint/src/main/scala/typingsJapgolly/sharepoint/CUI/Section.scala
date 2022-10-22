package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section
  extends StObject
     with RibbonComponent {
  
  def getRow(rowIndex: Double): Row
  
  def get_alignment(): Double
  
  def get_type(): Double
}
object Section {
  
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
    getRow: Double => Row,
    getTextValue: CallbackTo[String],
    get_alignment: CallbackTo[Double],
    get_cssClass: CallbackTo[String],
    get_description: CallbackTo[String],
    get_domElementTagName: CallbackTo[String],
    get_enabled: CallbackTo[Boolean],
    get_id: CallbackTo[String],
    get_needsDelayIniting: CallbackTo[Boolean],
    get_parent: CallbackTo[Component],
    get_ribbon: CallbackTo[Ribbon],
    get_root: CallbackTo[Component],
    get_title: CallbackTo[String],
    get_type: CallbackTo[Double],
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
  ): Section = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1((t0: Component) => addChild(t0).runNow()), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1((t0: Element) => appendChildrenToElement(t0).runNow()), createChildArray = createChildArray.toJsFn, dispose = dispose.toJsFn, doDelayedInit = doDelayedInit.toJsFn, ensureCorrectChildType = ensureCorrectChildType.toJsFn, ensureDOMElementAndEmpty = ensureDOMElementAndEmpty.toJsFn, getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getRow = js.Any.fromFunction1(getRow), getTextValue = getTextValue.toJsFn, get_alignment = get_alignment.toJsFn, get_cssClass = get_cssClass.toJsFn, get_description = get_description.toJsFn, get_domElementTagName = get_domElementTagName.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_needsDelayIniting = get_needsDelayIniting.toJsFn, get_parent = get_parent.toJsFn, get_ribbon = get_ribbon.toJsFn, get_root = get_root.toJsFn, get_title = get_title.toJsFn, get_type = get_type.toJsFn, get_visible = get_visible.toJsFn, get_visibleInDOM = get_visibleInDOM.toJsFn, initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = onMenuClosed.toJsFn, raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = receiveFocus.toJsFn, removeChild = js.Any.fromFunction1((t0: String) => removeChild(t0).runNow()), removeChildren = removeChildren.toJsFn, set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setGetRow(value: Double => Row): Self = StObject.set(x, "getRow", js.Any.fromFunction1(value))
    
    inline def setGet_alignment(value: CallbackTo[Double]): Self = StObject.set(x, "get_alignment", value.toJsFn)
    
    inline def setGet_type(value: CallbackTo[Double]): Self = StObject.set(x, "get_type", value.toJsFn)
  }
}
