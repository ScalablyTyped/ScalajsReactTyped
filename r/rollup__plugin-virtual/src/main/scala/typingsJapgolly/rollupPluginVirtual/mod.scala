package typingsJapgolly.rollupPluginVirtual

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A Rollup plugin which loads virtual modules from memory.
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("@rollup/plugin-virtual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = StringDictionary[String]
}
