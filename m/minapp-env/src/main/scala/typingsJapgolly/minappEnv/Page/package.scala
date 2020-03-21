package typingsJapgolly.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type GetCurrentPages = js.Function0[
    typingsJapgolly.minappEnv.Array[
      (typingsJapgolly.minappEnv.Page.PageInstance[js.Object, js.Object]) with js.Object
    ]
  ]
  type PageConstructor = js.Function1[
    /* options */ (typingsJapgolly.minappEnv.Page.PageInstance[
      typingsJapgolly.minappEnv.IAnyObject, 
      typingsJapgolly.minappEnv.IAnyObject with (typingsJapgolly.minappEnv.Page.PageInstance[_, _])
    ]) with typingsJapgolly.minappEnv.IAnyObject with (typingsJapgolly.minappEnv.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
