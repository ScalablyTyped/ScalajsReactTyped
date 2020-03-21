package typingsJapgolly.jsdom.mod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Node
import typingsJapgolly.node.Buffer
import typingsJapgolly.parse5.mod.ElementLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "JSDOM")
@js.native
class JSDOM () extends js.Object {
  def this(html: String) = this()
  def this(html: BinaryData) = this()
  def this(html: Buffer) = this()
  def this(html: String, options: ConstructorOptions) = this()
  def this(html: BinaryData, options: ConstructorOptions) = this()
  def this(html: Buffer, options: ConstructorOptions) = this()
  val cookieJar: CookieJar = js.native
  val virtualConsole: VirtualConsole = js.native
  val window: DOMWindow = js.native
  /**
  		 * The built-in `vm` module of Node.js is what underpins jsdom's script-running magic.
  		 * Some advanced use cases, like pre-compiling a script and then running it multiple
  		 * times, benefit from using the `vm` module directly with a jsdom-created `Window`.
  		 *
  		 * @throws
  		 * Note that this method will throw an exception if the `JSDOM` instance was created
  		 * without `runScripts` set, or if you are using JSDOM in a web browser.
  		 */
  def getInternalVMContext(): DOMWindow = js.native
  /**
  		 * The nodeLocation() method will find where a DOM node is within the source document, returning the parse5 location info for the node.
  		 */
  def nodeLocation(node: Node): ElementLocation | Null = js.native
  /**
  		 * The reconfigure method allows changing the `window.top` and url from the outside.
  		 */
  def reconfigure(settings: ReconfigureSettings): Unit = js.native
  /**
  		 * The serialize() method will return the HTML serialization of the document, including the doctype.
  		 */
  def serialize(): String = js.native
}

/* static members */
@JSImport("jsdom", "JSDOM")
@js.native
object JSDOM extends js.Object {
  def fragment(html: String): DocumentFragment = js.native
  def fromFile(url: String): js.Promise[JSDOM] = js.native
  def fromFile(url: String, options: FileOptions): js.Promise[JSDOM] = js.native
  def fromURL(url: String): js.Promise[JSDOM] = js.native
  def fromURL(url: String, options: BaseOptions): js.Promise[JSDOM] = js.native
}

