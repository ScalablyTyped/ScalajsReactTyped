package typingsJapgolly.gridstack

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CSSStyleSheet
import org.scalajs.dom.DragEvent
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackElement
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackNode
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackPosition
import typingsJapgolly.gridstack.distEs5TypesMod.GridStackWidget
import typingsJapgolly.gridstack.distEs5TypesMod.numberOrString
import typingsJapgolly.gridstack.distEs5UtilsMod.HeightData
import typingsJapgolly.gridstack.distEs5UtilsMod.Utils
import typingsJapgolly.gridstack.gridstackInts.`-1`
import typingsJapgolly.gridstack.gridstackInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Target extends StObject {
    
    var target: js.UndefOr[EventTarget] = js.undefined
    
    var `type`: String
  }
  object Target {
    
    inline def apply(`type`: String): Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofUtils
    extends StObject
       with Instantiable0[Utils] {
    
    /** inserts a CSS rule */
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
    
    def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    def appendTo(el: HTMLElement, parent: String): Unit = js.native
    def appendTo(el: HTMLElement, parent: HTMLElement): Unit = js.native
    def appendTo(el: HTMLElement, parent: Node): Unit = js.native
    
    /** returns the area */
    def area(a: GridStackPosition): Double = js.native
    
    /** returns the area a and b overlap */
    def areaIntercept(a: GridStackPosition, b: GridStackPosition): Double = js.native
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    def clone[T](obj: T): T = js.native
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    def cloneDeep[T](obj: T): T = js.native
    
    /** deep clone the given HTML node, removing teh unique id field */
    def cloneNode(el: HTMLElement): HTMLElement = js.native
    
    /** return the closest parent (or itself) matching the given class */
    def closestUpByClass(el: HTMLElement, name: String): HTMLElement = js.native
    
    /** copies over b size & position (GridStackPosition), and possibly min/max as well */
    def copyPos(a: GridStackWidget, b: GridStackWidget): GridStackWidget = js.native
    def copyPos(a: GridStackWidget, b: GridStackWidget, doMinMax: Boolean): GridStackWidget = js.native
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    def createStylesheet(id: String): CSSStyleSheet = js.native
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
    
    /** copies unset fields in target to use the given default sources values */
    def defaults(target: Any, sources: Any*): js.Object = js.native
    
    /** convert a potential selector into actual single element */
    def getElement(els: GridStackElement): HTMLElement = js.native
    
    /** convert a potential selector into actual list of html elements */
    def getElements(els: GridStackElement): js.Array[HTMLElement] = js.native
    
    def initEvent[T](e: DragEvent, info: Target): T = js.native
    def initEvent[T](e: MouseEvent, info: Target): T = js.native
    
    /** returns true if a and b overlap */
    def isIntercepted(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    /** returns true if a and b touch edges or corners */
    def isTouching(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    def parseHeight(`val`: numberOrString): HeightData = js.native
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    def removeInternalAndSame(a: Any, b: Any): Unit = js.native
    
    /** removes internal fields '_' and default values for saving */
    def removeInternalForSave(n: GridStackNode): Unit = js.native
    def removeInternalForSave(n: GridStackNode, removeEl: Boolean): Unit = js.native
    
    def removePositioningStyles(el: HTMLElement): Unit = js.native
    
    /** removed the given stylesheet id */
    def removeStylesheet(id: String): Unit = js.native
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    def same(a: Any, b: Any): Boolean = js.native
    
    /** true if a and b has same size & position */
    def samePos(a: GridStackPosition, b: GridStackPosition): Boolean = js.native
    
    /** copies the MouseEvent properties and sends it as another event to the given target */
    def simulateMouseEvent(e: MouseEvent, simulatedType: String): Unit = js.native
    def simulateMouseEvent(e: MouseEvent, simulatedType: String, target: EventTarget): Unit = js.native
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    def sort(nodes: js.Array[GridStackNode]): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: `-1` | `1`, column: Double): js.Array[GridStackNode] = js.native
    def sort(nodes: js.Array[GridStackNode], dir: Unit, column: Double): js.Array[GridStackNode] = js.native
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = js.native
    
    def toBool(v: Any): Boolean = js.native
    
    def toNumber(): Double = js.native
    def toNumber(value: String): Double = js.native
  }
  
  @js.native
  trait TypeofUtilsInstantiable
    extends StObject
       with Instantiable0[typingsJapgolly.gridstack.distUtilsMod.Utils] {
    
    /** inserts a CSS rule */
    def addCSSRule(sheet: CSSStyleSheet, selector: String, rules: String): Unit = js.native
    
    def addElStyles(el: HTMLElement, styles: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    def appendTo(el: HTMLElement, parent: String): Unit = js.native
    def appendTo(el: HTMLElement, parent: HTMLElement): Unit = js.native
    def appendTo(el: HTMLElement, parent: Node): Unit = js.native
    
    /** returns the area */
    def area(a: typingsJapgolly.gridstack.distTypesMod.GridStackPosition): Double = js.native
    
    /** returns the area a and b overlap */
    def areaIntercept(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackPosition,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackPosition
    ): Double = js.native
    
    /** single level clone, returning a new object with same top fields. This will share sub objects and arrays */
    def clone[T](obj: T): T = js.native
    
    /**
      * Recursive clone version that returns a full copy, checking for nested objects and arrays ONLY.
      * Note: this will use as-is any key starting with double __ (and not copy inside) some lib have circular dependencies.
      */
    def cloneDeep[T](obj: T): T = js.native
    
    /** deep clone the given HTML node, removing teh unique id field */
    def cloneNode(el: HTMLElement): HTMLElement = js.native
    
    /** return the closest parent (or itself) matching the given class */
    def closestUpByClass(el: HTMLElement, name: String): HTMLElement = js.native
    
    /** copies over b size & position (GridStackPosition), and possibly min/max as well */
    def copyPos(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackWidget,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackWidget
    ): typingsJapgolly.gridstack.distTypesMod.GridStackWidget = js.native
    def copyPos(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackWidget,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackWidget,
      doMinMax: Boolean
    ): typingsJapgolly.gridstack.distTypesMod.GridStackWidget = js.native
    
    /**
      * creates a style sheet with style id under given parent
      * @param id will set the 'gs-style-id' attribute to that id
      * @param parent to insert the stylesheet as first child,
      * if none supplied it will be appended to the document head instead.
      */
    def createStylesheet(id: String): CSSStyleSheet = js.native
    def createStylesheet(id: String, parent: HTMLElement): CSSStyleSheet = js.native
    
    /** copies unset fields in target to use the given default sources values */
    def defaults(target: Any, sources: Any*): js.Object = js.native
    
    /** convert a potential selector into actual single element */
    def getElement(els: typingsJapgolly.gridstack.distTypesMod.GridStackElement): HTMLElement = js.native
    
    /** convert a potential selector into actual list of html elements */
    def getElements(els: typingsJapgolly.gridstack.distTypesMod.GridStackElement): js.Array[HTMLElement] = js.native
    
    def initEvent[T](e: DragEvent, info: Target): T = js.native
    def initEvent[T](e: MouseEvent, info: Target): T = js.native
    
    /** returns true if a and b overlap */
    def isIntercepted(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackPosition,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    /** returns true if a and b touch edges or corners */
    def isTouching(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackPosition,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    def parseHeight(`val`: typingsJapgolly.gridstack.distTypesMod.numberOrString): typingsJapgolly.gridstack.distUtilsMod.HeightData = js.native
    
    /** removes field from the first object if same as the second objects (like diffing) and internal '_' for saving */
    def removeInternalAndSame(a: Any, b: Any): Unit = js.native
    
    /** removes internal fields '_' and default values for saving */
    def removeInternalForSave(n: typingsJapgolly.gridstack.distTypesMod.GridStackNode): Unit = js.native
    def removeInternalForSave(n: typingsJapgolly.gridstack.distTypesMod.GridStackNode, removeEl: Boolean): Unit = js.native
    
    def removePositioningStyles(el: HTMLElement): Unit = js.native
    
    /** removed the given stylesheet id */
    def removeStylesheet(id: String): Unit = js.native
    
    /** given 2 objects return true if they have the same values. Checks for Object {} having same fields and values (just 1 level down) */
    def same(a: Any, b: Any): Boolean = js.native
    
    /** true if a and b has same size & position */
    def samePos(
      a: typingsJapgolly.gridstack.distTypesMod.GridStackPosition,
      b: typingsJapgolly.gridstack.distTypesMod.GridStackPosition
    ): Boolean = js.native
    
    /** copies the MouseEvent properties and sends it as another event to the given target */
    def simulateMouseEvent(e: MouseEvent, simulatedType: String): Unit = js.native
    def simulateMouseEvent(e: MouseEvent, simulatedType: String, target: EventTarget): Unit = js.native
    
    /**
      * Sorts array of nodes
      * @param nodes array to sort
      * @param dir 1 for asc, -1 for desc (optional)
      * @param width width of the grid. If undefined the width will be calculated automatically (optional).
      **/
    def sort(nodes: js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode]): js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(nodes: js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode], dir: `-1` | `1`): js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(
      nodes: js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode],
      dir: `-1` | `1`,
      column: Double
    ): js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode] = js.native
    def sort(nodes: js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode], dir: Unit, column: Double): js.Array[typingsJapgolly.gridstack.distTypesMod.GridStackNode] = js.native
    
    /** delay calling the given function for given delay, preventing new calls from happening while waiting */
    def throttle(func: js.Function0[Unit], delay: Double): js.Function0[Unit] = js.native
    
    def toBool(v: Any): Boolean = js.native
    
    def toNumber(): Double = js.native
    def toNumber(value: String): Double = js.native
  }
}
