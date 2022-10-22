package typingsJapgolly.jsdevtoolsOno

import typingsJapgolly.jsdevtoolsOno.esmTypesMod.ErrorLike
import typingsJapgolly.jsdevtoolsOno.esmTypesMod.ErrorLikeConstructor
import typingsJapgolly.jsdevtoolsOno.esmTypesMod.OnoConstructor
import typingsJapgolly.jsdevtoolsOno.esmTypesMod.OnoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmConstructorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  open class Ono[T /* <: ErrorLike */] protected ()
    extends StObject
       with typingsJapgolly.jsdevtoolsOno.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  val Ono: OnoConstructor = js.native
}
