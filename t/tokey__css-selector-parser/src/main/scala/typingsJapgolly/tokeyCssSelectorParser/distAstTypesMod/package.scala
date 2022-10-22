package typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod

import typingsJapgolly.tokeyCore.distTypesMod.Token
import typingsJapgolly.tokeyCssSelectorParser.distTypesMod.Immutable
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ImmutableAttribute = Immutable[Attribute]

type ImmutableClass = Immutable[Class]

type ImmutableCombinator = Immutable[Combinator]

type ImmutableComment = Immutable[Comment]

type ImmutableCommentWithNoSpacing = Immutable[CommentWithNoSpacing]

type ImmutableCompoundSelector = Immutable[CompoundSelector]

type ImmutableFunctionalSelector = Immutable[FunctionalSelector]

type ImmutableId = Immutable[Id]

type ImmutableInvalid = Immutable[Invalid]

type ImmutableNamespacedNode = Immutable[NamespacedNode]

type ImmutableNesting = Immutable[Nesting]

type ImmutableNth = Immutable[Nth]

type ImmutableNthDash = Immutable[NthDash]

type ImmutableNthOf = Immutable[NthOf]

type ImmutableNthOffset = Immutable[NthOffset]

type ImmutableNthSelectorList = Immutable[NthSelectorList]

type ImmutableNthStep = Immutable[NthStep]

type ImmutablePseudoClass = Immutable[PseudoClass]

type ImmutablePseudoElement = Immutable[PseudoElement]

type ImmutableSelector = Immutable[Selector]

type ImmutableSelectorList = Immutable[SelectorList]

type ImmutableSelectorNode = Immutable[SelectorNode]

type ImmutableType = Immutable[Type]

type ImmutableUniversal = Immutable[Universal]

type Invalid = Token[invalid]

type NthDash = NthBase[nth_dash]

type NthNode = NthStep | NthOffset | NthDash | NthOf | Comment

type NthOf = NthBase[nth_of]

type NthOffset = NthBase[nth_offset]

type NthSelectorList = Array[Nth | Selector]

type NthStep = NthBase[nth_step]

type SelectorList = js.Array[Selector]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.FunctionalSelector
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Selector
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Combinator
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Comment
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Invalid
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nth
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthStep
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthDash
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthOffset
  - typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthOf
*/
type SelectorNode = _SelectorNode | Invalid | NthStep | NthDash | NthOffset | NthOf

type SelectorNodes = js.Array[SelectorNode]
