package typingsJapgolly.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesEnhancersMod {
  type BoxCssProps[CP] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof CP ]: CP[P] | number | false | null | undefined}
    */ typingsJapgolly.uiBox.uiBoxStrings.BoxCssProps with CP
  type BoxPropValue = js.UndefOr[
    java.lang.String | scala.Double | typingsJapgolly.uiBox.uiBoxBooleans.`false` | scala.Null
  ]
  type PropAliases = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type PropEnhancerValueType = java.lang.String | scala.Double
  type PropEnhancers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* value */ js.Any, 
      typingsJapgolly.uiBox.typesEnhancersMod.EnhancedProp | scala.Null
    ]
  ]
  type PropTypesMapping = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.propTypes.mod.Validator[js.Any]]
  type PropValidators = org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]]
}
