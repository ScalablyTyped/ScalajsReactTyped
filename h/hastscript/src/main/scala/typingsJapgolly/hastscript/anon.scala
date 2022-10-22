package typingsJapgolly.hastscript

import typingsJapgolly.hastscript.libCoreMod.Element
import typingsJapgolly.hastscript.libCoreMod.HPrimitiveChild
import typingsJapgolly.hastscript.libCoreMod.HProperties
import typingsJapgolly.hastscript.libCoreMod.Node
import typingsJapgolly.hastscript.libCoreMod.Root
import typingsJapgolly.hastscript.libRuntimeMod.HChild
import typingsJapgolly.hastscript.libRuntimeMod.JSXProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject
  
  trait `1` extends StObject {
    
    var children: js.UndefOr[HChild] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setChildren(value: HChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Node | HPrimitiveChild)*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[typingsJapgolly.hastscript.libCoreMod.HChild] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: typingsJapgolly.hastscript.libCoreMod.HChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Node | HPrimitiveChild)*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Root = js.native
    def apply(selector: String, children: typingsJapgolly.hastscript.libCoreMod.HChild*): Element = js.native
    def apply(selector: String, properties: Unit, children: typingsJapgolly.hastscript.libCoreMod.HChild*): Element = js.native
    def apply(selector: String, properties: HProperties, children: typingsJapgolly.hastscript.libCoreMod.HChild*): Element = js.native
    def apply(selector: Null, children: typingsJapgolly.hastscript.libCoreMod.HChild*): Root = js.native
    def apply(selector: Unit, children: typingsJapgolly.hastscript.libCoreMod.HChild*): Root = js.native
  }
  
  @js.native
  trait Fragment extends StObject {
    
    var Fragment: Null = js.native
    
    def jsx(`type`: String, props: JSXProps): typingsJapgolly.hastscript.libRuntimeMod.Element = js.native
    def jsx(`type`: String, props: JSXProps, key: String): typingsJapgolly.hastscript.libRuntimeMod.Element = js.native
    def jsx(`type`: Null, props: `1`): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsx(`type`: Null, props: `1`, key: String): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsx(`type`: Unit, props: `1`): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsx(`type`: Unit, props: `1`, key: String): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    
    def jsxs(`type`: String, props: JSXProps): typingsJapgolly.hastscript.libRuntimeMod.Element = js.native
    def jsxs(`type`: String, props: JSXProps, key: String): typingsJapgolly.hastscript.libRuntimeMod.Element = js.native
    def jsxs(`type`: Null, props: `1`): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsxs(`type`: Null, props: `1`, key: String): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsxs(`type`: Unit, props: `1`): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
    def jsxs(`type`: Unit, props: `1`, key: String): typingsJapgolly.hastscript.libRuntimeMod.Root = js.native
  }
}
