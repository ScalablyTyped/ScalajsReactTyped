package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outObjectPickMod.Pick
import typingsJapgolly.tsToolbelt.outObjectSelectKeysMod.SelectKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectSelectMod {
  
  type Select[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = Pick[O, SelectKeys[O, M, `match`]]
}
