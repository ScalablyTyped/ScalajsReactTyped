package typingsJapgolly.metascraperSpotify

import typingsJapgolly.metascraper.mod.Rule
import typingsJapgolly.metascraperSpotify.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Rule = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Rule]
  
  @JSImport("metascraper-spotify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidUrl(config: Url): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUrl")(config.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
