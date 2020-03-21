package typingsJapgolly.apolloLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NextLink = js.Function1[
    /* operation */ typingsJapgolly.apolloLink.typesMod.Operation, 
    typingsJapgolly.zenObservableTs.zenObservableMod.Observable[
      typingsJapgolly.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typingsJapgolly.std.Record[java.lang.String, js.Any], 
        typingsJapgolly.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type RequestHandler = js.Function2[
    /* operation */ typingsJapgolly.apolloLink.typesMod.Operation, 
    /* forward */ typingsJapgolly.apolloLink.typesMod.NextLink, 
    (typingsJapgolly.zenObservableTs.zenObservableMod.Observable[
      typingsJapgolly.apolloLink.typesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        typingsJapgolly.std.Record[java.lang.String, js.Any], 
        typingsJapgolly.std.Record[java.lang.String, js.Any]
      ]
    ]) | scala.Null
  ]
}
