package typingsJapgolly.primereact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.anon.BindEvents
import typingsJapgolly.primereact.anon.Browser
import typingsJapgolly.primereact.anon.Emit
import typingsJapgolly.primereact.anon.Height
import typingsJapgolly.primereact.anon.Left
import typingsJapgolly.primereact.anon.Name
import typingsJapgolly.primereact.anon.Width
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUtilsMod {
  
  @JSImport("primereact/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("primereact/utils/utils", "ConnectedOverlayScrollHandler")
  @js.native
  open class ConnectedOverlayScrollHandler protected () extends StObject {
    def this(element: Any) = this()
    def this(element: Any, listener: js.Function0[Unit]) = this()
    
    def bindScrollListener(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def unbindScrollListener(): Unit = js.native
  }
  
  @JSImport("primereact/utils/utils", "DomHandler")
  @js.native
  open class DomHandler () extends StObject
  /* static members */
  object DomHandler {
    
    @JSImport("primereact/utils/utils", "DomHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolutePosition(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("absolutePosition")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addClass(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addMultipleClasses(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMultipleClasses")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def alignOverlay(overlay: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: String, calculateMinWidth: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any], calculateMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: Unit, calculateMinWidth: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any], calculateMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def appendChild(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def applyStyle(el: HTMLElement, style: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(el.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def calculateScrollbarWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateScrollbarWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def clearSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSelection")().asInstanceOf[Unit]
    
    inline def createInlineStyle(nonce: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineStyle")(nonce.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    inline def exportCSV(csv: Any, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportCSV")(csv.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fadeIn(el: HTMLElement, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(el.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fadeOut(el: HTMLElement, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(el.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def find(el: HTMLElement, selector: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def findCollisionPosition(position: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findCollisionPosition")(position.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def findSingle(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findSingle")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: String, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: String, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def focus(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def focus(el: HTMLElement, scrollTo: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(el.asInstanceOf[js.Any], scrollTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getBrowser(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowser")().asInstanceOf[js.Object]
    
    inline def getBrowserLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserLanguage")().asInstanceOf[String]
    
    inline def getClientHeight(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientHeight")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getClientWidth(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientWidth")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getCursorOffset(el: HTMLElement): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: String, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: Unit, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: String, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
    inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: Unit, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
    
    inline def getFirstFocusableElement(el: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getFirstFocusableElement(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getFocusableElements(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def getFocusableElements(el: HTMLElement, selector: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getHiddenElementDimensions(el: HTMLElement): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementDimensions")(el.asInstanceOf[js.Any]).asInstanceOf[Width]
    
    inline def getHiddenElementOuterHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementOuterHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getHiddenElementOuterWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementOuterWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getLastFocusableElement(el: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getLastFocusableElement(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getOffset(el: HTMLElement): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
    
    inline def getOuterHeight(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHeight")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getOuterWidth(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterWidth")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getParents(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def getParents(el: HTMLElement, parents: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(el.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getScrollableParents(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollableParents")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def getTargetElement(target: Any): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetElement")(target.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
    
    inline def getViewport(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewport")().asInstanceOf[Height]
    
    inline def getWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getWindowScrollLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollLeft")().asInstanceOf[Double]
    
    inline def getWindowScrollTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollTop")().asInstanceOf[Double]
    
    inline def hasClass(el: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hasDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDOM")().asInstanceOf[Boolean]
    
    inline def index(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def innerWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("innerWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def invokeElementMethod(el: HTMLElement, methodName: String, arg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeElementMethod")(el.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
    
    inline def isClickable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClickable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isElement(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isExist(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExist")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
    
    inline def isTouchDevice(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchDevice")().asInstanceOf[Boolean]
    
    inline def isVisible(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def relativePosition(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePosition")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeChild(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeClass(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeInlineStyle(styleElement: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInlineStyle")(styleElement.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
    
    inline def removeMultipleClasses(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMultipleClasses")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolveUserAgent(): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgent")().asInstanceOf[Browser]
    
    inline def saveAs(file: Name): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def scrollInView(container: HTMLElement, item: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollInView")(container.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def width(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("width")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def EventBus(): Emit = ^.asInstanceOf[js.Dynamic].applyDynamic("EventBus")().asInstanceOf[Emit]
  
  @JSImport("primereact/utils/utils", "IconUtils")
  @js.native
  open class IconUtils () extends StObject
  /* static members */
  object IconUtils {
    
    @JSImport("primereact/utils/utils", "IconUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getJSXIcon(icon: IconType[Any], iconProps: HTMLProps[HTMLElement], options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSXIcon")(icon.asInstanceOf[js.Any], iconProps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("primereact/utils/utils", "ObjectUtils")
  @js.native
  open class ObjectUtils () extends StObject
  /* static members */
  object ObjectUtils {
    
    @JSImport("primereact/utils/utils", "ObjectUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def combinedRefs(innerRef: Any, forwardRef: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combinedRefs")(innerRef.asInstanceOf[js.Any], forwardRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def equals(obj1: Any, obj2: Any, field: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def findDiffKeys(obj1: Any, obj2: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("findDiffKeys")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def findIndexInList(value: Any, list: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexInList")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndexInList(value: Any, list: js.Array[Any], dataKey: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexInList")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getJSXElement(obj: Any, params: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSXElement")(scala.List(obj.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def getPropValue(obj: Any, params: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropValue")(scala.List(obj.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def getRefElement(ref: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefElement")(ref.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNotEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def removeAccents(str: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccents")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def reorderArray(value: Any, from: Double, to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderArray")(value.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resolveFieldData(data: Any, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFieldData")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def sort(value1: Any, value2: Any, order: Double, locale: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], order.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def sort(value1: Any, value2: Any, order: Double, locale: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], order.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def UniqueComponentId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueComponentId")().asInstanceOf[String]
  inline def UniqueComponentId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueComponentId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object ZIndexUtils {
    
    @JSImport("primereact/utils/utils", "ZIndexUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def get(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Double]
    inline def get(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getBase(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBase")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getCurrent(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def set(key: String, el: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(key: String, el: HTMLElement, baseZIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], el.asInstanceOf[js.Any], baseZIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def classNames(args: Any*): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[String]]
  
  inline def mask(el: HTMLElement, options: js.Object): BindEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BindEvents]
  
  trait IconOptions[ParentProps]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var element: Node
    
    var iconProps: HTMLProps[HTMLElement]
    
    var props: js.UndefOr[ParentProps] = js.undefined
  }
  object IconOptions {
    
    inline def apply[ParentProps](iconProps: HTMLProps[HTMLElement]): IconOptions[ParentProps] = {
      val __obj = js.Dynamic.literal(iconProps = iconProps.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[IconOptions[ParentProps]]
    }
    
    extension [Self <: IconOptions[?], ParentProps](x: Self & IconOptions[ParentProps]) {
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconProps(value: HTMLProps[HTMLElement]): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setProps(value: ParentProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  type IconType[ParentProps] = Node | (js.Function1[/* options */ IconOptions[ParentProps], Node])
  
  type TemplateType[ParentProps] = Node | (js.Function1[/* props */ ParentProps, Node])
}
