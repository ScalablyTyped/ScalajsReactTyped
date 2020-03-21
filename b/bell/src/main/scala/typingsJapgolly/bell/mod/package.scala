package typingsJapgolly.bell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
    js.Promise[js.Object]
  ]
  type ProfileGetter[C /* <: typingsJapgolly.bell.mod.Credentials */] = js.ThisFunction3[
    /* this */ typingsJapgolly.bell.mod.CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
    /* get */ typingsJapgolly.bell.mod.AuthedRequest, 
    js.Promise[scala.Unit]
  ]
  type RequestPassThrough = js.Function1[
    /* request */ typingsJapgolly.hapi.mod.Request, 
    js.Thenable[typingsJapgolly.hapi.mod.AuthCredentials] | typingsJapgolly.hapi.mod.AuthCredentials
  ]
  type StringLikeMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
