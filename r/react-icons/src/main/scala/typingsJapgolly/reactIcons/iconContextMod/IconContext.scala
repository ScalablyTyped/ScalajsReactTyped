package typingsJapgolly.reactIcons.iconContextMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconContext extends js.Object {
  var attr: js.UndefOr[SVGAttributes[SVGElement]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

@JSImport("react-icons/lib/esm/iconContext", "IconContext")
@js.native
object IconContext extends TopLevel[Context[IconContext]]

