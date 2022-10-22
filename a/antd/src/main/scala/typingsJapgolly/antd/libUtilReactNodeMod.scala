package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilReactNodeMod {
  
  @JSImport("antd/lib/_util/reactNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneElement(element: Node): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def cloneElement(element: Node, props: RenderProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def isFragment(child: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(child.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def replaceElement(element: Node, replacement: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def replaceElement(element: Node, replacement: Node, props: RenderProps): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  type AnyObject = Record[PropertyKey, Any]
  
  type RenderProps = AnyObject | (js.Function1[/* originProps */ AnyObject, AnyObject | Unit])
}
