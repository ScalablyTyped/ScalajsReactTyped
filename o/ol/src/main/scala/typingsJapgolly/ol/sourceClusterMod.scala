package typingsJapgolly.ol

import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceClusterMod {
  
  @JSImport("ol/source/Cluster", JSImport.Default)
  @js.native
  open class default protected () extends Cluster {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Cluster
    extends typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default] {
    
    /* protected */ def cluster(): Unit = js.native
    
    /* protected */ def createCluster(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
    ): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ var distance: Double = js.native
    
    /* protected */ var features: js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /* protected */ def geometryFunction(feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]): typingsJapgolly.ol.geomPointMod.default = js.native
    
    /**
      * Get the distance in pixels between clusters.
      */
    def getDistance(): Double = js.native
    
    /**
      * Get a reference to the wrapped source.
      */
    def getSource(): typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ var resolution: Double = js.native
    
    /**
      * Set the distance in pixels between clusters.
      */
    def setDistance(distance: Double): Unit = js.native
    
    /**
      * Replace the wrapped source.
      */
    def setSource(source: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var geometryFunction: js.UndefOr[
        js.Function1[
          /* p0 */ typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default], 
          typingsJapgolly.ol.geomPointMod.default
        ]
      ] = js.undefined
    
    var source: js.UndefOr[
        typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setGeometryFunction(
        value: /* p0 */ typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] => typingsJapgolly.ol.geomPointMod.default
      ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction1(value))
      
      inline def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
      
      inline def setSource(value: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
