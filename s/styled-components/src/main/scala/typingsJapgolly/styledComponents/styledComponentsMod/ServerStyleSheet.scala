package typingsJapgolly.styledComponents.styledComponentsMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.styledComponents.styledComponentsMod._Global_.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "ServerStyleSheet")
@js.native
class ServerStyleSheet () extends js.Object {
  val instance: this.type = js.native
  def collectStyles(tree: Node): Element = js.native
  def getStyleElement(): js.Array[Element] = js.native
  def getStyleTags(): String = js.native
  def interleaveWithNodeStream(readableStream: ReadableStream): ReadableStream = js.native
  def seal(): Unit = js.native
}

