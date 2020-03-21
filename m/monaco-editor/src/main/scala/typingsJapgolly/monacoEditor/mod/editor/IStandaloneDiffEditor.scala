package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandaloneDiffEditor extends IDiffEditor {
  def addAction(descriptor: IActionDescriptor): IDisposable = js.native
  def addCommand(keybinding: Double, handler: ICommandHandler): String | Null = js.native
  def addCommand(keybinding: Double, handler: ICommandHandler, context: String): String | Null = js.native
  def createContextKey[T](key: String, defaultValue: T): IContextKey[T] = js.native
}

