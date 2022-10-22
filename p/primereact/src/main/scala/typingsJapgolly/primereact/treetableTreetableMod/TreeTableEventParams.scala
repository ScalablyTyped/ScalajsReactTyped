package typingsJapgolly.primereact.treetableTreetableMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableEventParams extends StObject {
  
  var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
  
  var originalEvent: ReactEventFrom[Element]
}
object TreeTableEventParams {
  
  inline def apply(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any,
    originalEvent: ReactEventFrom[Element]
  ): TreeTableEventParams = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableEventParams]
  }
  
  extension [Self <: TreeTableEventParams](x: Self) {
    
    inline def setNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ Any
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
