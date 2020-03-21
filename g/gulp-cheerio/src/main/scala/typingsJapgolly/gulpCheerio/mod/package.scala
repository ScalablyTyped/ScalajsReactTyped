package typingsJapgolly.gulpCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* $ */ typingsJapgolly.cheerio.CheerioStatic, 
    /* file */ typingsJapgolly.vinyl.mod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
