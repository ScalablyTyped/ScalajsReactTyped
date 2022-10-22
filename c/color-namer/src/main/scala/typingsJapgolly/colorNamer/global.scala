package typingsJapgolly.colorNamer

import typingsJapgolly.colorNamer.anon.Omit
import typingsJapgolly.colorNamer.anon.Pick
import typingsJapgolly.colorNamer.mod.Colors
import typingsJapgolly.colorNamer.mod.Diff
import typingsJapgolly.colorNamer.mod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def ColorNamer[T /* <: Palette */](color: String): Colors[T] = js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any]).asInstanceOf[Colors[T]]
  inline def ColorNamer[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = (js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[Diff[Palette, T]]]
  inline def ColorNamer[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = (js.Dynamic.global.applyDynamic("ColorNamer")(color.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Colors[T]]
}
