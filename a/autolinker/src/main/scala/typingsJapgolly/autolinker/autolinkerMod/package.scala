package typingsJapgolly.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autolinkerMod {
  type ReplaceFn = js.Function1[
    /* match */ typingsJapgolly.autolinker.matchMatchMod.Match, 
    typingsJapgolly.autolinker.autolinkerMod.ReplaceFnReturn
  ]
  type ReplaceFnReturn = js.UndefOr[
    scala.Boolean | java.lang.String | typingsJapgolly.autolinker.htmlTagMod.HtmlTag | scala.Null | scala.Unit
  ]
  type StripPrefixConfig = scala.Boolean | typingsJapgolly.autolinker.autolinkerMod.StripPrefixConfigObj
  type TruncateConfig = scala.Double | typingsJapgolly.autolinker.autolinkerMod.TruncateConfigObj
  type UrlsConfig = scala.Boolean | typingsJapgolly.autolinker.autolinkerMod.UrlsConfigObj
}
