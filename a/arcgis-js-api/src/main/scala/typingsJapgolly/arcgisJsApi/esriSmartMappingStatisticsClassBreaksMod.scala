package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ClassBreaksResult
import typingsJapgolly.arcgisJsApi.esri.classBreaksClassBreaksParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsClassBreaksMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/classBreaks", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ classBreaksClassBreaksParams, js.Promise[ClassBreaksResult]] = js.native
  
  type _To = js.Function1[/* params */ classBreaksClassBreaksParams, js.Promise[ClassBreaksResult]]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsClassBreaksMod.foo` */
  override def _to: js.Function1[/* params */ classBreaksClassBreaksParams, js.Promise[ClassBreaksResult]] = ^
}
