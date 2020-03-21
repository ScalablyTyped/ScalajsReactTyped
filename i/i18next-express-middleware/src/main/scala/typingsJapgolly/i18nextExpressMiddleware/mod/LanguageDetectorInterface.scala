package typingsJapgolly.i18nextExpressMiddleware.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorInterface extends js.Object {
  var cacheUserLanguage: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response_, 
      /* lng */ String, 
      /* options */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.native
  var name: String = js.native
  def lookup(req: Request_[ParamsDictionary], res: Response_): String | js.Array[String] = js.native
  def lookup(req: Request_[ParamsDictionary], res: Response_, options: LanguageDetectorInterfaceOptions): String | js.Array[String] = js.native
}

