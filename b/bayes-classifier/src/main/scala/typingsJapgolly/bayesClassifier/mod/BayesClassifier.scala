package typingsJapgolly.bayesClassifier.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BayesClassifier extends js.Object {
  def addDocument(doc: String, label: String): Unit
  def addDocuments(docs: js.Array[String], label: String): Unit
  def classify(doc: String): String
  def getClassifications(doc: String): Classifications
  def restore(classifier: js.Any): Unit
  def train(): Unit
}

object BayesClassifier {
  @scala.inline
  def apply(
    addDocument: (String, String) => Callback,
    addDocuments: (js.Array[String], String) => Callback,
    classify: String => CallbackTo[String],
    getClassifications: String => CallbackTo[Classifications],
    restore: js.Any => Callback,
    train: Callback
  ): BayesClassifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDocument")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addDocument(t0, t1).runNow()))
    __obj.updateDynamic("addDocuments")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: java.lang.String) => addDocuments(t0, t1).runNow()))
    __obj.updateDynamic("classify")(js.Any.fromFunction1((t0: java.lang.String) => classify(t0).runNow()))
    __obj.updateDynamic("getClassifications")(js.Any.fromFunction1((t0: java.lang.String) => getClassifications(t0).runNow()))
    __obj.updateDynamic("restore")(js.Any.fromFunction1((t0: js.Any) => restore(t0).runNow()))
    __obj.updateDynamic("train")(train.toJsFn)
    __obj.asInstanceOf[BayesClassifier]
  }
}

