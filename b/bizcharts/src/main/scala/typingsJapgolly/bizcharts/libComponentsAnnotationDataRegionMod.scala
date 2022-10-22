package typingsJapgolly.bizcharts

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.antvG2.libInterfaceMod.DataRegionOption
import typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationDataRegionMod {
  
  @JSImport("bizcharts/lib/components/Annotation/dataRegion", JSImport.Default)
  @js.native
  open class default () extends DataRegion
  
  trait AnnotationDataRegionProps
    extends StObject
       with DataRegionOption
       with IAnnotationBaseProps
  object AnnotationDataRegionProps {
    
    inline def apply(end: AnnotationPosition, start: AnnotationPosition): AnnotationDataRegionProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationDataRegionProps]
    }
  }
  
  @js.native
  trait DataRegion
    extends typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.default[AnnotationDataRegionProps]
}
