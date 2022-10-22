package typingsJapgolly.nivoColors

import typingsJapgolly.nivoColors.distTypesSchemesAllMod.ColorSchemeId
import typingsJapgolly.nivoColors.nivoColorsStrings.accent
import typingsJapgolly.nivoColors.nivoColorsStrings.category10
import typingsJapgolly.nivoColors.nivoColorsStrings.dark2
import typingsJapgolly.nivoColors.nivoColorsStrings.nivo
import typingsJapgolly.nivoColors.nivoColorsStrings.paired
import typingsJapgolly.nivoColors.nivoColorsStrings.pastel1
import typingsJapgolly.nivoColors.nivoColorsStrings.pastel2
import typingsJapgolly.nivoColors.nivoColorsStrings.set1
import typingsJapgolly.nivoColors.nivoColorsStrings.set2
import typingsJapgolly.nivoColors.nivoColorsStrings.set3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSchemesCategoricalMod {
  
  @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemeIds")
  @js.native
  val categoricalColorSchemeIds: js.Array[
    nivo | category10 | accent | dark2 | paired | pastel1 | pastel2 | set1 | set2 | set3
  ] = js.native
  
  object categoricalColorSchemes {
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.accent")
    @js.native
    def accent: js.Array[String] = js.native
    inline def accent_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.category10")
    @js.native
    def category10: js.Array[String] = js.native
    inline def category10_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category10")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.dark2")
    @js.native
    def dark2: js.Array[String] = js.native
    inline def dark2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.nivo")
    @js.native
    def nivo: js.Array[String] = js.native
    inline def nivo_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nivo")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.paired")
    @js.native
    def paired: js.Array[String] = js.native
    inline def paired_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paired")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.pastel1")
    @js.native
    def pastel1: js.Array[String] = js.native
    inline def pastel1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.pastel2")
    @js.native
    def pastel2: js.Array[String] = js.native
    inline def pastel2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.set1")
    @js.native
    def set1: js.Array[String] = js.native
    inline def set1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.set2")
    @js.native
    def set2: js.Array[String] = js.native
    inline def set2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/categorical", "categoricalColorSchemes.set3")
    @js.native
    def set3: js.Array[String] = js.native
    inline def set3_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set3")(x.asInstanceOf[js.Any])
  }
  
  /* keyof @nivo/colors.anon.Accent */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoColors.nivoColorsStrings.nivo
    - typingsJapgolly.nivoColors.nivoColorsStrings.category10
    - typingsJapgolly.nivoColors.nivoColorsStrings.accent
    - typingsJapgolly.nivoColors.nivoColorsStrings.dark2
    - typingsJapgolly.nivoColors.nivoColorsStrings.paired
    - typingsJapgolly.nivoColors.nivoColorsStrings.pastel1
    - typingsJapgolly.nivoColors.nivoColorsStrings.pastel2
    - typingsJapgolly.nivoColors.nivoColorsStrings.set1
    - typingsJapgolly.nivoColors.nivoColorsStrings.set2
    - typingsJapgolly.nivoColors.nivoColorsStrings.set3
  */
  trait CategoricalColorSchemeId
    extends StObject
       with ColorSchemeId
}
