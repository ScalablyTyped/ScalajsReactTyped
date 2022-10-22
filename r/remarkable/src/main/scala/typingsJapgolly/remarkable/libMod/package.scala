package typingsJapgolly.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.remarkable.remarkableStrings.Linefeed
import typingsJapgolly.remarkable.remarkableStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// ---------------
// Specific Core Tokens
// ---------------
type AbbrToken = TagToken

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type BlockParsingRule = js.Function4[
/* state */ StateBlock, 
/* startLine */ Double, 
/* endLine */ Double, 
/* silent */ Boolean, 
Boolean]

// ---------------
// Specific Block Tokens
// ---------------
type BlockquoteToken = TagToken

type BulletListToken = TagToken

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type CoreParsingRule = js.Function1[/* state */ StateInline, Boolean]

type DelToken = TagToken

type EmToken = TagToken

type Env = StringDictionary[Any]

type FootnoteBlockToken = TagToken

type FootnoteReferenceToken = FootnoteGenericToken

type FootnoteToken = FootnoteGenericToken

type GetBreak = Rule[ContentToken, _empty | Linefeed]

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type InlineParsingRule = js.Function2[/* state */ StateInline, /* silent */ Boolean, Boolean]

type InsToken = TagToken

type LHeadingCloseToken = HeadingCloseToken

type LHeadingOpenToken = HeadingOpenToken

// ---------------
// Specific Block Tokens
// ---------------
type LinkToken = TagToken

type ListItemToken = TagToken

type MarkToken = TagToken

type OrderedListToken = TagToken

type Plugin = js.Function2[/* md */ Remarkable, /* options */ js.UndefOr[Any], Unit]

type Rule[T /* <: TagToken */, R /* <: String */] = js.Function5[
/* tokens */ js.Array[T], 
/* idx */ Double, 
/* options */ js.UndefOr[Options], 
/* env */ js.UndefOr[Env], 
/* instance */ js.UndefOr[Remarkable], 
R]

type StrongToken = TagToken

type TBodyToken = TagToken

type TDToken = TagToken

type THToken = TagToken

type THeadToken = TagToken

type TRToken = TagToken

type TableToken = TagToken

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.remarkable.libMod.BlockContentToken
  - typingsJapgolly.remarkable.libMod.ContentToken
  - typingsJapgolly.remarkable.libMod.TagToken
  - typingsJapgolly.remarkable.libMod.BlockquoteToken
  - typingsJapgolly.remarkable.libMod.BlockquoteOpenToken
  - typingsJapgolly.remarkable.libMod.BlockquoteCloseToken
  - typingsJapgolly.remarkable.libMod.CodeToken
  - typingsJapgolly.remarkable.libMod.DlOpenToken
  - typingsJapgolly.remarkable.libMod.DlCloseToken
  - typingsJapgolly.remarkable.libMod.DtOpenToken
  - typingsJapgolly.remarkable.libMod.DtCloseToken
  - typingsJapgolly.remarkable.libMod.DdOpenToken
  - typingsJapgolly.remarkable.libMod.DdCloseToken
  - typingsJapgolly.remarkable.libMod.FenceToken
  - typingsJapgolly.remarkable.libMod.FootnoteGenericToken
  - typingsJapgolly.remarkable.libMod.FootnoteReferenceToken
  - typingsJapgolly.remarkable.libMod.FootnoteReferenceOpenToken
  - typingsJapgolly.remarkable.libMod.FootnoteReferenceCloseToken
  - typingsJapgolly.remarkable.libMod.HeadingToken
  - typingsJapgolly.remarkable.libMod.HeadingOpenToken
  - typingsJapgolly.remarkable.libMod.HeadingCloseToken
  - typingsJapgolly.remarkable.libMod.HrToken
  - typingsJapgolly.remarkable.libMod.HtmlBlockToken
  - typingsJapgolly.remarkable.libMod.LHeadingOpenToken
  - typingsJapgolly.remarkable.libMod.LHeadingCloseToken
  - typingsJapgolly.remarkable.libMod.OrderedListToken
  - typingsJapgolly.remarkable.libMod.OrderedListOpenToken
  - typingsJapgolly.remarkable.libMod.OrderedListCloseToken
  - typingsJapgolly.remarkable.libMod.BulletListToken
  - typingsJapgolly.remarkable.libMod.BulletListOpenToken
  - typingsJapgolly.remarkable.libMod.BulletListCloseToken
  - typingsJapgolly.remarkable.libMod.ListItemToken
  - typingsJapgolly.remarkable.libMod.ListItemOpenToken
  - typingsJapgolly.remarkable.libMod.ListItemCloseToken
  - typingsJapgolly.remarkable.libMod.ParagraphToken
  - typingsJapgolly.remarkable.libMod.ParagraphOpenToken
  - typingsJapgolly.remarkable.libMod.ParagraphCloseToken
  - typingsJapgolly.remarkable.libMod.TextToken
  - typingsJapgolly.remarkable.libMod.StrongToken
  - typingsJapgolly.remarkable.libMod.StrongOpenToken
  - typingsJapgolly.remarkable.libMod.StrongCloseToken
  - typingsJapgolly.remarkable.libMod.TableToken
  - typingsJapgolly.remarkable.libMod.TableOpenToken
  - typingsJapgolly.remarkable.libMod.TableCloseToken
  - typingsJapgolly.remarkable.libMod.THeadToken
  - typingsJapgolly.remarkable.libMod.THeadOpenToken
  - typingsJapgolly.remarkable.libMod.THeadCloseToken
  - typingsJapgolly.remarkable.libMod.TBodyToken
  - typingsJapgolly.remarkable.libMod.TBodyOpenToken
  - typingsJapgolly.remarkable.libMod.TBodyCloseToken
  - typingsJapgolly.remarkable.libMod.TRToken
  - typingsJapgolly.remarkable.libMod.TROpenToken
  - typingsJapgolly.remarkable.libMod.TRCloseToken
  - typingsJapgolly.remarkable.libMod.THToken
  - typingsJapgolly.remarkable.libMod.THOpenToken
  - typingsJapgolly.remarkable.libMod.THCloseToken
  - typingsJapgolly.remarkable.libMod.TDToken
  - typingsJapgolly.remarkable.libMod.TDOpenToken
  - typingsJapgolly.remarkable.libMod.TDCloseToken
  - typingsJapgolly.remarkable.libMod.LinkToken
  - typingsJapgolly.remarkable.libMod.LinkOpenToken
  - typingsJapgolly.remarkable.libMod.LinkCloseToken
  - typingsJapgolly.remarkable.libMod.DelToken
  - typingsJapgolly.remarkable.libMod.DelOpenToken
  - typingsJapgolly.remarkable.libMod.DelCloseToken
  - typingsJapgolly.remarkable.libMod.EmToken
  - typingsJapgolly.remarkable.libMod.EmOpenToken
  - typingsJapgolly.remarkable.libMod.EmCloseToken
  - typingsJapgolly.remarkable.libMod.HardbreakToken
  - typingsJapgolly.remarkable.libMod.SoftbreakToken
  - typingsJapgolly.remarkable.libMod.FootnoteInlineToken
  - typingsJapgolly.remarkable.libMod.HtmlTagToken
  - typingsJapgolly.remarkable.libMod.InsToken
  - typingsJapgolly.remarkable.libMod.InsOpenToken
  - typingsJapgolly.remarkable.libMod.InsCloseToken
  - typingsJapgolly.remarkable.libMod.ImageToken
  - typingsJapgolly.remarkable.libMod.MarkToken
  - typingsJapgolly.remarkable.libMod.MarkOpenToken
  - typingsJapgolly.remarkable.libMod.MarkCloseToken
  - typingsJapgolly.remarkable.libMod.SubToken
  - typingsJapgolly.remarkable.libMod.SupToken
  - typingsJapgolly.remarkable.libMod.AbbrToken
  - typingsJapgolly.remarkable.libMod.AbbrOpenToken
  - typingsJapgolly.remarkable.libMod.AbbrCloseToken
  - typingsJapgolly.remarkable.libMod.FootnoteToken
  - typingsJapgolly.remarkable.libMod.FootnoteOpenToken
  - typingsJapgolly.remarkable.libMod.FootnoteCloseToken
  - typingsJapgolly.remarkable.libMod.FootnoteBlockToken
  - typingsJapgolly.remarkable.libMod.FootnoteBlockOpenToken
  - typingsJapgolly.remarkable.libMod.FootnoteBlockCloseToken
  - typingsJapgolly.remarkable.libMod.FootnoteAnchorToken
*/
type Token = _Token | BlockquoteToken | FootnoteReferenceToken | LHeadingOpenToken | LHeadingCloseToken | OrderedListToken | BulletListToken | ListItemToken | StrongToken | TableToken | THeadToken | TBodyToken | TRToken | THToken | TDToken | LinkToken | DelToken | EmToken | InsToken | MarkToken | AbbrToken | FootnoteToken | FootnoteBlockToken
