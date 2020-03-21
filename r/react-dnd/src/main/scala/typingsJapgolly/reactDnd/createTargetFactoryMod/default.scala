package typingsJapgolly.reactDnd.createTargetFactoryMod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactDnd.interfacesMod.DropTargetSpec
import typingsJapgolly.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/createTargetFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefHandle[_], Target] = js.native
}

