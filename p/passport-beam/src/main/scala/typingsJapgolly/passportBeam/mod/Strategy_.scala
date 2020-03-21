package typingsJapgolly.passportBeam.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passportBeam.mod.Strategy.IStrategyOption
import typingsJapgolly.passportBeam.mod.Strategy.Profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-beam", "Strategy")
@js.native
class Strategy_ protected ()
  extends typingsJapgolly.passport.mod.Strategy {
  def this(
    options: IStrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_Strategy_ : String = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

