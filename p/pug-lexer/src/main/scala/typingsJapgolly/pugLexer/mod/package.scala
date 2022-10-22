package typingsJapgolly.pugLexer.mod

import typingsJapgolly.pugLexer.mod.^
import typingsJapgolly.pugLexer.pugLexerStrings.Colon
import typingsJapgolly.pugLexer.pugLexerStrings.`end-attributes`
import typingsJapgolly.pugLexer.pugLexerStrings.`end-pipeless-text`
import typingsJapgolly.pugLexer.pugLexerStrings.`end-pug-interpolation`
import typingsJapgolly.pugLexer.pugLexerStrings.`extends`
import typingsJapgolly.pugLexer.pugLexerStrings.`mixin-block`
import typingsJapgolly.pugLexer.pugLexerStrings.`start-attributes`
import typingsJapgolly.pugLexer.pugLexerStrings.`start-pipeless-text`
import typingsJapgolly.pugLexer.pugLexerStrings.`start-pug-interpolation`
import typingsJapgolly.pugLexer.pugLexerStrings.`yield`
import typingsJapgolly.pugLexer.pugLexerStrings.blockcode
import typingsJapgolly.pugLexer.pugLexerStrings.default
import typingsJapgolly.pugLexer.pugLexerStrings.dot
import typingsJapgolly.pugLexer.pugLexerStrings.eos
import typingsJapgolly.pugLexer.pugLexerStrings.include
import typingsJapgolly.pugLexer.pugLexerStrings.newline
import typingsJapgolly.pugLexer.pugLexerStrings.outdent
import typingsJapgolly.pugLexer.pugLexerStrings.slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(str: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
inline def apply(str: String, options: LexerOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]

type BlockcodeToken = LexToken[blockcode]

type ColonToken = LexToken[Colon]

type DefaultToken = LexToken[default]

type DotToken = LexToken[dot]

type EndAttributesToken = LexToken[`end-attributes`]

type EndPipelessTextToken = LexToken[`end-pipeless-text`]

type EndPugInterpolationToken = LexToken[`end-pug-interpolation`]

type EosToken = LexToken[eos]

type ExtendsToken = LexToken[`extends`]

type IncludeToken = LexToken[include]

type LexerFunction = js.Function2[/* type */ String, /* exp */ js.UndefOr[Any], Boolean]

type MixinBlockToken = LexToken[`mixin-block`]

type NewlineToken = LexToken[newline]

type OutdentToken = LexToken[outdent]

type SlashToken = LexToken[slash]

type StartAttributesToken = LexToken[`start-attributes`]

type StartPipelessTextToken = LexToken[`start-pipeless-text`]

type StartPugInterpolationToken = LexToken[`start-pug-interpolation`]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pugLexer.mod.AndAttributesToken
  - typingsJapgolly.pugLexer.mod.AttributeToken
  - typingsJapgolly.pugLexer.mod.BlockcodeToken
  - typingsJapgolly.pugLexer.mod.BlockToken
  - typingsJapgolly.pugLexer.mod.CallToken
  - typingsJapgolly.pugLexer.mod.CaseToken
  - typingsJapgolly.pugLexer.mod.ClassToken
  - typingsJapgolly.pugLexer.mod.CodeToken
  - typingsJapgolly.pugLexer.mod.ColonToken
  - typingsJapgolly.pugLexer.mod.CommentToken
  - typingsJapgolly.pugLexer.mod.DefaultToken
  - typingsJapgolly.pugLexer.mod.DoctypeToken
  - typingsJapgolly.pugLexer.mod.DotToken
  - typingsJapgolly.pugLexer.mod.EachToken
  - typingsJapgolly.pugLexer.mod.EachOfToken
  - typingsJapgolly.pugLexer.mod.ElseIfToken
  - typingsJapgolly.pugLexer.mod.ElseToken
  - typingsJapgolly.pugLexer.mod.EndAttributesToken
  - typingsJapgolly.pugLexer.mod.EndPipelessTextToken
  - typingsJapgolly.pugLexer.mod.EndPugInterpolationToken
  - typingsJapgolly.pugLexer.mod.EosToken
  - typingsJapgolly.pugLexer.mod.ExtendsToken
  - typingsJapgolly.pugLexer.mod.FilterToken
  - typingsJapgolly.pugLexer.mod.IdToken
  - typingsJapgolly.pugLexer.mod.IfToken
  - typingsJapgolly.pugLexer.mod.IncludeToken
  - typingsJapgolly.pugLexer.mod.IndentToken
  - typingsJapgolly.pugLexer.mod.InterpolatedCodeToken
  - typingsJapgolly.pugLexer.mod.InterpolationToken
  - typingsJapgolly.pugLexer.mod.MixinBlockToken
  - typingsJapgolly.pugLexer.mod.MixinToken
  - typingsJapgolly.pugLexer.mod.NewlineToken
  - typingsJapgolly.pugLexer.mod.OutdentToken
  - typingsJapgolly.pugLexer.mod.PathToken
  - typingsJapgolly.pugLexer.mod.SlashToken
  - typingsJapgolly.pugLexer.mod.StartAttributesToken
  - typingsJapgolly.pugLexer.mod.StartPipelessTextToken
  - typingsJapgolly.pugLexer.mod.StartPugInterpolationToken
  - typingsJapgolly.pugLexer.mod.TagToken
  - typingsJapgolly.pugLexer.mod.TextHtmlToken
  - typingsJapgolly.pugLexer.mod.TextToken
  - typingsJapgolly.pugLexer.mod.WhenToken
  - typingsJapgolly.pugLexer.mod.WhileToken
  - typingsJapgolly.pugLexer.mod.YieldToken
*/
type Token = _Token | BlockcodeToken | ColonToken | DefaultToken | DotToken | EndAttributesToken | EndPipelessTextToken | EndPugInterpolationToken | EosToken | ExtendsToken | IncludeToken | MixinBlockToken | NewlineToken | OutdentToken | SlashToken | StartAttributesToken | StartPipelessTextToken | StartPugInterpolationToken | YieldToken

type YieldToken = LexToken[`yield`]
