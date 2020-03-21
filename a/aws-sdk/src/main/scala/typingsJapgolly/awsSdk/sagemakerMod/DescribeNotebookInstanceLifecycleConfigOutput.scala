package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The shell script that runs only once, when you create a notebook instance.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}

object DescribeNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    LastModifiedTime: js.Date = null,
    NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn = null,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    OnCreate: NotebookInstanceLifecycleConfigList = null,
    OnStart: NotebookInstanceLifecycleConfigList = null
  ): DescribeNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (NotebookInstanceLifecycleConfigArn != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigArn")(NotebookInstanceLifecycleConfigArn.asInstanceOf[js.Any])
    if (NotebookInstanceLifecycleConfigName != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    if (OnCreate != null) __obj.updateDynamic("OnCreate")(OnCreate.asInstanceOf[js.Any])
    if (OnStart != null) __obj.updateDynamic("OnStart")(OnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
  }
}

