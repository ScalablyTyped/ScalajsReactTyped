package typingsJapgolly.angularLocalize

import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typingsJapgolly.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateSourceFilesLocalePluginMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/locale_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLocalePlugin(locale: String): PluginObj = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any]).asInstanceOf[PluginObj]
  inline def makeLocalePlugin(locale: String, hasLocalizeName: TranslatePluginOptions): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any], hasLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
