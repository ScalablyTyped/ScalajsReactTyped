package typingsJapgolly.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Access = scala.Boolean | typingsJapgolly.keystonejsKeystone.mod.AccessCallback | typingsJapgolly.keystonejsKeystone.AnonAuth
  type AccessCallback = js.Function1[
    /* context */ typingsJapgolly.keystonejsKeystone.mod.AuthenticationContext, 
    scala.Boolean | typingsJapgolly.keystonejsKeystone.mod.GraphQLWhereClause
  ]
  /**
    * Lists
    */
  type DefaultValueFunction = js.Function0[js.Any]
  type GraphQLWhereClause = org.scalablytyped.runtime.StringDictionary[js.Any]
  type KeyValues[Keys /* <: java.lang.String */, Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]: Values}
    */ typingsJapgolly.keystonejsKeystone.keystonejsKeystoneStrings.KeyValues with js.Any
  type Plugin = js.Any
}
