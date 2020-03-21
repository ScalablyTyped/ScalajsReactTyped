package typingsJapgolly.xmljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait XmlParser extends js.Object {
  var errors: js.Array[js.Error]
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]): Boolean
}

object XmlParser {
  @scala.inline
  def apply(
    errors: js.Array[js.Error],
    parseString: (String, js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]) => CallbackTo[Boolean]
  ): XmlParser = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.updateDynamic("parseString")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ scala.Null | js.Array[js.Error], 
  /* xmlNode */ typingsJapgolly.xmljs.mod.Node, 
  scala.Unit]) => parseString(t0, t1).runNow()))
    __obj.asInstanceOf[XmlParser]
  }
}

