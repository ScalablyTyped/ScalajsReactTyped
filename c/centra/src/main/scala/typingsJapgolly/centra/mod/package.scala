package typingsJapgolly.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CentraFactory = js.Function2[
    /* url */ org.scalajs.dom.experimental.URL | java.lang.String, 
    /* method */ js.UndefOr[java.lang.String], 
    typingsJapgolly.centra.mod.Request
  ]
}
