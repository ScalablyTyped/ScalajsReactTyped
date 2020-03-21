package typingsJapgolly.neteaseCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NeteaseCaptcha {
  type InitFunction = js.Function3[
    /* config */ typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Config, 
    /* onLoad */ js.UndefOr[typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onLoad], 
    /* onError */ js.UndefOr[typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onError], 
    scala.Unit
  ]
  type onError = js.Function1[/* error */ js.Any, scala.Unit]
  type onLoad = js.Function1[/* instance */ typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Instance, scala.Unit]
}
