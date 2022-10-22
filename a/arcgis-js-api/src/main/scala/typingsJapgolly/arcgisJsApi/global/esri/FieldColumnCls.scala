package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.ButtonMenuItemConfig
import typingsJapgolly.arcgisJsApi.esri.FieldColumnProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FieldColumn")
@js.native
/**
  * The [FieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) class works with the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) and provides the underlying logic for column behavior.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html)
  */
open class FieldColumnCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.FieldColumn {
  def this(properties: FieldColumnProperties) = this()
  
  /**
    * Returns any associated menu items on the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#getMenuItems)
    */
  /* CompleteClass */
  override def getMenuItems(): ButtonMenuItemConfig = js.native
  
  /**
    * The object to customize the feature table column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#menu)
    */
  /* CompleteClass */
  override val menu: typingsJapgolly.arcgisJsApi.esri.ButtonMenu = js.native
  
  /**
    * Indicates whether the column is resizable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
    */
  /* CompleteClass */
  override val resizable: Boolean = js.native
}
