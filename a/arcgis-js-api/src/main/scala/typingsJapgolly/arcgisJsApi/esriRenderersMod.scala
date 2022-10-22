package typingsJapgolly.arcgisJsApi

import typingsJapgolly.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.ClassBreaksRendererProperties
import typingsJapgolly.arcgisJsApi.esri.DictionaryRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.DictionaryRendererProperties
import typingsJapgolly.arcgisJsApi.esri.DotDensityRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.DotDensityRendererProperties
import typingsJapgolly.arcgisJsApi.esri.HeatmapRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.HeatmapRendererProperties
import typingsJapgolly.arcgisJsApi.esri.PieChartRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.PieChartRendererProperties
import typingsJapgolly.arcgisJsApi.esri.SimpleRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.SimpleRendererProperties
import typingsJapgolly.arcgisJsApi.esri.UniqueValueRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.UniqueValueRendererProperties
import typingsJapgolly.arcgisJsApi.esri.VisualVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersMod {
  
  @JSImport("esri/renderers", "ClassBreaksRenderer")
  @js.native
  val ClassBreaksRenderer: ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "ClassBreaksRenderer")
  @js.native
  /**
    * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
    */
  open class ClassBreaksRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  @JSImport("esri/renderers", "DictionaryRenderer")
  @js.native
  val DictionaryRenderer: DictionaryRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "DictionaryRenderer")
  @js.native
  /**
    * Dictionary Renderer is used to symbolize layers using a dictionary of [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) configured with multiple attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html)
    */
  open class DictionaryRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.DictionaryRenderer {
    def this(properties: DictionaryRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  @JSImport("esri/renderers", "DotDensityRenderer")
  @js.native
  val DotDensityRenderer: DotDensityRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "DotDensityRenderer")
  @js.native
  /**
    * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
    */
  open class DotDensityRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/renderers", "HeatmapRenderer")
  @js.native
  val HeatmapRenderer: HeatmapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "HeatmapRenderer")
  @js.native
  /**
    * The HeatmapRenderer uses [kernel density](https://pro.arcgis.com/en/pro-app/2.8/tool-reference/spatial-analyst/how-kernel-density-works.htm) to render point features in [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [OGCFeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html) as a raster surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)
    */
  open class HeatmapRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.HeatmapRenderer {
    def this(properties: HeatmapRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/renderers", "PieChartRenderer")
  @js.native
  val PieChartRenderer: PieChartRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "PieChartRenderer")
  @js.native
  /**
    * PieChartRenderer allows you to create a pie chart for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html)
    */
  open class PieChartRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PieChartRenderer {
    def this(properties: PieChartRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/renderers", "SimpleRenderer")
  @js.native
  val SimpleRenderer: SimpleRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "SimpleRenderer")
  @js.native
  /**
    * SimpleRenderer renders all features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) with one [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html)
    */
  open class SimpleRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.SimpleRenderer {
    def this(properties: SimpleRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  
  @JSImport("esri/renderers", "UniqueValueRenderer")
  @js.native
  val UniqueValueRenderer: UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers", "UniqueValueRenderer")
  @js.native
  /**
    * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
    */
  open class UniqueValueRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
      */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
}
