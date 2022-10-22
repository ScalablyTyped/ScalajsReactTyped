package typingsJapgolly.regjsparser.mod

import typingsJapgolly.regjsparser.regjsparserStrings.disjunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disjunction[F /* <: Features */]
  extends StObject
     with Base[disjunction]
     with _AstNode[F] {
  
  var body: Array[RootNode[F]]
}
object Disjunction {
  
  inline def apply[F /* <: Features */](body: Array[RootNode[F]], range: js.Tuple2[Double, Double], raw: String): Disjunction[F] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disjunction")
    __obj.asInstanceOf[Disjunction[F]]
  }
  
  extension [Self <: Disjunction[?], F /* <: Features */](x: Self & Disjunction[F]) {
    
    inline def setBody(value: Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
