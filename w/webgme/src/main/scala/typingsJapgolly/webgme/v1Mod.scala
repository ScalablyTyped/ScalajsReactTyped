package typingsJapgolly.webgme

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webgme.GmeCommon.RelId
import typingsJapgolly.webgme.anon.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Things in this module are deprecated.
This was a serialization supported in version 1.
*/
object v1Mod {
  
  type GUID = String
  
  trait JsonContainment
    extends StObject
       with /* index */ StringDictionary[JsonContainment]
  object JsonContainment {
    
    inline def apply(): JsonContainment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonContainment]
    }
  }
  
  trait JsonNode extends StObject {
    
    var attributes: Any
    
    var base: String
    
    var constratints: Any
    
    var meta: Any
    
    var parent: String
    
    var pointers: Any
    
    var registry: Any
    
    var sets: Any
  }
  object JsonNode {
    
    inline def apply(
      attributes: Any,
      base: String,
      constratints: Any,
      meta: Any,
      parent: String,
      pointers: Any,
      registry: Any,
      sets: Any
    ): JsonNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], constratints = constratints.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonNode]
    }
    
    extension [Self <: JsonNode](x: Self) {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setConstratints(value: Any): Self = StObject.set(x, "constratints", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: Any): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: Any): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setSets(value: Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonObj extends StObject {
    
    // guid tree of hashes
    var bases: Any
    
    var containment: JsonContainment
    
    var metaSheets: Any
    
    //
    var nodes: Any
    
    var relids: js.Array[RelId]
    
    var root: Guid
  }
  object JsonObj {
    
    inline def apply(
      bases: Any,
      containment: JsonContainment,
      metaSheets: Any,
      nodes: Any,
      relids: js.Array[RelId],
      root: Guid
    ): JsonObj = {
      val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonObj]
    }
    
    extension [Self <: JsonObj](x: Self) {
      
      inline def setBases(value: Any): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
      
      inline def setContainment(value: JsonContainment): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      inline def setMetaSheets(value: Any): Self = StObject.set(x, "metaSheets", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setRelids(value: js.Array[RelId]): Self = StObject.set(x, "relids", value.asInstanceOf[js.Any])
      
      inline def setRelidsVarargs(value: RelId*): Self = StObject.set(x, "relids", js.Array(value*))
      
      inline def setRoot(value: Guid): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
