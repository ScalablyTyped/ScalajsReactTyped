package typingsJapgolly.rcDrawer.drawerChildMod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rcDrawer.AnonPrevProps
import typingsJapgolly.rcDrawer.AnonPrevPropsIDrawerChildProps
import typingsJapgolly.rcDrawer.AnonSwitchScrollingEffect
import typingsJapgolly.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
class default protected () extends DrawerChild {
  def this(props: IDrawerChildProps) = this()
}

@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
object default extends Instantiable1[/* props */ IDrawerChildProps, DrawerChild] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: AnonSwitchScrollingEffect = js.native
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any = js.native
  def getDerivedStateFromProps(props: IDrawerChildProps, hasPrevProps_self: AnonPrevProps): AnonPrevPropsIDrawerChildProps = js.native
}

