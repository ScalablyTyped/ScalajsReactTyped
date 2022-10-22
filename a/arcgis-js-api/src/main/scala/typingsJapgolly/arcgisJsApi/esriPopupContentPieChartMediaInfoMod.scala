package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ChartMediaInfoValue
import typingsJapgolly.arcgisJsApi.esri.PieChartMediaInfo
import typingsJapgolly.arcgisJsApi.esri.PieChartMediaInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.PieChartMediaInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentPieChartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/PieChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PieChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/PieChartMediaInfo", JSImport.Namespace)
  @js.native
  /**
    * A `PieChartMediaInfo` is a type of chart media element that represents a pie chart displayed within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-PieChartMediaInfo.html)
    */
  open class Class ()
    extends StObject
       with PieChartMediaInfo {
    def this(properties: PieChartMediaInfoProperties) = this()
    
    /**
      * Provides an alternate text for an image if the image cannot be displayed.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#altText)
      */
    /* CompleteClass */
    var altText: String = js.native
    
    /**
      * Defines a caption for the media.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
      */
    /* CompleteClass */
    var caption: String = js.native
    
    /**
      * The title of the media element.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
      */
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * Defines the chart value.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
      */
    /* CompleteClass */
    var value: ChartMediaInfoValue = js.native
  }
  
  type _To = js.Object & PieChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentPieChartMediaInfoMod.foo` */
  override def _to: js.Object & PieChartMediaInfoConstructor = ^
}
