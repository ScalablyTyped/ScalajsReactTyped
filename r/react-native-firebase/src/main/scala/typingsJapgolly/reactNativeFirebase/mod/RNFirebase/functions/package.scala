package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functions {
  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  type HttpsCallable[Params, Result] = (js.Function1[
    /* data */ Params, 
    js.Promise[
      typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
    ]
  ]) | (js.Function0[
    js.Promise[
      typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions.HttpsCallableResult[Result]
    ]
  ])
  type HttpsErrorCode = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.functions.FunctionsErrorCode]
}
