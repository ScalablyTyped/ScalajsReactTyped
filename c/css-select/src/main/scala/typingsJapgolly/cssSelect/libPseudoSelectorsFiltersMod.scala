package typingsJapgolly.cssSelect

import typingsJapgolly.cssSelect.libTypesMod.CompiledQuery
import typingsJapgolly.cssSelect.libTypesMod.InternalOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPseudoSelectorsFiltersMod {
  
  @JSImport("css-select/lib/pseudo-selectors/filters", "filters")
  @js.native
  val filters: Record[String, Filter] = js.native
  
  type Filter = js.Function4[
    /* next */ CompiledQuery[Any], 
    /* text */ String, 
    /* options */ InternalOptions[Any, Any], 
    /* context */ js.UndefOr[js.Array[Any]], 
    CompiledQuery[Any]
  ]
}
