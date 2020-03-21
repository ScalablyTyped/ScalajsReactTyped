package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.fontIconMod.IIconContent
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IFontIconProps
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IImageIconProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Icon", JSImport.Namespace)
@js.native
object libIconMod extends js.Object {
  @js.native
  class IconBase protected ()
    extends typingsJapgolly.officeUiFabricReact.iconMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  val Icon: FunctionComponent[IIconProps] = js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  def getFontIcon(iconName: String): Element | Null = js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): Element | Null = js.native
  def getFontIcon(iconName: String, className: String): Element | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): Element | Null = js.native
  def getIconContent(): IIconContent | Null = js.native
  def getIconContent(iconName: String): IIconContent | Null = js.native
  @js.native
  object IconType extends js.Object {
    /* 100000 */ val Default: typingsJapgolly.officeUiFabricReact.iconTypesMod.IconType.Default with Double = js.native
    /* 100001 */ val Image: typingsJapgolly.officeUiFabricReact.iconTypesMod.IconType.Image with Double = js.native
    /* 0 */ val default: typingsJapgolly.officeUiFabricReact.iconTypesMod.IconType.default with Double = js.native
    /* 1 */ val image: typingsJapgolly.officeUiFabricReact.iconTypesMod.IconType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.iconTypesMod.IconType with Double] = js.native
  }
  
}

