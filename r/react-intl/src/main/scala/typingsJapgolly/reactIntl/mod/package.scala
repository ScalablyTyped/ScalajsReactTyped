package typingsJapgolly.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatDateOptions = (typingsJapgolly.std.Exclude[
    typingsJapgolly.std.Intl.DateTimeFormatOptions, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsJapgolly.reactIntl.mod.CustomFormatConfig
  type FormatDisplayNameOptions = typingsJapgolly.std.Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNamesOptions */ js.Any, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]
  type FormatListOptions = typingsJapgolly.std.Exclude[
    typingsJapgolly.formatjsIntlListformat.mod.IntlListFormatOptions, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]
  type FormatNumberOptions = (typingsJapgolly.std.Exclude[
    typingsJapgolly.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsJapgolly.reactIntl.mod.CustomFormatConfig
  type FormatPluralOptions = (typingsJapgolly.std.Exclude[
    typingsJapgolly.std.Intl.PluralRulesOptions, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsJapgolly.reactIntl.mod.CustomFormatConfig
  type FormatRelativeTimeOptions = (typingsJapgolly.std.Exclude[
    typingsJapgolly.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions, 
    typingsJapgolly.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsJapgolly.reactIntl.mod.CustomFormatConfig
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type WithIntlProps[P] = (typingsJapgolly.reactIntl.mod.Omit[P, java.lang.String]) with typingsJapgolly.reactIntl.AnonForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl.IntlShape}
    */ typingsJapgolly.reactIntl.reactIntlStrings.WrappedComponentProps with js.Any
}
