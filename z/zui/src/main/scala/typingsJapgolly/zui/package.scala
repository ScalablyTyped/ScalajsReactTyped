package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zui {
  type ActionFunc = js.Function0[scala.Boolean]
  type CallBack = js.Function0[scala.Unit]
  type OnActionFunc = js.Function3[
    /* name */ java.lang.String, 
    /* action */ java.lang.String, 
    /* messager */ typingsJapgolly.zui.Messager, 
    js.Any
  ]
}
