package typingsJapgolly.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typingsJapgolly.jupyterlabNotebook.jupyterlabNotebookStrings.common
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to add an item to the notebook tools.
  */
trait IAddOptions extends js.Object {
  /**
    * The rank order of the widget among its siblings.
    */
  var rank: js.UndefOr[Double] = js.undefined
  /**
    * The section to which the tool should be added.
    */
  var section: js.UndefOr[common | advanced] = js.undefined
  /**
    * The tool to add to the notebook tools area.
    */
  var tool: Tool
}

object IAddOptions {
  @scala.inline
  def apply(tool: Tool, rank: Int | Double = null, section: common | advanced = null): IAddOptions = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
}

