package typingsJapgolly.antDesignProLayout

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLocalesMod {
  
  @JSImport("@ant-design/pro-layout/es/locales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gLocaleObject(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("gLocaleObject")().asInstanceOf[Record[String, String]]
  
  inline def getLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String]
  
  /* keyof @ant-design/pro-layout.anon.EnUS */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
    - typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
    - typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`en-US`
    - typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
    - typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`ko-KR`
  */
  trait LocaleType extends StObject
}
