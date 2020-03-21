package typingsJapgolly.apolloReactSsr

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloReactSsr.getDataFromTreeMod.GetMarkupFromTreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getDataFromTree(tree: Node): js.Promise[String] = js.native
  def getDataFromTree(tree: Node, context: StringDictionary[js.Any]): js.Promise[String] = js.native
  def getMarkupFromTree(hasTreeContextRenderFunction: GetMarkupFromTreeOptions): js.Promise[String] = js.native
  def renderToStringWithData(component: Element): js.Promise[String] = js.native
}

