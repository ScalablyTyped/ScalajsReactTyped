package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.typedocStrings.all_
import typingsJapgolly.typedoc.typedocStrings.block
import typingsJapgolly.typedoc.typedocStrings.jsdoc
import typingsJapgolly.typedoc.typedocStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  val All: all_
  
  val Block: block
  
  val JSDoc: jsdoc
  
  val Line: line
}
object All {
  
  inline def apply(): All = {
    val __obj = js.Dynamic.literal(All = "all", Block = "block", JSDoc = "jsdoc", Line = "line")
    __obj.asInstanceOf[All]
  }
  
  extension [Self <: All](x: Self) {
    
    inline def setAll(value: all_): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: block): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setJSDoc(value: jsdoc): Self = StObject.set(x, "JSDoc", value.asInstanceOf[js.Any])
    
    inline def setLine(value: line): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
  }
}
