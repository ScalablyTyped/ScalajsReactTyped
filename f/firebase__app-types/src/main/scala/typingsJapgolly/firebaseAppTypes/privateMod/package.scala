package typingsJapgolly.firebaseAppTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object privateMod {
  type AppHook = js.Function2[
    /* event */ java.lang.String, 
    /* app */ typingsJapgolly.firebaseAppTypes.mod.FirebaseApp, 
    scala.Unit
  ]
  type FirebaseServiceFactory = js.Function3[
    /* app */ typingsJapgolly.firebaseAppTypes.mod.FirebaseApp, 
    /* extendApp */ js.UndefOr[
      js.Function1[/* props */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit]
    ], 
    /* instanceString */ js.UndefOr[java.lang.String], 
    typingsJapgolly.firebaseAppTypes.privateMod.FirebaseService
  ]
  type FirebaseServiceNamespace[T /* <: typingsJapgolly.firebaseAppTypes.privateMod.FirebaseService */] = js.Function1[/* app */ js.UndefOr[typingsJapgolly.firebaseAppTypes.mod.FirebaseApp], T]
}
