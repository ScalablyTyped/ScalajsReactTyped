package typingsJapgolly.commitlintLoad

import typingsJapgolly.commitlintTypes.libLoadMod.ParserPreset
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsLoadParserOptsMod {
  
  @JSImport("@commitlint/load/lib/utils/load-parser-opts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadParserOpts(): js.Promise[js.UndefOr[ParserPreset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParserOpts")().asInstanceOf[js.Promise[js.UndefOr[ParserPreset]]]
  inline def loadParserOpts(pendingParser: String): js.Promise[js.UndefOr[ParserPreset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParserOpts")(pendingParser.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ParserPreset]]]
  inline def loadParserOpts(pendingParser: js.Function0[Awaitable[ParserPreset]]): js.Promise[js.UndefOr[ParserPreset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParserOpts")(pendingParser.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ParserPreset]]]
  inline def loadParserOpts(pendingParser: Awaitable[ParserPreset]): js.Promise[js.UndefOr[ParserPreset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParserOpts")(pendingParser.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ParserPreset]]]
  
  type Awaitable[T] = T | PromiseLike[T]
}
