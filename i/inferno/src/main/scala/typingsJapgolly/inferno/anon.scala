package typingsJapgolly.inferno

import typingsJapgolly.inferno.distCoreTypesMod.Inferno.InfernoNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[InfernoNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  children :inferno.inferno/dist/core/types.Inferno.InfernoNode | undefined}> */
  trait ReadonlychildrenInfernoNo extends StObject {
    
    val children: js.UndefOr[InfernoNode] = js.undefined
  }
  object ReadonlychildrenInfernoNo {
    
    inline def apply(): ReadonlychildrenInfernoNo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenInfernoNo]
    }
    
    extension [Self <: ReadonlychildrenInfernoNo](x: Self) {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
