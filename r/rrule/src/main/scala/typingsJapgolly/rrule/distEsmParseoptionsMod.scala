package typingsJapgolly.rrule

import typingsJapgolly.rrule.anon.Byeaster
import typingsJapgolly.rrule.anon.PartialOptions
import typingsJapgolly.rrule.distEsmDatetimeMod.Time
import typingsJapgolly.rrule.distEsmTypesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmParseoptionsMod {
  
  @JSImport("rrule/dist/esm/parseoptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTimeset(opts: ParsedOptions): js.Array[Time] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTimeset")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[Time]]
  
  inline def initializeOptions(options: PartialOptions): Byeaster = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Byeaster]
  
  inline def parseOptions(options: PartialOptions): typingsJapgolly.rrule.anon.ParsedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rrule.anon.ParsedOptions]
}
