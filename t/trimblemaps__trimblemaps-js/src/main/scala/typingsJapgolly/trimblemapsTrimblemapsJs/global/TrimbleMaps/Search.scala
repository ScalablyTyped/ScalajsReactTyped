package typingsJapgolly.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typingsJapgolly.trimblemapsTrimblemapsJs.anon.Countries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSGlobal("TrimbleMaps.Search")
  @js.native
  val ^ : js.Any = js.native
  
  inline def singleSearch(options: Countries): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleSearch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
