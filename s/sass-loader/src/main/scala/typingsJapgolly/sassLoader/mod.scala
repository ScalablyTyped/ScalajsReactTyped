package typingsJapgolly.sassLoader

import typingsJapgolly.sassLoader.interfacesMod.LoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(content: String): Unit = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("sass-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Options = LoaderOptions
}
