package typingsJapgolly.rrule

import typingsJapgolly.rrule.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmParsestringMod {
  
  @JSImport("rrule/dist/esm/parsestring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDtstart(line: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDtstart")(line.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
  
  inline def parseString(rfcString: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(rfcString.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
}
