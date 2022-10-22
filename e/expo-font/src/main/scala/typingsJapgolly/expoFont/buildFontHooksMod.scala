package typingsJapgolly.expoFont

import typingsJapgolly.expoFont.buildFontDottypesMod.FontSource
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFontHooksMod {
  
  @JSImport("expo-font/build/FontHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.Error | Null]]
  inline def useFonts(map: Record[String, FontSource]): js.Tuple2[Boolean, js.Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFonts")(map.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.Error | Null]]
}
