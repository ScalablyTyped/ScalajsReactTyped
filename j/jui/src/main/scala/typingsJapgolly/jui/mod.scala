package typingsJapgolly.jui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jui.anon.Align
import typingsJapgolly.jui.anon.Animated
import typingsJapgolly.jui.anon.AutoFold
import typingsJapgolly.jui.anon.AutoHide
import typingsJapgolly.jui.anon.BarSize
import typingsJapgolly.jui.anon.Bottom
import typingsJapgolly.jui.anon.Checked
import typingsJapgolly.jui.anon.Close
import typingsJapgolly.jui.anon.Color
import typingsJapgolly.jui.anon.Count
import typingsJapgolly.jui.anon.Date
import typingsJapgolly.jui.anon.Delay
import typingsJapgolly.jui.anon.Distance
import typingsJapgolly.jui.anon.Drag
import typingsJapgolly.jui.anon.DragChild
import typingsJapgolly.jui.anon.Event
import typingsJapgolly.jui.anon.Flex
import typingsJapgolly.jui.anon.Format
import typingsJapgolly.jui.anon.Items
import typingsJapgolly.jui.juiStrings.horizontal
import typingsJapgolly.jui.juiStrings.vertical
import typingsJapgolly.juiCore.mod.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait UIAccordion
    extends StObject
       with UIEvent {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: AutoFold): this.type = js.native
    
    /**
      * Gets the index of the currently enabled node
      *
      * @return Index
      */
    def activeIndex(): Double = js.native
  }
  
  @js.native
  trait UIAutoComplete extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Event): this.type = js.native
    
    def close(): Unit = js.native
    
    /**
      * Gets filtered words subject to autofill
      *
      * @return words
      */
    def list(): js.Array[String] = js.native
    
    /**
      * Updates words subject to autofill
      *
      *
      */
    def update(newWords: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait UIColorPicker extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Color): this.type = js.native
    
    def getColor(`type`: String): String | js.Object = js.native
    
    def setColor(value: String): Unit = js.native
    def setColor(value: js.Object): Unit = js.native
  }
  
  @js.native
  trait UICombo extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Flex): this.type = js.native
    
    def fold(): Unit = js.native
    
    /**
      * Gets the data of the button currently selected
      *
      */
    def getData(): js.Object = js.native
    
    /**
      * Gets the markup text of the button currently selected
      *
      */
    def getText(): String = js.native
    
    /**
      * Gets the value of the button currently selected
      *
      */
    def getValue(): Any = js.native
    
    def open(e: Any): Unit = js.native
    
    def reload(): Unit = js.native
    
    /**
      * Selects a button of a specified index
      *
      */
    def setIndex(index: Double): Unit = js.native
    
    /**
      * Selects a button having a specified value
      *
      */
    def setValue(value: Any): Unit = js.native
  }
  
  @js.native
  trait UIDatePicker extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Date): this.type = js.native
    
    def addTime(time: js.Date): Unit = js.native
    /**
      * Selects a date corresponding to the time added to the currently selected date
      *
      * @param time Timestamp or Date
      */
    def addTime(time: Double): Unit = js.native
    
    /**
      * Gets the value of the date currently selected
      *
      * @return Date object
      */
    def getDate(): js.Date = js.native
    
    /**
      * Gets a date string that fits the format entered
      *
      * @return format Formatted date string
      */
    def getFormat(format: String): String = js.native
    
    /**
      * Gets the timestamp value of the date currently selected
      *
      * @return Timestamp
      */
    def getTime(): Double = js.native
    
    def next(e: Any): Unit = js.native
    def next(e: Any, moveYear: Boolean): Unit = js.native
    
    /**
      * Outputs a calendar that fits the year/month entered
      *
      */
    def page(y: Double, m: Double): Unit = js.native
    
    def prev(e: Any): Unit = js.native
    def prev(e: Any, moveYear: Boolean): Unit = js.native
    
    def reload(): Unit = js.native
    
    /**
      * Selects today if there is no value, or selects a date applicable to a timestamp or year/month/date
      *
      * @param "year"/"month"/"date"/"timestamp"/"Date"
      */
    def select(args: Any*): Unit = js.native
  }
  
  @js.native
  trait UIDropdown extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Close): this.type = js.native
    
    def hide(): Unit = js.native
    
    /**
      * Moves a dropdown to the specified coordinates
      *
      */
    def move(x: Double, y: Double): Unit = js.native
    
    def reload(): Unit = js.native
    
    /**
      * Shows a dropdown at the specified coordinates
      *
      */
    def show(x: Double, y: Double): Unit = js.native
    
    /**
      * Changes the dropdown list
      *
      * @param nodes Dropdown list
      */
    def update(nodes: js.Array[Any]): Unit = js.native
  }
  
  @js.native
  trait UIModal extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: AutoHide): this.type = js.native
    
    def hide(): Unit = js.native
    
    def resize(): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  trait UINotify extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Distance): this.type = js.native
    
    /**
      * Adds a notice message. The value passed is the data object shown by the notice template
      *
      */
    def add(data: js.Object, timeout: Double): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait UIPaging extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Count): this.type = js.native
    
    def first(): Unit = js.native
    
    def last(): Unit = js.native
    
    def next(): Unit = js.native
    
    /**
      * Changes to a specified page number, and gets the currently enabled page number if there is no parameter
      *
      * @param pNo Page number
      */
    def page(pNo: Double): Unit = js.native
    
    def prev(): Unit = js.native
    
    /**
      * Reloads the number of specified data records, or reloads the initially configured number of data records if there is no parameter
      *
      * @param count Data total count
      */
    def reload(count: Double): Unit = js.native
  }
  
  @js.native
  trait UIProgress extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Animated): this.type = js.native
    
    def getValue(): Double = js.native
    
    def setAnimated(isAnimated: Boolean): Unit = js.native
    
    def setStriped(isStriped: Boolean): Unit = js.native
    
    def setValue(v: Double): Unit = js.native
  }
  
  @js.native
  trait UIProperty extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Items): this.type = js.native
    
    def addItem(item: js.Array[Any]): Unit = js.native
    def addItem(item: js.Object): Unit = js.native
    
    /**
      *
      * collapse group's children
      *
      */
    def collapsed(id: String): Unit = js.native
    
    /**
      *
      * expand group's children
      *
      */
    def expanded(id: String): Unit = js.native
    
    def findItem(key: String): Any = js.native
    
    def findRender(key: String): Any = js.native
    
    def getAllValue(key: String): Any = js.native
    
    def getDefaultValue(): js.Array[Any] = js.native
    
    def getGroupList(): js.Array[Any] = js.native
    
    /**
      *
      * get a list of property's value
      *
      * @param [key=null]  if key is null, value is all properties.
      */
    def getValue(): js.Object | js.Array[Any] = js.native
    def getValue(key: String): js.Object | js.Array[Any] = js.native
    
    def initValue(obj: js.Object): Unit = js.native
    
    def loadItems(newItems: js.Array[Any]): Unit = js.native
    
    def refreshValue($dom: Any, newValue: Any): Unit = js.native
    
    // remove item by key or title
    def removeItem(item: js.Object): Unit = js.native
    
    /**
      *
      * set a list of property's value
      *
      */
    def setValue(obj: js.Object): Unit = js.native
    
    def updateValue(key: String, value: Any): Unit = js.native
  }
  
  @js.native
  trait UISelect extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Align): this.type = js.native
    
    def getSelectedIndex(): Double = js.native
    
    def getValue(): Any | js.Array[Any] = js.native
    
    def setSelectedIndex(index: Double): Unit = js.native
    
    def setValue(value: js.Array[Any]): Unit = js.native
    def setValue(value: Any): Unit = js.native
    
    def update(data: js.Array[Any]): Unit = js.native
  }
  
  @js.native
  trait UISlider extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Format): this.type = js.native
    
    /**
      * get FromHandle's value
      *
      * @return value
      */
    def getFromValue(): Double = js.native
    
    /**
      * get ToHandle's value
      *
      * @return value
      */
    def getToValue(): Double = js.native
    
    /**
      * set FromHandle's value
      */
    def setFromValue(value: Double): Unit = js.native
    
    /**
      * set ToHandle's value
      */
    def setToValue(value: Double): Unit = js.native
  }
  
  @js.native
  trait UISplitter extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: BarSize): this.type = js.native
    
    def setDirection(d: horizontal | vertical): Unit = js.native
    
    def setHide(index: Double): Unit = js.native
    
    def setInitSize(size: Double): Unit = js.native
    
    def setShow(index: Double): Unit = js.native
    
    def toggle(index: Double): Unit = js.native
  }
  
  @js.native
  trait UISwitch extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Checked): this.type = js.native
    
    def getValue(): Boolean = js.native
    
    def setValue(value: Boolean): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  @js.native
  trait UITab extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Drag): this.type = js.native
    
    /**
      * Gets the index of the currently enabled tab
      *
      */
    def activeIndex(): Double = js.native
    
    /**
      * Adds a tab to the last node
      *
      */
    def append(node: js.Object): Unit = js.native
    
    /**
      * Disables the tab at a specified index
      *
      */
    def disable(index: Double): Unit = js.native
    
    /**
      * Enables the tab at a specified index
      *
      */
    def enable(index: Double): Unit = js.native
    
    /**
      * Adds a tab at a specified index
      *
      */
    def insert(index: Double, node: js.Object): Unit = js.native
    
    /**
      * Changes a specified tab to a tab at a target index
      *
      */
    def move(index: Double, targetIndex: Double): Unit = js.native
    
    /**
      * Adds a tab to the first node
      *
      */
    def prepend(node: js.Object): Unit = js.native
    
    /**
      * Removes a tab at a specified index
      *
      */
    def remove(index: Double): Unit = js.native
    
    /**
      * Enables the tab at a specified index
      *
      */
    def show(index: Double): Unit = js.native
    
    /**
      * Changes the tab list
      *
      */
    def update(nodes: js.Array[Any]): Unit = js.native
  }
  
  @js.native
  trait UITooltip extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Delay): this.type = js.native
    
    /**
      * Changes the content of a tooltip
      *
      */
    def update(newTitle: String): Unit = js.native
  }
  
  @js.native
  trait UITree extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: DragChild): this.type = js.native
    
    /**
      * Gets the index of a node that is activated in an active state.
      *
      * @return index
      */
    def activeIndex(): Double = js.native
    
    /**
      * Adds to a child node at a specified index.
      *
      * @param param1 index or data (Array/String)
      * @param param2 null or data
      */
    def append(args: Any*): Unit = js.native
    
    /**
      * Folds up a child node at a specified index.
      *
      */
    def fold(index: String, e: Any): Unit = js.native
    
    /**
      * Folds up all child nodes at a specified index.
      *
      */
    def foldAll(index: String): Unit = js.native
    
    /**
      * Gets a node at a specified index
      *
      * @return node
      */
    def get(index: String): UITreeNode = js.native
    
    /**
      * Gets all nodes at a specified index including child nodes.
      *
      * @return nodes
      */
    def getAll(index: String): js.Array[UITreeNode] = js.native
    
    /**
      * Adds a node at a specified index.
      *
      */
    def insert(index: String, data: js.Array[Any]): Unit = js.native
    
    /**
      * Return all nodes of the root.
      *
      * @return nodes
      */
    def list(): js.Array[UITreeNode] = js.native
    
    /**
      * Returns all child nodes.
      *
      * @return nodes
      */
    def listAll(): js.Array[UITreeNode] = js.native
    
    /**
      * Returns all parent nodes at a specified index.
      *
      * @return nodes
      */
    def listParents(index: String): js.Array[UITreeNode] = js.native
    
    /**
      * Moves a node at a specified index to the target index.
      *
      */
    def move(index: String, targetIndex: String): Unit = js.native
    
    /**
      * Shows a child node at a specified index.
      *
      */
    def open(index: String, e: Any): Unit = js.native
    
    /**
      * Shows all child nodes at a specified index.
      *
      */
    def openAll(index: String): Unit = js.native
    
    /**
      * Deletes a node at a specified index.
      *
      */
    def remove(index: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Adds a node at a specified index.
      *
      * @return node
      */
    def select(index: String): UITreeNode = js.native
    
    def unselect(): Unit = js.native
    
    /**
      * Changes to the node at a specified index.
      *
      */
    def update(index: String, data: js.Array[Any]): Unit = js.native
  }
  
  trait UITreeBase extends StObject {
    
    def appendNode(args: Any*): UITreeNode
    
    def foldNode(index: String): Unit
    
    def foldNodeAll(index: String): Unit
    
    def getNode(index: String): UITreeNode
    
    def getNodeAll(index: String): js.Array[UITreeNode]
    
    def getNodeParent(index: String): UITreeNode
    
    def getRoot(): UITreeNode
    
    def insertNode(index: String, data: Any): UITreeNode
    
    def moveNode(index: String, targetIndex: Double): Unit
    
    def openNode(index: String): Unit
    
    def openNodeAll(index: String): Unit
    
    def removeNode(index: String): Unit
    
    def removeNodes(): Unit
    
    def updateNode(index: String, data: Any): UITreeNode
  }
  object UITreeBase {
    
    inline def apply(
      appendNode: /* repeated */ Any => UITreeNode,
      foldNode: String => Callback,
      foldNodeAll: String => Callback,
      getNode: String => UITreeNode,
      getNodeAll: String => js.Array[UITreeNode],
      getNodeParent: String => UITreeNode,
      getRoot: CallbackTo[UITreeNode],
      insertNode: (String, Any) => UITreeNode,
      moveNode: (String, Double) => Callback,
      openNode: String => Callback,
      openNodeAll: String => Callback,
      removeNode: String => Callback,
      removeNodes: Callback,
      updateNode: (String, Any) => UITreeNode
    ): UITreeBase = {
      val __obj = js.Dynamic.literal(appendNode = js.Any.fromFunction1(appendNode), foldNode = js.Any.fromFunction1((t0: String) => foldNode(t0).runNow()), foldNodeAll = js.Any.fromFunction1((t0: String) => foldNodeAll(t0).runNow()), getNode = js.Any.fromFunction1(getNode), getNodeAll = js.Any.fromFunction1(getNodeAll), getNodeParent = js.Any.fromFunction1(getNodeParent), getRoot = getRoot.toJsFn, insertNode = js.Any.fromFunction2(insertNode), moveNode = js.Any.fromFunction2((t0: String, t1: Double) => (moveNode(t0, t1)).runNow()), openNode = js.Any.fromFunction1((t0: String) => openNode(t0).runNow()), openNodeAll = js.Any.fromFunction1((t0: String) => openNodeAll(t0).runNow()), removeNode = js.Any.fromFunction1((t0: String) => removeNode(t0).runNow()), removeNodes = removeNodes.toJsFn, updateNode = js.Any.fromFunction2(updateNode))
      __obj.asInstanceOf[UITreeBase]
    }
    
    extension [Self <: UITreeBase](x: Self) {
      
      inline def setAppendNode(value: /* repeated */ Any => UITreeNode): Self = StObject.set(x, "appendNode", js.Any.fromFunction1(value))
      
      inline def setFoldNode(value: String => Callback): Self = StObject.set(x, "foldNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFoldNodeAll(value: String => Callback): Self = StObject.set(x, "foldNodeAll", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetNode(value: String => UITreeNode): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
      
      inline def setGetNodeAll(value: String => js.Array[UITreeNode]): Self = StObject.set(x, "getNodeAll", js.Any.fromFunction1(value))
      
      inline def setGetNodeParent(value: String => UITreeNode): Self = StObject.set(x, "getNodeParent", js.Any.fromFunction1(value))
      
      inline def setGetRoot(value: CallbackTo[UITreeNode]): Self = StObject.set(x, "getRoot", value.toJsFn)
      
      inline def setInsertNode(value: (String, Any) => UITreeNode): Self = StObject.set(x, "insertNode", js.Any.fromFunction2(value))
      
      inline def setMoveNode(value: (String, Double) => Callback): Self = StObject.set(x, "moveNode", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOpenNode(value: String => Callback): Self = StObject.set(x, "openNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOpenNodeAll(value: String => Callback): Self = StObject.set(x, "openNodeAll", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveNode(value: String => Callback): Self = StObject.set(x, "removeNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveNodes(value: Callback): Self = StObject.set(x, "removeNodes", value.toJsFn)
      
      inline def setUpdateNode(value: (String, Any) => UITreeNode): Self = StObject.set(x, "updateNode", js.Any.fromFunction2(value))
    }
  }
  
  trait UITreeNode extends StObject {
    
    /** List of child nodes of a specified node */
    var children: js.UndefOr[js.Array[UITreeNode]] = js.undefined
    
    /** Data of a specified node */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Depth of a specified node */
    var depth: js.UndefOr[Double] = js.undefined
    
    /** LI element of a specified node */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Index of a specified node  */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Unique number of a specifiede node at the current depth */
    var nodenum: js.UndefOr[Double] = js.undefined
    
    /** Variable that refers to the parent of the current node */
    var parent: js.UndefOr[UITreeNode] = js.undefined
    
    /** State value that indicates whether a child node is shown or hidden */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object UITreeNode {
    
    inline def apply(): UITreeNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UITreeNode]
    }
    
    extension [Self <: UITreeNode](x: Self) {
      
      inline def setChildren(value: js.Array[UITreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: UITreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setNodenum(value: Double): Self = StObject.set(x, "nodenum", value.asInstanceOf[js.Any])
      
      inline def setNodenumUndefined: Self = StObject.set(x, "nodenum", js.undefined)
      
      inline def setParent(value: UITreeNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait UIWindow extends StObject {
    
    def apply(selector: Any): this.type = js.native
    def apply(selector: Any, options: Bottom): this.type = js.native
    
    def hide(): Unit = js.native
    
    /**
      * Moves a window at specified coordinates
      *
      */
    def move(x: Double, y: Double): Unit = js.native
    
    def resize(): Unit = js.native
    
    def resizeModal(): Unit = js.native
    
    /**
      * Changes the horizontal/vertical size of a window
      *
      */
    def setSize(w: Double, h: Double): Unit = js.native
    
    /**
      * Changes the markup of the title tag in the head area of a window
      *
      */
    def setTitle(html: String): Unit = js.native
    
    /**
      * Shows a window at specified coordinates
      *
      */
    def show(x: Double, y: Double): Unit = js.native
    
    /**
      * Changes the markup in the body area of a window
      *
      */
    def update(html: String): Unit = js.native
  }
}
