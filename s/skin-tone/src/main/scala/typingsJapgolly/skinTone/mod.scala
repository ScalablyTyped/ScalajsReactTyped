package typingsJapgolly.skinTone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("skin-tone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(emoji: String, `type`: SkinToneType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(emoji.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.skinTone.skinToneStrings.none
    - typingsJapgolly.skinTone.skinToneStrings.white
    - typingsJapgolly.skinTone.skinToneStrings.creamWhite
    - typingsJapgolly.skinTone.skinToneStrings.lightBrown
    - typingsJapgolly.skinTone.skinToneStrings.brown
    - typingsJapgolly.skinTone.skinToneStrings.darkBrown
  */
  trait SkinToneType extends StObject
  object SkinToneType {
    
    inline def brown: typingsJapgolly.skinTone.skinToneStrings.brown = "brown".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.brown]
    
    inline def creamWhite: typingsJapgolly.skinTone.skinToneStrings.creamWhite = "creamWhite".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.creamWhite]
    
    inline def darkBrown: typingsJapgolly.skinTone.skinToneStrings.darkBrown = "darkBrown".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.darkBrown]
    
    inline def lightBrown: typingsJapgolly.skinTone.skinToneStrings.lightBrown = "lightBrown".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.lightBrown]
    
    inline def none: typingsJapgolly.skinTone.skinToneStrings.none = "none".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.none]
    
    inline def white: typingsJapgolly.skinTone.skinToneStrings.white = "white".asInstanceOf[typingsJapgolly.skinTone.skinToneStrings.white]
  }
}
