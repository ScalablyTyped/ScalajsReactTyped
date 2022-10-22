package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.dom.nodeList
import typingsJapgolly.ckeditor4.CKEDITOR.ui.balloonPanel.parts
import typingsJapgolly.ckeditor4.CKEDITOR.ui.balloonPanel.rect
import typingsJapgolly.ckeditor4.CKEDITOR.ui.balloonPanel.templateDefinitions
import typingsJapgolly.ckeditor4.CKEDITOR.ui.balloonPanel.templates
import typingsJapgolly.ckeditor4.CKEDITOR.ui.panel.block
import typingsJapgolly.ckeditor4.anon.FocusElement
import typingsJapgolly.ckeditor4.anon.RemoveListenerListenerRegistration
import typingsJapgolly.ckeditor4.ckeditor4Strings.bottom
import typingsJapgolly.ckeditor4.ckeditor4Strings.horizontal
import typingsJapgolly.ckeditor4.ckeditor4Strings.left
import typingsJapgolly.ckeditor4.ckeditor4Strings.right
import typingsJapgolly.ckeditor4.ckeditor4Strings.top
import typingsJapgolly.ckeditor4.ckeditor4Strings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ui
  extends StObject
     with event {
  
  def add(name: String, `type`: StringDictionary[Any], definition: StringDictionary[Any]): Unit = js.native
  
  def addButton(name: String, definition: buttonDefinition): Unit = js.native
  
  def addHandler(`type`: StringDictionary[Any], handler: StringDictionary[Any]): Unit = js.native
  
  def addRichCombo(name: String, definition: StringDictionary[Any]): Unit = js.native
  
  def addToolbarGroup(name: String, previous: String): Unit = js.native
  def addToolbarGroup(name: String, previous: String, subgroupOf: String): Unit = js.native
  def addToolbarGroup(name: String, previous: Double): Unit = js.native
  def addToolbarGroup(name: String, previous: Double, subgroupOf: String): Unit = js.native
  
  def create(name: String): StringDictionary[Any] = js.native
  
  def get(name: String): StringDictionary[Any] = js.native
  
  def space(name: String): element = js.native
  
  def spaceId(name: String): String = js.native
}
object ui {
  
  @js.native
  trait balloonPanel extends StObject {
    
    def activateShowListeners(): Unit = js.native
    
    def activeShowListener(id: Double): Unit = js.native
    
    var activeShowListeners: NumberDictionary[RemoveListenerListenerRegistration] = js.native
    
    def addShowListener(listener: js.Function0[listenerRegistration]): listenerRegistration = js.native
    
    def attach(element: element): Unit = js.native
    def attach(element: element, options: Boolean): Unit = js.native
    def attach(element: element, options: element): Unit = js.native
    def attach(element: element, options: FocusElement): Unit = js.native
    
    def blur(): Unit = js.native
    
    def build(): Unit = js.native
    
    def deactivateShowListener(id: Double): Unit = js.native
    
    def deregisterFocusable(element: element): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var editor: typingsJapgolly.ckeditor4.CKEDITOR.editor = js.native
    
    var focusables: NumberDictionary[element] = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    var height: String = js.native
    
    def hide(): Unit = js.native
    
    def move(top: Double, left: Double): Unit = js.native
    
    var parts: parts = js.native
    
    var rect: rect = js.native
    
    def registerFocusable(element: element): Unit = js.native
    
    def removeShowListener(id: Double): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    def setTriangle(side: left | right | top | bottom): Unit = js.native
    
    def show(): Unit = js.native
    
    var showListeners: NumberDictionary[js.Function0[listenerRegistration]] = js.native
    
    var templateDefinitions: templateDefinitions = js.native
    
    var templates: templates = js.native
    
    var triangleHeight: Double = js.native
    
    var triangleMinDistance: Double = js.native
    
    var triangleWidth: Double = js.native
    
    var width: Double = js.native
  }
  object balloonPanel {
    
    trait definition extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object definition {
      
      inline def apply(): definition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[definition]
      }
      
      extension [Self <: definition](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait parts extends StObject {
      
      var close: js.UndefOr[element] = js.undefined
      
      var content: js.UndefOr[element] = js.undefined
      
      var panel: js.UndefOr[element] = js.undefined
      
      var title: js.UndefOr[element] = js.undefined
      
      var triangle: js.UndefOr[element] = js.undefined
      
      var triangleInner: js.UndefOr[element] = js.undefined
      
      var triangleOuter: js.UndefOr[element] = js.undefined
    }
    object parts {
      
      inline def apply(): parts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[parts]
      }
      
      extension [Self <: parts](x: Self) {
        
        inline def setClose(value: element): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        inline def setContent(value: element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setPanel(value: element): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        inline def setTitle(value: element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTriangle(value: element): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        inline def setTriangleInner(value: element): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        inline def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        inline def setTriangleOuter(value: element): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        inline def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
    
    trait rect extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var left: js.UndefOr[Double] = js.undefined
      
      var top: js.UndefOr[Double] = js.undefined
      
      var visible: js.UndefOr[Boolean] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object rect {
      
      inline def apply(): rect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[rect]
      }
      
      extension [Self <: rect](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
        
        inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait templateDefinitions extends StObject {
      
      var close: js.UndefOr[String] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var panel: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var triangle: js.UndefOr[String] = js.undefined
      
      var triangleInner: js.UndefOr[String] = js.undefined
      
      var triangleOuter: js.UndefOr[String] = js.undefined
    }
    object templateDefinitions {
      
      inline def apply(): templateDefinitions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[templateDefinitions]
      }
      
      extension [Self <: templateDefinitions](x: Self) {
        
        inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTriangle(value: String): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        inline def setTriangleInner(value: String): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        inline def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        inline def setTriangleOuter(value: String): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        inline def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
    
    trait templates extends StObject {
      
      var close: js.UndefOr[template] = js.undefined
      
      var content: js.UndefOr[template] = js.undefined
      
      var panel: js.UndefOr[template] = js.undefined
      
      var title: js.UndefOr[template] = js.undefined
      
      var triangle: js.UndefOr[template] = js.undefined
      
      var triangleInner: js.UndefOr[template] = js.undefined
      
      var triangleOuter: js.UndefOr[template] = js.undefined
    }
    object templates {
      
      inline def apply(): templates = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[templates]
      }
      
      extension [Self <: templates](x: Self) {
        
        inline def setClose(value: template): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        inline def setContent(value: template): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setPanel(value: template): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        inline def setTitle(value: template): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTriangle(value: template): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        inline def setTriangleInner(value: template): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        inline def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        inline def setTriangleOuter(value: template): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        inline def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
  }
  
  @js.native
  trait balloonToolbar extends StObject {
    
    def addItem(name: String, element: button): Unit = js.native
    def addItem(name: String, element: richCombo): Unit = js.native
    
    def addItems(elements: StringDictionary[button | richCombo]): Unit = js.native
    
    def deleteItem(name: String): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getItem(name: String): button | richCombo = js.native
    
    def hide(): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait button extends StObject {
    
    def getState(): Double
    
    def render(editor: editor, output: js.Array[String]): Unit
    
    def setState(state: Double): Unit
    
    def toFeature(editor: editor): feature
  }
  object button {
    
    inline def apply(
      getState: CallbackTo[Double],
      render: (editor, js.Array[String]) => Callback,
      setState: Double => Callback,
      toFeature: editor => feature
    ): button = {
      val __obj = js.Dynamic.literal(getState = getState.toJsFn, render = js.Any.fromFunction2((t0: editor, t1: js.Array[String]) => (render(t0, t1)).runNow()), setState = js.Any.fromFunction1((t0: Double) => setState(t0).runNow()), toFeature = js.Any.fromFunction1(toFeature))
      __obj.asInstanceOf[button]
    }
    
    extension [Self <: button](x: Self) {
      
      inline def setGetState(value: CallbackTo[Double]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setRender(value: (editor, js.Array[String]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: editor, t1: js.Array[String]) => (value(t0, t1)).runNow()))
      
      inline def setSetState(value: Double => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setToFeature(value: editor => feature): Self = StObject.set(x, "toFeature", js.Any.fromFunction1(value))
    }
  }
  
  object dialog {
    
    trait button
      extends StObject
         with uiElement {
      
      def accessKeyDown(): Unit
      
      def accessKeyUp(): Unit
      
      def click(): Any
    }
    object button {
      
      inline def apply(
        accessKeyDown: Callback,
        accessKeyUp: Callback,
        click: CallbackTo[Any],
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: CallbackTo[uiElement],
        setValue: (Any, Boolean) => js.UndefOr[uiElement]
      ): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.button = {
        val __obj = js.Dynamic.literal(accessKeyDown = accessKeyDown.toJsFn, accessKeyUp = accessKeyUp.toJsFn, click = click.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = selectParentTab.toJsFn, setValue = js.Any.fromFunction2(setValue))
        __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.button]
      }
      
      extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.button](x: Self) {
        
        inline def setAccessKeyDown(value: Callback): Self = StObject.set(x, "accessKeyDown", value.toJsFn)
        
        inline def setAccessKeyUp(value: Callback): Self = StObject.set(x, "accessKeyUp", value.toJsFn)
        
        inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
      }
    }
    
    trait checkbox
      extends StObject
         with uiElement {
      
      def accessKeyUp(): Unit
      
      def setValue(checked: Boolean, noChangeEvent: Boolean): Unit
    }
    object checkbox {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: CallbackTo[uiElement],
        setValue: (Boolean, Boolean) => Callback
      ): checkbox = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = accessKeyUp.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = selectParentTab.toJsFn, setValue = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (setValue(t0, t1)).runNow()))
        __obj.asInstanceOf[checkbox]
      }
      
      extension [Self <: checkbox](x: Self) {
        
        inline def setAccessKeyUp(value: Callback): Self = StObject.set(x, "accessKeyUp", value.toJsFn)
        
        inline def setSetValue(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
      }
    }
    
    object definitions {
      
      trait button extends StObject {
        
        var disabled: js.UndefOr[Boolean] = js.undefined
        
        var label: String
      }
      object button {
        
        inline def apply(label: String): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.button = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.button]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.button](x: Self) {
          
          inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      trait checkbox extends StObject {
        
        var checked: js.UndefOr[Boolean] = js.undefined
        
        var label: js.UndefOr[String] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object checkbox {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.checkbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.checkbox]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.checkbox](x: Self) {
          
          inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
          
          inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait fieldSet extends StObject {
        
        var children: js.Array[Any]
        
        var label: js.UndefOr[String] = js.undefined
      }
      object fieldSet {
        
        inline def apply(children: js.Array[Any]): fieldSet = {
          val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
          __obj.asInstanceOf[fieldSet]
        }
        
        extension [Self <: fieldSet](x: Self) {
          
          inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        }
      }
      
      trait file extends StObject {
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object file {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.file = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.file]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.file](x: Self) {
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait fileButton extends StObject {
        
        var `for`: String
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object fileButton {
        
        inline def apply(`for`: String): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.fileButton = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.fileButton]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.fileButton](x: Self) {
          
          inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait hbox extends StObject {
        
        var align: js.UndefOr[String] = js.undefined
        
        var height: js.UndefOr[String] = js.undefined
        
        var padding: js.UndefOr[String] = js.undefined
        
        var widths: js.UndefOr[js.Array[String]] = js.undefined
      }
      object hbox {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.hbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.hbox]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.hbox](x: Self) {
          
          inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
          
          inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
          
          inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
          
          inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
          
          inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
          
          inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
          
          inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value*))
        }
      }
      
      trait html extends StObject {
        
        var html: String
      }
      object html {
        
        inline def apply(html: String): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.html = {
          val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.html]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.html](x: Self) {
          
          inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        }
      }
      
      trait iframeElement extends StObject {
        
        var height: String
        
        var onContentLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var src: String
        
        var width: String
      }
      object iframeElement {
        
        inline def apply(height: String, src: String, width: String): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.iframeElement = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.iframeElement]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.iframeElement](x: Self) {
          
          inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setOnContentLoad(value: Callback): Self = StObject.set(x, "onContentLoad", value.toJsFn)
          
          inline def setOnContentLoadUndefined: Self = StObject.set(x, "onContentLoad", js.undefined)
          
          inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      trait labeledElement extends StObject {
        
        var includeLabel: js.UndefOr[Boolean] = js.undefined
        
        var label: String
        
        var labelLayout: js.UndefOr[horizontal | vertical] = js.undefined
        
        var role: js.UndefOr[String] = js.undefined
        
        var widths: js.UndefOr[js.Tuple2[String, String]] = js.undefined
      }
      object labeledElement {
        
        inline def apply(label: String): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.labeledElement = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.labeledElement]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.labeledElement](x: Self) {
          
          inline def setIncludeLabel(value: Boolean): Self = StObject.set(x, "includeLabel", value.asInstanceOf[js.Any])
          
          inline def setIncludeLabelUndefined: Self = StObject.set(x, "includeLabel", js.undefined)
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setLabelLayout(value: horizontal | vertical): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
          
          inline def setLabelLayoutUndefined: Self = StObject.set(x, "labelLayout", js.undefined)
          
          inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
          
          inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
          
          inline def setWidths(value: js.Tuple2[String, String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
          
          inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        }
      }
      
      trait radio extends StObject {
        
        var default: Any
        
        var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object radio {
        
        inline def apply(default: Any, items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.radio = {
          val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.radio]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.radio](x: Self) {
          
          inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          inline def setItems(value: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsVarargs(value: ((js.Tuple2[String, String]) | js.Array[String])*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait select extends StObject {
        
        var default: Any
        
        var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
        
        var multiple: js.UndefOr[Boolean] = js.undefined
        
        var size: js.UndefOr[Double] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object select {
        
        inline def apply(default: Any, items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.select = {
          val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.select]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.select](x: Self) {
          
          inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          inline def setItems(value: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsVarargs(value: ((js.Tuple2[String, String]) | js.Array[String])*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
          
          inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
          
          inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait textInput extends StObject {
        
        var default: js.UndefOr[String] = js.undefined
        
        var maxLength: js.UndefOr[Double] = js.undefined
        
        var size: js.UndefOr[String] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object textInput {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textInput = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textInput]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textInput](x: Self) {
          
          inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
          
          inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
          
          inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait textarea extends StObject {
        
        var default: js.UndefOr[String] = js.undefined
        
        var cols: js.UndefOr[Double] = js.undefined
        
        var rows: js.UndefOr[Double] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object textarea {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textarea = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textarea]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.textarea](x: Self) {
          
          inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
          
          inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
          
          inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
          
          inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
          
          inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
          
          inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait uiElement extends StObject {
        
        var accessKey: js.UndefOr[String] = js.undefined
        
        var className: js.UndefOr[String] = js.undefined
        
        var hidden: js.UndefOr[Boolean] = js.undefined
        
        var id: String
        
        var style: js.UndefOr[String] = js.undefined
        
        var title: js.UndefOr[String] = js.undefined
        
        var `type`: Double
      }
      object uiElement {
        
        inline def apply(id: String, `type`: Double): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement](x: Self) {
          
          inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
          
          inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
          
          inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
          
          inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
          
          inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
          
          inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      trait vbox extends StObject {
        
        var align: js.UndefOr[String] = js.undefined
        
        var expand: js.UndefOr[Boolean] = js.undefined
        
        var heights: js.UndefOr[js.Array[String]] = js.undefined
        
        var padding: js.UndefOr[String] = js.undefined
        
        var width: js.UndefOr[String] = js.undefined
      }
      object vbox {
        
        inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.vbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.vbox]
        }
        
        extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.definitions.vbox](x: Self) {
          
          inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
          
          inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
          
          inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
          
          inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
          
          inline def setHeights(value: js.Array[String]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
          
          inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
          
          inline def setHeightsVarargs(value: String*): Self = StObject.set(x, "heights", js.Array(value*))
          
          inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
          
          inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
          
          inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
    }
    
    type fieldset = uiElement
    
    trait file
      extends StObject
         with labeledElement {
      
      def getAction(): String
      
      def registerEvents(definition: StringDictionary[Any]): file
      
      def reset(): Unit
      
      def setInitValue(): Unit
      
      def submit(): file
    }
    object file {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getAction: CallbackTo[String],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getLabel: CallbackTo[String],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: StringDictionary[Any] => file,
        reset: Callback,
        selectParentTab: CallbackTo[uiElement],
        setInitValue: Callback,
        setValue: (Any, Boolean) => js.UndefOr[uiElement],
        setlabel: String => labeledElement,
        submit: CallbackTo[file]
      ): file = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyUp(t0, t1)).runNow()), disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getAction = getAction.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getLabel = getLabel.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), reset = reset.toJsFn, selectParentTab = selectParentTab.toJsFn, setInitValue = setInitValue.toJsFn, setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel), submit = submit.toJsFn)
        __obj.asInstanceOf[file]
      }
      
      extension [Self <: file](x: Self) {
        
        inline def setGetAction(value: CallbackTo[String]): Self = StObject.set(x, "getAction", value.toJsFn)
        
        inline def setRegisterEvents(value: StringDictionary[Any] => file): Self = StObject.set(x, "registerEvents", js.Any.fromFunction1(value))
        
        inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
        
        inline def setSetInitValue(value: Callback): Self = StObject.set(x, "setInitValue", value.toJsFn)
        
        inline def setSubmit(value: CallbackTo[file]): Self = StObject.set(x, "submit", value.toJsFn)
      }
    }
    
    type fileButton = typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.button
    
    @js.native
    trait hbox
      extends StObject
         with uiElement {
      
      def getChild(indices: js.Array[Double]): js.Array[uiElement] = js.native
      def getChild(indices: Double): uiElement = js.native
    }
    
    type html = uiElement
    
    type iframeElement = uiElement
    
    trait labeledElement
      extends StObject
         with uiElement {
      
      def getLabel(): String
      
      def setlabel(label: String): labeledElement
    }
    object labeledElement {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getLabel: CallbackTo[String],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: CallbackTo[uiElement],
        setValue: (Any, Boolean) => js.UndefOr[uiElement],
        setlabel: String => labeledElement
      ): labeledElement = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyUp(t0, t1)).runNow()), disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getLabel = getLabel.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = selectParentTab.toJsFn, setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[labeledElement]
      }
      
      extension [Self <: labeledElement](x: Self) {
        
        inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
        
        inline def setSetlabel(value: String => labeledElement): Self = StObject.set(x, "setlabel", js.Any.fromFunction1(value))
      }
    }
    
    trait radio
      extends StObject
         with labeledElement {
      
      def accessKeyUp(): Unit
      
      def setValue(value: String, noChangeEvent: Boolean): Unit
    }
    object radio {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getLabel: CallbackTo[String],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: CallbackTo[uiElement],
        setValue: (String, Boolean) => Callback,
        setlabel: String => labeledElement
      ): radio = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = accessKeyUp.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getLabel = getLabel.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = selectParentTab.toJsFn, setValue = js.Any.fromFunction2((t0: String, t1: Boolean) => (setValue(t0, t1)).runNow()), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[radio]
      }
      
      extension [Self <: radio](x: Self) {
        
        inline def setAccessKeyUp(value: Callback): Self = StObject.set(x, "accessKeyUp", value.toJsFn)
        
        inline def setSetValue(value: (String, Boolean) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      }
    }
    
    @js.native
    trait select
      extends StObject
         with uiElement {
      
      def add(label: String): select = js.native
      def add(label: String, value: String): select = js.native
      def add(label: String, value: String, indexedDB: Double): select = js.native
      def add(label: String, value: Unit, indexedDB: Double): select = js.native
      
      def clear(): select = js.native
      
      def remove(index: Double): select = js.native
    }
    
    trait textInput
      extends StObject
         with labeledElement {
      
      def accessKeyUp(): Unit
      
      def getDirectionMarker(): String
      
      def select(): Unit
      
      def setDirectionMarker(dir: String): Unit
      
      def setValue(value: String, noChangeEvent: Boolean): textInput
    }
    object textInput {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getDirectionMarker: CallbackTo[String],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getLabel: CallbackTo[String],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        select: Callback,
        selectParentTab: CallbackTo[uiElement],
        setDirectionMarker: String => Callback,
        setValue: (String, Boolean) => textInput,
        setlabel: String => labeledElement
      ): textInput = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = accessKeyUp.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getDirectionMarker = getDirectionMarker.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getLabel = getLabel.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), select = select.toJsFn, selectParentTab = selectParentTab.toJsFn, setDirectionMarker = js.Any.fromFunction1((t0: String) => setDirectionMarker(t0).runNow()), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[textInput]
      }
      
      extension [Self <: textInput](x: Self) {
        
        inline def setAccessKeyUp(value: Callback): Self = StObject.set(x, "accessKeyUp", value.toJsFn)
        
        inline def setGetDirectionMarker(value: CallbackTo[String]): Self = StObject.set(x, "getDirectionMarker", value.toJsFn)
        
        inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
        
        inline def setSetDirectionMarker(value: String => Callback): Self = StObject.set(x, "setDirectionMarker", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetValue(value: (String, Boolean) => textInput): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    type textarea = labeledElement
    
    trait uiElement extends StObject {
      
      def accessKeyDown(dialog: typingsJapgolly.ckeditor4.CKEDITOR.dialog, key: String): Unit
      
      def accessKeyUp(dialog: typingsJapgolly.ckeditor4.CKEDITOR.dialog, key: String): Unit
      
      def disable(): Unit
      
      def enable(): Unit
      
      var eventProcessors: Any
      
      def focus(): js.UndefOr[uiElement]
      
      def getDialog(): typingsJapgolly.ckeditor4.CKEDITOR.dialog
      
      def getElement(): element
      
      def getInputElement(): element
      
      def getValue(): Any
      
      def isChanged(): Boolean
      
      def isEnabled(): Boolean
      
      def isFocusable(): Boolean
      
      def isVisible(): Boolean
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      def registerEvents(definition: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement): uiElement
      
      def selectParentTab(): uiElement
      
      def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[uiElement]
    }
    object uiElement {
      
      inline def apply(
        accessKeyDown: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        accessKeyUp: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback,
        disable: Callback,
        enable: Callback,
        eventProcessors: Any,
        focus: CallbackTo[js.UndefOr[uiElement]],
        getDialog: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog],
        getElement: CallbackTo[element],
        getInputElement: CallbackTo[element],
        getValue: CallbackTo[Any],
        isChanged: CallbackTo[Boolean],
        isEnabled: CallbackTo[Boolean],
        isFocusable: CallbackTo[Boolean],
        isVisible: CallbackTo[Boolean],
        registerEvents: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: CallbackTo[uiElement],
        setValue: (Any, Boolean) => js.UndefOr[uiElement]
      ): uiElement = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyDown(t0, t1)).runNow()), accessKeyUp = js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (accessKeyUp(t0, t1)).runNow()), disable = disable.toJsFn, enable = enable.toJsFn, eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = focus.toJsFn, getDialog = getDialog.toJsFn, getElement = getElement.toJsFn, getInputElement = getInputElement.toJsFn, getValue = getValue.toJsFn, isChanged = isChanged.toJsFn, isEnabled = isEnabled.toJsFn, isFocusable = isFocusable.toJsFn, isVisible = isVisible.toJsFn, registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = selectParentTab.toJsFn, setValue = js.Any.fromFunction2(setValue))
        __obj.asInstanceOf[uiElement]
      }
      
      extension [Self <: uiElement](x: Self) {
        
        inline def setAccessKeyDown(value: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback): Self = StObject.set(x, "accessKeyDown", js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (value(t0, t1)).runNow()))
        
        inline def setAccessKeyUp(value: (typingsJapgolly.ckeditor4.CKEDITOR.dialog, String) => Callback): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction2((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog, t1: String) => (value(t0, t1)).runNow()))
        
        inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
        
        inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
        
        inline def setEventProcessors(value: Any): Self = StObject.set(x, "eventProcessors", value.asInstanceOf[js.Any])
        
        inline def setFocus(value: CallbackTo[js.UndefOr[uiElement]]): Self = StObject.set(x, "focus", value.toJsFn)
        
        inline def setGetDialog(value: CallbackTo[typingsJapgolly.ckeditor4.CKEDITOR.dialog]): Self = StObject.set(x, "getDialog", value.toJsFn)
        
        inline def setGetElement(value: CallbackTo[element]): Self = StObject.set(x, "getElement", value.toJsFn)
        
        inline def setGetInputElement(value: CallbackTo[element]): Self = StObject.set(x, "getInputElement", value.toJsFn)
        
        inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
        
        inline def setIsChanged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChanged", value.toJsFn)
        
        inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
        
        inline def setIsFocusable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusable", value.toJsFn)
        
        inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
        
        inline def setRegisterEvents(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => uiElement): Self = StObject.set(x, "registerEvents", js.Any.fromFunction1(value))
        
        inline def setSelectParentTab(value: CallbackTo[uiElement]): Self = StObject.set(x, "selectParentTab", value.toJsFn)
        
        inline def setSetValue(value: (Any, Boolean) => js.UndefOr[uiElement]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    type vbox = hbox
  }
  
  @js.native
  trait floatPanel extends StObject {
    
    def addBlock(name: String, block: StringDictionary[Any]): Unit = js.native
    
    def addListBlock(name: String, multiSelect: Boolean): Unit = js.native
    
    def allowBlur(allow: Boolean): Unit = js.native
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getBlock(name: String): block = js.native
    
    def hide(returnFocus: Boolean): Unit = js.native
    
    def hideChild(restoreFocus: Boolean): Unit = js.native
    
    def reposition(): Unit = js.native
    
    def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double): Unit = js.native
    def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
    def showAsChild(
      panel: floatPanel,
      blckName: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def showAsChild(
      panel: floatPanel,
      blckName: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    
    def showBlock(name: String, offsetParent: element, corner: Double): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Double,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Unit,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Unit, offsetY: Double): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Double,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Unit,
      callback: js.Function0[Unit]
    ): Unit = js.native
  }
  
  trait handlerDefinition[T] extends StObject {
    
    var contentsElement: element
    
    def create(definition: StringDictionary[Any]): T
  }
  object handlerDefinition {
    
    inline def apply[T](contentsElement: element, create: StringDictionary[Any] => T): handlerDefinition[T] = {
      val __obj = js.Dynamic.literal(contentsElement = contentsElement.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[handlerDefinition[T]]
    }
    
    extension [Self <: handlerDefinition[?], T](x: Self & handlerDefinition[T]) {
      
      inline def setContentsElement(value: element): Self = StObject.set(x, "contentsElement", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: StringDictionary[Any] => T): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  type menuButton = button
  
  @js.native
  trait panel extends StObject {
    
    def addBlock(name: String, block: StringDictionary[Any]): Unit = js.native
    
    def getBlock(name: String): block = js.native
    
    def render(editor: editor): Unit = js.native
    def render(editor: editor, output: js.Array[String]): Unit = js.native
    
    def showBlock(name: String): Unit = js.native
  }
  object panel {
    
    trait block extends StObject {
      
      def getItems(): nodeList
      
      def markItem(index: Double): Unit
    }
    object block {
      
      inline def apply(getItems: CallbackTo[nodeList], markItem: Double => Callback): block = {
        val __obj = js.Dynamic.literal(getItems = getItems.toJsFn, markItem = js.Any.fromFunction1((t0: Double) => markItem(t0).runNow()))
        __obj.asInstanceOf[block]
      }
      
      extension [Self <: block](x: Self) {
        
        inline def setGetItems(value: CallbackTo[nodeList]): Self = StObject.set(x, "getItems", value.toJsFn)
        
        inline def setMarkItem(value: Double => Callback): Self = StObject.set(x, "markItem", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      }
    }
  }
  
  type panelButton = button
  
  trait richCombo extends StObject {
    
    def render(editor: editor, output: js.Array[String]): Unit
  }
  object richCombo {
    
    inline def apply(render: (editor, js.Array[String]) => Callback): richCombo = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2((t0: editor, t1: js.Array[String]) => (render(t0, t1)).runNow()))
      __obj.asInstanceOf[richCombo]
    }
    
    extension [Self <: richCombo](x: Self) {
      
      inline def setRender(value: (editor, js.Array[String]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: editor, t1: js.Array[String]) => (value(t0, t1)).runNow()))
    }
  }
}
