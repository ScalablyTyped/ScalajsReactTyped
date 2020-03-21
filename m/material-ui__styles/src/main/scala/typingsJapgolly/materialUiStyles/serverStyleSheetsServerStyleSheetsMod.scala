package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/ServerStyleSheets/ServerStyleSheets", JSImport.Namespace)
@js.native
object serverStyleSheetsServerStyleSheetsMod extends js.Object {
  @js.native
  trait ServerStyleSheets extends js.Object {
    def collect(children: Node): Element = js.native
    def collect(children: Node, options: js.Object): Element = js.native
    def getStyleElement(): Element = js.native
    def getStyleElement(props: js.Object): Element = js.native
  }
  
  @js.native
  class default () extends ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
}

