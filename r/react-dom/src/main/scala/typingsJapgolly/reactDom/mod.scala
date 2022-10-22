package typingsJapgolly.reactDom

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Text
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.ReactPortal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPortal(children: Node, container: DocumentFragment): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: Node, container: DocumentFragment, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: Node, container: Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: Node, container: Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  
  inline def findDOMNode(): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[Element | Null | Text]
  inline def findDOMNode(instance: ReactInstance): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Element | Null | Text]
  
  inline def flushSync[R](fn: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def flushSync[A, R](fn: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @JSImport("react-dom", "hydrate")
  @js.native
  val hydrate: Renderer = js.native
  
  @JSImport("react-dom", "render")
  @js.native
  val render: Renderer = js.native
  
  inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unstableBatchedUpdates(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, Any], a: A): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, Any], a: A, b: B): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](parentComponent: Component[Any & js.Object, js.Object], element: DomElement, container: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[Any & js.Object, js.Object],
    element: DomElement,
    container: Element,
    callback: js.Function1[/* element */ T, Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P](
    parentComponent: Component[Any & js.Object, js.Object],
    element: japgolly.scalajs.react.facade.React.Element,
    container: Element
  ): (Component[P & js.Object, js.Object]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[(Component[P & js.Object, js.Object]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P](
    parentComponent: Component[Any & js.Object, js.Object],
    element: japgolly.scalajs.react.facade.React.Element,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P & js.Object, js.Object]) | Element], Any]
  ): (Component[P & js.Object, js.Object]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[P & js.Object, js.Object]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P & js.Object, js.Object] */](
    parentComponent: Component[Any & js.Object, js.Object],
    element: CElement[P, T],
    container: Element
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P & js.Object, js.Object] */](
    parentComponent: Component[Any & js.Object, js.Object],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("react-dom", "version")
  @js.native
  val version: String = js.native
  
  type Container = Element | Document | DocumentFragment
  
  @js.native
  trait Renderer extends StObject {
    
    def apply(element: js.Array[DomElement]): Element = js.native
    def apply(element: js.Array[DomElement], container: Null, callback: js.Function0[Unit]): Element = js.native
    def apply(element: js.Array[DomElement], container: Container): Element = js.native
    def apply(element: js.Array[DomElement], container: Container, callback: js.Function0[Unit]): Element = js.native
    def apply(element: FunctionComponentElement[Any]): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Container): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Container, callback: js.Function0[Unit]): Unit = js.native
    // Deprecated(render): The return value is deprecated.
    // In future releases the render function's return type will be void.
    def apply[T /* <: Element */](element: DomElement): T = js.native
    def apply[T /* <: Element */](element: DomElement, container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[T /* <: Element */](element: DomElement, container: Container): T = js.native
    def apply[T /* <: Element */](element: DomElement, container: Container, callback: js.Function0[Unit]): T = js.native
    def apply[P](element: japgolly.scalajs.react.facade.React.Element): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
    def apply[P](
      element: japgolly.scalajs.react.facade.React.Element,
      container: Null,
      callback: js.Function0[Unit]
    ): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
    def apply[P](element: japgolly.scalajs.react.facade.React.Element, container: Container): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
    def apply[P](
      element: japgolly.scalajs.react.facade.React.Element,
      container: Container,
      callback: js.Function0[Unit]
    ): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
    def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T]): T = js.native
    def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Container): T = js.native
    def apply[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], container: Container, callback: js.Function0[Unit]): T = js.native
  }
}
