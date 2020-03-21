package typingsJapgolly.parsimmon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FailureFunctionType[U] = js.Function2[
    /* index */ scala.Double, 
    /* msg */ java.lang.String, 
    typingsJapgolly.parsimmon.mod.Reply[U]
  ]
  type Language = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.parsimmon.mod.Parser[js.Any]]
  type ParseFunctionType[U] = js.Function2[
    /* stream */ typingsJapgolly.parsimmon.mod.StreamType, 
    /* index */ scala.Double, 
    typingsJapgolly.parsimmon.mod.Reply[U]
  ]
  type Rule = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* r */ typingsJapgolly.parsimmon.mod.Language, 
      typingsJapgolly.parsimmon.mod.Parser[js.Any]
    ]
  ]
  type StreamType = java.lang.String
  type SuccessFunctionType[U] = js.Function2[/* index */ scala.Double, /* result */ U, typingsJapgolly.parsimmon.mod.Reply[U]]
  type TypedLanguage[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typingsJapgolly.parsimmon.parsimmonStrings.TypedLanguage with TLanguageSpec
  type TypedRule[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typingsJapgolly.parsimmon.parsimmonStrings.TypedRule with TLanguageSpec
  type UnParser[T] = js.Any
}
