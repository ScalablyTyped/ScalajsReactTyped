package typingsJapgolly.emberArray

import typingsJapgolly.emberArray.mutableMod.MutableArray
import typingsJapgolly.emberObject.copyableMod.Copyable
import typingsJapgolly.emberObject.observableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/types/prototype-extensions", JSImport.Namespace)
@js.native
object prototypeExtensionsMod extends js.Object {
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
  
}

