package typingsJapgolly.angularQExtras

import typingsJapgolly.angularQExtras.mod.angularAugmentingMod.PromiseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularQExtrasStrings {
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with PromiseState
  inline def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait rejected
    extends StObject
       with PromiseState
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
}
