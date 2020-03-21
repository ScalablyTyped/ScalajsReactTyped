package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
}

object CreateNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn = null): CreateNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (NotebookInstanceLifecycleConfigArn != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
  }
}

