package typingsJapgolly.reactReduxI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DispatchCallback[S /* <: typingsJapgolly.redux.mod.Action[_] */] = js.Function2[
    /* dispatch */ js.UndefOr[typingsJapgolly.redux.mod.Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  type SubTranslationObject = java.lang.String | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-redux-i18n.react-redux-i18n.SubTranslationObject */ js.Object
  ])
  type TranslationObjects = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactReduxI18n.mod.SubTranslationObject]
}
