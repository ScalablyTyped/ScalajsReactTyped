package typingsJapgolly.jupyterlabCells.widgetMod.CodeCell

import typingsJapgolly.jupyterlabCells.PartialIConfig
import typingsJapgolly.jupyterlabCells.modelMod.ICellModel
import typingsJapgolly.jupyterlabCells.widgetMod.Cell.IContentFactory
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a base cell widget.
  */
trait IOptions
  extends typingsJapgolly.jupyterlabCells.widgetMod.Cell.IOptions {
  /**
    * The mime renderer for the cell widget.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    model: ICellModel,
    rendermime: IRenderMimeRegistry,
    contentFactory: IContentFactory = null,
    editorConfig: PartialIConfig = null,
    updateEditorOnShow: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEditorOnShow)) __obj.updateDynamic("updateEditorOnShow")(updateEditorOnShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

