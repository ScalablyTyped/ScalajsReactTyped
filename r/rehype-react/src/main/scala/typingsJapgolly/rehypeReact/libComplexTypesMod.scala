package typingsJapgolly.rehypeReact

import typingsJapgolly.hast.mod.Element
import typingsJapgolly.rehypeReact.anon.PartialTagNameinkeyofIntr
import typingsJapgolly.rehypeReact.anon.PartialTagNameinkeyofIntrA
import typingsJapgolly.rehypeReact.rehypeReactBooleans.`false`
import typingsJapgolly.rehypeReact.rehypeReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComplexTypesMod {
  
  trait ComponentsWithNodeOptions extends StObject {
    
    /**
      * Override default elements (such as `<a>`, `<p>`, etcetera) by passing an
      * object mapping tag names to components.
      */
    var components: js.UndefOr[PartialTagNameinkeyofIntr] = js.undefined
    
    /**
      * Expose hast elements as a `node` field in components
      */
    var passNode: `true`
  }
  object ComponentsWithNodeOptions {
    
    inline def apply(): ComponentsWithNodeOptions = {
      val __obj = js.Dynamic.literal(passNode = true)
      __obj.asInstanceOf[ComponentsWithNodeOptions]
    }
    
    extension [Self <: ComponentsWithNodeOptions](x: Self) {
      
      inline def setComponents(value: PartialTagNameinkeyofIntr): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setPassNode(value: `true`): Self = StObject.set(x, "passNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentsWithoutNodeOptions extends StObject {
    
    /**
      * Override default elements (such as `<a>`, `<p>`, etcetera) by passing an
      * object mapping tag names to components.
      */
    var components: js.UndefOr[PartialTagNameinkeyofIntrA] = js.undefined
    
    /**
      * Expose hast elements as a `node` field in components.
      */
    var passNode: js.UndefOr[`false`] = js.undefined
  }
  object ComponentsWithoutNodeOptions {
    
    inline def apply(): ComponentsWithoutNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentsWithoutNodeOptions]
    }
    
    extension [Self <: ComponentsWithoutNodeOptions](x: Self) {
      
      inline def setComponents(value: PartialTagNameinkeyofIntrA): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setPassNode(value: `false`): Self = StObject.set(x, "passNode", value.asInstanceOf[js.Any])
      
      inline def setPassNodeUndefined: Self = StObject.set(x, "passNode", js.undefined)
    }
  }
  
  trait WithNode extends StObject {
    
    var node: Element
  }
  object WithNode {
    
    inline def apply(node: Element): WithNode = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithNode]
    }
    
    extension [Self <: WithNode](x: Self) {
      
      inline def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
