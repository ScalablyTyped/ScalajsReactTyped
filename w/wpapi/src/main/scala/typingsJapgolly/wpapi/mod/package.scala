package typingsJapgolly.wpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTTPHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Routes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.wpapi.mod.Route]
  type TransportFunction = js.Function2[
    /* wpreq */ typingsJapgolly.wpapi.mod.WPRequest, 
    /* cb */ js.UndefOr[typingsJapgolly.wpapi.mod.WPRequestCallback], 
    js.Promise[js.Any]
  ]
  type WPRequestCallback = js.Function2[/* error */ js.Error, /* data */ js.Any, scala.Unit]
  type WPRequestFactory = js.Function0[typingsJapgolly.wpapi.mod.WPRequest]
}
