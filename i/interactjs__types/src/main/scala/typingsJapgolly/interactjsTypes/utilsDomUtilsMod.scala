package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import org.scalajs.dom.SVGElement
import org.scalajs.dom.Window
import typingsJapgolly.interactjsTypes.anon.RequiredRect
import typingsJapgolly.interactjsTypes.anon.X
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDomUtilsMod {
  
  @JSImport("@interactjs/utils/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closest(element: Node, selector: String): HTMLElement | SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | SVGElement]
  
  inline def getActualElement(element: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualElement")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getElementClientRect(element: Element): RequiredRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementClientRect")(element.asInstanceOf[js.Any]).asInstanceOf[RequiredRect]
  
  inline def getElementRect(element: Element): RequiredRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRect")(element.asInstanceOf[js.Any]).asInstanceOf[RequiredRect]
  
  inline def getPath(node: Document): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getPath(node: Node): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getScrollXY(): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollXY")().asInstanceOf[X]
  inline def getScrollXY(relevantWindow: Window): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollXY")(relevantWindow.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def indexOfDeepestElement(elements: js.Array[Element]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfDeepestElement")(elements.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOfDeepestElement(
    elements: NodeList[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Element */ Any) & Node
    ]
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfDeepestElement")(elements.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matchesSelector(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesSelector")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchesUpTo(element: Element, selector: String, limit: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesUpTo")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nodeContains(parent: Node, child: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parentNode(node: Document): ParentNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parentNode")(node.asInstanceOf[js.Any]).asInstanceOf[ParentNode]
  inline def parentNode(node: Node): ParentNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parentNode")(node.asInstanceOf[js.Any]).asInstanceOf[ParentNode]
  
  inline def trySelector(value: Target): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("trySelector")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
