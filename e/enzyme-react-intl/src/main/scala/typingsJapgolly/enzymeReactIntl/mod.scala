package typingsJapgolly.enzymeReactIntl

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.cheerio.Cheerio_
import typingsJapgolly.enzyme.mod.MountRendererProps
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowRendererProps
import typingsJapgolly.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-react-intl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getLocale(): String = js.native
  def loadTranslation(translationFilePath: String): js.Any = js.native
  def mountWithIntl[P](node: Element): ReactWrapper[P, _, Component[js.Object, js.Object]] = js.native
  def mountWithIntl[P](node: Element, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: Element): ReactWrapper[P, S, Component[js.Object, js.Object]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: Element, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object]] = js.native
  def renderWithIntl[P, S](node: Element): Cheerio_ = js.native
  def renderWithIntl[P, S](node: Element, options: js.Any): Cheerio_ = js.native
  def setLocale(locale: String): Unit = js.native
  def shallowWithIntl[P](node: Element): ShallowWrapper[P, _, Component[js.Object, js.Object]] = js.native
  def shallowWithIntl[P](node: Element, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: Element): ShallowWrapper[P, S, Component[js.Object, js.Object]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: Element, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object]] = js.native
}

