package typingsJapgolly.jestSourceMap

import typingsJapgolly.callsites.mod.CallSite
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/source-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCallsite(level: Double): CallSite = ^.asInstanceOf[js.Dynamic].applyDynamic("getCallsite")(level.asInstanceOf[js.Any]).asInstanceOf[CallSite]
  inline def getCallsite(level: Double, sourceMaps: SourceMapRegistry): CallSite = (^.asInstanceOf[js.Dynamic].applyDynamic("getCallsite")(level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[CallSite]
  
  type SourceMapRegistry = Map[String, String]
}
