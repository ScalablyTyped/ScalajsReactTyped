package typingsJapgolly.bizcharts

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.antvG2.libInterfaceMod.RegionFilterOption
import typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationRegionFilterMod {
  
  @JSImport("bizcharts/lib/components/Annotation/regionFilter", JSImport.Default)
  @js.native
  open class default () extends RegionFilter
  
  trait AnnotationRegionFilterProps
    extends StObject
       with RegionFilterOption
       with IAnnotationBaseProps
  object AnnotationRegionFilterProps {
    
    inline def apply(color: String, end: AnnotationPosition, start: AnnotationPosition): AnnotationRegionFilterProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationRegionFilterProps]
    }
  }
  
  @js.native
  trait RegionFilter
    extends typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.default[AnnotationRegionFilterProps]
}
