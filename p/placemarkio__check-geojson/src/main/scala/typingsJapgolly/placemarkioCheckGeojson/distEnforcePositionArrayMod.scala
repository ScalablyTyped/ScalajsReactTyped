package typingsJapgolly.placemarkioCheckGeojson

import org.scalajs.dom.Node
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEnforcePositionArrayMod {
  
  @JSImport("@placemarkio/check-geojson/dist/enforce_position_array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enforcePositionArray(ctx: Ctx): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enforcePositionArray(ctx: Ctx, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray(ctx: Ctx, node: Node, kind: PositionKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray(ctx: Ctx, node: Null, kind: PositionKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enforcePositionArray2(ctx: Ctx): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray2")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enforcePositionArray2(ctx: Ctx, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray2")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray2(ctx: Ctx, node: Node, kind: PositionKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray2")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray2(ctx: Ctx, node: Null, kind: PositionKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray2")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enforcePositionArray3(ctx: Ctx): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray3")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enforcePositionArray3(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayNode */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray3")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray3(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayNode */ Any,
    kind: PositionKind
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray3")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enforcePositionArray3(ctx: Ctx, node: Null, kind: PositionKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePositionArray3")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Polygon
    - typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.LineString
  */
  trait PositionKind extends StObject
  object PositionKind {
    
    inline def LineString: typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.LineString = "LineString".asInstanceOf[typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.LineString]
    
    inline def Polygon: typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Polygon]
  }
}
