package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.doublearray.doublearray.DoubleArray
import typingsJapgolly.kuromoji.AnonTokeninfodictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryBuilder_ extends js.Object {
  var tid_entries: js.Array[String]
  var unk_entries: js.Array[String]
  def addTokenInfoDictionary(text: String): DictionaryBuilder_
  def build(): DynamicDictionaries
  def buildConnectionCosts(): ConnectionCosts
  def buildDoubleArray(): DoubleArray
  def buildTokenInfoDictionary(): AnonTokeninfodictionary
  def buildUnknownDictionary(): UnknownDictionary
  def charDef(char_text: String): DictionaryBuilder_
  def costMatrix(matrix_text: String): DictionaryBuilder_
  def unkDef(text: String): DictionaryBuilder_
}

object DictionaryBuilder_ {
  @scala.inline
  def apply(
    addTokenInfoDictionary: String => CallbackTo[DictionaryBuilder_],
    build: CallbackTo[DynamicDictionaries],
    buildConnectionCosts: CallbackTo[ConnectionCosts],
    buildDoubleArray: CallbackTo[DoubleArray],
    buildTokenInfoDictionary: CallbackTo[AnonTokeninfodictionary],
    buildUnknownDictionary: CallbackTo[UnknownDictionary],
    charDef: String => CallbackTo[DictionaryBuilder_],
    costMatrix: String => CallbackTo[DictionaryBuilder_],
    tid_entries: js.Array[String],
    unkDef: String => CallbackTo[DictionaryBuilder_],
    unk_entries: js.Array[String]
  ): DictionaryBuilder_ = {
    val __obj = js.Dynamic.literal(tid_entries = tid_entries.asInstanceOf[js.Any], unk_entries = unk_entries.asInstanceOf[js.Any])
    __obj.updateDynamic("addTokenInfoDictionary")(js.Any.fromFunction1((t0: java.lang.String) => addTokenInfoDictionary(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("buildConnectionCosts")(buildConnectionCosts.toJsFn)
    __obj.updateDynamic("buildDoubleArray")(buildDoubleArray.toJsFn)
    __obj.updateDynamic("buildTokenInfoDictionary")(buildTokenInfoDictionary.toJsFn)
    __obj.updateDynamic("buildUnknownDictionary")(buildUnknownDictionary.toJsFn)
    __obj.updateDynamic("charDef")(js.Any.fromFunction1((t0: java.lang.String) => charDef(t0).runNow()))
    __obj.updateDynamic("costMatrix")(js.Any.fromFunction1((t0: java.lang.String) => costMatrix(t0).runNow()))
    __obj.updateDynamic("unkDef")(js.Any.fromFunction1((t0: java.lang.String) => unkDef(t0).runNow()))
    __obj.asInstanceOf[DictionaryBuilder_]
  }
}

