package typingsJapgolly.webdriver

import typingsJapgolly.webdriver.WebDriver.AttachSessionOptions
import typingsJapgolly.webdriver.WebDriver.Client
import typingsJapgolly.webdriver.WebDriver.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def attachToSession(options: AttachSessionOptions): js.Promise[Client] = js.native
  def attachToSession(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
  def attachToSession(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
  def attachToSession(
    options: AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
  ): js.Promise[Client] = js.native
  def newSession(): js.Promise[Client] = js.native
  def newSession(options: Options): js.Promise[Client] = js.native
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
  def newSession(
    options: Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
  ): js.Promise[Client] = js.native
  def reloadSession(instance: Client): js.Promise[Client] = js.native
}

