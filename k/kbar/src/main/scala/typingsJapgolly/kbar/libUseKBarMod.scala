package typingsJapgolly.kbar

import typingsJapgolly.kbar.libTypesMod.KBarOptions
import typingsJapgolly.kbar.libTypesMod.KBarQuery
import typingsJapgolly.kbar.libTypesMod.KBarState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseKBarMod {
  
  @JSImport("kbar/lib/useKBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKBar[C](): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")().asInstanceOf[useKBarReturnType[C]]
  inline def useKBar[C](collector: js.Function1[/* state */ KBarState, C]): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")(collector.asInstanceOf[js.Any]).asInstanceOf[useKBarReturnType[C]]
  
  trait BaseKBarReturnType extends StObject {
    
    var options: KBarOptions
    
    var query: KBarQuery
  }
  object BaseKBarReturnType {
    
    inline def apply(options: KBarOptions, query: KBarQuery): BaseKBarReturnType = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseKBarReturnType]
    }
    
    extension [Self <: BaseKBarReturnType](x: Self) {
      
      inline def setOptions(value: KBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: KBarQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends null ? kbar.kbar/lib/useKBar.BaseKBarReturnType : S & kbar.kbar/lib/useKBar.BaseKBarReturnType
    }}}
    */
  @js.native
  trait useKBarReturnType[S] extends StObject
}
