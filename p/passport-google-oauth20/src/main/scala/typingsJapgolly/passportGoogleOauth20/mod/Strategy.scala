package typingsJapgolly.passportGoogleOauth20.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.passportOauth2.mod.OAuth2Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth20", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(
    options: StrategyOptionsWithRequest,
    verify: js.Function5[
        /* req */ Request_[ParamsDictionary], 
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  def this(
    options: StrategyOptions,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
}

