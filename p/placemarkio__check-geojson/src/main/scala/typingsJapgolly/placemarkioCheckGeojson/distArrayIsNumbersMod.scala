package typingsJapgolly.placemarkioCheckGeojson

import org.scalajs.dom.Node
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArrayIsNumbersMod {
  
  @JSImport("@placemarkio/check-geojson/dist/array_is_numbers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayIsNumbers(ctx: Ctx, elements: js.Array[Node], name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIsNumbers")(ctx.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
