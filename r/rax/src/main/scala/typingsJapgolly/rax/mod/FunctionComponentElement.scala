package typingsJapgolly.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionComponentElement[P]
  extends StObject
     with RaxElement[P, FunctionComponent[P]] {
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? R : never : never | undefined */ js.Any
  ] = js.undefined
}
object FunctionComponentElement {
  
  inline def apply[P](props: P, `type`: FunctionComponent[P]): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
  
  extension [Self <: FunctionComponentElement[?], P](x: Self & FunctionComponentElement[P]) {
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? R : never : never | undefined */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
