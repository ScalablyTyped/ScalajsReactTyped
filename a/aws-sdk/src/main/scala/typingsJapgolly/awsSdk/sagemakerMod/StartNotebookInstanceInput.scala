package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance to start.
    */
  var NotebookInstanceName: typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceName = js.native
}

object StartNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StartNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartNotebookInstanceInput]
  }
}

