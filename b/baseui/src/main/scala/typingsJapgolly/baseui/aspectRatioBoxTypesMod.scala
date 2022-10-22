package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxTypesMod {
  
  trait AspectRatioBoxProps[T /* <: ElementType */]
    extends StObject
       with BlockProps[T] {
    
    /** Aspect ratio is width divided by height. */
    val aspectRatio: js.UndefOr[Double] = js.undefined
  }
  object AspectRatioBoxProps {
    
    inline def apply[T /* <: ElementType */](): AspectRatioBoxProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioBoxProps[T]]
    }
    
    extension [Self <: AspectRatioBoxProps[?], T /* <: ElementType */](x: Self & AspectRatioBoxProps[T]) {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    }
  }
}
