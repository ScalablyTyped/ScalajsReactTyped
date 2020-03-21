package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.display_data
import typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error
import typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result
import typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IOutput extends js.Object

object _IOutput {
  @scala.inline
  def IExecuteResult(
    data: IMimeBundle,
    metadata: OutputMetadata,
    output_type: execute_result,
    execution_count: Int | Double = null
  ): _IOutput = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IOutput]
  }
  @scala.inline
  def IDisplayData(data: IMimeBundle, metadata: OutputMetadata, output_type: display_data): _IOutput = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_IOutput]
  }
  @scala.inline
  def IStream(name: StreamType, output_type: stream, text: MultilineString): _IOutput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_IOutput]
  }
  @scala.inline
  def IError(ename: String, evalue: String, output_type: error, traceback: js.Array[String]): _IOutput = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_IOutput]
  }
}

