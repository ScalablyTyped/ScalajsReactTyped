package typingsJapgolly.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TablesMixin")
@js.native
open class TablesMixinCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.TablesMixin {
  
  /**
    * Returns a table based on the given table ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
    */
  /* CompleteClass */
  override def findTableById(tableId: String): typingsJapgolly.arcgisJsApi.esri.Layer = js.native
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  /* CompleteClass */
  var tables: typingsJapgolly.arcgisJsApi.esri.Collection[typingsJapgolly.arcgisJsApi.esri.Layer] = js.native
}
