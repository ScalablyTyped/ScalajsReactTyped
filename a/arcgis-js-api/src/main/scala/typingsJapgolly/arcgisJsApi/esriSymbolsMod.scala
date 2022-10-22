package typingsJapgolly.arcgisJsApi

import typingsJapgolly.arcgisJsApi.esri.CIMSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.CIMSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.ExtrudeSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.FillSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.FillSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.FontConstructor
import typingsJapgolly.arcgisJsApi.esri.FontProperties
import typingsJapgolly.arcgisJsApi.esri.IconSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.IconSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.LabelSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.LabelSymbol3DProperties
import typingsJapgolly.arcgisJsApi.esri.LineSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.LineSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.LineSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.LineSymbol3DProperties
import typingsJapgolly.arcgisJsApi.esri.MeshSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.MeshSymbol3DProperties
import typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.PathSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.PathSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.PictureFillSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.PictureFillSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.PictureMarkerSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.PictureMarkerSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.PointSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.PointSymbol3DProperties
import typingsJapgolly.arcgisJsApi.esri.PolygonSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.PolygonSymbol3DProperties
import typingsJapgolly.arcgisJsApi.esri.SimpleFillSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.SimpleFillSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.SimpleLineSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.SimpleLineSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.TextSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.TextSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.TextSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.TextSymbolProperties
import typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import typingsJapgolly.arcgisJsApi.esri.WebStyleSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.WebStyleSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsMod {
  
  @JSImport("esri/symbols", "CIMSymbol")
  @js.native
  val CIMSymbol: CIMSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "CIMSymbol")
  @js.native
  /**
    * CIMSymbols are high quality, scalable, multi-layer vector symbols for features and graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
    */
  open class CIMSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.CIMSymbol {
    def this(properties: CIMSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "ExtrudeSymbol3DLayer")
  @js.native
  val ExtrudeSymbol3DLayer: ExtrudeSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "ExtrudeSymbol3DLayer")
  @js.native
  /**
    * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
    */
  open class ExtrudeSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.ExtrudeSymbol3DLayer {
    def this(properties: ExtrudeSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "FillSymbol3DLayer")
  @js.native
  val FillSymbol3DLayer: FillSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "FillSymbol3DLayer")
  @js.native
  /**
    * FillSymbol3DLayer is used to render the surfaces of flat 2D [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries and 3D volumetric meshes in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html)
    */
  open class FillSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.FillSymbol3DLayer {
    def this(properties: FillSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "Font")
  @js.native
  val Font: FontConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "Font")
  @js.native
  /**
    * The font used to display [2D text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) and [3D text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html)
    */
  open class FontCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.Font {
    def this(properties: FontProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "IconSymbol3DLayer")
  @js.native
  val IconSymbol3DLayer: IconSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "IconSymbol3DLayer")
  @js.native
  /**
    * IconSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a flat 2D icon (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)
    */
  open class IconSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.IconSymbol3DLayer {
    def this(properties: IconSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "LabelSymbol3D")
  @js.native
  val LabelSymbol3D: LabelSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "LabelSymbol3D")
  @js.native
  /**
    * LabelSymbol3D is used to render labels for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html)
    */
  open class LabelSymbol3DCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.LabelSymbol3D {
    def this(properties: LabelSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "LineSymbol3D")
  @js.native
  val LineSymbol3D: LineSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "LineSymbol3D")
  @js.native
  /**
    * LineSymbol3D is used to render features with [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html)
    */
  open class LineSymbol3DCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.LineSymbol3D {
    def this(properties: LineSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "LineSymbol3DLayer")
  @js.native
  val LineSymbol3DLayer: LineSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "LineSymbol3DLayer")
  @js.native
  /**
    * LineSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries using a flat 2D line with a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html)
    */
  open class LineSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.LineSymbol3DLayer {
    def this(properties: LineSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "MeshSymbol3D")
  @js.native
  val MeshSymbol3D: MeshSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "MeshSymbol3D")
  @js.native
  /**
    * MeshSymbol3D is used to render 3D mesh features in a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html)
    */
  open class MeshSymbol3DCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.MeshSymbol3D {
    def this(properties: MeshSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "ObjectSymbol3DLayer")
  @js.native
  val ObjectSymbol3DLayer: ObjectSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "ObjectSymbol3DLayer")
  @js.native
  /**
    * ObjectSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a volumetric 3D shape (e.g., a sphere or cylinder) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html)
    */
  open class ObjectSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayer {
    def this(properties: ObjectSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "PathSymbol3DLayer")
  @js.native
  val PathSymbol3DLayer: PathSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "PathSymbol3DLayer")
  @js.native
  /**
    * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
    */
  open class PathSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PathSymbol3DLayer {
    def this(properties: PathSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "PictureFillSymbol")
  @js.native
  val PictureFillSymbol: PictureFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "PictureFillSymbol")
  @js.native
  /**
    * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
    */
  open class PictureFillSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PictureFillSymbol {
    def this(properties: PictureFillSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "PictureMarkerSymbol")
  @js.native
  val PictureMarkerSymbol: PictureMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "PictureMarkerSymbol")
  @js.native
  /**
    * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
    */
  open class PictureMarkerSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PictureMarkerSymbol {
    def this(properties: PictureMarkerSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "PointSymbol3D")
  @js.native
  val PointSymbol3D: PointSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "PointSymbol3D")
  @js.native
  /**
    * PointSymbol3D is used to render features with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html)
    */
  open class PointSymbol3DCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PointSymbol3D {
    def this(properties: PointSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "PolygonSymbol3D")
  @js.native
  val PolygonSymbol3D: PolygonSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "PolygonSymbol3D")
  @js.native
  /**
    * PolygonSymbol3D is used to render features with [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html)
    */
  open class PolygonSymbol3DCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.PolygonSymbol3D {
    def this(properties: PolygonSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "SimpleFillSymbol")
  @js.native
  val SimpleFillSymbol: SimpleFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "SimpleFillSymbol")
  @js.native
  /**
    * SimpleFillSymbol is used for rendering 2D polygons in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html)
    */
  open class SimpleFillSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.SimpleFillSymbol {
    def this(properties: SimpleFillSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "SimpleLineSymbol")
  @js.native
  val SimpleLineSymbol: SimpleLineSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "SimpleLineSymbol")
  @js.native
  /**
    * SimpleLineSymbol is used for rendering 2D [polyline geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html)
    */
  open class SimpleLineSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.SimpleLineSymbol {
    def this(properties: SimpleLineSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "SimpleMarkerSymbol")
  @js.native
  val SimpleMarkerSymbol: SimpleMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "SimpleMarkerSymbol")
  @js.native
  /**
    * SimpleMarkerSymbol is used for rendering 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries with a simple shape and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html)
    */
  open class SimpleMarkerSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbol {
    def this(properties: SimpleMarkerSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "TextSymbol")
  @js.native
  val TextSymbol: TextSymbolConstructor = js.native
  
  @JSImport("esri/symbols", "TextSymbol3DLayer")
  @js.native
  val TextSymbol3DLayer: TextSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "TextSymbol3DLayer")
  @js.native
  /**
    * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
    */
  open class TextSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.TextSymbol3DLayer {
    def this(properties: TextSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "TextSymbol")
  @js.native
  /**
    * Text symbols are used to define the graphic for displaying labels on a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html)
    */
  open class TextSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.TextSymbol {
    def this(properties: TextSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "WaterSymbol3DLayer")
  @js.native
  val WaterSymbol3DLayer: WaterSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "WaterSymbol3DLayer")
  @js.native
  /**
    * WaterSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries as realistic, animated water surfaces, therefore it can only be used inside a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html)
    */
  open class WaterSymbol3DLayerCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayer {
    def this(properties: WaterSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  @JSImport("esri/symbols", "WebStyleSymbol")
  @js.native
  val WebStyleSymbol: WebStyleSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols", "WebStyleSymbol")
  @js.native
  /**
    * WebStyleSymbol is a class used to conveniently create vector 2D symbols and realistic and thematic 3D symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)
    */
  open class WebStyleSymbolCls ()
    extends StObject
       with typingsJapgolly.arcgisJsApi.esri.WebStyleSymbol {
    def this(properties: WebStyleSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
