package typingsJapgolly.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpageMod {
  
  @JSImport("webpage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): WebPage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[WebPage]
}
