package typingsJapgolly.geolib

import typingsJapgolly.geolib.geolibStrings.E
import typingsJapgolly.geolib.geolibStrings.N
import typingsJapgolly.geolib.geolibStrings.S
import typingsJapgolly.geolib.geolibStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetRoughCompassDirectionMod {
  
  @JSImport("geolib/es/getRoughCompassDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(exact: String): js.UndefOr[S | W | E | N] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(exact.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S | W | E | N]]
}
