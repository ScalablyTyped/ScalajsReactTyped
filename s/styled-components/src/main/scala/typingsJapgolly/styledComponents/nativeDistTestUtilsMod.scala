package typingsJapgolly.styledComponents

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import typingsJapgolly.styledComponents.anon.A
import typingsJapgolly.styledComponents.anon.Attrs
import typingsJapgolly.styledComponents.anon.IgnoreWhitespace
import typingsJapgolly.styledComponents.nativeDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistTestUtilsMod {
  
  @JSImport("styled-components/native/dist/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expectCSSMatches(_expectation: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("expectCSSMatches")(_expectation.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def expectCSSMatches(_expectation: String, opts: IgnoreWhitespace): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expectCSSMatches")(_expectation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCSS(scope: Document): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getCSS(scope: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRenderedCSS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderedCSS")().asInstanceOf[String]
  
  inline def rehydrateTestStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rehydrateTestStyles")().asInstanceOf[Unit]
  
  inline def resetStyled(): (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyled")().asInstanceOf[(js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A]
  inline def resetStyled(isServer: Boolean): (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyled")(isServer.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A]
  
  inline def seedNextClassnames(names: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("seedNextClassnames")(names.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stripComments(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
