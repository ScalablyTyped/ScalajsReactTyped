package typingsJapgolly.awsSdkClientLambdaNode.typesEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
}

object Environment {
  @scala.inline
  def apply(Variables: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null): Environment = {
    val __obj = js.Dynamic.literal()
    if (Variables != null) __obj.updateDynamic("Variables")(Variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

