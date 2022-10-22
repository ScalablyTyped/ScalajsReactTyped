package typingsJapgolly.webidlConversions

import typingsJapgolly.webidlConversions.mod.Globals
import typingsJapgolly.webidlConversions.webidlConversionsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined webidl-conversions.webidl-conversions.BufferSourceOptions & {  allowShared :false | undefined} */
  trait BufferSourceOptionsallowS extends StObject {
    
    var allowShared: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var context: js.UndefOr[String] = js.undefined
    
    var globals: js.UndefOr[Globals] = js.undefined
  }
  object BufferSourceOptionsallowS {
    
    inline def apply(allowShared: js.UndefOr[Boolean] & js.UndefOr[`false`]): BufferSourceOptionsallowS = {
      val __obj = js.Dynamic.literal(allowShared = allowShared.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferSourceOptionsallowS]
    }
    
    extension [Self <: BufferSourceOptionsallowS](x: Self) {
      
      inline def setAllowShared(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "allowShared", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
}
