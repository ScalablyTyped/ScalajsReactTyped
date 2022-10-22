package typingsJapgolly.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextChange {
  
  @JSImport("grammarkdown", "TextChange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyChange(originalText: String, change: typingsJapgolly.grammarkdown.distParserMod.TextChange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(originalText.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def clone_(change: typingsJapgolly.grammarkdown.distParserMod.TextChange): typingsJapgolly.grammarkdown.anon.Range = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(change.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.anon.Range]
  
  inline def create(text: String, range: typingsJapgolly.grammarkdown.distTypesMod.Range): typingsJapgolly.grammarkdown.anon.Range = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.anon.Range]
  
  inline def isUnchanged(change: typingsJapgolly.grammarkdown.distParserMod.TextChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnchanged")(change.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
