package typingsJapgolly.micromarkExtensionGfmTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxMod {
  
  @JSImport("micromark-extension-gfm-table/lib/syntax", "gfmTable")
  @js.native
  val gfmTable: Extension = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left
    - typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center
    - typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right
    - typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none
  */
  trait Align extends StObject
  object Align {
    
    inline def center: typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center = "center".asInstanceOf[typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center]
    
    inline def left: typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left = "left".asInstanceOf[typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left]
    
    inline def none: typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none = "none".asInstanceOf[typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none]
    
    inline def right: typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right = "right".asInstanceOf[typingsJapgolly.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right]
  }
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  type Resolver = typingsJapgolly.micromarkUtilTypes.mod.Resolver
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Token = typingsJapgolly.micromarkUtilTypes.mod.Token
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
