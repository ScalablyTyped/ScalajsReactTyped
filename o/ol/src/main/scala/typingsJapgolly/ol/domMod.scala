package typingsJapgolly.ol

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("ol/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCanvasContext2D(): CanvasRenderingContext2D = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")().asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Double): CanvasRenderingContext2D = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any]).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Double, opt_height: Double): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Double, opt_height: Double, opt_canvasPool: js.Array[HTMLCanvasElement]): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any], opt_canvasPool.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Double, opt_height: Unit, opt_canvasPool: js.Array[HTMLCanvasElement]): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any], opt_canvasPool.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Unit, opt_height: Double): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Unit, opt_height: Double, opt_canvasPool: js.Array[HTMLCanvasElement]): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any], opt_canvasPool.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  inline def createCanvasContext2D(opt_width: Unit, opt_height: Unit, opt_canvasPool: js.Array[HTMLCanvasElement]): CanvasRenderingContext2D = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext2D")(opt_width.asInstanceOf[js.Any], opt_height.asInstanceOf[js.Any], opt_canvasPool.asInstanceOf[js.Any])).asInstanceOf[CanvasRenderingContext2D]
  
  inline def outerHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def outerWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outerWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeChildren(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChildren")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeNode(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def replaceChildren(node: Node, children: js.Array[Node]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceChildren")(node.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceNode(newNode: Node, oldNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(newNode.asInstanceOf[js.Any], oldNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
