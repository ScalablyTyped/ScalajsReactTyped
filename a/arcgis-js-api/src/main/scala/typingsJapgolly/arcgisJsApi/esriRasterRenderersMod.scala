package typingsJapgolly.arcgisJsApi

import typingsJapgolly.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.ClassBreaksRendererProperties
import typingsJapgolly.arcgisJsApi.esri.FlowRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.FlowRendererProperties
import typingsJapgolly.arcgisJsApi.esri.RasterColormapRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.RasterColormapRendererProperties
import typingsJapgolly.arcgisJsApi.esri.RasterShadedReliefRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import typingsJapgolly.arcgisJsApi.esri.RasterStretchRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.RasterStretchRendererProperties
import typingsJapgolly.arcgisJsApi.esri.UniqueValueRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.UniqueValueRendererProperties
import typingsJapgolly.arcgisJsApi.esri.VectorFieldRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.VectorFieldRendererProperties
import typingsJapgolly.arcgisJsApi.esri.VisualVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRasterRenderersMod {
  
  @JSImport("esri/rasterRenderers", "ClassBreaksRenderer")
  @js.native
  val ClassBreaksRenderer: ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "ClassBreaksRenderer")
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
  
  @JSImport("esri/rasterRenderers", "FlowRenderer")
  @js.native
  val FlowRenderer: FlowRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "FlowRenderer")
  @js.native
  /**
    * The FlowRenderer allows you to visualize your raster data with animated streamlines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html)
    */
  open class FlowRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.FlowRenderer {
    def this(properties: FlowRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/rasterRenderers", "RasterColormapRenderer")
  @js.native
  val RasterColormapRenderer: RasterColormapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterColormapRenderer")
  @js.native
  /**
    * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
    */
  open class RasterColormapRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/rasterRenderers", "RasterShadedReliefRenderer")
  @js.native
  val RasterShadedReliefRenderer: RasterShadedReliefRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterShadedReliefRenderer")
  @js.native
  /**
    * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
    */
  open class RasterShadedReliefRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/rasterRenderers", "RasterStretchRenderer")
  @js.native
  val RasterStretchRenderer: RasterStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "RasterStretchRenderer")
  @js.native
  /**
    * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html) based on the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
    */
  open class RasterStretchRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/rasterRenderers", "UniqueValueRenderer")
  @js.native
  val UniqueValueRenderer: UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "UniqueValueRenderer")
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
  
  @JSImport("esri/rasterRenderers", "VectorFieldRenderer")
  @js.native
  val VectorFieldRenderer: VectorFieldRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rasterRenderers", "VectorFieldRenderer")
  @js.native
  /**
    * The VectorFieldRenderer allows you to display your raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
    */
  open class VectorFieldRendererCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
