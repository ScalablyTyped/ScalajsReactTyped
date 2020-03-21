package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type GetCurrentPages = js.Function0[
    js.Array[
      (typingsJapgolly.uniApp.Page.PageInstance[typingsJapgolly.uniApp.AnyObject, js.Object]) with js.Object
    ]
  ]
  type PageConstructor = js.Function1[
    /* options */ (typingsJapgolly.uniApp.Page.PageInstance[
      typingsJapgolly.uniApp.AnyObject, 
      typingsJapgolly.uniApp.AnyObject with (typingsJapgolly.uniApp.Page.PageInstance[_, _])
    ]) with typingsJapgolly.uniApp.AnyObject with (typingsJapgolly.uniApp.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
