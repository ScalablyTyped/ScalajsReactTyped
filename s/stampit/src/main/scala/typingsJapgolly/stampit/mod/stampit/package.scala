package typingsJapgolly.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampit {
  /** A composable object (either a `Stamp` or a `ExtendedDescriptor`.) */
  type Composable = typingsJapgolly.stampit.mod.StampSignature | (typingsJapgolly.stampit.mod.stampit.ExtendedDescriptor[js.Any, js.Any])
  /**
    * A function used as `.composers` argument.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
    */
  type Composer[S̤t̤a̤m̤p̤ /* <: typingsJapgolly.stampit.mod.StampSignature */] = js.Function1[
    /* parameters */ typingsJapgolly.stampit.mod.stampit.ComposerParameters[S̤t̤a̤m̤p̤], 
    scala.Unit | S̤t̤a̤m̤p̤
  ]
  /**
    * A function used as `.initializers` argument.
    * @template Obj The type of the object instance being produced by the `Stamp`.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
    */
  type Initializer[Obj, S̤t̤a̤m̤p̤ /* <: typingsJapgolly.stampit.mod.StampSignature */] = js.ThisFunction2[
    /* this */ Obj, 
    /*_propertyMap*/ /* options */ js.Any, 
    /* context */ typingsJapgolly.stampit.mod.stampit.InitializerContext[Obj, S̤t̤a̤m̤p̤], 
    scala.Unit | Obj
  ]
}
