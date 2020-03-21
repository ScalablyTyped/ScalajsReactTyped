package typingsJapgolly.scroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cancel = js.Function0[scala.Unit]
  type Scroll = js.Function4[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* to */ scala.Double, 
    /* opts */ js.UndefOr[
      typingsJapgolly.scroll.mod.ScrollOptions | typingsJapgolly.scroll.mod.ScrollCallback
    ], 
    /* cb */ js.UndefOr[typingsJapgolly.scroll.mod.ScrollCallback], 
    typingsJapgolly.scroll.mod.Cancel
  ]
  type ScrollCallback = js.Function2[
    /* error */ typingsJapgolly.scroll.mod.ScrollError, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  type ScrollError = js.Error | scala.Null
}
