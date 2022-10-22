package typingsJapgolly.expressXmlBodyparser

import typingsJapgolly.express.mod.Handler
import typingsJapgolly.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Handler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Handler]
  inline def apply(options: ParserOptions): Handler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  @JSImport("express-xml-bodyparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // @deprecated Will be removed in future versions
  @JSImport("express-xml-bodyparser", "regexp")
  @js.native
  def regexp: js.RegExp = js.native
  inline def regexp_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
}
