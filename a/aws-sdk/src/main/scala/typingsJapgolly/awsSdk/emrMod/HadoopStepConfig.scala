package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HadoopStepConfig extends js.Object {
  /**
    * The list of command line arguments to pass to the JAR file's main function for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  /**
    * The path to the JAR file that runs during the step.
    */
  var Jar: js.UndefOr[String] = js.native
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class in its manifest file.
    */
  var MainClass: js.UndefOr[String] = js.native
  /**
    * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[StringMap] = js.native
}

object HadoopStepConfig {
  @scala.inline
  def apply(
    Args: StringList = null,
    Jar: String = null,
    MainClass: String = null,
    Properties: StringMap = null
  ): HadoopStepConfig = {
    val __obj = js.Dynamic.literal()
    if (Args != null) __obj.updateDynamic("Args")(Args.asInstanceOf[js.Any])
    if (Jar != null) __obj.updateDynamic("Jar")(Jar.asInstanceOf[js.Any])
    if (MainClass != null) __obj.updateDynamic("MainClass")(MainClass.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[HadoopStepConfig]
  }
}

