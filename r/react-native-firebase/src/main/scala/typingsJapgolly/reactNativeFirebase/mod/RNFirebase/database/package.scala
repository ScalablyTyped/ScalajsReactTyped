package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object database {
  type QueryErrorCallback = js.Function1[/* e */ js.Error, scala.Unit]
  type QuerySuccessCallback = js.Function2[
    /* snapshot */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot, 
    /* previousChildId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
}
