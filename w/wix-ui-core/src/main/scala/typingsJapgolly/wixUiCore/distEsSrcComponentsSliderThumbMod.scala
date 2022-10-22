package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSliderThumbMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Thumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Thumb", "Thumb")
  @js.native
  open class Thumb protected ()
    extends Component[ThumbProps, js.Object, Any] {
    def this(props: ThumbProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThumbProps, context: Any) = this()
  }
  
  inline def getThumbSize(shape: String, rest: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getThumbSize")(scala.List(shape.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  trait ThumbProps extends StObject {
    
    var onMouseEnter: Any
    
    var onMouseLeave: Any
    
    var shape: String
    
    var thumbPosition: CSSProperties
    
    var thumbSize: CSSProperties
  }
  object ThumbProps {
    
    inline def apply(
      onMouseEnter: Any,
      onMouseLeave: Any,
      shape: String,
      thumbPosition: CSSProperties,
      thumbSize: CSSProperties
    ): ThumbProps = {
      val __obj = js.Dynamic.literal(onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], thumbPosition = thumbPosition.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbProps]
    }
    
    extension [Self <: ThumbProps](x: Self) {
      
      inline def setOnMouseEnter(value: Any): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeave(value: Any): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setThumbPosition(value: CSSProperties): Self = StObject.set(x, "thumbPosition", value.asInstanceOf[js.Any])
      
      inline def setThumbSize(value: CSSProperties): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    }
  }
}
