package typingsJapgolly.cssSelect

import typingsJapgolly.cssSelect.libEsmTypesMod.CompiledQuery
import typingsJapgolly.cssSelect.libEsmTypesMod.InternalOptions
import typingsJapgolly.cssWhat.libEsTypesMod.AttributeAction
import typingsJapgolly.cssWhat.libEsTypesMod.AttributeSelector
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmAttributesMod {
  
  @JSImport("css-select/lib/esm/attributes", "attributeRules")
  @js.native
  val attributeRules: Record[
    AttributeAction, 
    js.Function3[
      /* next */ CompiledQuery[Any], 
      /* data */ AttributeSelector, 
      /* options */ InternalOptions[Any, Any], 
      CompiledQuery[Any]
    ]
  ] = js.native
}
