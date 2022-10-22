package typingsJapgolly.highlightJs.mod

import typingsJapgolly.highlightJs.anon.Emit
import typingsJapgolly.highlightJs.mod.^
import typingsJapgolly.std.Record
import typingsJapgolly.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: HLJSApi = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[HLJSApi]

type AutoHighlightResult = HighlightResult

type CompiledScope = (Record[Double, String]) & Emit

type CompilerExt = js.Function2[/* mode */ Mode, /* parent */ Mode | Language | Null, Unit]

type LanguageFn = js.Function1[/* hljs */ HLJSApi, Language]

type ModeCallback = js.Function2[/* match */ RegExpMatchArray, /* response */ CallbackResponse, Unit]
