package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.grid.header.IContainer
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object property {
  
  trait IGrid
    extends StObject
       with IPanel {
    
    /** [Config Option] (Object) */
    var customEditors: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var customRenderers: js.UndefOr[Any] = js.undefined
    
    /** [Method] Gets the source data object containing the property data
      * @returns Object The data object.
      */
    var getSource: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var inferTypes: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number/String) */
    var nameColumnWidth: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var nameField: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Object) */
    var propertyNames: js.UndefOr[Any] = js.undefined
    
    /** [Method] Removes a property from the grid
      * @param prop String The name of the property to remove.
      */
    var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of a property
      * @param prop String The name of the property to set.
      * @param value Object The value to test.
      * @param create Boolean true to create the property if it doesn't already exist.
      */
    var setProperty: js.UndefOr[
        js.Function3[
          /* prop */ js.UndefOr[String], 
          /* value */ js.UndefOr[Any], 
          /* create */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the source data object containing the property data
      * @param source Object The data object.
      * @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
      */
    var setSource: js.UndefOr[
        js.Function2[/* source */ js.UndefOr[Any], /* sourceConfig */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var source: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var sourceConfig: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object IGrid {
    
    inline def apply(): IGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGrid]
    }
    
    extension [Self <: IGrid](x: Self) {
      
      inline def setCustomEditors(value: Any): Self = StObject.set(x, "customEditors", value.asInstanceOf[js.Any])
      
      inline def setCustomEditorsUndefined: Self = StObject.set(x, "customEditors", js.undefined)
      
      inline def setCustomRenderers(value: Any): Self = StObject.set(x, "customRenderers", value.asInstanceOf[js.Any])
      
      inline def setCustomRenderersUndefined: Self = StObject.set(x, "customRenderers", js.undefined)
      
      inline def setGetSource(value: CallbackTo[Any]): Self = StObject.set(x, "getSource", value.toJsFn)
      
      inline def setGetSourceUndefined: Self = StObject.set(x, "getSource", js.undefined)
      
      inline def setInferTypes(value: Boolean): Self = StObject.set(x, "inferTypes", value.asInstanceOf[js.Any])
      
      inline def setInferTypesUndefined: Self = StObject.set(x, "inferTypes", js.undefined)
      
      inline def setNameColumnWidth(value: Any): Self = StObject.set(x, "nameColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setNameColumnWidthUndefined: Self = StObject.set(x, "nameColumnWidth", js.undefined)
      
      inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
      
      inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
      
      inline def setPropertyNames(value: Any): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      inline def setRemoveProperty(value: /* prop */ js.UndefOr[String] => Callback): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1((t0: /* prop */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setRemovePropertyUndefined: Self = StObject.set(x, "removeProperty", js.undefined)
      
      inline def setSetProperty(
        value: (/* prop */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* create */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "setProperty", js.Any.fromFunction3((t0: /* prop */ js.UndefOr[String], t1: /* value */ js.UndefOr[Any], t2: /* create */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
      
      inline def setSetSource(value: (/* source */ js.UndefOr[Any], /* sourceConfig */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction2((t0: /* source */ js.UndefOr[Any], t1: /* sourceConfig */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setSetSourceUndefined: Self = StObject.set(x, "setSource", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceConfig(value: Any): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
      
      inline def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    }
  }
  
  type IHeaderContainer = IContainer
  
  trait IProperty
    extends StObject
       with IModel {
    
    /** [Property] (Ext.util.MixedCollection) */
    @JSName("fields")
    var fields_IProperty: js.UndefOr[IMixedCollection] = js.undefined
  }
  object IProperty {
    
    inline def apply(): IProperty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProperty]
    }
    
    extension [Self <: IProperty](x: Self) {
      
      inline def setFields(value: IMixedCollection): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    }
  }
  
  trait IStore
    extends StObject
       with typingsJapgolly.extjs.Ext.data.IStore
  object IStore {
    
    inline def apply(): IStore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStore]
    }
  }
}
