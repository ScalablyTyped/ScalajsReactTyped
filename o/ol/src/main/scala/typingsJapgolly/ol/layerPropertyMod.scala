package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerPropertyMod {
  
  @JSImport("ol/layer/Property", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Property & String] = js.native
    
    /* "extent" */ val EXTENT: typingsJapgolly.ol.layerPropertyMod.Property.EXTENT & String = js.native
    
    /* "maxResolution" */ val MAX_RESOLUTION: typingsJapgolly.ol.layerPropertyMod.Property.MAX_RESOLUTION & String = js.native
    
    /* "maxZoom" */ val MAX_ZOOM: typingsJapgolly.ol.layerPropertyMod.Property.MAX_ZOOM & String = js.native
    
    /* "minResolution" */ val MIN_RESOLUTION: typingsJapgolly.ol.layerPropertyMod.Property.MIN_RESOLUTION & String = js.native
    
    /* "minZoom" */ val MIN_ZOOM: typingsJapgolly.ol.layerPropertyMod.Property.MIN_ZOOM & String = js.native
    
    /* "opacity" */ val OPACITY: typingsJapgolly.ol.layerPropertyMod.Property.OPACITY & String = js.native
    
    /* "source" */ val SOURCE: typingsJapgolly.ol.layerPropertyMod.Property.SOURCE & String = js.native
    
    /* "visible" */ val VISIBLE: typingsJapgolly.ol.layerPropertyMod.Property.VISIBLE & String = js.native
    
    /* "zIndex" */ val Z_INDEX: typingsJapgolly.ol.layerPropertyMod.Property.Z_INDEX & String = js.native
  }
  
  @js.native
  sealed trait Property extends StObject
  @JSImport("ol/layer/Property", "Property")
  @js.native
  object Property extends StObject {
    
    @js.native
    sealed trait EXTENT
      extends StObject
         with Property
    
    @js.native
    sealed trait MAX_RESOLUTION
      extends StObject
         with Property
    
    @js.native
    sealed trait MAX_ZOOM
      extends StObject
         with Property
    
    @js.native
    sealed trait MIN_RESOLUTION
      extends StObject
         with Property
    
    @js.native
    sealed trait MIN_ZOOM
      extends StObject
         with Property
    
    @js.native
    sealed trait OPACITY
      extends StObject
         with Property
    
    @js.native
    sealed trait SOURCE
      extends StObject
         with Property
    
    @js.native
    sealed trait VISIBLE
      extends StObject
         with Property
    
    @js.native
    sealed trait Z_INDEX
      extends StObject
         with Property
  }
}
