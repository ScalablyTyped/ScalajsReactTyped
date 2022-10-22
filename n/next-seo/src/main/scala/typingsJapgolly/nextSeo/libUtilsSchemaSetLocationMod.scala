package typingsJapgolly.nextSeo

import org.scalajs.dom.Location
import typingsJapgolly.nextSeo.anon.Address
import typingsJapgolly.nextSeo.anon.SameAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetLocationMod {
  
  @JSImport("next-seo/lib/utils/schema/setLocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setLocation(location: Location): js.UndefOr[SameAs | Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocation")(location.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SameAs | Address]]
}
