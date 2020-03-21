package typingsJapgolly.reactDnd

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def checkDecoratorArguments(functionName: String, signature: String, args: js.Any*): Unit = js.native
  def getDecoratedComponent(instanceRef: RefHandle[_]): js.Any = js.native
  def isClassComponent(Component: js.Any): Boolean = js.native
  def isRefForwardingComponent(C: js.Any): Boolean = js.native
  def isRefable(C: js.Any): Boolean = js.native
}

