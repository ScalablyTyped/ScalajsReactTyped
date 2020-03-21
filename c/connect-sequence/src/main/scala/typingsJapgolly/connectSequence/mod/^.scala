package typingsJapgolly.connectSequence.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-sequence", JSImport.Namespace)
@js.native
class ^ protected () extends ConnectSequence {
  def this(req: Request_[ParamsDictionary], res: Response_, next: NextFunction) = this()
  /* CompleteClass */
  override def append(middleware: RequestHandler[ParamsDictionary]*): this.type = js.native
  /* CompleteClass */
  override def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary]): this.type = js.native
  /* CompleteClass */
  override def appendList(middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type = js.native
  /* CompleteClass */
  override def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type = js.native
  /* CompleteClass */
  override def run(): Unit = js.native
}

