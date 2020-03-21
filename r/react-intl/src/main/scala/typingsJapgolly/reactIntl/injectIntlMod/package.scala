package typingsJapgolly.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object injectIntlMod {
  type WithIntlProps[P] = (typingsJapgolly.reactIntl.typesMod.Omit[P, java.lang.String]) with typingsJapgolly.reactIntl.AnonForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/types.IntlShape}
    */ typingsJapgolly.reactIntl.reactIntlStrings.WrappedComponentProps with js.Any
}
