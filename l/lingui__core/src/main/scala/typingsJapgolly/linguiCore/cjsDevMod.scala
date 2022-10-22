package typingsJapgolly.linguiCore

import typingsJapgolly.linguiCore.anon.Plurals
import typingsJapgolly.linguiCore.cjsI18nMod.CompiledMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsDevMod {
  
  @JSImport("@lingui/core/cjs/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(message: String): CompiledMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(message.asInstanceOf[js.Any]).asInstanceOf[CompiledMessage]
  
  inline def loadLocaleData(locale: String): Plurals = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLocaleData")(locale.asInstanceOf[js.Any]).asInstanceOf[Plurals]
}
