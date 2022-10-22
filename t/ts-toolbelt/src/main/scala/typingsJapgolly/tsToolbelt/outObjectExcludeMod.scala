package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyInternalMod.Match
import typingsJapgolly.tsToolbelt.outObjectExcludeKeysMod.ExcludeKeys
import typingsJapgolly.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectExcludeMod {
  
  type Exclude[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, ExcludeKeys[O, O1, `match`]]
}
