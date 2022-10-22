package typingsJapgolly.yaml

import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distNodesToJSMod.ToJSContext
import typingsJapgolly.yaml.distNodesYamlmapMod.MapLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesAddPairToJSMapMod {
  
  @JSImport("yaml/dist/nodes/addPairToJSMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPairToJSMap(ctx: Unit, map: MapLike, hasKeyValue: Pair[Any, Any]): MapLike = (^.asInstanceOf[js.Dynamic].applyDynamic("addPairToJSMap")(ctx.asInstanceOf[js.Any], map.asInstanceOf[js.Any], hasKeyValue.asInstanceOf[js.Any])).asInstanceOf[MapLike]
  inline def addPairToJSMap(ctx: ToJSContext, map: MapLike, hasKeyValue: Pair[Any, Any]): MapLike = (^.asInstanceOf[js.Dynamic].applyDynamic("addPairToJSMap")(ctx.asInstanceOf[js.Any], map.asInstanceOf[js.Any], hasKeyValue.asInstanceOf[js.Any])).asInstanceOf[MapLike]
}
