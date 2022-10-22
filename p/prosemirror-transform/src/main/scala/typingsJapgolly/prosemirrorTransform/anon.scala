package typingsJapgolly.prosemirrorTransform

import typingsJapgolly.prosemirrorModel.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[typingsJapgolly.prosemirrorModel.mod.Attrs | Null] = js.undefined
    
    var `type`: NodeType
  }
  object Attrs {
    
    inline def apply(`type`: NodeType): Attrs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: typingsJapgolly.prosemirrorModel.mod.Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var attrs: typingsJapgolly.prosemirrorModel.mod.Attrs | Null
    
    var `type`: NodeType
  }
  object Type {
    
    inline def apply(`type`: NodeType): Type = {
      val __obj = js.Dynamic.literal(attrs = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setAttrs(value: typingsJapgolly.prosemirrorModel.mod.Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
