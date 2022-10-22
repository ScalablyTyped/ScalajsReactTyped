package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineMap1 {
  
  @JSGlobal("TypeScript.LineMap1")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): typingsJapgolly.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptSnapshot")(scriptSnapshot.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.LineMap]
  
  inline def fromSimpleText(text: ISimpleText): typingsJapgolly.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSimpleText")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.LineMap]
  
  inline def fromString(text: String): typingsJapgolly.typescriptServices.TypeScript.LineMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.LineMap]
}
