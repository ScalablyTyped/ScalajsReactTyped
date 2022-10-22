package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfo
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentMixinsChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/mixins/ChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : ChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/mixins/ChartMediaInfo", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with ChartMediaInfo {
    
    /**
      * Defines the chart value.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
      */
    /* CompleteClass */
    var value: ChartMediaInfoValue = js.native
  }
  
  type _To = ChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentMixinsChartMediaInfoMod.foo` */
  override def _to: ChartMediaInfoConstructor = ^
}
