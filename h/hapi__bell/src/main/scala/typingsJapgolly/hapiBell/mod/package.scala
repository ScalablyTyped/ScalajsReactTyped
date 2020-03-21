package typingsJapgolly.hapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
    js.Promise[js.Object]
  ]
  type ProfileGetter[C /* <: typingsJapgolly.hapiBell.mod.Credentials */] = js.ThisFunction3[
    /* this */ typingsJapgolly.hapiBell.mod.CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
    /* get */ typingsJapgolly.hapiBell.mod.AuthedRequest, 
    js.Promise[scala.Unit]
  ]
  type RequestPassThrough = js.Function1[
    /* request */ typingsJapgolly.hapiHapi.mod.Request, 
    js.Thenable[typingsJapgolly.hapiHapi.mod.AuthCredentials] | typingsJapgolly.hapiHapi.mod.AuthCredentials
  ]
  type StringLikeMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
