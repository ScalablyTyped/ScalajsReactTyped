package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait platform extends StObject
@JSImport("itunesconnectanalytics", "platform")
@js.native
object platform extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[platform & String] = js.native
  
  @js.native
  sealed trait appleTV
    extends StObject
       with platform
  /* "AppleTV" */ val appleTV: typingsJapgolly.itunesconnectanalytics.mod.platform.appleTV & String = js.native
  
  @js.native
  sealed trait iPad
    extends StObject
       with platform
  /* "iPad" */ val iPad: typingsJapgolly.itunesconnectanalytics.mod.platform.iPad & String = js.native
  
  @js.native
  sealed trait iPhone
    extends StObject
       with platform
  /* "iPhone" */ val iPhone: typingsJapgolly.itunesconnectanalytics.mod.platform.iPhone & String = js.native
  
  @js.native
  sealed trait iPod
    extends StObject
       with platform
  /* "iPod" */ val iPod: typingsJapgolly.itunesconnectanalytics.mod.platform.iPod & String = js.native
}
