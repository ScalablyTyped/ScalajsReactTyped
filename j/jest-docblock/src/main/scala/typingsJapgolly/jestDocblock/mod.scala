package typingsJapgolly.jestDocblock

import typingsJapgolly.jestDocblock.anon.Comments
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-docblock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(docblock: String): Pragmas = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(docblock.asInstanceOf[js.Any]).asInstanceOf[Pragmas]
  
  inline def parseWithComments(docblock: String): Comments = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithComments")(docblock.asInstanceOf[js.Any]).asInstanceOf[Comments]
  
  inline def print(hasCommentsPragmas: typingsJapgolly.jestDocblock.anon.Pragmas): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(hasCommentsPragmas.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def strip(contents: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(contents.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Pragmas = Record[String, String | js.Array[String]]
}
