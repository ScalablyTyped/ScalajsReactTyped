package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toastr {
  type ToastrDisplayMethod = js.Function3[
    /* message */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    /* overrides */ js.UndefOr[typingsJapgolly.toastr.ToastrOptions], 
    typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]
  ]
}
