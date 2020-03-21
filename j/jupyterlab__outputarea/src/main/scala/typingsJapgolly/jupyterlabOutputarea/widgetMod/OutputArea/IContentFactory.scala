package typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typingsJapgolly.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An output area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output prompt.
    */
  def createOutputPrompt(): IOutputPrompt
  /**
    * Create an stdin widget.
    */
  def createStdin(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputPrompt: CallbackTo[IOutputPrompt],
    createStdin: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions => CallbackTo[IStdin]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOutputPrompt")(createOutputPrompt.toJsFn)
    __obj.updateDynamic("createStdin")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions) => createStdin(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

