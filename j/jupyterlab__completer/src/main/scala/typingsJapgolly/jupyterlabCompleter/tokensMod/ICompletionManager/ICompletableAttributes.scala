package typingsJapgolly.jupyterlabCompleter.tokensMod.ICompletionManager

import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes of a completable object that can change and sync at runtime.
  */
trait ICompletableAttributes extends js.Object {
  /**
    * The data connector used to populate the completer.
    */
  var connector: IDataConnector[IReply, Unit, IRequest]
  /**
    * The host editor for the completer.
    */
  var editor: IEditor | Null
}

object ICompletableAttributes {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest], editor: IEditor = null): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletableAttributes]
  }
}

