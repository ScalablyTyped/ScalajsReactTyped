package typingsJapgolly.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallBack = js.Function2[
    /* error */ typingsJapgolly.ldapjs.mod.Error, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type CompareCallback = js.Function2[
    /* error */ typingsJapgolly.ldapjs.mod.Error, 
    /* matched */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type Control = js.Any
  type ErrorCallback = js.Function1[/* error */ typingsJapgolly.ldapjs.mod.Error, scala.Unit]
  type ExopCallback = js.Function3[
    /* error */ typingsJapgolly.ldapjs.mod.Error, 
    /* value */ java.lang.String, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type SearchCallBack = js.Function2[
    /* error */ typingsJapgolly.ldapjs.mod.Error | scala.Null, 
    /* result */ typingsJapgolly.ldapjs.mod.SearchCallbackResponse, 
    scala.Unit
  ]
  type SearchReference = js.Any
}
