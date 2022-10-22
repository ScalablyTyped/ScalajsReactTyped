package typingsJapgolly.colord

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.colord.colordMod.Colord_
import typingsJapgolly.colord.typesMod.AnyColor
import typingsJapgolly.colord.typesMod.Parsers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendMod {
  
  @JSImport("colord/extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(plugins: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Plugin = js.Function2[
    /* ColordClass */ Instantiable1[/* input */ AnyColor, Colord_], 
    /* parsers */ Parsers, 
    Unit
  ]
}
