package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libTypesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTSV[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */] extends StObject {
  
  var value: TSV
}
object ValueTSV {
  
  inline def apply[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */](value: TSV): ValueTSV[TSV, TResolvedTypesMeta, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTSV[TSV, TResolvedTypesMeta, TTypestate]]
  }
  
  extension [Self <: ValueTSV[?, ?, ?], TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TResolvedTypesMeta extends xstate.xstate/lib/typegenTypes.TypegenDisabled ? TTypestate['value'] : never */ js.Any */, TResolvedTypesMeta, TTypestate /* <: Typestate[TContext] */](x: Self & (ValueTSV[TSV, TResolvedTypesMeta, TTypestate])) {
    
    inline def setValue(value: TSV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
