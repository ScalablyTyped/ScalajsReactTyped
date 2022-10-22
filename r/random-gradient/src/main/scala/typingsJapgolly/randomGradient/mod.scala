package typingsJapgolly.randomGradient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uuid: String): String = ^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(uuid: String, `type`: GradientDirection): String = (^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("random-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.randomGradient.randomGradientStrings.diagonal
    - typingsJapgolly.randomGradient.randomGradientStrings.radial
    - typingsJapgolly.randomGradient.randomGradientStrings.horizontal
    - typingsJapgolly.randomGradient.randomGradientStrings.vertical
  */
  trait GradientDirection extends StObject
  object GradientDirection {
    
    inline def diagonal: typingsJapgolly.randomGradient.randomGradientStrings.diagonal = "diagonal".asInstanceOf[typingsJapgolly.randomGradient.randomGradientStrings.diagonal]
    
    inline def horizontal: typingsJapgolly.randomGradient.randomGradientStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.randomGradient.randomGradientStrings.horizontal]
    
    inline def radial: typingsJapgolly.randomGradient.randomGradientStrings.radial = "radial".asInstanceOf[typingsJapgolly.randomGradient.randomGradientStrings.radial]
    
    inline def vertical: typingsJapgolly.randomGradient.randomGradientStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.randomGradient.randomGradientStrings.vertical]
  }
}
