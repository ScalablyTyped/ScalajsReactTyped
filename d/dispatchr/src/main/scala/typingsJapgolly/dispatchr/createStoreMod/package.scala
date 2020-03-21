package typingsJapgolly.dispatchr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createStoreMod {
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  // see: https://github.com/yahoo/fluxible/blob/dispatchr-v1.2.0/packages/dispatchr/addons/createStore.js#L9
  type StoreThis[T /* <: typingsJapgolly.dispatchr.createStoreMod.StoreOptions */] = (typingsJapgolly.dispatchr.createStoreMod.Omit[
    T, 
    typingsJapgolly.dispatchr.dispatchrStrings.statics | typingsJapgolly.dispatchr.dispatchrStrings.storeName | typingsJapgolly.dispatchr.dispatchrStrings.handlers | typingsJapgolly.dispatchr.dispatchrStrings.mixins
  ]) with typingsJapgolly.dispatchr.mod.Store[js.Object]
}
