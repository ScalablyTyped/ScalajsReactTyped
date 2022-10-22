package typingsJapgolly.k6.htmlMod

import typingsJapgolly.k6.htmlMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parseHTML(html: String): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(html.asInstanceOf[js.Any]).asInstanceOf[Selection]

type Handler = js.Function2[/* index */ Double, /* element */ Element, Unit]

type Mapper = js.Function2[/* index */ Double, /* element */ Element, Any]

type Tester = js.Function2[/* index */ Double, /* element */ Element, Boolean]
