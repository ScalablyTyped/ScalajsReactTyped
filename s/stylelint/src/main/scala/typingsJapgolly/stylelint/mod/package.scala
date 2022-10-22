package typingsJapgolly.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postcss.mod.Root_
import typingsJapgolly.postcss.mod.Syntax
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.ReadonlyMap
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.Record
import typingsJapgolly.stylelint.stylelintStrings.`border-block-end`
import typingsJapgolly.stylelint.stylelintStrings.`border-block-start`
import typingsJapgolly.stylelint.stylelintStrings.`border-bottom`
import typingsJapgolly.stylelint.stylelintStrings.`border-color`
import typingsJapgolly.stylelint.stylelintStrings.`border-image`
import typingsJapgolly.stylelint.stylelintStrings.`border-inline-end`
import typingsJapgolly.stylelint.stylelintStrings.`border-inline-start`
import typingsJapgolly.stylelint.stylelintStrings.`border-left`
import typingsJapgolly.stylelint.stylelintStrings.`border-radius`
import typingsJapgolly.stylelint.stylelintStrings.`border-right`
import typingsJapgolly.stylelint.stylelintStrings.`border-style`
import typingsJapgolly.stylelint.stylelintStrings.`border-top`
import typingsJapgolly.stylelint.stylelintStrings.`border-width`
import typingsJapgolly.stylelint.stylelintStrings.`column-rule`
import typingsJapgolly.stylelint.stylelintStrings.`flex-flow`
import typingsJapgolly.stylelint.stylelintStrings.`grid-area`
import typingsJapgolly.stylelint.stylelintStrings.`grid-column`
import typingsJapgolly.stylelint.stylelintStrings.`grid-gap`
import typingsJapgolly.stylelint.stylelintStrings.`grid-row`
import typingsJapgolly.stylelint.stylelintStrings.`grid-template`
import typingsJapgolly.stylelint.stylelintStrings.`list-style`
import typingsJapgolly.stylelint.stylelintStrings.`text-decoration`
import typingsJapgolly.stylelint.stylelintStrings.`text-emphasis`
import typingsJapgolly.stylelint.stylelintStrings.animation
import typingsJapgolly.stylelint.stylelintStrings.background
import typingsJapgolly.stylelint.stylelintStrings.border
import typingsJapgolly.stylelint.stylelintStrings.columns
import typingsJapgolly.stylelint.stylelintStrings.flex
import typingsJapgolly.stylelint.stylelintStrings.font
import typingsJapgolly.stylelint.stylelintStrings.grid
import typingsJapgolly.stylelint.stylelintStrings.margin
import typingsJapgolly.stylelint.stylelintStrings.mask
import typingsJapgolly.stylelint.stylelintStrings.outline
import typingsJapgolly.stylelint.stylelintStrings.padding
import typingsJapgolly.stylelint.stylelintStrings.transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CodeProcessor = js.Function2[/* code */ String, /* file */ js.UndefOr[String], String]

type ConfigExtends = String | js.Array[String]

type ConfigIgnoreFiles = String | js.Array[String]

type ConfigPlugins = String | js.Array[String]

type ConfigProcessor = String | (js.Tuple2[String, js.Object])

type ConfigProcessors = String | js.Array[ConfigProcessor]

type ConfigRuleSettings[T, O /* <: js.Object */] = js.UndefOr[
Null | NonNullable[T] | js.Array[NonNullable[T]] | (js.Tuple2[NonNullable[T], O])]

type ConfigRules = StringDictionary[ConfigRuleSettings[Any, js.Object]]

type CosmiconfigResult = typingsJapgolly.stylelint.anon.Config | Null

type CustomSyntax = String | Syntax

type DisableOptionsReport = js.Array[DisableReportEntry]

type DisablePropertyName = PropertyNamesOfType[Config, DisableSettings]

type DisableSettings = ConfigRuleSettings[Boolean, DisableOptions]

type DisabledRangeObject = StringDictionary[js.Array[DisabledRange]]

type Formatter = js.Function2[/* results */ js.Array[LintResult], /* returnValue */ LinterResult, String]

type LonghandSubPropertiesOfShorthandProperties = ReadonlyMap[
animation | background | border | `border-block-end` | `border-block-start` | `border-bottom` | `border-color` | `border-image` | `border-inline-end` | `border-inline-start` | `border-left` | `border-radius` | `border-right` | `border-style` | `border-top` | `border-width` | `column-rule` | columns | flex | `flex-flow` | font | grid | `grid-area` | `grid-column` | `grid-gap` | `grid-row` | `grid-template` | `list-style` | margin | mask | outline | padding | `text-decoration` | `text-emphasis` | transition, 
ReadonlySet[String]]

type Plugin = RuleBase[Any, Any]

// A meta-type that returns a union over all properties of `T` whose values
// have type `U`.
type PropertyNamesOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends U? K : never}[keyof T] */ js.Any

type ResultProcessor = js.Function2[/* result */ LintResult, /* file */ js.UndefOr[String], LintResult]

type RuleBase[P, S] = js.Function3[
/* primaryOption */ P, 
/* secondaryOptions */ Record[String, S], 
/* context */ PluginContext, 
js.Function2[/* root */ Root_, /* result */ PostcssResult, js.Promise[Unit] | Unit]]

type RuleMessage = String | RuleMessageFunc

type RuleMessages = StringDictionary[RuleMessage]

type RuleOptionsPossible = Boolean | Double | String | RuleOptionsPossibleFunc

type RuleOptionsPossibleFunc = js.Function1[/* value */ Any, Boolean]
