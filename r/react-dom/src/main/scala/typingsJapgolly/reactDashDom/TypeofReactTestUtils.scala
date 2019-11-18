package typingsJapgolly.reactDashDom

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.CElement
import typingsJapgolly.react.reactMod.ClassType
import typingsJapgolly.react.reactMod.DOMAttributes
import typingsJapgolly.react.reactMod.DOMElement
import typingsJapgolly.react.reactMod.ReactElement
import typingsJapgolly.react.reactMod.ReactInstance
import typingsJapgolly.react.reactMod.SFC
import typingsJapgolly.react.reactMod.SFCElement
import typingsJapgolly.reactDashDom.testDashUtilsMod.DebugPromiseLike
import typingsJapgolly.reactDashDom.testDashUtilsMod.MockedComponentClass
import typingsJapgolly.reactDashDom.testDashUtilsMod.ShallowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactTestUtils extends js.Object {
  val Simulate: TypeofSimulate = js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  @JSName("act")
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def createRenderer(): ShallowRenderer = js.native
  def findAllInRenderedTree(root: Component[js.Object, js.Object], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](root: Component[js.Object, js.Object], `type`: ClassType[_, T, C]): T = js.native
  def findRenderedDOMComponentWithClass(root: Component[js.Object, js.Object], className: String): Element = js.native
  def findRenderedDOMComponentWithTag(root: Component[js.Object, js.Object], tagName: String): Element = js.native
  def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
  def isCompositeComponentWithType[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
  def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
  def isElement(element: js.Any): Boolean = js.native
  def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def isElementOfType[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def isElementOfType[P, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
  @JSName("isElementOfType")
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: japgolly.scalajs.react.raw.React.Element, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
  def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: SFCElement[_]): Unit = js.native
  def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: ReactElement): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
  def renderIntoDocument[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: Component[js.Object, js.Object] */, C /* <: ComponentClassP[js.Object] */](root: Component[js.Object, js.Object], `type`: ClassType[_, T, C]): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: Component[js.Object, js.Object], className: String): js.Array[Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: Component[js.Object, js.Object], tagName: String): js.Array[Element] = js.native
}

