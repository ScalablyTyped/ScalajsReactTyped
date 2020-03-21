package typingsJapgolly.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLScriptElement
import typingsJapgolly.firebaseAnalyticsTypes.mod.DataLayer
import typingsJapgolly.firebaseAnalyticsTypes.mod.Gtag
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  def initializeGAId(app: FirebaseApp, installations: FirebaseInstallations, gtagCore: Gtag): js.Promise[Unit] = js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  def wrapOrCreateGtag(
    initializedIdPromisesMap: StringDictionary[js.Promise[Unit]],
    dataLayerName: String,
    gtagFunctionName: String
  ): AnonGtagCore = js.native
}

