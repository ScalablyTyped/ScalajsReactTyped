package typingsJapgolly.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutScrollbarSizeMod {
  
  @JSImport("@react-md/utils/types/layout/scrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def scrollbarSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")().asInstanceOf[Double]
  inline def scrollbarSize(`type`: Unit, forced: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any], forced.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def scrollbarSize(`type`: SizingType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def scrollbarSize(`type`: SizingType, forced: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollbarSize")(`type`.asInstanceOf[js.Any], forced.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.height
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.width
  */
  trait SizingType extends StObject
  object SizingType {
    
    inline def height: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.height = "height".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.height]
    
    inline def width: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.width = "width".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.width]
  }
}
