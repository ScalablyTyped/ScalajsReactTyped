package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryType extends StObject
@JSImport("itunesconnectanalytics", "queryType")
@js.native
object queryType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[queryType & String] = js.native
  
  @js.native
  sealed trait metrics
    extends StObject
       with queryType
  /* "metrics" */ val metrics: typingsJapgolly.itunesconnectanalytics.mod.queryType.metrics & String = js.native
  
  @js.native
  sealed trait sources
    extends StObject
       with queryType
  /* "sources" */ val sources: typingsJapgolly.itunesconnectanalytics.mod.queryType.sources & String = js.native
}
