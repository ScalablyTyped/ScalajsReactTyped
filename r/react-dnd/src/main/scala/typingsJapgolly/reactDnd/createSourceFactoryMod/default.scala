package typingsJapgolly.reactDnd.createSourceFactoryMod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactDnd.interfacesMod.DragSourceSpec
import typingsJapgolly.reactDnd.monitorsMod.DragSourceMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefHandle[_], Source] = js.native
}

