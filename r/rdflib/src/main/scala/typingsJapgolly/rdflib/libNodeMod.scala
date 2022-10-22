package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libTypesMod.FromValueReturns
import typingsJapgolly.rdflib.libTypesMod.ValueType
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  /* note: abstract class */ @JSImport("rdflib/lib/node", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.rdflib.libNodeInternalMod.default {
    /* protected */ def this(value: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/node", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromValue[T /* <: FromValueReturns[Any] */](value: ValueType): T = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def toJS(term: Any): js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(term.asInstanceOf[js.Any]).asInstanceOf[js.Date | Number | String | Boolean | js.Object | (js.Array[js.Date | Number | String | Boolean | js.Object])]
  }
}
