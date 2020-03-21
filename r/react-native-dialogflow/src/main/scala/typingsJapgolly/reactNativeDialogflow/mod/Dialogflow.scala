package typingsJapgolly.reactNativeDialogflow.mod

import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`en-GB`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`en-US`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`pt-BR`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-CN`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-HK`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.`zh-TW`
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.de
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.en
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.es
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.fr
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.it
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.ja
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.ko
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.nl
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.pt
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.ru
import typingsJapgolly.reactNativeDialogflow.reactNativeDialogflowStrings.uk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialogflow", "Dialogflow")
@js.native
object Dialogflow extends js.Object {
  val LANG_CHINESE_CHINA: `zh-CN` = js.native
  val LANG_CHINESE_HONGKONG: `zh-HK` = js.native
  val LANG_CHINESE_TAIWAN: `zh-TW` = js.native
  val LANG_DUTCH: nl = js.native
  val LANG_ENGLISH: en = js.native
  val LANG_ENGLISH_GB: `en-GB` = js.native
  val LANG_ENGLISH_US: `en-US` = js.native
  val LANG_FRENCH: fr = js.native
  val LANG_GERMAN: de = js.native
  val LANG_ITALIAN: it = js.native
  val LANG_JAPANESE: ja = js.native
  val LANG_KOREAN: ko = js.native
  val LANG_PORTUGUESE: pt = js.native
  val LANG_PORTUGUESE_BRAZIL: `pt-BR` = js.native
  val LANG_RUSSIAN: ru = js.native
  val LANG_SPANISH: es = js.native
  val LANG_UKRAINIAN: uk = js.native
  def finishListening(): Unit = js.native
  def onAudioLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
  def onListeningFinished(callback: js.Function0[Unit]): Unit = js.native
  def onListeningStarted(callback: js.Function0[Unit]): Unit = js.native
  def requestEvent(
    eventName: String,
    eventData: js.Object,
    resultCallback: js.Function1[/* result */ js.Object, Unit],
    errorCallback: js.Function1[/* error */ js.Error, Unit]
  ): js.Promise[_] = js.native
  def requestQuery(
    query: String,
    resultCallback: js.Function1[/* result */ js.Object, Unit],
    errorCallback: js.Function1[/* error */ js.Error, Unit]
  ): js.Promise[_] = js.native
  def resetContexts(
    resultCallback: js.Function1[/* result */ js.Object, Unit],
    errorCallback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  def setConfiguration(accessToken: String, languageTag: String): Unit = js.native
  def setContexts(contexts: js.Array[_]): Unit = js.native
  def setEntities(entities: js.Array[_]): Unit = js.native
  def setPermanentContexts(contexts: js.Array[_]): Unit = js.native
  def startListening(
    resultCallback: js.Function1[/* result */ js.Object, Unit],
    errorCallback: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}

