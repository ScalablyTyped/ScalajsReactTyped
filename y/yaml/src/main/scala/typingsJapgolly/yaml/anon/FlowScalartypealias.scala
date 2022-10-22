package typingsJapgolly.yaml.anon

import typingsJapgolly.yaml.distParseCstMod.SourceToken
import typingsJapgolly.yaml.yamlStrings.`double-quoted-scalar`
import typingsJapgolly.yaml.yamlStrings.`single-quoted-scalar`
import typingsJapgolly.yaml.yamlStrings.alias
import typingsJapgolly.yaml.yamlStrings.scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yaml.yaml/dist/parse/cst.FlowScalar & {  type :'alias'} */
trait FlowScalartypealias extends StObject {
  
  var end: js.UndefOr[js.Array[SourceToken]] = js.undefined
  
  var indent: Double
  
  var offset: Double
  
  var source: String
  
  var `type`: (alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`) & alias
}
object FlowScalartypealias {
  
  inline def apply(
    indent: Double,
    offset: Double,
    source: String,
    `type`: (alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`) & alias
  ): FlowScalartypealias = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowScalartypealias]
  }
  
  extension [Self <: FlowScalartypealias](x: Self) {
    
    inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: (alias | scalar | `single-quoted-scalar` | `double-quoted-scalar`) & alias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
