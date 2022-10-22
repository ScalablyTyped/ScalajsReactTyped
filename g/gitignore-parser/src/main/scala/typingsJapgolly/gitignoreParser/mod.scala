package typingsJapgolly.gitignoreParser

import typingsJapgolly.gitignoreParser.anon.Accepts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gitignore-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(content: String): Accepts = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(content.asInstanceOf[js.Any]).asInstanceOf[Accepts]
  
  inline def parse(content: String): js.Tuple2[GitignoreParseResultSet, GitignoreParseResultSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[GitignoreParseResultSet, GitignoreParseResultSet]]
  
  type GitignoreParseResultSet = js.Tuple2[js.RegExp, js.RegExp]
}
