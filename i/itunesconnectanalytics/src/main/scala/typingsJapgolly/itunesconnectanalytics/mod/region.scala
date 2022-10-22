package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait region extends StObject
@JSImport("itunesconnectanalytics", "region")
@js.native
object region extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[region & String] = js.native
  
  @js.native
  sealed trait africaMiddleEastIndia
    extends StObject
       with region
  /* "-100005" */ val africaMiddleEastIndia: typingsJapgolly.itunesconnectanalytics.mod.region.africaMiddleEastIndia & String = js.native
  
  @js.native
  sealed trait asiaPacific
    extends StObject
       with region
  /* "-100004" */ val asiaPacific: typingsJapgolly.itunesconnectanalytics.mod.region.asiaPacific & String = js.native
  
  @js.native
  sealed trait europe
    extends StObject
       with region
  /* "-100003" */ val europe: typingsJapgolly.itunesconnectanalytics.mod.region.europe & String = js.native
  
  @js.native
  sealed trait latinAmericaTheCaribbean
    extends StObject
       with region
  /* "-100002" */ val latinAmericaTheCaribbean: typingsJapgolly.itunesconnectanalytics.mod.region.latinAmericaTheCaribbean & String = js.native
  
  @js.native
  sealed trait usaCanada
    extends StObject
       with region
  /* "-100001" */ val usaCanada: typingsJapgolly.itunesconnectanalytics.mod.region.usaCanada & String = js.native
}
