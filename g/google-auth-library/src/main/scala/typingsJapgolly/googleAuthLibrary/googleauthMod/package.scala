package typingsJapgolly.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleauthMod {
  type ADCCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* credential */ js.UndefOr[typingsJapgolly.googleAuthLibrary.oauth2clientMod.OAuth2Client], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type CredentialCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[
      typingsJapgolly.googleAuthLibrary.refreshclientMod.UserRefreshClient | typingsJapgolly.googleAuthLibrary.jwtclientMod.JWT
    ], 
    scala.Unit
  ]
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
