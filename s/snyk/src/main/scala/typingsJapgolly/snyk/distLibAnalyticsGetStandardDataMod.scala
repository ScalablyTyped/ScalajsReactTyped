package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliArgsMod.ArgsOptions
import typingsJapgolly.snyk.distLibAnalyticsTypesMod.StandardAnalyticsData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAnalyticsGetStandardDataMod {
  
  @JSImport("snyk/dist/lib/analytics/getStandardData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStandardData(args: js.Array[ArgsOptions]): js.Promise[StandardAnalyticsData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStandardData")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StandardAnalyticsData]]
}
