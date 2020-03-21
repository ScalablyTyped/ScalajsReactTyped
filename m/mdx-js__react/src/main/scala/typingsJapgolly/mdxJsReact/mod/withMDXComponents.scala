package typingsJapgolly.mdxJsReact.mod

import typingsJapgolly.mdxJsReact.mdxJsReactStrings.components
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mdx-js/react", "withMDXComponents")
@js.native
object withMDXComponents extends js.Object {
  def apply[GProps /* <: InjectedMDXProviderProps */](Component: ComponentType[GProps]): FC[Except[GProps, components]] = js.native
}

