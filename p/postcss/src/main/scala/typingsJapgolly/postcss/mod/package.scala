package typingsJapgolly.postcss.mod

import typingsJapgolly.postcss.anon.PickProcessOptionsmapfrom
import typingsJapgolly.postcss.anon.ToString
import typingsJapgolly.postcss.libAtRuleMod.AtRuleProps
import typingsJapgolly.postcss.libCommentMod.CommentProps
import typingsJapgolly.postcss.libDeclarationMod.DeclarationProps
import typingsJapgolly.postcss.libNodeMod.AnyNode
import typingsJapgolly.postcss.libRootMod.RootProps
import typingsJapgolly.postcss.libRuleMod.RuleProps
import typingsJapgolly.postcss.mod.^
import typingsJapgolly.postcss.postcssStrings.end
import typingsJapgolly.postcss.postcssStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def atRule: js.Function1[
/* defaults */ js.UndefOr[AtRuleProps], 
typingsJapgolly.postcss.libAtRuleMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("atRule").asInstanceOf[js.Function1[
/* defaults */ js.UndefOr[AtRuleProps], 
typingsJapgolly.postcss.libAtRuleMod.default]]

inline def comment: js.Function1[
/* defaults */ js.UndefOr[CommentProps], 
typingsJapgolly.postcss.libCommentMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("comment").asInstanceOf[js.Function1[
/* defaults */ js.UndefOr[CommentProps], 
typingsJapgolly.postcss.libCommentMod.default]]

inline def decl: js.Function1[
/* defaults */ js.UndefOr[DeclarationProps], 
typingsJapgolly.postcss.libDeclarationMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("decl").asInstanceOf[js.Function1[
/* defaults */ js.UndefOr[DeclarationProps], 
typingsJapgolly.postcss.libDeclarationMod.default]]

inline def fromJSON: JSONHydrator = ^.asInstanceOf[js.Dynamic].selectDynamic("fromJSON").asInstanceOf[JSONHydrator]

inline def list: typingsJapgolly.postcss.libListMod.List = ^.asInstanceOf[js.Dynamic].selectDynamic("list").asInstanceOf[typingsJapgolly.postcss.libListMod.List]

inline def parse: Parser[typingsJapgolly.postcss.libRootMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("parse").asInstanceOf[Parser[typingsJapgolly.postcss.libRootMod.default]]

inline def root: js.Function1[/* defaults */ js.UndefOr[RootProps], typingsJapgolly.postcss.libRootMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("root").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[RootProps], typingsJapgolly.postcss.libRootMod.default]]

inline def rule: js.Function1[/* defaults */ js.UndefOr[RuleProps], typingsJapgolly.postcss.libRuleMod.default] = ^.asInstanceOf[js.Dynamic].selectDynamic("rule").asInstanceOf[js.Function1[/* defaults */ js.UndefOr[RuleProps], typingsJapgolly.postcss.libRuleMod.default]]

inline def stringify: Stringifier = ^.asInstanceOf[js.Dynamic].selectDynamic("stringify").asInstanceOf[Stringifier]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.postcss.mod.Plugin
  - typingsJapgolly.postcss.mod.PluginCreator[scala.Any]
  - typingsJapgolly.postcss.mod.OldPlugin[scala.Any]
  - typingsJapgolly.postcss.mod.TransformCallback
  - typingsJapgolly.postcss.anon.Postcss
  - typingsJapgolly.postcss.libProcessorMod.default
*/
type AcceptedPlugin = _AcceptedPlugin | PluginCreator[Any] | OldPlugin[Any] | TransformCallback

type AtRuleProcessor = js.Function2[
/* atRule */ typingsJapgolly.postcss.libAtRuleMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Builder = js.Function3[
/* part */ String, 
/* node */ js.UndefOr[AnyNode], 
/* type */ js.UndefOr[start | end], 
Unit]

type CommentProcessor = js.Function2[
/* comment */ typingsJapgolly.postcss.libCommentMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type DeclarationProcessor = js.Function2[
/* decl */ typingsJapgolly.postcss.libDeclarationMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type DocumentProcessor = js.Function2[
/* document */ typingsJapgolly.postcss.libDocumentMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Parser[RootNode] = js.Function2[
/* css */ String | ToString, 
/* opts */ js.UndefOr[PickProcessOptionsmapfrom], 
RootNode]

type RootProcessor = js.Function2[
/* root */ typingsJapgolly.postcss.libRootMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type RuleProcessor = js.Function2[
/* rule */ typingsJapgolly.postcss.libRuleMod.default, 
/* helper */ Helpers, 
js.Promise[Unit] | Unit]

type Stringifier = js.Function2[/* node */ AnyNode, /* builder */ Builder, Unit]

type TransformCallback = js.Function2[
/* root */ typingsJapgolly.postcss.libRootMod.default, 
/* result */ typingsJapgolly.postcss.libResultMod.default, 
js.Promise[Unit] | Unit]
