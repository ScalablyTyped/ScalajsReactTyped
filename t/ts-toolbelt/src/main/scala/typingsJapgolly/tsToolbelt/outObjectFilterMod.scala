package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outObjectFilterKeysMod.FilterKeys
import typingsJapgolly.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectFilterMod {
  
  type Filter[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = Pick[O, FilterKeys[O, M, `match`]]
}
