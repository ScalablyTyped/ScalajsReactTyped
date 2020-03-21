package typingsJapgolly.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauth2clientMod {
  type Certificates = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsJapgolly.googleAuthLibrary.cryptoCryptoMod.JwkCertificate
  ]
  type GetAccessTokenCallback = js.Function3[
    /* err */ typingsJapgolly.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[java.lang.String | scala.Null], 
    /* res */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type GetFederatedSignonCertsCallback = js.Function3[
    /* err */ typingsJapgolly.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* certs */ js.UndefOr[typingsJapgolly.googleAuthLibrary.oauth2clientMod.Certificates], 
    /* response */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
  type GetTokenCallback = js.Function3[
    /* err */ typingsJapgolly.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* token */ js.UndefOr[typingsJapgolly.googleAuthLibrary.credentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RefreshAccessTokenCallback = js.Function3[
    /* err */ typingsJapgolly.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* credentials */ js.UndefOr[typingsJapgolly.googleAuthLibrary.credentialsMod.Credentials | scala.Null], 
    /* res */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[js.Any] | scala.Null], 
    scala.Unit
  ]
  type RequestMetadataCallback = js.Function3[
    /* err */ typingsJapgolly.gaxios.mod.GaxiosError[js.Any] | scala.Null, 
    /* headers */ js.UndefOr[typingsJapgolly.googleAuthLibrary.oauth2clientMod.Headers], 
    /* res */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[scala.Unit] | scala.Null], 
    scala.Unit
  ]
}
