package typingsJapgolly.stylus.anon

import typingsJapgolly.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cond extends StObject {
  
  var __type: String
  
  var block: typingsJapgolly.stylus.mod.Stylus.Nodes.Block
  
  var column: Double
  
  var cond: Expression
  
  var elses: js.Array[Expression]
  
  var filename: String
  
  var lineno: Double
  
  var negate: Boolean
}
object Cond {
  
  inline def apply(
    __type: String,
    block: typingsJapgolly.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    filename: String,
    lineno: Double,
    negate: Boolean
  ): Cond = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], elses = elses.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cond]
  }
  
  extension [Self <: Cond](x: Self) {
    
    inline def setBlock(value: typingsJapgolly.stylus.mod.Stylus.Nodes.Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setCond(value: Expression): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setElses(value: js.Array[Expression]): Self = StObject.set(x, "elses", value.asInstanceOf[js.Any])
    
    inline def setElsesVarargs(value: Expression*): Self = StObject.set(x, "elses", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
