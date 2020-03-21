package typingsJapgolly.mermaid

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import typingsJapgolly.mermaid.mermaidAPIMod.mermaidAPI.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mermaid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Mermaid extends js.Object {
    @JSName("contentLoaded")
    var contentLoaded_Original: js.Function0[Unit] = js.native
    var htmlLabels: Boolean = js.native
    @JSName("init")
    var init_Original: js.Function1[/* nodes */ String | Node | NodeList, Unit] = js.native
    @JSName("initialize")
    var initialize_Original: js.Function1[/* config */ Config, Unit] = js.native
    var mermaidAPI: TypeofmermaidAPI = js.native
    @JSName("parse")
    var parse_Original: js.Function1[/* text */ String, _] = js.native
    @JSName("render")
    var render_Original: js.Function4[
        /* id */ String, 
        /* txt */ String, 
        /* cb */ js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ], 
        /* container */ js.UndefOr[String], 
        String
      ] = js.native
    var startOnLoad: Boolean = js.native
    def contentLoaded(): Unit = js.native
    def init(nodes: String): Unit = js.native
    def init(nodes: typingsJapgolly.std.Node): Unit = js.native
    def init(nodes: typingsJapgolly.std.NodeList): Unit = js.native
    def initialize(config: Config): Unit = js.native
    def parse(text: String): js.Any = js.native
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String = js.native
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String = js.native
  }
  
  val default: Mermaid = js.native
}

