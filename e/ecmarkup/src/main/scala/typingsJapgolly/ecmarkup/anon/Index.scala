package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.libExprParserMod.Paren
import typingsJapgolly.ecmarkup.libExprParserMod.PathItem
import typingsJapgolly.ecmarkup.libExprParserMod.Record
import typingsJapgolly.ecmarkup.libExprParserMod.Seq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index
  extends StObject
     with PathItem {
  
  var index: Double
  
  var parent: typingsJapgolly.ecmarkup.libExprParserMod.List | Record | Seq | Paren
}
object Index {
  
  inline def apply(index: Double, parent: typingsJapgolly.ecmarkup.libExprParserMod.List | Record | Seq | Paren): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: typingsJapgolly.ecmarkup.libExprParserMod.List | Record | Seq | Paren): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
