package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAuthHeaderValueForFirstParty extends js.Object {
  def getAuthHeaderValueForFirstParty(userIdentifiers: js.Array[StringDictionary[String]]): String | Null
}

object AnonGetAuthHeaderValueForFirstParty {
  @scala.inline
  def apply(getAuthHeaderValueForFirstParty: js.Array[StringDictionary[String]] => CallbackTo[String | Null]): AnonGetAuthHeaderValueForFirstParty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthHeaderValueForFirstParty")(js.Any.fromFunction1((t0: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]) => getAuthHeaderValueForFirstParty(t0).runNow()))
    __obj.asInstanceOf[AnonGetAuthHeaderValueForFirstParty]
  }
}

