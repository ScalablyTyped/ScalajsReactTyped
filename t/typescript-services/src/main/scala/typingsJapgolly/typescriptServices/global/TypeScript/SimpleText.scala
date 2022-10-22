package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleText {
  
  @JSGlobal("TypeScript.SimpleText")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScriptSnapshot")(scriptSnapshot.asInstanceOf[js.Any]).asInstanceOf[ISimpleText]
  
  inline def fromString(value: String): ISimpleText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleText]
}
