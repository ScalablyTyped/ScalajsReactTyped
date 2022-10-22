package typingsJapgolly.placemarkioCheckGeojson

import org.scalajs.dom.Node
import typingsJapgolly.placemarkioCheckGeojson.anon.ObjectNode
import typingsJapgolly.placemarkioCheckGeojson.anon.Type
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.Ctx
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.GeoJSONTypeSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetTypeMod {
  
  @JSImport("@placemarkio/check-geojson/dist/get_type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getType(ctx: Ctx, node: Node, allowedTypes: GeoJSONTypeSet): ObjectNode | Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getType")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], allowedTypes.asInstanceOf[js.Any])).asInstanceOf[ObjectNode | Type]
}
