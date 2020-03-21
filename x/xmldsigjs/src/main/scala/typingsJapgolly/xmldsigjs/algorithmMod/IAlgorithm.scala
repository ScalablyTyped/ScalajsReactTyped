package typingsJapgolly.xmldsigjs.algorithmMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlgorithm extends js.Object {
  var algorithm: Algorithm
  var namespaceURI: String
  def getAlgorithmName(): String
}

object IAlgorithm {
  @scala.inline
  def apply(algorithm: Algorithm, getAlgorithmName: CallbackTo[String], namespaceURI: String): IAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any])
    __obj.updateDynamic("getAlgorithmName")(getAlgorithmName.toJsFn)
    __obj.asInstanceOf[IAlgorithm]
  }
}

