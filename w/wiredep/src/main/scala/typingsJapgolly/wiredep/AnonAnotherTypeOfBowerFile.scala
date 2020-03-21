package typingsJapgolly.wiredep

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnotherTypeOfBowerFile extends js.Object {
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: String
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: String): String
}

object AnonAnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: String => CallbackTo[String], typeOfBowerFile: String): AnonAnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.updateDynamic("anotherTypeOfBowerFile")(js.Any.fromFunction1((t0: java.lang.String) => anotherTypeOfBowerFile(t0).runNow()))
    __obj.asInstanceOf[AnonAnotherTypeOfBowerFile]
  }
}

