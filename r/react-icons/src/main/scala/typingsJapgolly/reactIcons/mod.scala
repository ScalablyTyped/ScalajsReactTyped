package typingsJapgolly.reactIcons

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactIcons.iconBaseMod.IconBaseProps
import typingsJapgolly.reactIcons.iconBaseMod.IconTree
import typingsJapgolly.reactIcons.iconsManifestMod.IconManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-icons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DefaultContext: typingsJapgolly.reactIcons.iconContextMod.IconContext = js.native
  val IconContext: Context[typingsJapgolly.reactIcons.iconContextMod.IconContext] = js.native
  val icons: IconManifest = js.native
  def GenIcon(data: IconTree): js.Function1[/* props */ IconBaseProps, Element] = js.native
  def IconBase(props: IconBasePropsattrundefine): Element = js.native
}

