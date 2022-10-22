package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.popupExpressionInfo
import typingsJapgolly.arcgisJsApi.esri.popupExpressionInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.popupExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupExpressionInfoMod extends Shortcut {
  
  @JSImport("esri/popup/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & popupExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/ExpressionInfo", JSImport.Namespace)
  @js.native
  /**
    * The `ExpressionInfo` class references [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html)
    */
  open class Class ()
    extends StObject
       with popupExpressionInfo {
    def this(properties: popupExpressionInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & popupExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupExpressionInfoMod.foo` */
  override def _to: js.Object & popupExpressionInfoConstructor = ^
}
