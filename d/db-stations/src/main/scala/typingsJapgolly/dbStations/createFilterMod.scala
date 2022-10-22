package typingsJapgolly.dbStations

import typingsJapgolly.dbStations.dbStationsStrings.all
import typingsJapgolly.dbStations.mod.Station
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFilterMod {
  
  inline def apply[TStation /* <: Station */](selector: all): js.Function1[/* station */ TStation, Boolean] = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* station */ TStation, Boolean]]
  inline def apply[TStation /* <: Station */](selector: Partial[TStation]): js.Function1[/* station */ TStation, Boolean] = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* station */ TStation, Boolean]]
  
  @JSImport("db-stations/create-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
