package typingsJapgolly.jsoneditoronline

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("JSONEditor")
  @js.native
  open class JSONEditor protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONEditor {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONEditorOptions) = this()
    def this(container: HTMLElement, options: Unit, json: Any) = this()
    def this(container: HTMLElement, options: JSONEditorOptions, json: Any) = this()
  }
  object JSONEditor {
    
    @JSGlobal("JSONEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addClassName(elem: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @JSGlobal("JSONEditor.focusNode")
    @js.native
    def focusNode: typingsJapgolly.jsoneditoronline.JSONEditorNode = js.native
    inline def focusNode_=(x: typingsJapgolly.jsoneditoronline.JSONEditorNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("JSONEditor.freezeHighlight")
    @js.native
    def freezeHighlight: Boolean = js.native
    inline def freezeHighlight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("freezeHighlight")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getAbsoluteLeft(elem: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteLeft")(elem.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def getAbsoluteTop(elem: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteTop")(elem.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def getInnerText(element: HTMLElement, buffer: JSONEditorBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerText")(element.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def getInternetExplorerVersion(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternetExplorerVersion")().asInstanceOf[Double]
    
    /* static member */
    inline def getNodeFromTarget(target: HTMLElement): typingsJapgolly.jsoneditoronline.JSONEditorNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeFromTarget")(target.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsoneditoronline.JSONEditorNode]
    
    /* static member */
    inline def parse(jsonString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(jsonString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /* static member */
    inline def removeClassName(elem: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def setEndOfContentEditable(contentEditableElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEndOfContentEditable")(contentEditableElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def stripFormatting(divElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stripFormatting")(divElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def validate(jsonString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(jsonString.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("JSONEditorAppendNode")
  @js.native
  open class JSONEditorAppendNode protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONEditorNode {
    def this(editor: typingsJapgolly.jsoneditoronline.JSONEditor) = this()
    
    /* CompleteClass */
    override def appendChild(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): Unit = js.native
    
    /* CompleteClass */
    override def blur(): Unit = js.native
    
    /* CompleteClass */
    override def changeType(newType: String): Unit = js.native
    
    /* CompleteClass */
    override def clearDom(): Unit = js.native
    
    /* CompleteClass */
    override def collapse(recurse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def containsNode(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): Boolean = js.native
    
    /* CompleteClass */
    override def expand(recurse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /* CompleteClass */
    override def getAppend(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getDom(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getField(): String = js.native
    
    /* CompleteClass */
    override def getLevel(): Double = js.native
    
    /* CompleteClass */
    override def getParent(): typingsJapgolly.jsoneditoronline.JSONEditorNode = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def hideChilds(): Unit = js.native
    
    /* CompleteClass */
    override def insertBefore(
      node: typingsJapgolly.jsoneditoronline.JSONEditorNode,
      beforeNode: typingsJapgolly.jsoneditoronline.JSONEditorNode
    ): Unit = js.native
    
    /* CompleteClass */
    override def moveBefore(
      node: typingsJapgolly.jsoneditoronline.JSONEditorNode,
      beforeNode: typingsJapgolly.jsoneditoronline.JSONEditorNode
    ): Unit = js.native
    
    /* CompleteClass */
    override def moveTo(node: typingsJapgolly.jsoneditoronline.JSONEditorNode, index: Double): Unit = js.native
    
    /* CompleteClass */
    override def onEvent(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeChild(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): typingsJapgolly.jsoneditoronline.JSONEditorNode = js.native
    
    /* CompleteClass */
    override def scrollTo(): Unit = js.native
    
    /* CompleteClass */
    override def search(text: String): js.Array[typingsJapgolly.jsoneditoronline.JSONEditorNode] = js.native
    
    /* CompleteClass */
    override def setField(field: String, fieldEditable: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setHighlight(highlight: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setParent(parent: typingsJapgolly.jsoneditoronline.JSONEditorNode): Unit = js.native
    
    /* CompleteClass */
    override def setValue(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def showChilds(): Unit = js.native
    
    /* CompleteClass */
    var types: js.Array[JSONEditorNodeType] = js.native
    
    /* CompleteClass */
    override def updateDom(): Unit = js.native
    
    /* CompleteClass */
    override def updateField(field: String): Unit = js.native
    
    /* CompleteClass */
    override def updateValue(value: Any): Unit = js.native
  }
  
  @JSGlobal("JSONEditorHistory")
  @js.native
  open class JSONEditorHistory protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONEditorHistory {
    def this(editor: typingsJapgolly.jsoneditoronline.JSONEditor) = this()
    
    /* CompleteClass */
    override def add(action: String, params: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def canRedo(): Boolean = js.native
    
    /* CompleteClass */
    override def canUndo(): Boolean = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def onChange(): Unit = js.native
    
    /* CompleteClass */
    override def redo(): Unit = js.native
    
    /* CompleteClass */
    override def undo(): Unit = js.native
  }
  
  @JSGlobal("JSONEditorNode")
  @js.native
  open class JSONEditorNode protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONEditorNode {
    def this(editor: typingsJapgolly.jsoneditoronline.JSONEditor, params: JSONEditorConstructorParams) = this()
    
    /* CompleteClass */
    override def appendChild(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): Unit = js.native
    
    /* CompleteClass */
    override def blur(): Unit = js.native
    
    /* CompleteClass */
    override def changeType(newType: String): Unit = js.native
    
    /* CompleteClass */
    override def clearDom(): Unit = js.native
    
    /* CompleteClass */
    override def collapse(recurse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def containsNode(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): Boolean = js.native
    
    /* CompleteClass */
    override def expand(recurse: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /* CompleteClass */
    override def getAppend(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getDom(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getField(): String = js.native
    
    /* CompleteClass */
    override def getLevel(): Double = js.native
    
    /* CompleteClass */
    override def getParent(): typingsJapgolly.jsoneditoronline.JSONEditorNode = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def hideChilds(): Unit = js.native
    
    /* CompleteClass */
    override def insertBefore(
      node: typingsJapgolly.jsoneditoronline.JSONEditorNode,
      beforeNode: typingsJapgolly.jsoneditoronline.JSONEditorNode
    ): Unit = js.native
    
    /* CompleteClass */
    override def moveBefore(
      node: typingsJapgolly.jsoneditoronline.JSONEditorNode,
      beforeNode: typingsJapgolly.jsoneditoronline.JSONEditorNode
    ): Unit = js.native
    
    /* CompleteClass */
    override def moveTo(node: typingsJapgolly.jsoneditoronline.JSONEditorNode, index: Double): Unit = js.native
    
    /* CompleteClass */
    override def onEvent(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def removeChild(node: typingsJapgolly.jsoneditoronline.JSONEditorNode): typingsJapgolly.jsoneditoronline.JSONEditorNode = js.native
    
    /* CompleteClass */
    override def scrollTo(): Unit = js.native
    
    /* CompleteClass */
    override def search(text: String): js.Array[typingsJapgolly.jsoneditoronline.JSONEditorNode] = js.native
    
    /* CompleteClass */
    override def setField(field: String, fieldEditable: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setHighlight(highlight: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setParent(parent: typingsJapgolly.jsoneditoronline.JSONEditorNode): Unit = js.native
    
    /* CompleteClass */
    override def setValue(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def showChilds(): Unit = js.native
    
    /* CompleteClass */
    var types: js.Array[JSONEditorNodeType] = js.native
    
    /* CompleteClass */
    override def updateDom(): Unit = js.native
    
    /* CompleteClass */
    override def updateField(field: String): Unit = js.native
    
    /* CompleteClass */
    override def updateValue(value: Any): Unit = js.native
  }
  
  @JSGlobal("JSONEditorSearchBox")
  @js.native
  open class JSONEditorSearchBox protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONEditorSearchBox {
    def this(editor: typingsJapgolly.jsoneditoronline.JSONEditor, container: HTMLElement) = this()
    
    /* CompleteClass */
    override def clearDelay(): Unit = js.native
    
    /* CompleteClass */
    override def focusActiveResult(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    override def onDelayedSearch(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onKeyDown(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onKeyUp(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def onSearch(event: Event, forcedSearch: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def previous(): Unit = js.native
    
    /* CompleteClass */
    override def setActiveResult(index: Double): Unit = js.native
  }
  
  @JSGlobal("JSONFormatter")
  @js.native
  open class JSONFormatter protected ()
    extends StObject
       with typingsJapgolly.jsoneditoronline.JSONFormatter {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions) = this()
    def this(container: HTMLElement, options: Unit, json: Any) = this()
    def this(container: HTMLElement, options: JSONFormatterOptions, json: Any) = this()
    
    /* CompleteClass */
    override def get(): js.Object = js.native
    
    /* CompleteClass */
    override def getText(): String = js.native
    
    /* CompleteClass */
    override def onError(err: String): Unit = js.native
    
    /* CompleteClass */
    override def set(json: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def setText(jsonString: String): Unit = js.native
  }
}
