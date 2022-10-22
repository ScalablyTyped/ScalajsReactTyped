package typingsJapgolly.antvUtil

import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathParserParsePathStringMod {
  
  @JSImport("@antv/util/lib/path/parser/parse-path-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePathString(pathInput: String): PathArray | String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathInput.asInstanceOf[js.Any]).asInstanceOf[PathArray | String]
  inline def parsePathString(pathInput: PathArray): PathArray | String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathInput.asInstanceOf[js.Any]).asInstanceOf[PathArray | String]
}
