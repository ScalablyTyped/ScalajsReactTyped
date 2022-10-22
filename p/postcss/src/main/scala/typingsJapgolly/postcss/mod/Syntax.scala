package typingsJapgolly.postcss.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.postcss.anon.PickProcessOptionsmapfrom
import typingsJapgolly.postcss.anon.ToString
import typingsJapgolly.postcss.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syntax extends StObject {
  
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[
    Parser[
      typingsJapgolly.postcss.libRootMod.default | typingsJapgolly.postcss.libDocumentMod.default
    ]
  ] = js.undefined
  
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.undefined
}
object Syntax {
  
  inline def apply(): Syntax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Syntax]
  }
  
  extension [Self <: Syntax](x: Self) {
    
    inline def setParse(
      value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => typingsJapgolly.postcss.libRootMod.default | typingsJapgolly.postcss.libDocumentMod.default
    ): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setStringify(value: (/* node */ AnyNode, /* builder */ Builder) => Callback): Self = StObject.set(x, "stringify", js.Any.fromFunction2((t0: /* node */ AnyNode, t1: /* builder */ Builder) => (value(t0, t1)).runNow()))
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
