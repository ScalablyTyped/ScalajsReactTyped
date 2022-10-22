package typingsJapgolly.ink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildColorizeMod {
  
  @JSImport("ink/build/colorize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String, color: String, `type`: ColorType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(str: String, color: Unit, `type`: ColorType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ink.inkStrings.foreground
    - typingsJapgolly.ink.inkStrings.background
  */
  trait ColorType extends StObject
  object ColorType {
    
    inline def background: typingsJapgolly.ink.inkStrings.background = "background".asInstanceOf[typingsJapgolly.ink.inkStrings.background]
    
    inline def foreground: typingsJapgolly.ink.inkStrings.foreground = "foreground".asInstanceOf[typingsJapgolly.ink.inkStrings.foreground]
  }
}
