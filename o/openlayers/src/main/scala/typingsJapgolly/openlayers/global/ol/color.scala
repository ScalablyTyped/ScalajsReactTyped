package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object color {
  
  @JSGlobal("ol.color")
  @js.native
  val ^ : js.Any = js.native
  
  inline def asArray(color: String): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color_]
  /**
    * Return the color as an array. This function maintains a cache of calculated
    * arrays which means the result should not be modified.
    * @param color Color.
    * @return Color.
    * @api
    */
  inline def asArray(color: Color_): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color_]
  
  inline def asString(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Return the color as an rgba string.
    * @param color Color.
    * @return Rgba string.
    * @api
    */
  inline def asString(color: Color_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
