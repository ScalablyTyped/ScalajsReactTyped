package typingsJapgolly.blueprintjsCore.iconMod

import typingsJapgolly.blueprintjsCore.blueprintjsCoreNumbers.`16`
import typingsJapgolly.blueprintjsCore.blueprintjsCoreNumbers.`20`
import typingsJapgolly.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
class Icon ()
  extends AbstractPureComponent2[IIconProps with DOMAttributes[HTMLElement], js.Object, js.Object] {
  /** Render `<path>` elements for the given icon name. Returns `null` if name is unknown. */
  var renderSvgPaths: js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
@js.native
object Icon extends js.Object {
  val SIZE_LARGE: `20` = js.native
  val SIZE_STANDARD: `16` = js.native
  var displayName: String = js.native
}

