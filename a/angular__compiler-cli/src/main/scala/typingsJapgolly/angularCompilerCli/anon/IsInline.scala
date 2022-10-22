package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompiler.mod.ParseSourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInline extends StObject {
  
  /** Template file recorded by template parser */
  var file: ParseSourceFile
  
  /** Whether the component template is inline */
  var isInline: Boolean
}
object IsInline {
  
  inline def apply(file: ParseSourceFile, isInline: Boolean): IsInline = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  
  extension [Self <: IsInline](x: Self) {
    
    inline def setFile(value: ParseSourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
  }
}
