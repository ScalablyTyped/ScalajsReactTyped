package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth {
  type AuthListenerCallback = js.Function1[
    /* user */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.auth.OrNull[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.User], 
    scala.Unit
  ]
  type AuthResult = typingsJapgolly.reactNativeFirebase.AnonAuthenticated | scala.Null
  type OrNull[T] = T | scala.Null
}
