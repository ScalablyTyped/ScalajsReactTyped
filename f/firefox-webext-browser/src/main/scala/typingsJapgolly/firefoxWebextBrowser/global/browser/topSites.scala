package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.browser.topSites.GetOptions
import typingsJapgolly.firefoxWebextBrowser.browser.topSites.MostVisitedURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
  *
  * Permissions: `topSites`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object topSites {
  
  @JSGlobal("browser.topSites")
  @js.native
  val ^ : js.Any = js.native
  
  /* topSites functions */
  /** Gets a list of top sites. */
  inline def get(): js.Promise[js.Array[MostVisitedURL]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Array[MostVisitedURL]]]
  inline def get(options: GetOptions): js.Promise[js.Array[MostVisitedURL]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MostVisitedURL]]]
}
