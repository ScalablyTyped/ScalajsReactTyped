package typingsJapgolly.refractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object langSupercolliderMod {
  
  object default {
    
    inline def apply(Prism: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(Prism.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("refractor/lang/supercollider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("refractor/lang/supercollider", "default.aliases")
    @js.native
    val aliases: js.Array[String] = js.native
    
    @JSImport("refractor/lang/supercollider", "default.displayName")
    @js.native
    val displayName: String = js.native
  }
}
