package typingsJapgolly.remarkable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  // ---------------
  // Specific Core Tokens
  // ---------------
  type AbbrToken = typingsJapgolly.remarkable.libMod.TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type BlockParsingRule = js.Function4[
    /* state */ typingsJapgolly.remarkable.libMod.StateBlock, 
    /* startLine */ scala.Double, 
    /* endLine */ scala.Double, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  // ---------------
  // Specific Block Tokens
  // ---------------
  type BlockquoteToken = typingsJapgolly.remarkable.libMod.TagToken
  type BulletListToken = typingsJapgolly.remarkable.libMod.TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type CoreParsingRule = js.Function1[/* state */ typingsJapgolly.remarkable.libMod.StateInline, scala.Boolean]
  type DelToken = typingsJapgolly.remarkable.libMod.TagToken
  type EmToken = typingsJapgolly.remarkable.libMod.TagToken
  type Env = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FootnoteBlockToken = typingsJapgolly.remarkable.libMod.TagToken
  type FootnoteReferenceToken = typingsJapgolly.remarkable.libMod.FootnoteGenericToken
  type FootnoteToken = typingsJapgolly.remarkable.libMod.FootnoteGenericToken
  type GetBreak = typingsJapgolly.remarkable.libMod.Rule[
    typingsJapgolly.remarkable.libMod.ContentToken, 
    typingsJapgolly.remarkable.remarkableStrings._empty | typingsJapgolly.remarkable.remarkableStrings.Linefeed
  ]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type InlineParsingRule = js.Function2[
    /* state */ typingsJapgolly.remarkable.libMod.StateInline, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  type InsToken = typingsJapgolly.remarkable.libMod.TagToken
  type LHeadingCloseToken = typingsJapgolly.remarkable.libMod.HeadingCloseToken
  type LHeadingOpenToken = typingsJapgolly.remarkable.libMod.HeadingOpenToken
  // ---------------
  // Specific Block Tokens
  // ---------------
  type LinkToken = typingsJapgolly.remarkable.libMod.TagToken
  type ListItemToken = typingsJapgolly.remarkable.libMod.TagToken
  type MarkToken = typingsJapgolly.remarkable.libMod.TagToken
  type OrderedListToken = typingsJapgolly.remarkable.libMod.TagToken
  type Plugin = js.Function2[
    /* md */ typingsJapgolly.remarkable.libMod.Remarkable, 
    /* options */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Rule[T /* <: typingsJapgolly.remarkable.libMod.TagToken */, R /* <: java.lang.String */] = js.Function5[
    /* tokens */ js.Array[T], 
    /* idx */ scala.Double, 
    /* options */ js.UndefOr[typingsJapgolly.remarkable.libMod.Options], 
    /* env */ js.UndefOr[typingsJapgolly.remarkable.libMod.Env], 
    /* instance */ js.UndefOr[typingsJapgolly.remarkable.libMod.Remarkable], 
    R
  ]
  type StrongToken = typingsJapgolly.remarkable.libMod.TagToken
  type TBodyToken = typingsJapgolly.remarkable.libMod.TagToken
  type TDToken = typingsJapgolly.remarkable.libMod.TagToken
  type THToken = typingsJapgolly.remarkable.libMod.TagToken
  type THeadToken = typingsJapgolly.remarkable.libMod.TagToken
  type TRToken = typingsJapgolly.remarkable.libMod.TagToken
  type TableToken = typingsJapgolly.remarkable.libMod.TagToken
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
  type Token = typingsJapgolly.remarkable.libMod._Token | typingsJapgolly.remarkable.libMod.BlockquoteToken | typingsJapgolly.remarkable.libMod.FootnoteReferenceToken | typingsJapgolly.remarkable.libMod.LHeadingOpenToken | typingsJapgolly.remarkable.libMod.LHeadingCloseToken | typingsJapgolly.remarkable.libMod.OrderedListToken | typingsJapgolly.remarkable.libMod.BulletListToken | typingsJapgolly.remarkable.libMod.ListItemToken | typingsJapgolly.remarkable.libMod.StrongToken | typingsJapgolly.remarkable.libMod.TableToken | typingsJapgolly.remarkable.libMod.THeadToken | typingsJapgolly.remarkable.libMod.TBodyToken | typingsJapgolly.remarkable.libMod.TRToken | typingsJapgolly.remarkable.libMod.THToken | typingsJapgolly.remarkable.libMod.TDToken | typingsJapgolly.remarkable.libMod.LinkToken | typingsJapgolly.remarkable.libMod.DelToken | typingsJapgolly.remarkable.libMod.EmToken | typingsJapgolly.remarkable.libMod.InsToken | typingsJapgolly.remarkable.libMod.MarkToken | typingsJapgolly.remarkable.libMod.AbbrToken | typingsJapgolly.remarkable.libMod.FootnoteToken | typingsJapgolly.remarkable.libMod.FootnoteBlockToken
}
