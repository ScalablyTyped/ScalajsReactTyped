package typingsJapgolly.colord

import typingsJapgolly.colord.extendMod.Plugin
import typingsJapgolly.colord.typesMod.AnyColor
import typingsJapgolly.colord.typesMod.Format
import typingsJapgolly.colord.typesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("colord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("colord", "Colord")
  @js.native
  open class Colord_ protected ()
    extends typingsJapgolly.colord.colordMod.Colord_ {
    def this(input: AnyColor) = this()
  }
  
  inline def colord(input: typingsJapgolly.colord.colordMod.Colord_): typingsJapgolly.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.colord.colordMod.Colord_]
  inline def colord(input: AnyColor): typingsJapgolly.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("colord")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.colord.colordMod.Colord_]
  
  inline def extend(plugins: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFormat(input: Input): js.UndefOr[Format] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Format]]
  
  inline def random(): typingsJapgolly.colord.colordMod.Colord_ = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typingsJapgolly.colord.colordMod.Colord_]
}
