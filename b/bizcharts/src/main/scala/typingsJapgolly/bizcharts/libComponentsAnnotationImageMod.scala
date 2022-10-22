package typingsJapgolly.bizcharts

import typingsJapgolly.antvG2.libInterfaceMod.AnnotationPosition
import typingsJapgolly.antvG2.libInterfaceMod.ImageOption
import typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.IAnnotationBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAnnotationImageMod {
  
  @JSImport("bizcharts/lib/components/Annotation/image", JSImport.Default)
  @js.native
  open class default () extends Image
  
  trait AnnotationImageProps
    extends StObject
       with ImageOption
       with IAnnotationBaseProps
  object AnnotationImageProps {
    
    inline def apply(end: AnnotationPosition, src: String, start: AnnotationPosition): AnnotationImageProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationImageProps]
    }
  }
  
  @js.native
  trait Image
    extends typingsJapgolly.bizcharts.libComponentsAnnotationBaseMod.default[AnnotationImageProps]
}
