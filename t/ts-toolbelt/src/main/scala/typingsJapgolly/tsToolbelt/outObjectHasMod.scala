package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyAtMod.At
import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outAnyIsMod.Is
import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectHasMod {
  
  type Has[O /* <: js.Object */, K /* <: Key */, M /* <: Any */, `match` /* <: Match */] = Is[At[O, K], M, `match`]
}
