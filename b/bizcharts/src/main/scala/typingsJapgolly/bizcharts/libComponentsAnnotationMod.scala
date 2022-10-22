package typingsJapgolly.bizcharts

import typingsJapgolly.bizcharts.libComponentsAnnotationArcMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationMod {
  
  @JSImport("bizcharts/lib/components/Annotation", "Arc")
  @js.native
  open class Arc () extends default
  
  /* note: abstract class */ @JSImport("bizcharts/lib/components/Annotation", "Base")
  @js.native
  open class Base[PropsI] ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.default[PropsI]
  object Base {
    
    @JSImport("bizcharts/lib/components/Annotation", "Base")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bizcharts/lib/components/Annotation", "Base.contextType")
    @js.native
    def contextType: Any = js.native
    inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bizcharts/lib/components/Annotation", "DataMarker")
  @js.native
  open class DataMarker ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationDataMarkerMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "DataRegion")
  @js.native
  open class DataRegion ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationDataRegionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Html")
  @js.native
  open class Html ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationHtmlMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Image")
  @js.native
  open class Image ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationImageMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Line")
  @js.native
  open class Line ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationLineMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "ReactElement")
  @js.native
  open class ReactElement ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationReactElementMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Region")
  @js.native
  open class Region ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationRegionMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "RegionFilter")
  @js.native
  open class RegionFilter ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationRegionFilterMod.default
  
  @JSImport("bizcharts/lib/components/Annotation", "Text")
  @js.native
  open class Text ()
    extends typingsJapgolly.bizcharts.libComponentsAnnotationTextMod.default
}
