package typingsJapgolly.word

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.word.distTypingsTypesMod.WJSDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsCodecsXmlMod {
  
  @JSImport("word/dist/typings/codecs/XML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseStr(data: String): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_str")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
  
  inline def read(data: Buffer): WJSDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WJSDoc]
}
