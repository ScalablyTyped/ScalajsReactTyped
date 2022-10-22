package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScriptSnapshot {
  
  @JSGlobal("TypeScript.ScriptSnapshot")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(text: String): IScriptSnapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[IScriptSnapshot]
}
