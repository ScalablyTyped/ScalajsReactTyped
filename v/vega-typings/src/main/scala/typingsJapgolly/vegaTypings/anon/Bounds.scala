package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesRuntimeDataflowMod.Operator
import typingsJapgolly.vegaTypings.typesRuntimeSceneMod.SceneItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var bounds: typingsJapgolly.vegaTypings.typesRuntimeSceneMod.Bounds
  
  var clip: Boolean
  
  var interactive: Boolean
  
  var items: js.Array[SceneItem]
  
  var marktype: String
  
  var role: String
  
  var source: Operator
  
  var zindex: Double
}
object Bounds {
  
  inline def apply(
    bounds: typingsJapgolly.vegaTypings.typesRuntimeSceneMod.Bounds,
    clip: Boolean,
    interactive: Boolean,
    items: js.Array[SceneItem],
    marktype: String,
    role: String,
    source: Operator,
    zindex: Double
  ): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setBounds(value: typingsJapgolly.vegaTypings.typesRuntimeSceneMod.Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[SceneItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: SceneItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMarktype(value: String): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Operator): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
  }
}
